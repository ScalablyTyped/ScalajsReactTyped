package typingsJapgolly.kendoUi.kendo.mobile.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.mobile.ui.Loader")
@js.native
class Loader protected ()
  extends typingsJapgolly.kendoUi.kendo.ui.Widget {
  def this(element: Element) = this()
  def this(element: Element, options: LoaderOptions) = this()
  @JSName("options")
  var options_Loader: LoaderOptions = js.native
  var wrapper: JQuery = js.native
  def hide(): Unit = js.native
  def show(): Unit = js.native
}

/* static members */
@JSGlobal("kendo.mobile.ui.Loader")
@js.native
object Loader extends js.Object {
  var fn: Loader = js.native
  def extend(proto: js.Object): Loader = js.native
}

