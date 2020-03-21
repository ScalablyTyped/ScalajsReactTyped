package typingsJapgolly.styledSystem.mod

import typingsJapgolly.csstype.mod.GlobalsNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexGrowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The flex-grow CSS property sets the flex grow factor of a flex item main size. It specifies how much of the
    * remaining space in the flex container should be assigned to the item (the flex grow factor).
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex-grow)
    */
  var flexGrow: js.UndefOr[ResponsiveValue[GlobalsNumber, ThemeType]] = js.undefined
}

object FlexGrowProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](flexGrow: ResponsiveValue[GlobalsNumber, ThemeType] = null): FlexGrowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexGrowProps[ThemeType]]
  }
}

