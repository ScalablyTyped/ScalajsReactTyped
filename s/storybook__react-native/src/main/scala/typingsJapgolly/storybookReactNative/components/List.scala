package typingsJapgolly.storybookReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookAddons.distMod.Collection
import typingsJapgolly.storybookReactNative.listMod.Props
import typingsJapgolly.storybookReactNative.listMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List {
  def apply(
    addonSelected: String,
    panels: Collection,
    onPressAddon: String => Callback,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(addonSelected = addonSelected.asInstanceOf[js.Any], panels = panels.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onPressAddon")(js.Any.fromFunction1((t0: java.lang.String) => onPressAddon(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookReactNative.listMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookReactNative.listMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookReactNative.listMod.Props])(children: _*)
  }
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/addons/list", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

