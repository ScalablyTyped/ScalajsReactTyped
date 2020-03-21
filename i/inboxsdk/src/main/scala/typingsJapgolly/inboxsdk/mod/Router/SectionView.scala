package typingsJapgolly.inboxsdk.mod.Router

import japgolly.scalajs.react.Callback
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SectionView extends js.Object {
  var destroyed: Boolean
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
  def remove(): Unit
}

object SectionView {
  @scala.inline
  def apply(destroyed: Boolean, on: (destroy, js.Function0[Unit]) => Callback, remove: Callback): SectionView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any])
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: typingsJapgolly.inboxsdk.inboxsdkStrings.destroy, t1: js.Function0[scala.Unit]) => on(t0, t1).runNow()))
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.asInstanceOf[SectionView]
  }
}

