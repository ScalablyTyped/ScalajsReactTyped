package typingsJapgolly.inboxsdk.mod.NavMenu

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavMenuInstance extends js.Object {
  def addNavItem(navItemDescriptor: NavItemDescriptor): NavItemView
}

object NavMenuInstance {
  @scala.inline
  def apply(addNavItem: NavItemDescriptor => CallbackTo[NavItemView]): NavMenuInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addNavItem")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.NavMenu.NavItemDescriptor) => addNavItem(t0).runNow()))
    __obj.asInstanceOf[NavMenuInstance]
  }
}

