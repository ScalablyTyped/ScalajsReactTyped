package typingsJapgolly.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundPositionProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The background-position CSS property sets the initial position for each background image. The
    * position is relative to the position layer set by background-origin.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-position)
    */
  var backgroundPosition: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object BackgroundPositionProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](backgroundPosition: ResponsiveValue[TVal, ThemeType] = null): BackgroundPositionProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (backgroundPosition != null) __obj.updateDynamic("backgroundPosition")(backgroundPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundPositionProps[ThemeType, TVal]]
  }
}

