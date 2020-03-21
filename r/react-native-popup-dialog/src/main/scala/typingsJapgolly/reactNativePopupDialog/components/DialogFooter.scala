package typingsJapgolly.reactNativePopupDialog.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePopupDialog.mod.DialogFooterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DialogFooter {
  def apply(
    bordered: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    DialogFooterProps, 
    typingsJapgolly.reactNativePopupDialog.mod.DialogFooter, 
    Unit, 
    DialogFooterProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativePopupDialog.mod.DialogFooterProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativePopupDialog.mod.DialogFooter](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativePopupDialog.mod.DialogFooterProps])(children: _*)
  }
  @JSImport("react-native-popup-dialog", "DialogFooter")
  @js.native
  object componentImport extends js.Object
  
}

