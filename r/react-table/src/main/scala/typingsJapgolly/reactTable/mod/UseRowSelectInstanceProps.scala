package typingsJapgolly.reactTable.mod

import typingsJapgolly.reactTable.PartialTableToggleAllRows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseRowSelectInstanceProps[D /* <: js.Object */] extends js.Object {
  var isAllRowsSelected: Boolean = js.native
  var selectedFlatRows: js.Array[Row[D]] = js.native
  def getToggleAllRowsSelectedProps(): TableToggleAllRowsSelectedProps = js.native
  def getToggleAllRowsSelectedProps(props: PartialTableToggleAllRows): TableToggleAllRowsSelectedProps = js.native
  def toggleAllRowsSelected(): Unit = js.native
  def toggleAllRowsSelected(set: Boolean): Unit = js.native
  def toggleRowSelected(rowId: IdType[D]): Unit = js.native
  def toggleRowSelected(rowId: IdType[D], set: Boolean): Unit = js.native
}

