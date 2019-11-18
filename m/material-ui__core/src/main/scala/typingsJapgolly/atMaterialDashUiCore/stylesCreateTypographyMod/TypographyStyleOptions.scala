package typingsJapgolly.atMaterialDashUiCore.stylesCreateTypographyMod

import typingsJapgolly.csstype.csstypeMod.ColorProperty
import typingsJapgolly.csstype.csstypeMod.FontFamilyProperty
import typingsJapgolly.csstype.csstypeMod.FontSizeProperty
import typingsJapgolly.csstype.csstypeMod.FontWeightProperty
import typingsJapgolly.csstype.csstypeMod.LetterSpacingProperty
import typingsJapgolly.csstype.csstypeMod.LineHeightProperty
import typingsJapgolly.csstype.csstypeMod.TextTransformProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@material-ui/core.@material-ui/core/styles/createTypography.TypographyStyle> */
trait TypographyStyleOptions extends js.Object {
  var color: js.UndefOr[ColorProperty] = js.undefined
  var fontFamily: js.UndefOr[FontFamilyProperty] = js.undefined
  var fontSize: js.UndefOr[FontSizeProperty[Double | String]] = js.undefined
  var fontWeight: js.UndefOr[FontWeightProperty] = js.undefined
  var letterSpacing: js.UndefOr[LetterSpacingProperty[Double | String]] = js.undefined
  var lineHeight: js.UndefOr[LineHeightProperty[Double | String]] = js.undefined
  var textTransform: js.UndefOr[TextTransformProperty] = js.undefined
}

object TypographyStyleOptions {
  @scala.inline
  def apply(
    color: ColorProperty = null,
    fontFamily: FontFamilyProperty = null,
    fontSize: FontSizeProperty[Double | String] = null,
    fontWeight: FontWeightProperty = null,
    letterSpacing: LetterSpacingProperty[Double | String] = null,
    lineHeight: LineHeightProperty[Double | String] = null,
    textTransform: TextTransformProperty = null
  ): TypographyStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypographyStyleOptions]
  }
}

