package typingsJapgolly.signaturePad.mod.SignaturePad

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bezier extends js.Object {
  var control1: CurveControl
  var control2: CurveControl
  var endPoint: Point
  var endWidth: Double
  var startPoint: Point
  var startWidth: Double
  def _point(t: Double, start: Double, c1: Double, c2: Double, end: Double): Double
  def length(): Double
}

object Bezier {
  @scala.inline
  def apply(
    _point: (Double, Double, Double, Double, Double) => CallbackTo[Double],
    control1: CurveControl,
    control2: CurveControl,
    endPoint: Point,
    endWidth: Double,
    length: CallbackTo[Double],
    startPoint: Point,
    startWidth: Double
  ): Bezier = {
    val __obj = js.Dynamic.literal(control1 = control1.asInstanceOf[js.Any], control2 = control2.asInstanceOf[js.Any], endPoint = endPoint.asInstanceOf[js.Any], endWidth = endWidth.asInstanceOf[js.Any], startPoint = startPoint.asInstanceOf[js.Any], startWidth = startWidth.asInstanceOf[js.Any])
    __obj.updateDynamic("_point")(js.Any.fromFunction5((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: scala.Double) => _point(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("length")(length.toJsFn)
    __obj.asInstanceOf[Bezier]
  }
}

