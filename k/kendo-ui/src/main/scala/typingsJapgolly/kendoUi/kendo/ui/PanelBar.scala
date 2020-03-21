package typingsJapgolly.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.kendo.data.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.PanelBar")
@js.native
class PanelBar protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: PanelBarOptions) = this()
  @JSName("options")
  var options_PanelBar: PanelBarOptions = js.native
  var wrapper: JQuery = js.native
  def append(item: String): PanelBar = js.native
  def append(item: String, referenceItem: String): PanelBar = js.native
  def append(item: String, referenceItem: JQuery): PanelBar = js.native
  def append(item: String, referenceItem: typingsJapgolly.std.Element): PanelBar = js.native
  def append(item: js.Any): PanelBar = js.native
  def append(item: js.Any, referenceItem: String): PanelBar = js.native
  def append(item: js.Any, referenceItem: JQuery): PanelBar = js.native
  def append(item: js.Any, referenceItem: typingsJapgolly.std.Element): PanelBar = js.native
  def append(item: JQuery): PanelBar = js.native
  def append(item: JQuery, referenceItem: String): PanelBar = js.native
  def append(item: JQuery, referenceItem: JQuery): PanelBar = js.native
  def append(item: JQuery, referenceItem: typingsJapgolly.std.Element): PanelBar = js.native
  def append(item: typingsJapgolly.std.Element): PanelBar = js.native
  def append(item: typingsJapgolly.std.Element, referenceItem: String): PanelBar = js.native
  def append(item: typingsJapgolly.std.Element, referenceItem: JQuery): PanelBar = js.native
  def append(item: typingsJapgolly.std.Element, referenceItem: typingsJapgolly.std.Element): PanelBar = js.native
  def clearSelection(): Unit = js.native
  def collapse(element: String, useAnimation: Boolean): PanelBar = js.native
  def collapse(element: JQuery, useAnimation: Boolean): PanelBar = js.native
  def collapse(element: typingsJapgolly.std.Element, useAnimation: Boolean): PanelBar = js.native
  def dataItem(node: String): Node = js.native
  def dataItem(node: JQuery): Node = js.native
  def dataItem(node: typingsJapgolly.std.Element): Node = js.native
  def enable(element: String, enable: Boolean): Unit = js.native
  def enable(element: JQuery, enable: Boolean): Unit = js.native
  def enable(element: typingsJapgolly.std.Element, enable: Boolean): Unit = js.native
  def expand(element: String, useAnimation: Boolean): PanelBar = js.native
  def expand(element: JQuery, useAnimation: Boolean): PanelBar = js.native
  def expand(element: typingsJapgolly.std.Element, useAnimation: Boolean): PanelBar = js.native
  def insertAfter(item: String, referenceItem: String): Unit = js.native
  def insertAfter(item: String, referenceItem: JQuery): Unit = js.native
  def insertAfter(item: String, referenceItem: typingsJapgolly.std.Element): Unit = js.native
  def insertAfter(item: js.Any, referenceItem: String): Unit = js.native
  def insertAfter(item: js.Any, referenceItem: JQuery): Unit = js.native
  def insertAfter(item: js.Any, referenceItem: typingsJapgolly.std.Element): Unit = js.native
  def insertAfter(item: JQuery, referenceItem: String): Unit = js.native
  def insertAfter(item: JQuery, referenceItem: JQuery): Unit = js.native
  def insertAfter(item: JQuery, referenceItem: typingsJapgolly.std.Element): Unit = js.native
  def insertAfter(item: typingsJapgolly.std.Element, referenceItem: String): Unit = js.native
  def insertAfter(item: typingsJapgolly.std.Element, referenceItem: JQuery): Unit = js.native
  def insertAfter(item: typingsJapgolly.std.Element, referenceItem: typingsJapgolly.std.Element): Unit = js.native
  def insertBefore(item: String, referenceItem: String): PanelBar = js.native
  def insertBefore(item: String, referenceItem: JQuery): PanelBar = js.native
  def insertBefore(item: String, referenceItem: typingsJapgolly.std.Element): PanelBar = js.native
  def insertBefore(item: js.Any, referenceItem: String): PanelBar = js.native
  def insertBefore(item: js.Any, referenceItem: JQuery): PanelBar = js.native
  def insertBefore(item: js.Any, referenceItem: typingsJapgolly.std.Element): PanelBar = js.native
  def insertBefore(item: JQuery, referenceItem: String): PanelBar = js.native
  def insertBefore(item: JQuery, referenceItem: JQuery): PanelBar = js.native
  def insertBefore(item: JQuery, referenceItem: typingsJapgolly.std.Element): PanelBar = js.native
  def insertBefore(item: typingsJapgolly.std.Element, referenceItem: String): PanelBar = js.native
  def insertBefore(item: typingsJapgolly.std.Element, referenceItem: JQuery): PanelBar = js.native
  def insertBefore(item: typingsJapgolly.std.Element, referenceItem: typingsJapgolly.std.Element): PanelBar = js.native
  def reload(element: String): Unit = js.native
  def reload(element: JQuery): Unit = js.native
  def reload(element: typingsJapgolly.std.Element): Unit = js.native
  def remove(element: String): Unit = js.native
  def remove(element: JQuery): Unit = js.native
  def remove(element: typingsJapgolly.std.Element): Unit = js.native
  def select(): Unit = js.native
  def select(element: String): Unit = js.native
  def select(element: JQuery): Unit = js.native
  def select(element: typingsJapgolly.std.Element): Unit = js.native
  @JSName("select")
  def select_JQuery(): JQuery = js.native
}

/* static members */
@JSGlobal("kendo.ui.PanelBar")
@js.native
object PanelBar extends js.Object {
  var fn: PanelBar = js.native
  def extend(proto: js.Object): PanelBar = js.native
}

