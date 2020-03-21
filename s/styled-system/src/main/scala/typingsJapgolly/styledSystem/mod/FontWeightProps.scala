package typingsJapgolly.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontWeightProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The font-weight CSS property specifies the weight (or boldness) of the font.
    *
    * The font weights available to you will depend on the font-family you are using. Some fonts are only available in normal and bold.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight)
    */
  var fontWeight: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object FontWeightProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](fontWeight: ResponsiveValue[TVal, ThemeType] = null): FontWeightProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontWeightProps[ThemeType, TVal]]
  }
}

