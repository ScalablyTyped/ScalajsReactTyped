package typingsJapgolly.androiduix.android.content.DialogInterface

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnShowListener extends js.Object {
  def onShow(dialog: typingsJapgolly.androiduix.android.content.DialogInterface): Unit
}

object OnShowListener {
  @scala.inline
  def apply(onShow: typingsJapgolly.androiduix.android.content.DialogInterface => Callback): OnShowListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.content.DialogInterface) => onShow(t0).runNow()))
    __obj.asInstanceOf[OnShowListener]
  }
}

