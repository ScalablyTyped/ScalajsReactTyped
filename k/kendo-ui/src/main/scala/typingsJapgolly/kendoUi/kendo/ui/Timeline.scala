package typingsJapgolly.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.kendo.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Timeline")
@js.native
class Timeline protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: TimelineOptions) = this()
  var dataSource: DataSource = js.native
  @JSName("options")
  var options_Timeline: TimelineOptions = js.native
  var wrapper: JQuery = js.native
  def collapse(event: String): Unit = js.native
  def collapse(event: JQuery): Unit = js.native
  def collapse(event: typingsJapgolly.std.Element): Unit = js.native
  def expand(event: String): Unit = js.native
  def expand(event: JQuery): Unit = js.native
  def expand(event: typingsJapgolly.std.Element): Unit = js.native
  def next(): Unit = js.native
  def open(event: String): Unit = js.native
  def open(event: JQuery): Unit = js.native
  def open(event: typingsJapgolly.std.Element): Unit = js.native
  def previous(): Unit = js.native
  def redraw(): Unit = js.native
  def setDataSource(dataSource: DataSource): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.Timeline")
@js.native
object Timeline extends js.Object {
  var fn: Timeline = js.native
  def extend(proto: js.Object): Timeline = js.native
}

