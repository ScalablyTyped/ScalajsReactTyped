package typingsJapgolly.reactNativeNavigation.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.TouchableHighlight
import typingsJapgolly.reactNative.mod.TouchableNativeFeedback
import typingsJapgolly.reactNative.mod.TouchableOpacity
import typingsJapgolly.reactNative.mod.TouchableWithoutFeedback
import typingsJapgolly.reactNativeNavigation.AnonReactTag
import typingsJapgolly.reactNativeNavigation.touchablePreviewMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TouchablePreview {
  def apply(
    onPeekIn: js.UndefOr[Callback] = js.undefined,
    onPeekOut: js.UndefOr[Callback] = js.undefined,
    onPress: js.UndefOr[Callback] = js.undefined,
    onPressIn: /* payload */ AnonReactTag => Callback = null,
    touchableComponent: TouchableHighlight | TouchableOpacity | TouchableNativeFeedback | TouchableWithoutFeedback | Node = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    Props, 
    typingsJapgolly.reactNativeNavigation.touchablePreviewMod.TouchablePreview, 
    Unit, 
    Props
  ] = {
    val __obj = js.Dynamic.literal()
  
      onPeekIn.foreach(p => __obj.updateDynamic("onPeekIn")(p.toJsFn))
    onPeekOut.foreach(p => __obj.updateDynamic("onPeekOut")(p.toJsFn))
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction1((t0: /* payload */ typingsJapgolly.reactNativeNavigation.AnonReactTag) => onPressIn(t0).runNow()))
    if (touchableComponent != null) __obj.updateDynamic("touchableComponent")(touchableComponent.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeNavigation.touchablePreviewMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeNavigation.touchablePreviewMod.TouchablePreview](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeNavigation.touchablePreviewMod.Props])(children: _*)
  }
  @JSImport("react-native-navigation/lib/dist/adapters/TouchablePreview", "TouchablePreview")
  @js.native
  object componentImport extends js.Object
  
}

