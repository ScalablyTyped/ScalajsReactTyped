package typingsJapgolly.kendoUi.kendo.mobile.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.kendo.data.DataSource
import typingsJapgolly.kendoUi.kendo.data.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.ListView")
@js.native
class ListView protected ()
  extends typingsJapgolly.kendoUi.kendo.ui.Widget {
  def this(element: Element) = this()
  def this(element: Element, options: ListViewOptions) = this()
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_ListView: ListViewOptions = js.native
  var wrapper: JQuery = js.native
  def append(dataItems: js.Any): Unit = js.native
  def items(): JQuery = js.native
  def prepend(dataItems: js.Any): Unit = js.native
  def refresh(): Unit = js.native
  def remove(dataItems: js.Any): Unit = js.native
  def replace(dataItems: js.Any): Unit = js.native
  def setDataItem(item: JQuery, dataItem: Model): Unit = js.native
  def setDataSource(dataSource: DataSource): Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.ListView")
@js.native
object ListView extends js.Object {
  var fn: ListView = js.native
  def extend(proto: js.Object): ListView = js.native
}

