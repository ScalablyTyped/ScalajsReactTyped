package typingsJapgolly.styledSystem.mod

import typingsJapgolly.csstype.mod.GlobalsNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexShrinkProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The flex-shrink CSS property sets the flex shrink factor of a flex item. If the size of all flex items is larger
    * than the flex container, items shrink to fit according to flex-shrink.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-shrink)
    */
  var flexShrink: js.UndefOr[ResponsiveValue[GlobalsNumber, ThemeType]] = js.undefined
}

object FlexShrinkProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](flexShrink: ResponsiveValue[GlobalsNumber, ThemeType] = null): FlexShrinkProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (flexShrink != null) __obj.updateDynamic("flexShrink")(flexShrink.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexShrinkProps[ThemeType]]
  }
}

