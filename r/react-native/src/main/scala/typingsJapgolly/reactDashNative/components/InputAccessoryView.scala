package typingsJapgolly.reactDashNative.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNative.reactDashNativeMod.InputAccessoryViewProps
import typingsJapgolly.reactDashNative.reactDashNativeMod.StyleProp
import typingsJapgolly.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InputAccessoryView {
  def apply(
    backgroundColor: String = null,
    nativeID: String = null,
    style: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    InputAccessoryViewProps, 
    typingsJapgolly.reactDashNative.reactDashNativeMod.InputAccessoryView, 
    Unit, 
    InputAccessoryViewProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNative.reactDashNativeMod.InputAccessoryViewProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNative.reactDashNativeMod.InputAccessoryView](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNative.reactDashNativeMod.InputAccessoryViewProps])(children: _*)
  }
  @JSImport("react-native", "InputAccessoryView")
  @js.native
  object componentImport extends js.Object
  
}

