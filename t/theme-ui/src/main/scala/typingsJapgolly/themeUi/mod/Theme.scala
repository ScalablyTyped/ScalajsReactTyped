package typingsJapgolly.themeUi.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.csstype.mod.BorderProperty
import typingsJapgolly.csstype.mod.BorderRadiusProperty
import typingsJapgolly.csstype.mod.BorderWidthProperty
import typingsJapgolly.csstype.mod.BoxShadowProperty
import typingsJapgolly.csstype.mod.FontFamilyProperty
import typingsJapgolly.csstype.mod.FontSizeProperty
import typingsJapgolly.csstype.mod.FontWeightProperty
import typingsJapgolly.csstype.mod.HeightProperty
import typingsJapgolly.csstype.mod.LetterSpacingProperty
import typingsJapgolly.csstype.mod.LineHeightProperty
import typingsJapgolly.csstype.mod.MarginProperty
import typingsJapgolly.csstype.mod.StandardProperties
import typingsJapgolly.csstype.mod.WidthProperty
import typingsJapgolly.csstype.mod.ZIndexProperty
import typingsJapgolly.styledSystem.mod.TLengthStyledSystem
import typingsJapgolly.themeUi.ColorModemodeskstringColo
import typingsJapgolly.themeUi.PinStyledTagsSystemStyleO
import typingsJapgolly.themeUi.themeUiNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent theme-ui.theme-ui.Omit<styled-system.styled-system.Theme<styled-system.styled-system.TLengthStyledSystem>, 'colors'> */
trait Theme extends js.Object {
  var borderStyles: js.UndefOr[
    typingsJapgolly.styledSystem.mod.ObjectOrArray[BorderProperty[js.Object], String]
  ] = js.undefined
  var borderWidths: js.UndefOr[
    typingsJapgolly.styledSystem.mod.ObjectOrArray[BorderWidthProperty[TLengthStyledSystem], String]
  ] = js.undefined
  var borders: js.UndefOr[
    typingsJapgolly.styledSystem.mod.ObjectOrArray[BorderProperty[js.Object], String]
  ] = js.undefined
  var breakpoints: js.UndefOr[
    typingsJapgolly.styledSystem.mod.ObjectOrArray[Double | String | js.Symbol, String]
  ] = js.undefined
  var buttons: js.UndefOr[
    typingsJapgolly.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], String]
  ] = js.undefined
  var colorStyles: js.UndefOr[
    typingsJapgolly.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], String]
  ] = js.undefined
  /**
    * Define the colors that are available through this theme
    */
  var colors: js.UndefOr[ColorModemodeskstringColo] = js.undefined
  var fontSizes: js.UndefOr[typingsJapgolly.styledSystem.mod.ObjectOrArray[FontSizeProperty[Double], String]] = js.undefined
  var fontWeights: js.UndefOr[typingsJapgolly.styledSystem.mod.ObjectOrArray[FontWeightProperty, String]] = js.undefined
  var fonts: js.UndefOr[typingsJapgolly.styledSystem.mod.ObjectOrArray[FontFamilyProperty, String]] = js.undefined
  /**
    * Provide a value here to enable color modes
    */
  var initialColorModeName: js.UndefOr[String] = js.undefined
  var letterSpacings: js.UndefOr[
    typingsJapgolly.styledSystem.mod.ObjectOrArray[LetterSpacingProperty[TLengthStyledSystem], String]
  ] = js.undefined
  var lineHeights: js.UndefOr[
    typingsJapgolly.styledSystem.mod.ObjectOrArray[LineHeightProperty[TLengthStyledSystem], String]
  ] = js.undefined
  var mediaQueries: js.UndefOr[StringDictionary[String]] = js.undefined
  var radii: js.UndefOr[
    typingsJapgolly.styledSystem.mod.ObjectOrArray[BorderRadiusProperty[TLengthStyledSystem], String]
  ] = js.undefined
  var shadows: js.UndefOr[typingsJapgolly.styledSystem.mod.ObjectOrArray[BoxShadowProperty, String]] = js.undefined
  var sizes: js.UndefOr[
    typingsJapgolly.styledSystem.mod.ObjectOrArray[HeightProperty[js.Object] | WidthProperty[js.Object], String]
  ] = js.undefined
  var space: js.UndefOr[
    typingsJapgolly.styledSystem.mod.ObjectOrArray[MarginProperty[Double | String], String]
  ] = js.undefined
  /**
    * Styles for elements rendered in MDX can be added to the theme.styles
    * object. This is the primary, low-level way to control typographic and
    * other styles in markdown content. Styles within this object are processed
    * with @styled-system/css and have access to base theme values like colors,
    * fonts, etc.
    */
  var styles: js.UndefOr[PinStyledTagsSystemStyleO] = js.undefined
  var textStyles: js.UndefOr[
    typingsJapgolly.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], String]
  ] = js.undefined
  /**
    * Enable/disable custom CSS properties/variables if lower browser
    * support is required (for eg. IE 11).
    *
    * References: https://theme-ui.com/color-modes/#turn-off-custom-properties
    */
  var useCustomProperties: js.UndefOr[Boolean] = js.undefined
  var zIndices: js.UndefOr[typingsJapgolly.styledSystem.mod.ObjectOrArray[ZIndexProperty, String]] = js.undefined
}

