package typingsJapgolly.protonNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protonNative.mod.MenuItemProps
import typingsJapgolly.protonNative.protonNativeStrings.About
import typingsJapgolly.protonNative.protonNativeStrings.Check
import typingsJapgolly.protonNative.protonNativeStrings.Item
import typingsJapgolly.protonNative.protonNativeStrings.Preferences
import typingsJapgolly.protonNative.protonNativeStrings.Quit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MenuItem {
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    onClick: /* checked */ Boolean => Callback = null,
    `type`: Check | Quit | About | Preferences | typingsJapgolly.protonNative.protonNativeStrings.Separator | Item = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: String = null
  ): UnmountedWithRoot[MenuItemProps, typingsJapgolly.protonNative.mod.MenuItem, Unit, MenuItemProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* checked */ scala.Boolean) => onClick(t0).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.protonNative.mod.MenuItemProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.protonNative.mod.MenuItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.protonNative.mod.MenuItemProps])
  }
  @JSImport("proton-native", "MenuItem")
  @js.native
  object componentImport extends js.Object
  
}

