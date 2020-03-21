package typingsJapgolly.storybookReactNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookReactNative.onDeviceUIMod.OnDeviceUIProps
import typingsJapgolly.storybookReactNative.onDeviceUIMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OnDeviceUI {
  def apply(
    stories: js.Any,
    isUIHidden: js.UndefOr[Boolean] = js.undefined,
    keyboardAvoidingViewVerticalOffset: Int | Double = null,
    shouldDisableKeyboardAvoidingView: js.UndefOr[Boolean] = js.undefined,
    tabOpen: Int | Double = null,
    url: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[OnDeviceUIProps, default, Unit, OnDeviceUIProps] = {
    val __obj = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any])
  
      if (!js.isUndefined(isUIHidden)) __obj.updateDynamic("isUIHidden")(isUIHidden.asInstanceOf[js.Any])
    if (keyboardAvoidingViewVerticalOffset != null) __obj.updateDynamic("keyboardAvoidingViewVerticalOffset")(keyboardAvoidingViewVerticalOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldDisableKeyboardAvoidingView)) __obj.updateDynamic("shouldDisableKeyboardAvoidingView")(shouldDisableKeyboardAvoidingView.asInstanceOf[js.Any])
    if (tabOpen != null) __obj.updateDynamic("tabOpen")(tabOpen.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookReactNative.onDeviceUIMod.OnDeviceUIProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookReactNative.onDeviceUIMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookReactNative.onDeviceUIMod.OnDeviceUIProps])(children: _*)
  }
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

