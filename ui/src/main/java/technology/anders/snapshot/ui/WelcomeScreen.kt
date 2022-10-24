package technology.anders.snapshot.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import technology.anders.snapshot.ui.theme.Dark
import technology.anders.snapshot.ui.theme.Purple40
import technology.anders.snapshot.ui.theme.White

@Composable
fun WelcomeScreen(username: String) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Dark
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(stringResource(id = R.string.welcome)) },
                    backgroundColor = Purple40,
                    contentColor = White
                )
            }
        ) { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .background(Dark),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painterResource(id = R.drawable.android_selfie),
                    contentDescription = null
                )
                Greeting(username)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen("DAUG")
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenWithLongUsernamePreview() {
    WelcomeScreen("Llanfairpwllgwyngyll Android User Group")
}