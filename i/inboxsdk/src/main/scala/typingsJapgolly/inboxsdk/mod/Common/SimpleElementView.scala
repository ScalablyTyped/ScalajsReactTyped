package typingsJapgolly.inboxsdk.mod.Common

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleElementView extends js.Object {
  var destroyed: Boolean
  var el: HTMLElement
  def destroy(): Unit
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
}

object SimpleElementView {
  @scala.inline
  def apply(
    destroy: Callback,
    destroyed: Boolean,
    el: HTMLElement,
    on: (destroy, js.Function0[Unit]) => Callback
  ): SimpleElementView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: typingsJapgolly.inboxsdk.inboxsdkStrings.destroy, t1: js.Function0[scala.Unit]) => on(t0, t1).runNow()))
    __obj.asInstanceOf[SimpleElementView]
  }
}

