package typingsJapgolly.agGrid.headerCompMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.agGrid.columnApiMod.ColumnApi
import typingsJapgolly.agGrid.columnMod.Column
import typingsJapgolly.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHeaderParams extends js.Object {
  var api: GridApi = js.native
  var column: Column = js.native
  var columnApi: ColumnApi = js.native
  var context: js.Any = js.native
  var displayName: String = js.native
  var enableMenu: Boolean = js.native
  var enableSorting: Boolean = js.native
  var template: String = js.native
  def progressSort(): Unit = js.native
  def progressSort(multiSort: Boolean): Unit = js.native
  def setSort(sort: String): Unit = js.native
  def setSort(sort: String, multiSort: Boolean): Unit = js.native
  def showColumnMenu(source: HTMLElement): Unit = js.native
}

