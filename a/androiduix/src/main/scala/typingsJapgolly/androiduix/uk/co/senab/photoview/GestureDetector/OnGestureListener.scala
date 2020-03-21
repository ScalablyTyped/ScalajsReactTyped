package typingsJapgolly.androiduix.uk.co.senab.photoview.GestureDetector

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGestureListener extends js.Object {
  def onDrag(dx: Double, dy: Double): Unit
  def onFling(startX: Double, startY: Double, velocityX: Double, velocityY: Double): Unit
  def onScale(scaleFactor: Double, focusX: Double, focusY: Double): Unit
}

object OnGestureListener {
  @scala.inline
  def apply(
    onDrag: (Double, Double) => Callback,
    onFling: (Double, Double, Double, Double) => Callback,
    onScale: (Double, Double, Double) => Callback
  ): OnGestureListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onDrag")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => onDrag(t0, t1).runNow()))
    __obj.updateDynamic("onFling")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => onFling(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("onScale")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => onScale(t0, t1, t2).runNow()))
    __obj.asInstanceOf[OnGestureListener]
  }
}

