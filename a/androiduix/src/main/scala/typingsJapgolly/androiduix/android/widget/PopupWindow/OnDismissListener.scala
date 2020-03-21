package typingsJapgolly.androiduix.android.widget.PopupWindow

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDismissListener extends js.Object {
  def onDismiss(): Unit
}

object OnDismissListener {
  @scala.inline
  def apply(onDismiss: Callback): OnDismissListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onDismiss")(onDismiss.toJsFn)
    __obj.asInstanceOf[OnDismissListener]
  }
}

