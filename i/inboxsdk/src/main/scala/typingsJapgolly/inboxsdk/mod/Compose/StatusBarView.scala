package typingsJapgolly.inboxsdk.mod.Compose

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import typingsJapgolly.inboxsdk.mod.Common.SimpleElementView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusBarView extends SimpleElementView {
  def setHeight(height: Double): Unit
}

object StatusBarView {
  @scala.inline
  def apply(
    destroy: Callback,
    destroyed: Boolean,
    el: HTMLElement,
    on: (destroy, js.Function0[Unit]) => Callback,
    setHeight: Double => Callback
  ): StatusBarView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: typingsJapgolly.inboxsdk.inboxsdkStrings.destroy, t1: js.Function0[scala.Unit]) => on(t0, t1).runNow()))
    __obj.updateDynamic("setHeight")(js.Any.fromFunction1((t0: scala.Double) => setHeight(t0).runNow()))
    __obj.asInstanceOf[StatusBarView]
  }
}

