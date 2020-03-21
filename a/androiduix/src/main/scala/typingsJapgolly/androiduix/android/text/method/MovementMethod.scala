package typingsJapgolly.androiduix.android.text.method

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.androiduix.android.text.Spannable
import typingsJapgolly.androiduix.android.view.KeyEvent
import typingsJapgolly.androiduix.android.view.MotionEvent
import typingsJapgolly.androiduix.android.widget.TextView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MovementMethod extends js.Object {
  def canSelectArbitrarily(): Boolean
  def initialize(widget: TextView, text: Spannable): Unit
  def onGenericMotionEvent(widget: TextView, text: Spannable, event: MotionEvent): Boolean
  def onKeyDown(widget: TextView, text: Spannable, keyCode: Double, event: KeyEvent): Boolean
  def onKeyOther(view: TextView, text: Spannable, event: KeyEvent): Boolean
  def onKeyUp(widget: TextView, text: Spannable, keyCode: Double, event: KeyEvent): Boolean
  def onTakeFocus(widget: TextView, text: Spannable, direction: Double): Unit
  def onTouchEvent(widget: TextView, text: Spannable, event: MotionEvent): Boolean
  def onTrackballEvent(widget: TextView, text: Spannable, event: MotionEvent): Boolean
}

object MovementMethod {
  @scala.inline
  def apply(
    canSelectArbitrarily: CallbackTo[Boolean],
    initialize: (TextView, Spannable) => Callback,
    onGenericMotionEvent: (TextView, Spannable, MotionEvent) => CallbackTo[Boolean],
    onKeyDown: (TextView, Spannable, Double, KeyEvent) => CallbackTo[Boolean],
    onKeyOther: (TextView, Spannable, KeyEvent) => CallbackTo[Boolean],
    onKeyUp: (TextView, Spannable, Double, KeyEvent) => CallbackTo[Boolean],
    onTakeFocus: (TextView, Spannable, Double) => Callback,
    onTouchEvent: (TextView, Spannable, MotionEvent) => CallbackTo[Boolean],
    onTrackballEvent: (TextView, Spannable, MotionEvent) => CallbackTo[Boolean]
  ): MovementMethod = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canSelectArbitrarily")(canSelectArbitrarily.toJsFn)
    __obj.updateDynamic("initialize")(js.Any.fromFunction2((t0: typingsJapgolly.androiduix.android.widget.TextView, t1: typingsJapgolly.androiduix.android.text.Spannable) => initialize(t0, t1).runNow()))
    __obj.updateDynamic("onGenericMotionEvent")(js.Any.fromFunction3((t0: typingsJapgolly.androiduix.android.widget.TextView, t1: typingsJapgolly.androiduix.android.text.Spannable, t2: typingsJapgolly.androiduix.android.view.MotionEvent) => onGenericMotionEvent(t0, t1, t2).runNow()))
    __obj.updateDynamic("onKeyDown")(js.Any.fromFunction4((t0: typingsJapgolly.androiduix.android.widget.TextView, t1: typingsJapgolly.androiduix.android.text.Spannable, t2: scala.Double, t3: typingsJapgolly.androiduix.android.view.KeyEvent) => onKeyDown(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("onKeyOther")(js.Any.fromFunction3((t0: typingsJapgolly.androiduix.android.widget.TextView, t1: typingsJapgolly.androiduix.android.text.Spannable, t2: typingsJapgolly.androiduix.android.view.KeyEvent) => onKeyOther(t0, t1, t2).runNow()))
    __obj.updateDynamic("onKeyUp")(js.Any.fromFunction4((t0: typingsJapgolly.androiduix.android.widget.TextView, t1: typingsJapgolly.androiduix.android.text.Spannable, t2: scala.Double, t3: typingsJapgolly.androiduix.android.view.KeyEvent) => onKeyUp(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("onTakeFocus")(js.Any.fromFunction3((t0: typingsJapgolly.androiduix.android.widget.TextView, t1: typingsJapgolly.androiduix.android.text.Spannable, t2: scala.Double) => onTakeFocus(t0, t1, t2).runNow()))
    __obj.updateDynamic("onTouchEvent")(js.Any.fromFunction3((t0: typingsJapgolly.androiduix.android.widget.TextView, t1: typingsJapgolly.androiduix.android.text.Spannable, t2: typingsJapgolly.androiduix.android.view.MotionEvent) => onTouchEvent(t0, t1, t2).runNow()))
    __obj.updateDynamic("onTrackballEvent")(js.Any.fromFunction3((t0: typingsJapgolly.androiduix.android.widget.TextView, t1: typingsJapgolly.androiduix.android.text.Spannable, t2: typingsJapgolly.androiduix.android.view.MotionEvent) => onTrackballEvent(t0, t1, t2).runNow()))
    __obj.asInstanceOf[MovementMethod]
  }
}

