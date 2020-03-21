package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.bottom
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.left
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.right
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.top
import typingsJapgolly.antdMobileRn.drawerIndexNativeMod.DrawerNativeProps
import typingsJapgolly.reactNativeDrawerLayout.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Drawer {
  def apply(
    drawerBackgroundColor: String = null,
    drawerRef: /* el */ default | Null => Callback = null,
    drawerWidth: Int | Double = null,
    onOpenChange: /* isOpen */ Boolean => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    position: left | right | top | bottom = null,
    sidebar: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DrawerNativeProps, typingsJapgolly.antdMobileRn.mod.Drawer, Unit, DrawerNativeProps] = {
    val __obj = js.Dynamic.literal()
  
      if (drawerBackgroundColor != null) __obj.updateDynamic("drawerBackgroundColor")(drawerBackgroundColor.asInstanceOf[js.Any])
    if (drawerRef != null) __obj.updateDynamic("drawerRef")(js.Any.fromFunction1((t0: /* el */ typingsJapgolly.reactNativeDrawerLayout.mod.default | scala.Null) => drawerRef(t0).runNow()))
    if (drawerWidth != null) __obj.updateDynamic("drawerWidth")(drawerWidth.asInstanceOf[js.Any])
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1((t0: /* isOpen */ scala.Boolean) => onOpenChange(t0).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (sidebar != null) __obj.updateDynamic("sidebar")(sidebar.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.drawerIndexNativeMod.DrawerNativeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.mod.Drawer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.drawerIndexNativeMod.DrawerNativeProps])(children: _*)
  }
  @JSImport("antd-mobile-rn", "Drawer")
  @js.native
  object componentImport extends js.Object
  
}

