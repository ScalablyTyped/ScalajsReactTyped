package typingsJapgolly.androiduix.android.view.GestureDetector

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.androiduix.android.view.MotionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDoubleTapListener extends js.Object {
  def onDoubleTap(e: MotionEvent): Boolean
  def onDoubleTapEvent(e: MotionEvent): Boolean
  def onSingleTapConfirmed(e: MotionEvent): Boolean
}

object OnDoubleTapListener {
  @scala.inline
  def apply(
    onDoubleTap: MotionEvent => CallbackTo[Boolean],
    onDoubleTapEvent: MotionEvent => CallbackTo[Boolean],
    onSingleTapConfirmed: MotionEvent => CallbackTo[Boolean]
  ): OnDoubleTapListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onDoubleTap")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.MotionEvent) => onDoubleTap(t0).runNow()))
    __obj.updateDynamic("onDoubleTapEvent")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.MotionEvent) => onDoubleTapEvent(t0).runNow()))
    __obj.updateDynamic("onSingleTapConfirmed")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.MotionEvent) => onSingleTapConfirmed(t0).runNow()))
    __obj.asInstanceOf[OnDoubleTapListener]
  }
}

