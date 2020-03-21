package typingsJapgolly.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.kendo.data.DataSource
import typingsJapgolly.kendoUi.kendo.data.ObservableArray
import typingsJapgolly.kendoUi.kendo.data.ObservableObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.ListBox")
@js.native
class ListBox protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: ListBoxOptions) = this()
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_ListBox: ListBoxOptions = js.native
  var wrapper: JQuery = js.native
  def clearSelection(): Unit = js.native
  def dataItem(element: String): ObservableObject = js.native
  def dataItem(element: JQuery): ObservableObject = js.native
  def dataItem(element: typingsJapgolly.std.Element): ObservableObject = js.native
  def dataItems(): ObservableArray = js.native
  def enable(element: String): Unit = js.native
  def enable(element: String, enable: Boolean): Unit = js.native
  def enable(element: JQuery): Unit = js.native
  def enable(element: JQuery, enable: Boolean): Unit = js.native
  def enable(element: typingsJapgolly.std.Element): Unit = js.native
  def enable(element: typingsJapgolly.std.Element, enable: Boolean): Unit = js.native
  def items(): js.Any = js.native
  def refresh(): Unit = js.native
  def remove(element: String): Unit = js.native
  def remove(element: js.Any): Unit = js.native
  def remove(element: JQuery): Unit = js.native
  def remove(element: typingsJapgolly.std.Element): Unit = js.native
  def reorder(element: String, index: Double): Unit = js.native
  def reorder(element: JQuery, index: Double): Unit = js.native
  def reorder(element: typingsJapgolly.std.Element, index: Double): Unit = js.native
  def select(): JQuery = js.native
  def select(items: js.Any): Unit = js.native
  def select(items: JQuery): Unit = js.native
  def setDataSource(dataSource: DataSource): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.ListBox")
@js.native
object ListBox extends js.Object {
  var fn: ListBox = js.native
  def extend(proto: js.Object): ListBox = js.native
}

