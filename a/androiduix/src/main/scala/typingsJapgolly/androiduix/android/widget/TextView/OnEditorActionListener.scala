package typingsJapgolly.androiduix.android.widget.TextView

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.androiduix.android.view.KeyEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnEditorActionListener extends js.Object {
  def onEditorAction(v: typingsJapgolly.androiduix.android.widget.TextView, actionId: Double, event: KeyEvent): Boolean
}

object OnEditorActionListener {
  @scala.inline
  def apply(
    onEditorAction: (typingsJapgolly.androiduix.android.widget.TextView, Double, KeyEvent) => CallbackTo[Boolean]
  ): OnEditorActionListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onEditorAction")(js.Any.fromFunction3((t0: typingsJapgolly.androiduix.android.widget.TextView, t1: scala.Double, t2: typingsJapgolly.androiduix.android.view.KeyEvent) => onEditorAction(t0, t1, t2).runNow()))
    __obj.asInstanceOf[OnEditorActionListener]
  }
}

