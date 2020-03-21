package typingsJapgolly.baseui.tableMod

import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableProps extends js.Object {
  var columns: js.Array[String | Node]
  var data: js.Array[js.Array[Node]]
  var horizontalScrollWidth: js.UndefOr[String] = js.undefined
  var isLoading: js.UndefOr[Boolean] = js.undefined
}

object TableProps {
  @scala.inline
  def apply(
    columns: js.Array[String | Node],
    data: js.Array[js.Array[Node]],
    horizontalScrollWidth: String = null,
    isLoading: js.UndefOr[Boolean] = js.undefined
  ): TableProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    if (horizontalScrollWidth != null) __obj.updateDynamic("horizontalScrollWidth")(horizontalScrollWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isLoading)) __obj.updateDynamic("isLoading")(isLoading.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableProps]
  }
}

