package typingsJapgolly.androiduix.android.content.DialogInterface

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.androiduix.android.view.KeyEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnKeyListener extends js.Object {
  def onKey(
    dialog: typingsJapgolly.androiduix.android.content.DialogInterface,
    keyCode: Double,
    event: KeyEvent
  ): Boolean
}

object OnKeyListener {
  @scala.inline
  def apply(
    onKey: (typingsJapgolly.androiduix.android.content.DialogInterface, Double, KeyEvent) => CallbackTo[Boolean]
  ): OnKeyListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onKey")(js.Any.fromFunction3((t0: typingsJapgolly.androiduix.android.content.DialogInterface, t1: scala.Double, t2: typingsJapgolly.androiduix.android.view.KeyEvent) => onKey(t0, t1, t2).runNow()))
    __obj.asInstanceOf[OnKeyListener]
  }
}

