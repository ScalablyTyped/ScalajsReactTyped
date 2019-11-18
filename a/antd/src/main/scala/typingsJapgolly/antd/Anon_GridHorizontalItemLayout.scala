package typingsJapgolly.antd

import typingsJapgolly.antd.antdStrings.horizontal
import typingsJapgolly.antd.antdStrings.vertical
import typingsJapgolly.antd.libListMod.ListGridType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GridHorizontalItemLayout extends js.Object {
  var grid: js.UndefOr[ListGridType] = js.undefined
  var itemLayout: js.UndefOr[horizontal | vertical] = js.undefined
}

object Anon_GridHorizontalItemLayout {
  @scala.inline
  def apply(grid: ListGridType = null, itemLayout: horizontal | vertical = null): Anon_GridHorizontalItemLayout = {
    val __obj = js.Dynamic.literal()
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (itemLayout != null) __obj.updateDynamic("itemLayout")(itemLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GridHorizontalItemLayout]
  }
}

