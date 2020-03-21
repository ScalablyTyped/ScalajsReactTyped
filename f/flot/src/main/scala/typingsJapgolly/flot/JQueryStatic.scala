package typingsJapgolly.flot

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.flot.jquery.flot.dataSeries
import typingsJapgolly.flot.jquery.flot.plotOptions
import typingsJapgolly.flot.jquery.flot.plotStatic
import typingsJapgolly.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  @JSName("plot")
  var plot_Original: plotStatic = js.native
  def plot(placeholder: JQuery_[HTMLElement], data: js.Array[_ | dataSeries]): typingsJapgolly.flot.jquery.flot.plot = js.native
  def plot(placeholder: JQuery_[HTMLElement], data: js.Array[_ | dataSeries], options: plotOptions): typingsJapgolly.flot.jquery.flot.plot = js.native
}

