package typingsJapgolly.androiduix.android.view.Window

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.androiduix.android.view.KeyEvent
import typingsJapgolly.androiduix.android.view.MotionEvent
import typingsJapgolly.androiduix.android.view.WindowManager.LayoutParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  def dispatchGenericMotionEvent(event: MotionEvent): Boolean
  def dispatchKeyEvent(event: KeyEvent): Boolean
  def dispatchTouchEvent(event: MotionEvent): Boolean
  def onAttachedToWindow(): Unit
  def onContentChanged(): Unit
  def onDetachedFromWindow(): Unit
  def onWindowAttributesChanged(attrs: LayoutParams): Unit
  def onWindowFocusChanged(hasFocus: Boolean): Unit
}

object Callback {
  @scala.inline
  def apply(
    dispatchGenericMotionEvent: MotionEvent => CallbackTo[Boolean],
    dispatchKeyEvent: KeyEvent => CallbackTo[Boolean],
    dispatchTouchEvent: MotionEvent => CallbackTo[Boolean],
    onAttachedToWindow: japgolly.scalajs.react.Callback,
    onContentChanged: japgolly.scalajs.react.Callback,
    onDetachedFromWindow: japgolly.scalajs.react.Callback,
    onWindowAttributesChanged: LayoutParams => japgolly.scalajs.react.Callback,
    onWindowFocusChanged: Boolean => japgolly.scalajs.react.Callback
  ): Callback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispatchGenericMotionEvent")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.MotionEvent) => dispatchGenericMotionEvent(t0).runNow()))
    __obj.updateDynamic("dispatchKeyEvent")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.KeyEvent) => dispatchKeyEvent(t0).runNow()))
    __obj.updateDynamic("dispatchTouchEvent")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.MotionEvent) => dispatchTouchEvent(t0).runNow()))
    __obj.updateDynamic("onAttachedToWindow")(onAttachedToWindow.toJsFn)
    __obj.updateDynamic("onContentChanged")(onContentChanged.toJsFn)
    __obj.updateDynamic("onDetachedFromWindow")(onDetachedFromWindow.toJsFn)
    __obj.updateDynamic("onWindowAttributesChanged")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.view.WindowManager.LayoutParams) => onWindowAttributesChanged(t0).runNow()))
    __obj.updateDynamic("onWindowFocusChanged")(js.Any.fromFunction1((t0: scala.Boolean) => onWindowFocusChanged(t0).runNow()))
    __obj.asInstanceOf[Callback]
  }
}

