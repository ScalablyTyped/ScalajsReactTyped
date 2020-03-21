package typingsJapgolly.kendoUi.kendo.mobile.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.NavBar")
@js.native
class NavBar protected ()
  extends typingsJapgolly.kendoUi.kendo.ui.Widget {
  def this(element: Element) = this()
  def this(element: Element, options: NavBarOptions) = this()
  @JSName("options")
  var options_NavBar: NavBarOptions = js.native
  var wrapper: JQuery = js.native
  def title(value: String): Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.NavBar")
@js.native
object NavBar extends js.Object {
  var fn: NavBar = js.native
  def extend(proto: js.Object): NavBar = js.native
}