object Theme {
  @scala.inline
  def apply(
    borderStyles: typingsJapgolly.styledSystem.mod.ObjectOrArray[BorderProperty[js.Object], String] = null,
    borderWidths: typingsJapgolly.styledSystem.mod.ObjectOrArray[BorderWidthProperty[TLengthStyledSystem], String] = null,
    borders: typingsJapgolly.styledSystem.mod.ObjectOrArray[BorderProperty[js.Object], String] = null,
    breakpoints: typingsJapgolly.styledSystem.mod.ObjectOrArray[Double | String | js.Symbol, String] = null,
    buttons: typingsJapgolly.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], String] = null,
    colorStyles: typingsJapgolly.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], String] = null,
    colors: ColorModemodeskstringColo = null,
    fontSizes: typingsJapgolly.styledSystem.mod.ObjectOrArray[FontSizeProperty[Double], String] = null,
    fontWeights: typingsJapgolly.styledSystem.mod.ObjectOrArray[FontWeightProperty, String] = null,
    fonts: typingsJapgolly.styledSystem.mod.ObjectOrArray[FontFamilyProperty, String] = null,
    initialColorModeName: String = null,
    letterSpacings: typingsJapgolly.styledSystem.mod.ObjectOrArray[LetterSpacingProperty[TLengthStyledSystem], String] = null,
    lineHeights: typingsJapgolly.styledSystem.mod.ObjectOrArray[LineHeightProperty[TLengthStyledSystem], String] = null,
    mediaQueries: StringDictionary[String] = null,
    radii: typingsJapgolly.styledSystem.mod.ObjectOrArray[BorderRadiusProperty[TLengthStyledSystem], String] = null,
    shadows: typingsJapgolly.styledSystem.mod.ObjectOrArray[BoxShadowProperty, String] = null,
    sizes: typingsJapgolly.styledSystem.mod.ObjectOrArray[HeightProperty[js.Object] | WidthProperty[js.Object], String] = null,
    space: typingsJapgolly.styledSystem.mod.ObjectOrArray[MarginProperty[Double | String], String] = null,
    styles: PinStyledTagsSystemStyleO = null,
    textStyles: typingsJapgolly.styledSystem.mod.ObjectOrArray[StandardProperties[String | `0`], String] = null,
    useCustomProperties: js.UndefOr[Boolean] = js.undefined,
    zIndices: typingsJapgolly.styledSystem.mod.ObjectOrArray[ZIndexProperty, String] = null
  ): Theme = {
    val __obj = js.Dynamic.literal()
    if (borderStyles != null) __obj.updateDynamic("borderStyles")(borderStyles.asInstanceOf[js.Any])
    if (borderWidths != null) __obj.updateDynamic("borderWidths")(borderWidths.asInstanceOf[js.Any])
    if (borders != null) __obj.updateDynamic("borders")(borders.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (colorStyles != null) __obj.updateDynamic("colorStyles")(colorStyles.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (fontSizes != null) __obj.updateDynamic("fontSizes")(fontSizes.asInstanceOf[js.Any])
    if (fontWeights != null) __obj.updateDynamic("fontWeights")(fontWeights.asInstanceOf[js.Any])
    if (fonts != null) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    if (initialColorModeName != null) __obj.updateDynamic("initialColorModeName")(initialColorModeName.asInstanceOf[js.Any])
    if (letterSpacings != null) __obj.updateDynamic("letterSpacings")(letterSpacings.asInstanceOf[js.Any])
    if (lineHeights != null) __obj.updateDynamic("lineHeights")(lineHeights.asInstanceOf[js.Any])
    if (mediaQueries != null) __obj.updateDynamic("mediaQueries")(mediaQueries.asInstanceOf[js.Any])
    if (radii != null) __obj.updateDynamic("radii")(radii.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (textStyles != null) __obj.updateDynamic("textStyles")(textStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(useCustomProperties)) __obj.updateDynamic("useCustomProperties")(useCustomProperties.asInstanceOf[js.Any])
    if (zIndices != null) __obj.updateDynamic("zIndices")(zIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme]
  }
}

