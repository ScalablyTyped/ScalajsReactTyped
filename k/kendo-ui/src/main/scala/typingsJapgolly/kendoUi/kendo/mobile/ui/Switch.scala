package typingsJapgolly.kendoUi.kendo.mobile.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.Switch")
@js.native
class Switch protected ()
  extends typingsJapgolly.kendoUi.kendo.ui.Widget {
  def this(element: Element) = this()
  def this(element: Element, options: SwitchOptions) = this()
  @JSName("options")
  var options_Switch: SwitchOptions = js.native
  var wrapper: JQuery = js.native
  def check(): Boolean = js.native
  def check(check: Boolean): Unit = js.native
  def enable(enable: Boolean): Unit = js.native
  def refresh(): Unit = js.native
  def toggle(): Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.Switch")
@js.native
object Switch extends js.Object {
  var fn: Switch = js.native
  def extend(proto: js.Object): Switch = js.native
}

