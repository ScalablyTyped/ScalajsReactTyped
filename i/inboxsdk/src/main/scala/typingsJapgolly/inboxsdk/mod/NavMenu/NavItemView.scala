package typingsJapgolly.inboxsdk.mod.NavMenu

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavItemView extends js.Object {
  var destroyed: Boolean
  def addNavItem(navItemDescriptor: NavItemDescriptor): NavItemView
  def isCollapsed(): Boolean
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit
  def remove(): Unit
  def setCollapsed(collapseValue: Boolean): Unit
}

object NavItemView {
  @scala.inline
  def apply(
    addNavItem: NavItemDescriptor => CallbackTo[NavItemView],
    destroyed: Boolean,
    isCollapsed: CallbackTo[Boolean],
    on: (destroy, js.Function0[Unit]) => Callback,
    remove: Callback,
    setCollapsed: Boolean => Callback
  ): NavItemView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any])
    __obj.updateDynamic("addNavItem")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.NavMenu.NavItemDescriptor) => addNavItem(t0).runNow()))
    __obj.updateDynamic("isCollapsed")(isCollapsed.toJsFn)
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: typingsJapgolly.inboxsdk.inboxsdkStrings.destroy, t1: js.Function0[scala.Unit]) => on(t0, t1).runNow()))
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("setCollapsed")(js.Any.fromFunction1((t0: scala.Boolean) => setCollapsed(t0).runNow()))
    __obj.asInstanceOf[NavItemView]
  }
}

