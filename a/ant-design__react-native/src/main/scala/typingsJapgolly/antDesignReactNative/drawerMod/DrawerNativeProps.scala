package typingsJapgolly.antDesignReactNative.drawerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.bottom
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.left
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.right
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.top
import typingsJapgolly.antDesignReactNative.drawerPropsTypeMod.DrawerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerNativeProps extends DrawerProps {
  var drawerBackgroundColor: js.UndefOr[String] = js.undefined
  var drawerRef: js.UndefOr[
    js.Function1[/* el */ typingsJapgolly.bang88ReactNativeDrawerLayout.mod.default | Null, Unit]
  ] = js.undefined
  var drawerWidth: js.UndefOr[Double] = js.undefined
}

object DrawerNativeProps {
  @scala.inline
  def apply(
    drawerBackgroundColor: String = null,
    drawerRef: /* el */ typingsJapgolly.bang88ReactNativeDrawerLayout.mod.default | Null => Callback = null,
    drawerWidth: Int | Double = null,
    onOpenChange: /* isOpen */ Boolean => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    position: left | right | top | bottom = null,
    sidebar: VdomNode = null
  ): DrawerNativeProps = {
    val __obj = js.Dynamic.literal()
    if (drawerBackgroundColor != null) __obj.updateDynamic("drawerBackgroundColor")(drawerBackgroundColor.asInstanceOf[js.Any])
    if (drawerRef != null) __obj.updateDynamic("drawerRef")(js.Any.fromFunction1((t0: /* el */ typingsJapgolly.bang88ReactNativeDrawerLayout.mod.default | scala.Null) => drawerRef(t0).runNow()))
    if (drawerWidth != null) __obj.updateDynamic("drawerWidth")(drawerWidth.asInstanceOf[js.Any])
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1((t0: /* isOpen */ scala.Boolean) => onOpenChange(t0).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (sidebar != null) __obj.updateDynamic("sidebar")(sidebar.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerNativeProps]
  }
}

