package typingsJapgolly.androiduix.android.content.DialogInterface

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDismissListener extends js.Object {
  def onDismiss(dialog: typingsJapgolly.androiduix.android.content.DialogInterface): Unit
}

object OnDismissListener {
  @scala.inline
  def apply(onDismiss: typingsJapgolly.androiduix.android.content.DialogInterface => Callback): OnDismissListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onDismiss")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.content.DialogInterface) => onDismiss(t0).runNow()))
    __obj.asInstanceOf[OnDismissListener]
  }
}

