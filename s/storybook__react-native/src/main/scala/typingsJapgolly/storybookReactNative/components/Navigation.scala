package typingsJapgolly.storybookReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookReactNative.navigationMod.Props
import typingsJapgolly.storybookReactNative.navigationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Navigation {
  def apply(
    tabOpen: Double,
    onChangeTab: Double => Callback,
    initialUiVisible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(tabOpen = tabOpen.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChangeTab")(js.Any.fromFunction1((t0: scala.Double) => onChangeTab(t0).runNow()))
    if (!js.isUndefined(initialUiVisible)) __obj.updateDynamic("initialUiVisible")(initialUiVisible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookReactNative.navigationMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookReactNative.navigationMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookReactNative.navigationMod.Props])(children: _*)
  }
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/navigation", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

