package typingsJapgolly.reactNativePopupDialog.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePopupDialog.mod.AlignTypes
import typingsJapgolly.reactNativePopupDialog.mod.DialogTitleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DialogTitle {
  def apply(
    title: String,
    align: AlignTypes = null,
    hasTitleBar: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    textStyle: StyleProp[TextStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    DialogTitleProps, 
    typingsJapgolly.reactNativePopupDialog.mod.DialogTitle, 
    Unit, 
    DialogTitleProps
  ] = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
  
      if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTitleBar)) __obj.updateDynamic("hasTitleBar")(hasTitleBar.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativePopupDialog.mod.DialogTitleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativePopupDialog.mod.DialogTitle](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativePopupDialog.mod.DialogTitleProps])(children: _*)
  }
  @JSImport("react-native-popup-dialog", "DialogTitle")
  @js.native
  object componentImport extends js.Object
  
}

