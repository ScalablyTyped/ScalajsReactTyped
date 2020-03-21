package typingsJapgolly.inboxsdk.mod.Widgets

import japgolly.scalajs.react.Callback
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalView extends js.Object {
  var destroyed: Boolean
  def close(): Unit
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
}

object ModalView {
  @scala.inline
  def apply(close: Callback, destroyed: Boolean, on: (destroy, js.Function0[Unit]) => Callback): ModalView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: typingsJapgolly.inboxsdk.inboxsdkStrings.destroy, t1: js.Function0[scala.Unit]) => on(t0, t1).runNow()))
    __obj.asInstanceOf[ModalView]
  }
}

