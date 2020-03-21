package typingsJapgolly.uifabricMergeStyles.irawstylebaseMod

import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.`extra-condensed`
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.`extra-expanded`
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.`semi-condensed`
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.`semi-expanded`
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.`ultra-condensed`
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.`ultra-expanded`
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.`x-large`
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.`x-small`
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.`xx-large`
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.`xx-small`
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.auto
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.block
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.condensed
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.expanded
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.fallback
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.italic
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.large
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.larger
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.medium
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.none
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.normal
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.oblique
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.optional
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.small
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.smaller
import typingsJapgolly.uifabricMergeStyles.uifabricMergeStylesStrings.swap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFontFace extends IRawFontStyle {
  /**
    * Determines how a font face is displayed based on whether and when it is downloaded
    * and ready to use.
    */
  var fontDisplay: js.UndefOr[auto | block | swap | fallback | optional] = js.undefined
  /**
    * Feature settings for the font.
    */
  var fontFeatureSettings: js.UndefOr[String] = js.undefined
  /**
    * Specifies the src of the font.
    */
  var src: js.UndefOr[String] = js.undefined
  /**
    * unicode-range allows you to set a specific range of characters to be downloaded
    * from a font (embedded using \@font-face) and made available for use on the current
    * page.
    */
  var unicodeRange: js.UndefOr[ICSSRule | String] = js.undefined
}

object IFontFace {
  @scala.inline
  def apply(
    font: ICSSRule | String = null,
    fontDisplay: auto | block | swap | fallback | optional = null,
    fontFamily: ICSSRule | String = null,
    fontFeatureSettings: String = null,
    fontKerning: ICSSRule | String = null,
    fontSize: ICSSRule | `xx-small` | `x-small` | small | medium | large | `x-large` | `xx-large` | larger | smaller | ICSSPixelUnitRule | ICSSPercentageRule = null,
    fontSizeAdjust: ICSSRule | none | Double = null,
    fontStretch: ICSSRule | normal | `ultra-condensed` | `extra-condensed` | condensed | `semi-condensed` | `semi-expanded` | expanded | `extra-expanded` | `ultra-expanded` = null,
    fontStyle: ICSSRule | normal | italic | oblique = null,
    fontSynthesis: ICSSRule | String = null,
    fontVariant: ICSSRule | String = null,
    fontVariantAlternates: ICSSRule | String = null,
    fontWeight: IFontWeight = null,
    src: String = null,
    unicodeRange: ICSSRule | String = null
  ): IFontFace = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (fontDisplay != null) __obj.updateDynamic("fontDisplay")(fontDisplay.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontFeatureSettings != null) __obj.updateDynamic("fontFeatureSettings")(fontFeatureSettings.asInstanceOf[js.Any])
    if (fontKerning != null) __obj.updateDynamic("fontKerning")(fontKerning.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontSizeAdjust != null) __obj.updateDynamic("fontSizeAdjust")(fontSizeAdjust.asInstanceOf[js.Any])
    if (fontStretch != null) __obj.updateDynamic("fontStretch")(fontStretch.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontSynthesis != null) __obj.updateDynamic("fontSynthesis")(fontSynthesis.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
    if (fontVariantAlternates != null) __obj.updateDynamic("fontVariantAlternates")(fontVariantAlternates.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (unicodeRange != null) __obj.updateDynamic("unicodeRange")(unicodeRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFontFace]
  }
}

