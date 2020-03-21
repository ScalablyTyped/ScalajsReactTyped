package typingsJapgolly.agGrid.iCellEditorMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import typingsJapgolly.agGrid.columnApiMod.ColumnApi
import typingsJapgolly.agGrid.columnMod.Column
import typingsJapgolly.agGrid.gridApiMod.GridApi
import typingsJapgolly.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICellEditorParams extends js.Object {
  @JSName("$scope")
  var $scope: js.Any = js.native
  var api: GridApi = js.native
  var cellStartedEdit: Boolean = js.native
  var charPress: String = js.native
  var column: Column = js.native
  var columnApi: ColumnApi = js.native
  var context: js.Any = js.native
  var eGridCell: HTMLElement = js.native
  var keyPress: Double = js.native
  var node: RowNode = js.native
  var rowIndex: Double = js.native
  var value: js.Any = js.native
  def formatValue(value: js.Any): js.Any = js.native
  def onKeyDown(event: KeyboardEvent): Unit = js.native
  def parseValue(value: js.Any): js.Any = js.native
  def stopEditing(): Unit = js.native
  def stopEditing(suppressNavigateAfterEdit: Boolean): Unit = js.native
}

