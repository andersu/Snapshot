package technology.anders.snapshot.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import technology.anders.snapshot.ui.theme.White
import technology.anders.snapshot.ui.theme.bodyLarge
import technology.anders.snapshot.ui.theme.titleLarge

@Composable
fun Greeting(name: String) {
    Text(
        text = stringResource(R.string.good_evening, name),
        modifier = Modifier.padding(16.dp),
        style = bodyLarge,
        color = White
    )
}

@Preview
@Composable
fun GreetingPreview() {
    Greeting("Anders")
}

@Preview
@Composable
fun GreetingWithLongNamePreview() {
    Greeting("Uvuvwevwevwe Onyetenyevwe Ugwemuhwem Osas")
}