package typingsJapgolly.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextColorProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The color utility parses a component's `color` and `bg` props and converts them into CSS declarations.
    * By default the raw value of the prop is returned.
    *
    * Color palettes can be configured with the ThemeProvider to use keys as prop values, with support for dot notation.
    * Array values are converted into responsive values.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/color)
    */
  var color: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object TextColorProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](color: ResponsiveValue[TVal, ThemeType] = null): TextColorProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextColorProps[ThemeType, TVal]]
  }
}

