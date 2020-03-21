package typingsJapgolly.antd.useSorterMod

import typingsJapgolly.antd.tableInterfaceMod.ColumnsType
import typingsJapgolly.antd.tableInterfaceMod.SortOrder
import typingsJapgolly.antd.tableInterfaceMod.SorterResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SorterConfig[RecordType] extends js.Object {
  var columns: ColumnsType[RecordType] = js.native
  var prefixCls: String = js.native
  var sortDirections: js.Array[SortOrder] = js.native
  def onSorterChange(sorterResult: js.Array[SorterResult[RecordType]], sortStates: js.Array[SortState[RecordType]]): Unit = js.native
  def onSorterChange(sorterResult: SorterResult[RecordType], sortStates: js.Array[SortState[RecordType]]): Unit = js.native
}

