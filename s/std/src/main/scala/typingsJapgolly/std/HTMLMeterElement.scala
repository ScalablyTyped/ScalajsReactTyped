package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The HTML <meter> elements expose the HTMLMeterElement interface, which provides special properties and methods (beyond the HTMLElement object interface they also have available to them by inheritance) for manipulating the layout and presentation of <meter> elements. */
@js.native
trait HTMLMeterElement extends HTMLElement {
  var high: Double = js.native
  val labels: org.scalajs.dom.raw.NodeListOf[org.scalajs.dom.raw.HTMLLabelElement with org.scalajs.dom.raw.Node] = js.native
  var low: Double = js.native
  var max: Double = js.native
  var min: Double = js.native
  var optimum: Double = js.native
  var value: Double = js.native
}

@JSGlobal("HTMLMeterElement")
@js.native
object HTMLMeterElement extends Instantiable0[HTMLMeterElement]

