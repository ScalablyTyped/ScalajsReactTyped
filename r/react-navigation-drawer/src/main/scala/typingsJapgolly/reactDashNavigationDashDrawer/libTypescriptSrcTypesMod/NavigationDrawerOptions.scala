package typingsJapgolly.reactDashNavigationDashDrawer.libTypescriptSrcTypesMod

import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationDrawerOptions extends js.Object {
  var drawerIcon: js.UndefOr[Node | (js.Function1[/* props */ DrawerIconProps, Node])] = js.undefined
  var drawerLabel: js.UndefOr[Node | (js.Function1[/* props */ DrawerLabelProps, Node])] = js.undefined
  var drawerLockMode: js.UndefOr[DrawerLockMode] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object NavigationDrawerOptions {
  @scala.inline
  def apply(
    drawerIcon: Node | (js.Function1[/* props */ DrawerIconProps, Node]) = null,
    drawerLabel: Node | (js.Function1[/* props */ DrawerLabelProps, Node]) = null,
    drawerLockMode: DrawerLockMode = null,
    title: String = null
  ): NavigationDrawerOptions = {
    val __obj = js.Dynamic.literal()
    if (drawerIcon != null) __obj.updateDynamic("drawerIcon")(drawerIcon.asInstanceOf[js.Any])
    if (drawerLabel != null) __obj.updateDynamic("drawerLabel")(drawerLabel.asInstanceOf[js.Any])
    if (drawerLockMode != null) __obj.updateDynamic("drawerLockMode")(drawerLockMode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDrawerOptions]
  }
}

