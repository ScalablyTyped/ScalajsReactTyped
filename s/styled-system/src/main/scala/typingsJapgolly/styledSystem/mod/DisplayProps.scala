package typingsJapgolly.styledSystem.mod

import typingsJapgolly.csstype.mod.DisplayProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The display CSS property defines the display type of an element, which consists of the two basic qualities
    * of how an element generates boxes — the outer display type defining how the box participates in flow layout,
    * and the inner display type defining how the children of the box are laid out.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/display)
    */
  var display: js.UndefOr[ResponsiveValue[DisplayProperty, ThemeType]] = js.undefined
}

object DisplayProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](display: ResponsiveValue[DisplayProperty, ThemeType] = null): DisplayProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayProps[ThemeType]]
  }
}

