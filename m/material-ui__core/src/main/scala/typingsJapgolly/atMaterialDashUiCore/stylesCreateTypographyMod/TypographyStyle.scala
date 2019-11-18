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

/* Inlined std.Required<std.Pick<@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties, 'fontFamily' | 'fontSize' | 'fontWeight' | 'color'>> & std.Partial<std.Pick<@material-ui/core.@material-ui/core/styles/withStyles.CSSProperties, 'letterSpacing' | 'lineHeight' | 'textTransform'>> */
trait TypographyStyle extends js.Object {
  var color: ColorProperty
  var fontFamily: FontFamilyProperty
  var fontSize: FontSizeProperty[Double | String]
  var fontWeight: FontWeightProperty
  var letterSpacing: js.UndefOr[LetterSpacingProperty[Double | String]] = js.undefined
  var lineHeight: js.UndefOr[LineHeightProperty[Double | String]] = js.undefined
  var textTransform: js.UndefOr[TextTransformProperty] = js.undefined
}

object TypographyStyle {
  @scala.inline
  def apply(
    color: ColorProperty,
    fontFamily: FontFamilyProperty,
    fontSize: FontSizeProperty[Double | String],
    fontWeight: FontWeightProperty,
    letterSpacing: LetterSpacingProperty[Double | String] = null,
    lineHeight: LineHeightProperty[Double | String] = null,
    textTransform: TextTransformProperty = null
  ): TypographyStyle = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypographyStyle]
  }
}

