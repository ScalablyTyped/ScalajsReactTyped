package typingsJapgolly.reactNativeCanvas.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeCanvas.mod.CanvasProps
import typingsJapgolly.reactNativeCanvas.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeCanvas {
  def apply(
    baseUrl: String = null,
    originWhitelist: js.Array[String] = null,
    style: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CanvasProps, default, Unit, CanvasProps] = {
    val __obj = js.Dynamic.literal()
  
      if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (originWhitelist != null) __obj.updateDynamic("originWhitelist")(originWhitelist.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeCanvas.mod.CanvasProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeCanvas.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeCanvas.mod.CanvasProps])(children: _*)
  }
  @JSImport("react-native-canvas", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

