package typingsJapgolly.reactNativeShare.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewProps
import typingsJapgolly.reactNativeShare.mod.ShareSheetProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ShareSheet {
  def apply(
    visible: Boolean,
    onCancel: Callback,
    overlayStyle: StyleProp[ViewProps] = null,
    style: StyleProp[ViewProps] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ShareSheetProps, 
    typingsJapgolly.reactNativeShare.mod.ShareSheet, 
    Unit, 
    ShareSheetProps
  ] = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onCancel")(onCancel.toJsFn)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeShare.mod.ShareSheetProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeShare.mod.ShareSheet](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeShare.mod.ShareSheetProps])(children: _*)
  }
  @JSImport("react-native-share", "ShareSheet")
  @js.native
  object componentImport extends js.Object
  
}

