package typingsJapgolly.androiduix.android.view.ScaleGestureDetector

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnScaleGestureListener extends js.Object {
  def onScale(detector: typingsJapgolly.androiduix.android.view.ScaleGestureDetector): Boolean
  def onScaleBegin(detector: typingsJapgolly.androiduix.android.view.ScaleGestureDetector): Boolean
  def onScaleEnd(detector: typingsJapgolly.androiduix.android.view.ScaleGestureDetector): Unit
}

object OnScaleGestureListener {
  @scala.inline
  def apply(
    onScale: typingsJapgolly.androiduix.android.view.ScaleGestureDetector => CallbackTo[Boolean],
    onScaleBegin: typingsJapgolly.androiduix.android.view.ScaleGestureDetector => CallbackTo[Boolean],
    onScaleEnd: typingsJapgolly.androiduix.android.view.ScaleGestureDetector => Callback
  ): OnScaleGestureListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onScale")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.ScaleGestureDetector) => onScale(t0).runNow()))
    __obj.updateDynamic("onScaleBegin")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.ScaleGestureDetector) => onScaleBegin(t0).runNow()))
    __obj.updateDynamic("onScaleEnd")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.ScaleGestureDetector) => onScaleEnd(t0).runNow()))
    __obj.asInstanceOf[OnScaleGestureListener]
  }
}

