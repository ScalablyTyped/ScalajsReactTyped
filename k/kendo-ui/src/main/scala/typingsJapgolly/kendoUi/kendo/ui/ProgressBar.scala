package typingsJapgolly.kendoUi.kendo.ui

import org.scalajs.dom.raw.Element
import typingsJapgolly.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.ProgressBar")
@js.native
class ProgressBar protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: ProgressBarOptions) = this()
  @JSName("options")
  var options_ProgressBar: ProgressBarOptions = js.native
  var progressStatus: JQuery = js.native
  var progressWrapper: JQuery = js.native
  var wrapper: JQuery = js.native
  def enable(enable: Boolean): Unit = js.native
  def value(): Double = js.native
  def value(value: Double): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.ProgressBar")
@js.native
object ProgressBar extends js.Object {
  var fn: ProgressBar = js.native
  def extend(proto: js.Object): ProgressBar = js.native
}

