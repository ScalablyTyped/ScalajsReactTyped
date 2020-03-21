package typingsJapgolly.kendoUi.kendo.mobile.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.Badge")
@js.native
class Badge protected ()
  extends typingsJapgolly.kendoUi.kendo.ui.Widget {
  def this(element: Element) = this()
  def this(element: Element, options: BadgeOptions) = this()
  @JSName("options")
  var options_Badge: BadgeOptions = js.native
  var wrapper: JQuery = js.native
  def hide(): Unit = js.native
  def setOptions(options: js.Any): Unit = js.native
  def show(): Unit = js.native
  def value(newValue: String): Unit = js.native
  def value(newValue: Double): Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.Badge")
@js.native
object Badge extends js.Object {
  var fn: Badge = js.native
  def extend(proto: js.Object): Badge = js.native
}

