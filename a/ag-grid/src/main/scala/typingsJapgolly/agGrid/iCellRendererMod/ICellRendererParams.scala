package typingsJapgolly.agGrid.iCellRendererMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.agGrid.colDefMod.ColDef
import typingsJapgolly.agGrid.columnApiMod.ColumnApi
import typingsJapgolly.agGrid.columnMod.Column
import typingsJapgolly.agGrid.gridApiMod.GridApi
import typingsJapgolly.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICellRendererParams extends js.Object {
  @JSName("$scope")
  var $scope: js.Any = js.native
  var api: GridApi = js.native
  var colDef: ColDef = js.native
  var column: Column = js.native
  var columnApi: ColumnApi = js.native
  var context: js.Any = js.native
  var data: js.Any = js.native
  var eGridCell: HTMLElement = js.native
  var eParentOfValue: HTMLElement = js.native
  var node: RowNode = js.native
  var rowIndex: Double = js.native
  var value: js.Any = js.native
  var valueFormatted: js.Any = js.native
  def addRenderedRowListener(eventType: String, listener: js.Function): Unit = js.native
  def formatValue(value: js.Any): js.Any = js.native
  def getValue(): js.Any = js.native
  def refreshCell(): Unit = js.native
  def setValue(value: js.Any): Unit = js.native
}

