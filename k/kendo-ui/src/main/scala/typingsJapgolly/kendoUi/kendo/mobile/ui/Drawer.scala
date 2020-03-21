package typingsJapgolly.kendoUi.kendo.mobile.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.Drawer")
@js.native
class Drawer protected ()
  extends typingsJapgolly.kendoUi.kendo.ui.Widget {
  def this(element: Element) = this()
  def this(element: Element, options: DrawerOptions) = this()
  @JSName("options")
  var options_Drawer: DrawerOptions = js.native
  var wrapper: JQuery = js.native
  def hide(): Unit = js.native
  def show(): Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.Drawer")
@js.native
object Drawer extends js.Object {
  var fn: Drawer = js.native
  def extend(proto: js.Object): Drawer = js.native
}

