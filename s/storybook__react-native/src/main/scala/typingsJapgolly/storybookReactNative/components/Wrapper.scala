package typingsJapgolly.storybookReactNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookAddons.distMod.Collection
import typingsJapgolly.storybookReactNative.wrapperMod.Props
import typingsJapgolly.storybookReactNative.wrapperMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Wrapper {
  def apply(
    addonSelected: String,
    panels: Collection,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(addonSelected = addonSelected.asInstanceOf[js.Any], panels = panels.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookReactNative.wrapperMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookReactNative.wrapperMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookReactNative.wrapperMod.Props])(children: _*)
  }
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/addons/wrapper", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

