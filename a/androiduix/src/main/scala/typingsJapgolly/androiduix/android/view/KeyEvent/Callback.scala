package typingsJapgolly.androiduix.android.view.KeyEvent

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  def onKeyDown(keyCode: Double, event: typingsJapgolly.androiduix.android.view.KeyEvent): Boolean
  def onKeyLongPress(keyCode: Double, event: typingsJapgolly.androiduix.android.view.KeyEvent): Boolean
  def onKeyUp(keyCode: Double, event: typingsJapgolly.androiduix.android.view.KeyEvent): Boolean
}

object Callback {
  @scala.inline
  def apply(
    onKeyDown: (Double, typingsJapgolly.androiduix.android.view.KeyEvent) => CallbackTo[Boolean],
    onKeyLongPress: (Double, typingsJapgolly.androiduix.android.view.KeyEvent) => CallbackTo[Boolean],
    onKeyUp: (Double, typingsJapgolly.androiduix.android.view.KeyEvent) => CallbackTo[Boolean]
  ): Callback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onKeyDown")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.androiduix.android.view.KeyEvent) => onKeyDown(t0, t1).runNow()))
    __obj.updateDynamic("onKeyLongPress")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.androiduix.android.view.KeyEvent) => onKeyLongPress(t0, t1).runNow()))
    __obj.updateDynamic("onKeyUp")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.androiduix.android.view.KeyEvent) => onKeyUp(t0, t1).runNow()))
    __obj.asInstanceOf[Callback]
  }
}

