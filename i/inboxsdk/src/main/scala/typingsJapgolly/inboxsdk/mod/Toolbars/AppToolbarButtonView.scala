package typingsJapgolly.inboxsdk.mod.Toolbars

import japgolly.scalajs.react.Callback
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppToolbarButtonView extends js.Object {
  var destroyed: Boolean
  def close(): Unit
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
  def open(): Unit
  def remove(): Unit
}

object AppToolbarButtonView {
  @scala.inline
  def apply(
    close: Callback,
    destroyed: Boolean,
    on: (destroy, js.Function0[Unit]) => Callback,
    open: Callback,
    remove: Callback
  ): AppToolbarButtonView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: typingsJapgolly.inboxsdk.inboxsdkStrings.destroy, t1: js.Function0[scala.Unit]) => on(t0, t1).runNow()))
    __obj.updateDynamic("open")(open.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.asInstanceOf[AppToolbarButtonView]
  }
}

