package typingsJapgolly.storybookReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookReactNative.barMod.Props
import typingsJapgolly.storybookReactNative.barMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Bar {
  def apply(
    index: Double,
    onPress: Double => Callback,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onPress")(js.Any.fromFunction1((t0: scala.Double) => onPress(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookReactNative.barMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookReactNative.barMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookReactNative.barMod.Props])(children: _*)
  }
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/navigation/bar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

