package fr.acyll.core.designsystem.components.dialogs

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fr.acyll.core.designsystem.theme.ChirpTheme
import fr.acyll.core.presentation.util.currentDeviceConfiguration

@Composable
fun ChirpAdaptiveDialogSheetLayout(
    onDismiss: () -> Unit,
    content: @Composable () -> Unit
) {
    val configuration = currentDeviceConfiguration()

    if(configuration.isMobile) {
        ChirpBottomSheet(
            onDismiss = onDismiss,
            content = content
        )
    } else {
        ChirpDialogContent(
            onDismiss = onDismiss,
            content = content
        )
    }
}