package typingsJapgolly.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RightProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The right CSS property participates in specifying the horizontal position of a
    * positioned element. It has no effect on non-positioned elements.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/right)
    */
  var right: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object RightProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](right: ResponsiveValue[TVal, ThemeType] = null): RightProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[RightProps[ThemeType, TVal]]
  }
}

