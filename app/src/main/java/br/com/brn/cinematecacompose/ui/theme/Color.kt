package br.com.brn.cinematecacompose.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.material.Colors
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import br.com.brn.cinematecacompose.R

val DarkColorScheme
    @Composable get() = darkColorScheme(
        primary = colorResource(id = R.color.dark_primaryColor),
        primaryContainer = colorResource(id = R.color.dark_primaryLightColor),
        onPrimary = colorResource(id = R.color.dark_onPrimaryColor),
        secondary = colorResource(id = R.color.dark_secondaryColor),
        secondaryContainer = colorResource(id = R.color.dark_secondaryLightColor),
        onSecondary = colorResource(id = R.color.dark_onSecondaryColor),
        tertiary = colorResource(id = R.color.dark_tertiaryColor),
        tertiaryContainer = colorResource(id = R.color.dark_tertiaryLightColor),
        onTertiary = colorResource(id = R.color.dark_onTertiaryColor),

        background = colorResource(id = R.color.dark_backgroundColor),
        surface = colorResource(id = R.color.dark_surfaceColor),
        error = colorResource(id = R.color.dark_errorColor),

//        onBackground = colorResource(id = R.color.dark_onBackgroundColor),
        onSurface = colorResource(id = R.color.dark_onSurfaceColor),
        onErrorContainer = colorResource(id = R.color.dark_onErrorColor)
    )

val LightColorScheme
    @Composable get() = lightColorScheme(
        primary = colorResource(id = R.color.primaryColor),
        primaryContainer = colorResource(id = R.color.primaryLightColor),
        onPrimary = colorResource(id = R.color.onPrimaryColor),
        secondary = colorResource(id = R.color.secondaryColor),
        secondaryContainer = colorResource(id = R.color.secondaryLightColor),
        onSecondary = colorResource(id = R.color.onSecondaryColor),
        tertiary = colorResource(id = R.color.tertiaryColor),
        tertiaryContainer = colorResource(id = R.color.tertiaryLightColor),
        onTertiary = colorResource(id = R.color.onTertiaryColor),

        background = colorResource(id = R.color.backgroundColor),
        surface = colorResource(id = R.color.surfaceColor),
        error = colorResource(id = R.color.errorColor),

//        onBackground = colorResource(id = R.color.onBackgroundColor),
        onSurface = colorResource(id = R.color.onSurfaceColor),
        onErrorContainer = colorResource(id = R.color.onErrorColor)
    )


/**
 * Base class to extend the material color theme with auxiliary colors that goes
 * beyond the default theme acc. to accomplish your company's corporate identity design
 */
@Immutable
data class ExtendedColors(
    val snowWhite: Color,
//    val deepOcean: Color,
//    val skyBlue: Color,
//    val nightBlue: Color,
//    val dialogBackground: Color
)

// cores que serão usados de acordo com a modalidade dia ou noite
val LocalExtendedColors = staticCompositionLocalOf {
    ExtendedColors(
        snowWhite = Color.Unspecified,
//        deepOcean = Color.Unspecified,
//        skyBlue = Color.Unspecified,
//        nightBlue = Color.Unspecified,
//        dialogBackground = Color.Unspecified
    )
}

// day colors extented - cores auxiliares para dia que vão além do padrão
val lightExtendedColors: ExtendedColors
    @Composable
    get() = ExtendedColors(
        snowWhite = colorResource(id = R.color.white_snow),
//        deepOcean = colorResource(id = R.color.blue_deep_ocean),
//        skyBlue = colorResource(id = R.color.blue_sky),
//        nightBlue = colorResource(id = R.color.blue_night),
//        dialogBackground = colorResource(id = R.color.dialog_background)
    )

// night colors extented - cores auxiliares para dia que vão além do padrão
val darkExtendedColors: ExtendedColors
    @Composable
    get() = ExtendedColors(
        snowWhite = colorResource(id = R.color.white_snow),
//        deepOcean = colorResource(id = R.color.black_inverted_mode),
//        skyBlue = colorResource(id = R.color.blue_sky),
//        nightBlue = colorResource(id = R.color.black_plain),
//        dialogBackground = colorResource(id = R.color.black_inverted_mode)
    )