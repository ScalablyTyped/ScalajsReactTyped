package typingsJapgolly.reactNativePopupDialog.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePopupDialog.mod.DialogContentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DialogContent {
  def apply(
    style: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    DialogContentProps, 
    typingsJapgolly.reactNativePopupDialog.mod.DialogContent, 
    Unit, 
    DialogContentProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativePopupDialog.mod.DialogContentProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativePopupDialog.mod.DialogContent](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativePopupDialog.mod.DialogContentProps])(children: _*)
  }
  @JSImport("react-native-popup-dialog", "DialogContent")
  @js.native
  object componentImport extends js.Object
  
}

