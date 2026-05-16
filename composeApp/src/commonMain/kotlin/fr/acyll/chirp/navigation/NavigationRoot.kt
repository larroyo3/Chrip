package fr.acyll.chirp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import fr.acyll.auth.presentation.navigation.AuthGraphRoutes
import fr.acyll.auth.presentation.navigation.authGraph
import fr.acyll.chat.presentation.chat_list.ChatListRoute
import fr.acyll.chat.presentation.chat_list.ChatListScreen

@Composable
fun NavigationRoot(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = AuthGraphRoutes.Graph
    ) {
        authGraph(
            navController = navController,
            onLoginSuccess = {
                navController.navigate(ChatListRoute) {
                    popUpTo(AuthGraphRoutes.Graph) {
                        inclusive = true
                    }
                }
            }
        )

        composable<ChatListRoute> {
            ChatListScreen()
        }
    }
}