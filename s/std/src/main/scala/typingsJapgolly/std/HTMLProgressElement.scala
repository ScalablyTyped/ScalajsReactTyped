package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties and methods (beyond the regular HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of <progress> elements. */
@js.native
trait HTMLProgressElement extends HTMLElement {
  val labels: org.scalajs.dom.raw.NodeListOf[org.scalajs.dom.raw.HTMLLabelElement with org.scalajs.dom.raw.Node] = js.native
  /**
    * Defines the maximum, or "done" value for a progress element.
    */
  var max: Double = js.native
  /**
    * Returns the quotient of value/max when the value attribute is set (determinate progress bar), or -1 when the value attribute is missing (indeterminate progress bar).
    */
  val position: Double = js.native
  /**
    * Sets or gets the current value of a progress element. The value must be a non-negative number between 0 and the max value.
    */
  var value: Double = js.native
}

@JSGlobal("HTMLProgressElement")
@js.native
object HTMLProgressElement extends Instantiable0[HTMLProgressElement]

