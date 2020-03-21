package typingsJapgolly.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Dialog")
@js.native
class Dialog protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: DialogOptions) = this()
  var wrapper: JQuery = js.native
  def close(): Dialog = js.native
  def content(): Dialog = js.native
  def content(content: String): Dialog = js.native
  def content(content: JQuery): Dialog = js.native
  @JSName("content")
  def content_String(): String = js.native
  def open(): Dialog = js.native
  def title(): Dialog = js.native
  def title(text: String): Dialog = js.native
  @JSName("title")
  def title_String(): String = js.native
  def toFront(): Dialog = js.native
}

/* static members */
@JSGlobal("kendo.ui.Dialog")
@js.native
object Dialog extends js.Object {
  var fn: Dialog = js.native
  def extend(proto: js.Object): Dialog = js.native
}

