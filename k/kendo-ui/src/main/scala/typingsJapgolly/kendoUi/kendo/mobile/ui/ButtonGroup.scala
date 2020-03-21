package typingsJapgolly.kendoUi.kendo.mobile.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.ButtonGroup")
@js.native
class ButtonGroup protected ()
  extends typingsJapgolly.kendoUi.kendo.ui.Widget {
  def this(element: Element) = this()
  def this(element: Element, options: ButtonGroupOptions) = this()
  @JSName("options")
  var options_ButtonGroup: ButtonGroupOptions = js.native
  var wrapper: JQuery = js.native
  def badge(button: String, value: String): String = js.native
  def badge(button: String, value: Boolean): String = js.native
  def badge(button: Double, value: String): String = js.native
  def badge(button: Double, value: Boolean): String = js.native
  def current(): JQuery = js.native
  def enable(enable: Boolean): Unit = js.native
  def select(li: Double): Unit = js.native
  def select(li: JQuery): Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.ButtonGroup")
@js.native
object ButtonGroup extends js.Object {
  var fn: ButtonGroup = js.native
  def extend(proto: js.Object): ButtonGroup = js.native
}

