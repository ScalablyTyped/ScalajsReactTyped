package typingsJapgolly.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Splitter")
@js.native
class Splitter protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: SplitterOptions) = this()
  @JSName("options")
  var options_Splitter: SplitterOptions = js.native
  var wrapper: JQuery = js.native
  def ajaxRequest(pane: String, url: String, data: String): Unit = js.native
  def ajaxRequest(pane: String, url: String, data: js.Any): Unit = js.native
  def ajaxRequest(pane: JQuery, url: String, data: String): Unit = js.native
  def ajaxRequest(pane: JQuery, url: String, data: js.Any): Unit = js.native
  def ajaxRequest(pane: typingsJapgolly.std.Element, url: String, data: String): Unit = js.native
  def ajaxRequest(pane: typingsJapgolly.std.Element, url: String, data: js.Any): Unit = js.native
  def append(): JQuery = js.native
  def append(config: js.Any): JQuery = js.native
  def collapse(pane: String): Unit = js.native
  def collapse(pane: JQuery): Unit = js.native
  def collapse(pane: typingsJapgolly.std.Element): Unit = js.native
  def expand(pane: String): Unit = js.native
  def expand(pane: JQuery): Unit = js.native
  def expand(pane: typingsJapgolly.std.Element): Unit = js.native
  def insertAfter(config: js.Any, referencePane: String): JQuery = js.native
  def insertAfter(config: js.Any, referencePane: JQuery): JQuery = js.native
  def insertAfter(config: js.Any, referencePane: typingsJapgolly.std.Element): JQuery = js.native
  def insertBefore(config: js.Any, referencePane: String): JQuery = js.native
  def insertBefore(config: js.Any, referencePane: JQuery): JQuery = js.native
  def insertBefore(config: js.Any, referencePane: typingsJapgolly.std.Element): JQuery = js.native
  def max(pane: String, value: String): Unit = js.native
  def max(pane: JQuery, value: String): Unit = js.native
  def max(pane: typingsJapgolly.std.Element, value: String): Unit = js.native
  def min(pane: String, value: String): Unit = js.native
  def min(pane: JQuery, value: String): Unit = js.native
  def min(pane: typingsJapgolly.std.Element, value: String): Unit = js.native
  def remove(pane: String): Unit = js.native
  def remove(pane: JQuery): Unit = js.native
  def remove(pane: typingsJapgolly.std.Element): Unit = js.native
  def size(pane: String): js.Any = js.native
  def size(pane: String, value: String): Unit = js.native
  def size(pane: JQuery): js.Any = js.native
  def size(pane: JQuery, value: String): Unit = js.native
  def size(pane: typingsJapgolly.std.Element): js.Any = js.native
  def size(pane: typingsJapgolly.std.Element, value: String): Unit = js.native
  @JSName("size")
  def size_Unit(pane: String): Unit = js.native
  @JSName("size")
  def size_Unit(pane: JQuery): Unit = js.native
  @JSName("size")
  def size_Unit(pane: typingsJapgolly.std.Element): Unit = js.native
  def toggle(pane: String): Unit = js.native
  def toggle(pane: String, expand: Boolean): Unit = js.native
  def toggle(pane: JQuery): Unit = js.native
  def toggle(pane: JQuery, expand: Boolean): Unit = js.native
  def toggle(pane: typingsJapgolly.std.Element): Unit = js.native
  def toggle(pane: typingsJapgolly.std.Element, expand: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.Splitter")
@js.native
object Splitter extends js.Object {
  var fn: Splitter = js.native
  def extend(proto: js.Object): Splitter = js.native
}

