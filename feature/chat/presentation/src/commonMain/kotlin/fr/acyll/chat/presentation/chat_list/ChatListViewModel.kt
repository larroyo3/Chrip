package fr.acyll.chat.presentation.chat_list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import fr.acyll.core.domain.auth.SessionStorage
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ChatListViewModel(
    private val sessionStorage: SessionStorage
): ViewModel() {

    init {
        viewModelScope.launch {
            delay(5000)
            sessionStorage.set(null)
        }
    }
}