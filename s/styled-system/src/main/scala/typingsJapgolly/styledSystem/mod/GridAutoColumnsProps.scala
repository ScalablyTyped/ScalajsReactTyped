package typingsJapgolly.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridAutoColumnsProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The grid-auto-columns CSS property specifies the size of an implicitly-created grid column track.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-auto-columns)
    */
  var gridAutoColumns: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object GridAutoColumnsProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](gridAutoColumns: ResponsiveValue[TVal, ThemeType] = null): GridAutoColumnsProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (gridAutoColumns != null) __obj.updateDynamic("gridAutoColumns")(gridAutoColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridAutoColumnsProps[ThemeType, TVal]]
  }
}

