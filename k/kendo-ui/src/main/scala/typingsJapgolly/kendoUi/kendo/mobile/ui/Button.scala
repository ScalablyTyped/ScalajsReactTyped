package typingsJapgolly.kendoUi.kendo.mobile.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.Button")
@js.native
class Button protected ()
  extends typingsJapgolly.kendoUi.kendo.ui.Widget {
  def this(element: Element) = this()
  def this(element: Element, options: ButtonOptions) = this()
  @JSName("options")
  var options_Button: ButtonOptions = js.native
  var wrapper: JQuery = js.native
  def badge(value: String): String = js.native
  def badge(value: Boolean): String = js.native
  def enable(enable: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.Button")
@js.native
object Button extends js.Object {
  var fn: Button = js.native
  def extend(proto: js.Object): Button = js.native
}

