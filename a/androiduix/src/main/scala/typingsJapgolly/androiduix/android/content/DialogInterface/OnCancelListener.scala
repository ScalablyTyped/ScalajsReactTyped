package typingsJapgolly.androiduix.android.content.DialogInterface

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCancelListener extends js.Object {
  def onCancel(dialog: typingsJapgolly.androiduix.android.content.DialogInterface): Unit
}

object OnCancelListener {
  @scala.inline
  def apply(onCancel: typingsJapgolly.androiduix.android.content.DialogInterface => Callback): OnCancelListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onCancel")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.content.DialogInterface) => onCancel(t0).runNow()))
    __obj.asInstanceOf[OnCancelListener]
  }
}

