package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasRect extends js.Object {
  def clearRect(x: Double, y: Double, w: Double, h: Double): Unit
  def fillRect(x: Double, y: Double, w: Double, h: Double): Unit
  def strokeRect(x: Double, y: Double, w: Double, h: Double): Unit
}

object CanvasRect {
  @scala.inline
  def apply(
    clearRect: (Double, Double, Double, Double) => Callback,
    fillRect: (Double, Double, Double, Double) => Callback,
    strokeRect: (Double, Double, Double, Double) => Callback
  ): CanvasRect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearRect")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => clearRect(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("fillRect")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => fillRect(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("strokeRect")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => strokeRect(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[CanvasRect]
  }
}

