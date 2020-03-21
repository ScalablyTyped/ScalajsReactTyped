package typingsJapgolly.styledSystemCss

import typingsJapgolly.csstype.mod.BorderProperty
import typingsJapgolly.csstype.mod.BorderRadiusProperty
import typingsJapgolly.csstype.mod.BorderWidthProperty
import typingsJapgolly.csstype.mod.BoxShadowProperty
import typingsJapgolly.csstype.mod.ColorProperty
import typingsJapgolly.csstype.mod.FontFamilyProperty
import typingsJapgolly.csstype.mod.FontSizeProperty
import typingsJapgolly.csstype.mod.FontWeightProperty
import typingsJapgolly.csstype.mod.HeightProperty
import typingsJapgolly.csstype.mod.LetterSpacingProperty
import typingsJapgolly.csstype.mod.LineHeightProperty
import typingsJapgolly.csstype.mod.LineStyle
import typingsJapgolly.csstype.mod.MarginProperty
import typingsJapgolly.csstype.mod.PaddingProperty
import typingsJapgolly.csstype.mod.WidthProperty
import typingsJapgolly.csstype.mod.ZIndexProperty
import typingsJapgolly.styledSystemCss.mod.ThemeValue
import typingsJapgolly.styledSystemCss.mod._Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@styled-system/css.@styled-system/css.ScaleThemeProperties> */
trait PartialScaleThemeProperti extends _Theme {
  var borderStyles: js.UndefOr[ThemeValue[LineStyle]] = js.undefined
  var borderWidths: js.UndefOr[ThemeValue[BorderWidthProperty[js.Object]]] = js.undefined
  var borders: js.UndefOr[ThemeValue[BorderProperty[js.Object]]] = js.undefined
  var colors: js.UndefOr[ThemeValue[ColorProperty]] = js.undefined
  var fontSizes: js.UndefOr[ThemeValue[FontSizeProperty[Double]]] = js.undefined
  var fontWeights: js.UndefOr[ThemeValue[FontWeightProperty]] = js.undefined
  var fonts: js.UndefOr[ThemeValue[FontFamilyProperty]] = js.undefined
  var letterSpacings: js.UndefOr[ThemeValue[LetterSpacingProperty[String | Double]]] = js.undefined
  var lineHeights: js.UndefOr[ThemeValue[LineHeightProperty[String]]] = js.undefined
  var radii: js.UndefOr[ThemeValue[BorderRadiusProperty[js.Object]]] = js.undefined
  var shadows: js.UndefOr[ThemeValue[BoxShadowProperty]] = js.undefined
  var sizes: js.UndefOr[ThemeValue[HeightProperty[js.Object] | WidthProperty[js.Object]]] = js.undefined
  var space: js.UndefOr[ThemeValue[MarginProperty[Double] with PaddingProperty[Double]]] = js.undefined
  var zIndices: js.UndefOr[ThemeValue[ZIndexProperty]] = js.undefined
}

object PartialScaleThemeProperti {
  @scala.inline
  def apply(
    borderStyles: ThemeValue[LineStyle] = null,
    borderWidths: ThemeValue[BorderWidthProperty[js.Object]] = null,
    borders: ThemeValue[BorderProperty[js.Object]] = null,
    colors: ThemeValue[ColorProperty] = null,
    fontSizes: ThemeValue[FontSizeProperty[Double]] = null,
    fontWeights: ThemeValue[FontWeightProperty] = null,
    fonts: ThemeValue[FontFamilyProperty] = null,
    letterSpacings: ThemeValue[LetterSpacingProperty[String | Double]] = null,
    lineHeights: ThemeValue[LineHeightProperty[String]] = null,
    radii: ThemeValue[BorderRadiusProperty[js.Object]] = null,
    shadows: ThemeValue[BoxShadowProperty] = null,
    sizes: ThemeValue[HeightProperty[js.Object] | WidthProperty[js.Object]] = null,
    space: ThemeValue[MarginProperty[Double] with PaddingProperty[Double]] = null,
    zIndices: ThemeValue[ZIndexProperty] = null
  ): PartialScaleThemeProperti = {
    val __obj = js.Dynamic.literal()
    if (borderStyles != null) __obj.updateDynamic("borderStyles")(borderStyles.asInstanceOf[js.Any])
    if (borderWidths != null) __obj.updateDynamic("borderWidths")(borderWidths.asInstanceOf[js.Any])
    if (borders != null) __obj.updateDynamic("borders")(borders.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (fontSizes != null) __obj.updateDynamic("fontSizes")(fontSizes.asInstanceOf[js.Any])
    if (fontWeights != null) __obj.updateDynamic("fontWeights")(fontWeights.asInstanceOf[js.Any])
    if (fonts != null) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    if (letterSpacings != null) __obj.updateDynamic("letterSpacings")(letterSpacings.asInstanceOf[js.Any])
    if (lineHeights != null) __obj.updateDynamic("lineHeights")(lineHeights.asInstanceOf[js.Any])
    if (radii != null) __obj.updateDynamic("radii")(radii.asInstanceOf[js.Any])
    if (shadows != null) __obj.updateDynamic("shadows")(shadows.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    if (zIndices != null) __obj.updateDynamic("zIndices")(zIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialScaleThemeProperti]
  }
}

