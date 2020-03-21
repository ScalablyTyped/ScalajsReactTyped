package typingsJapgolly.signaturePad.mod.SignaturePad

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var time: Double
  var x: Double
  var y: Double
  def distanceTo(start: Point): Double
  def velocityFrom(start: Point): Double
}

object Point {
  @scala.inline
  def apply(
    distanceTo: Point => CallbackTo[Double],
    time: Double,
    velocityFrom: Point => CallbackTo[Double],
    x: Double,
    y: Double,
    color: String = null
  ): Point = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("distanceTo")(js.Any.fromFunction1((t0: typingsJapgolly.signaturePad.mod.SignaturePad.Point) => distanceTo(t0).runNow()))
    __obj.updateDynamic("velocityFrom")(js.Any.fromFunction1((t0: typingsJapgolly.signaturePad.mod.SignaturePad.Point) => velocityFrom(t0).runNow()))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

