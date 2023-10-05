package br.com.brn.cinematecacompose.ui.components

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.brn.cinematecacompose.R
import br.com.brn.cinematecacompose.ui.theme.CinematecaComposeTheme


@Composable
fun CustomsButtons(
    modifier: Modifier,
    action: () -> Unit,
    @StringRes textId: Int
) {
    Button(
        modifier = modifier,
        onClick = action,
//        colors = ButtonDefaults.buttonColors(
//            containerColor = Color.White,
//            contentColor = Color.Red
//        )
    ) {
        Text(text = stringResource(id = textId))
    }
}

@Composable
fun SelectCustomsButtons(
    modifier: Modifier,
    positiveAction: (() -> Unit)? = null,
    neutralAction: (() -> Unit)? = null,
    negativeAction: (() -> Unit)? = null,
    @StringRes positiveTextId: Int? = null,
    @StringRes negativeTextId: Int? = null,
    @StringRes neutralTextId: Int? = null,
) {
    Row(
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        negativeAction?.let { clickAction ->
            negativeTextId?.let { textId ->
                CustomsButtons(modifier.weight(1f), clickAction, textId)
            }
        }
        if (negativeAction == null) Spacer(modifier = modifier)

        neutralAction?.let { clickAction ->
            neutralTextId?.let { textId ->
                CustomsButtons(modifier.weight(1f), clickAction, textId)
            }
        }
        if (neutralAction == null) Spacer(modifier = modifier)

        positiveAction?.let { clickAction ->
            positiveTextId?.let { textId ->
                CustomsButtons(modifier.weight(1f), clickAction, textId)
            }
        }
        if (positiveAction == null) Spacer(modifier = modifier)
    }

}


// ---------------------------------- Previews ----------------------------------
@Preview
@Composable
fun CustomsButtonsLightPreview() {
    CinematecaComposeTheme(false) {
        CustomsButtons(
            modifier = Modifier.fillMaxWidth(),
            {},
            textId = R.string.app_name
        )
    }
}

@Preview
@Composable
fun CustomsButtonsDarkPreview() {
    CinematecaComposeTheme(true) {
        CustomsButtons(
            modifier = Modifier.fillMaxWidth(),
            {},
            textId = R.string.app_name
        )
    }
}


@Preview
@Composable
fun SelectCustomsButtonsLightPreview() {
    CinematecaComposeTheme(false) {
        SelectCustomsButtons(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            {},
            {},
            {},
            positiveTextId = R.string.ok_text,
            neutralTextId = R.string.maybe_text,
            negativeTextId = R.string.cancel_text
        )
    }
}

@Preview
@Composable
fun SelectCustomsButtonsDarkPreview() {
    CinematecaComposeTheme(true) {
        SelectCustomsButtons(
            modifier = Modifier.padding(8.dp),
            {},
            {},
            {},
            positiveTextId = R.string.ok_text,
            neutralTextId = R.string.maybe_text,
            negativeTextId = R.string.cancel_text
        )
    }
}

@Preview
@Composable
fun Select2CustomsButtonsLightPreview() {
    CinematecaComposeTheme(false) {
        SelectCustomsButtons(
            modifier = Modifier.padding(8.dp),
            {},
            {},
            {},
            positiveTextId = R.string.ok_text,
            negativeTextId = R.string.cancel_text
        )
    }
}

@Preview
@Composable
fun Select2CustomsButtonsDarkPreview() {
    CinematecaComposeTheme(true) {
        SelectCustomsButtons(
            modifier = Modifier.padding(8.dp),
            {},
            {},
            {},
            positiveTextId = R.string.ok_text,
            negativeTextId = R.string.cancel_text
        )
    }
}