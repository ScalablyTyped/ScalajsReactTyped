package typingsJapgolly.antd.libTableInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SorterResult[T] extends js.Object {
  var column: ColumnProps[T]
  var columnKey: String
  var field: String
  var order: SortOrder
}

object SorterResult {
  @scala.inline
  def apply[T](column: ColumnProps[T], columnKey: String, field: String, order: SortOrder): SorterResult[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnKey = columnKey.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SorterResult[T]]
  }
}

