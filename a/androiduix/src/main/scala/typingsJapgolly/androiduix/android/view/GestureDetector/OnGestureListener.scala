package typingsJapgolly.androiduix.android.view.GestureDetector

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.androiduix.android.view.MotionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGestureListener extends js.Object {
  def onDown(e: MotionEvent): Boolean
  def onFling(e1: MotionEvent, e2: MotionEvent, velocityX: Double, velocityY: Double): Boolean
  def onLongPress(e: MotionEvent): Unit
  def onScroll(e1: MotionEvent, e2: MotionEvent, distanceX: Double, distanceY: Double): Boolean
  def onShowPress(e: MotionEvent): Unit
  def onSingleTapUp(e: MotionEvent): Boolean
}

object OnGestureListener {
  @scala.inline
  def apply(
    onDown: MotionEvent => CallbackTo[Boolean],
    onFling: (MotionEvent, MotionEvent, Double, Double) => CallbackTo[Boolean],
    onLongPress: MotionEvent => Callback,
    onScroll: (MotionEvent, MotionEvent, Double, Double) => CallbackTo[Boolean],
    onShowPress: MotionEvent => Callback,
    onSingleTapUp: MotionEvent => CallbackTo[Boolean]
  ): OnGestureListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onDown")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.MotionEvent) => onDown(t0).runNow()))
    __obj.updateDynamic("onFling")(js.Any.fromFunction4((t0: typingsJapgolly.androiduix.android.view.MotionEvent, t1: typingsJapgolly.androiduix.android.view.MotionEvent, t2: scala.Double, t3: scala.Double) => onFling(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("onLongPress")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.MotionEvent) => onLongPress(t0).runNow()))
    __obj.updateDynamic("onScroll")(js.Any.fromFunction4((t0: typingsJapgolly.androiduix.android.view.MotionEvent, t1: typingsJapgolly.androiduix.android.view.MotionEvent, t2: scala.Double, t3: scala.Double) => onScroll(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("onShowPress")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.MotionEvent) => onShowPress(t0).runNow()))
    __obj.updateDynamic("onSingleTapUp")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.MotionEvent) => onSingleTapUp(t0).runNow()))
    __obj.asInstanceOf[OnGestureListener]
  }
}

