package typingsJapgolly.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  var size: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object SizeProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](size: ResponsiveValue[TVal, ThemeType] = null): SizeProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeProps[ThemeType, TVal]]
  }
}

