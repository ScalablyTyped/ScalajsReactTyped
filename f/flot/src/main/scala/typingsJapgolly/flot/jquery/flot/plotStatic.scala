package typingsJapgolly.flot.jquery.flot

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait plotStatic extends js.Object {
  var plugins: js.Array[plugin] = js.native
  def apply(placeholder: JQuery_[HTMLElement], data: js.Array[_ | dataSeries]): plot = js.native
  def apply(placeholder: JQuery_[HTMLElement], data: js.Array[_ | dataSeries], options: plotOptions): plot = js.native
}

