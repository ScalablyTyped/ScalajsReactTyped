package typingsJapgolly.svgJs

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDegrees extends js.Object {
  var filterSVGElements: js.Array[HTMLElement]
  def degrees(r: Double): Double
  def filter(array: js.Array[_], block: js.Function): js.Any
  def map(array: js.Array[_], block: js.Function): js.Any
  def radians(d: Double): Double
}

object AnonDegrees {
  @scala.inline
  def apply(
    degrees: Double => CallbackTo[Double],
    filter: (js.Array[js.Any], js.Function) => CallbackTo[js.Any],
    filterSVGElements: js.Array[HTMLElement],
    map: (js.Array[js.Any], js.Function) => CallbackTo[js.Any],
    radians: Double => CallbackTo[Double]
  ): AnonDegrees = {
    val __obj = js.Dynamic.literal(filterSVGElements = filterSVGElements.asInstanceOf[js.Any])
    __obj.updateDynamic("degrees")(js.Any.fromFunction1((t0: scala.Double) => degrees(t0).runNow()))
    __obj.updateDynamic("filter")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: js.Function) => filter(t0, t1).runNow()))
    __obj.updateDynamic("map")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: js.Function) => map(t0, t1).runNow()))
    __obj.updateDynamic("radians")(js.Any.fromFunction1((t0: scala.Double) => radians(t0).runNow()))
    __obj.asInstanceOf[AnonDegrees]
  }
}

