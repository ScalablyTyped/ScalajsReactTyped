package typingsJapgolly.storybookReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookReactNative.absolutePositionedKeyboardAwareViewMod.PreviewDimens
import typingsJapgolly.storybookReactNative.absolutePositionedKeyboardAwareViewMod.Props
import typingsJapgolly.storybookReactNative.absolutePositionedKeyboardAwareViewMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AbsolutePositionedKeyboardAwareView {
  def apply(
    previewHeight: Double,
    previewWidth: Double,
    onLayout: PreviewDimens => Callback,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(previewHeight = previewHeight.asInstanceOf[js.Any], previewWidth = previewWidth.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onLayout")(js.Any.fromFunction1((t0: typingsJapgolly.storybookReactNative.absolutePositionedKeyboardAwareViewMod.PreviewDimens) => onLayout(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookReactNative.absolutePositionedKeyboardAwareViewMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookReactNative.absolutePositionedKeyboardAwareViewMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookReactNative.absolutePositionedKeyboardAwareViewMod.Props])(children: _*)
  }
  @JSImport("@storybook/react-native/dist/preview/components/OnDeviceUI/absolute-positioned-keyboard-aware-view", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

