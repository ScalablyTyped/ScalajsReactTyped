package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasFillStrokeStyles extends js.Object {
  var fillStyle: java.lang.String | org.scalajs.dom.raw.CanvasGradient | org.scalajs.dom.raw.CanvasPattern
  var strokeStyle: java.lang.String | org.scalajs.dom.raw.CanvasGradient | org.scalajs.dom.raw.CanvasPattern
  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): org.scalajs.dom.raw.CanvasGradient
  def createPattern(image: CanvasImageSource, repetition: java.lang.String): org.scalajs.dom.raw.CanvasPattern | Null
  def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): org.scalajs.dom.raw.CanvasGradient
}

object CanvasFillStrokeStyles {
  @scala.inline
  def apply(
    createLinearGradient: (Double, Double, Double, Double) => CallbackTo[org.scalajs.dom.raw.CanvasGradient],
    createPattern: (CanvasImageSource, java.lang.String) => CallbackTo[org.scalajs.dom.raw.CanvasPattern | Null],
    createRadialGradient: (Double, Double, Double, Double, Double, Double) => CallbackTo[org.scalajs.dom.raw.CanvasGradient],
    fillStyle: java.lang.String | org.scalajs.dom.raw.CanvasGradient | org.scalajs.dom.raw.CanvasPattern,
    strokeStyle: java.lang.String | org.scalajs.dom.raw.CanvasGradient | org.scalajs.dom.raw.CanvasPattern
  ): CanvasFillStrokeStyles = {
    val __obj = js.Dynamic.literal(fillStyle = fillStyle.asInstanceOf[js.Any], strokeStyle = strokeStyle.asInstanceOf[js.Any])
    __obj.updateDynamic("createLinearGradient")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => createLinearGradient(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("createPattern")(js.Any.fromFunction2((t0: typingsJapgolly.std.CanvasImageSource, t1: java.lang.String) => createPattern(t0, t1).runNow()))
    __obj.updateDynamic("createRadialGradient")(js.Any.fromFunction6((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: scala.Double, t5: scala.Double) => createRadialGradient(t0, t1, t2, t3, t4, t5).runNow()))
    __obj.asInstanceOf[CanvasFillStrokeStyles]
  }
}

