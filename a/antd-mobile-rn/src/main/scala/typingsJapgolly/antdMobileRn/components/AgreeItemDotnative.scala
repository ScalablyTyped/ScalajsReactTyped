package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.agreeItemNativeMod.AgreeItemNativeProps
import typingsJapgolly.antdMobileRn.agreeItemNativeMod.default
import typingsJapgolly.antdMobileRn.checkboxPropsTypeMod.OnChangeParams
import typingsJapgolly.antdMobileRn.checkboxStyleIndexNativeMod.ICheckboxStyle
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AgreeItemDotnative {
  def apply(
    checkboxStyle: StyleProp[ImageStyle] = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* params */ OnChangeParams => Callback = null,
    style: StyleProp[ViewStyle] = null,
    styles: ICheckboxStyle = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AgreeItemNativeProps, default, Unit, AgreeItemNativeProps] = {
    val __obj = js.Dynamic.literal()
  
      if (checkboxStyle != null) __obj.updateDynamic("checkboxStyle")(checkboxStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.antdMobileRn.checkboxPropsTypeMod.OnChangeParams) => onChange(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.agreeItemNativeMod.AgreeItemNativeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.agreeItemNativeMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.agreeItemNativeMod.AgreeItemNativeProps])(children: _*)
  }
  @JSImport("antd-mobile-rn/lib/checkbox/AgreeItem.native", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

