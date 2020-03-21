package typingsJapgolly.reactTable.mod

import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseGroupByRowProps[D /* <: js.Object */] extends js.Object {
  var depth: Double
  var groupById: IdType[D]
  var groupByVal: String
  var id: String
  var index: Double
  var isGrouped: Boolean
  var subRows: js.Array[Row[D]]
  var values: Record[IdType[D], AggregatedValue]
}

object UseGroupByRowProps {
  @scala.inline
  def apply[D /* <: js.Object */](
    depth: Double,
    groupById: IdType[D],
    groupByVal: String,
    id: String,
    index: Double,
    isGrouped: Boolean,
    subRows: js.Array[Row[D]],
    values: Record[IdType[D], AggregatedValue]
  ): UseGroupByRowProps[D] = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], groupById = groupById.asInstanceOf[js.Any], groupByVal = groupByVal.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], subRows = subRows.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UseGroupByRowProps[D]]
  }
}

