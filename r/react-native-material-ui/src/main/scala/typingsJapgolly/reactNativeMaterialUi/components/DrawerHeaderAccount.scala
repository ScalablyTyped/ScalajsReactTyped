package typingsJapgolly.reactNativeMaterialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeMaterialUi.AnonAccountContainer
import typingsJapgolly.reactNativeMaterialUi.AnonAvatar
import typingsJapgolly.reactNativeMaterialUi.mod.Drawer.Header.Account
import typingsJapgolly.reactNativeMaterialUi.mod.DrawerHeaderAccountProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DrawerHeaderAccount {
  def apply(
    accounts: js.Array[AnonAvatar] = null,
    avatar: VdomElement = null,
    footer: js.Object = null,
    style: AnonAccountContainer = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DrawerHeaderAccountProps, Account, Unit, DrawerHeaderAccountProps] = {
    val __obj = js.Dynamic.literal()
  
      if (accounts != null) __obj.updateDynamic("accounts")(accounts.asInstanceOf[js.Any])
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.rawElement.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeMaterialUi.mod.DrawerHeaderAccountProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeMaterialUi.mod.Drawer.Header.Account](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeMaterialUi.mod.DrawerHeaderAccountProps])(children: _*)
  }
  @JSImport("react-native-material-ui", "Drawer.Header.Account")
  @js.native
  object componentImport extends js.Object
  
}

