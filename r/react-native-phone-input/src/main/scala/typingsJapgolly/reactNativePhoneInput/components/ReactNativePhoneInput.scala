package typingsJapgolly.reactNativePhoneInput.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNativePhoneInput.mod.CountriesListItem
import typingsJapgolly.reactNativePhoneInput.mod.ReactNativePhoneInputProps
import typingsJapgolly.reactNativePhoneInput.mod.TextStyle
import typingsJapgolly.reactNativePhoneInput.mod.ViewStyle
import typingsJapgolly.reactNativePhoneInput.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativePhoneInput {
  def apply[TextComponentType /* <: ComponentType[js.Object] */](
    allowZeroAfterCountryCode: js.UndefOr[Boolean] = js.undefined,
    buttonTextStyle: TextStyle = null,
    cancelText: String = null,
    confirmText: String = null,
    countriesList: js.Array[CountriesListItem] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    flagStyle: ViewStyle = null,
    initialCountry: String = null,
    offset: Int | Double = null,
    onChangePhoneNumber: /* number */ Double => Callback = null,
    onPressCancel: js.UndefOr[Callback] = js.undefined,
    onPressConfirm: js.UndefOr[Callback] = js.undefined,
    onPressFlag: js.UndefOr[Callback] = js.undefined,
    onSelectCountry: /* iso2 */ String => Callback = null,
    pickerBackgroundColor: String = null,
    pickerButtonColor: String = null,
    pickerItemStyle: ViewStyle = null,
    style: ViewStyle = null,
    textComponent: TextComponentType = null,
    textProps: ComponentProps[TextComponentType] = null,
    textStyle: TextStyle = null,
    value: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ReactNativePhoneInputProps[TextComponentType], 
    default[TextComponentType], 
    Unit, 
    ReactNativePhoneInputProps[TextComponentType]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(allowZeroAfterCountryCode)) __obj.updateDynamic("allowZeroAfterCountryCode")(allowZeroAfterCountryCode.asInstanceOf[js.Any])
    if (buttonTextStyle != null) __obj.updateDynamic("buttonTextStyle")(buttonTextStyle.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (confirmText != null) __obj.updateDynamic("confirmText")(confirmText.asInstanceOf[js.Any])
    if (countriesList != null) __obj.updateDynamic("countriesList")(countriesList.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (flagStyle != null) __obj.updateDynamic("flagStyle")(flagStyle.asInstanceOf[js.Any])
    if (initialCountry != null) __obj.updateDynamic("initialCountry")(initialCountry.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onChangePhoneNumber != null) __obj.updateDynamic("onChangePhoneNumber")(js.Any.fromFunction1((t0: /* number */ scala.Double) => onChangePhoneNumber(t0).runNow()))
    onPressCancel.foreach(p => __obj.updateDynamic("onPressCancel")(p.toJsFn))
    onPressConfirm.foreach(p => __obj.updateDynamic("onPressConfirm")(p.toJsFn))
    onPressFlag.foreach(p => __obj.updateDynamic("onPressFlag")(p.toJsFn))
    if (onSelectCountry != null) __obj.updateDynamic("onSelectCountry")(js.Any.fromFunction1((t0: /* iso2 */ java.lang.String) => onSelectCountry(t0).runNow()))
    if (pickerBackgroundColor != null) __obj.updateDynamic("pickerBackgroundColor")(pickerBackgroundColor.asInstanceOf[js.Any])
    if (pickerButtonColor != null) __obj.updateDynamic("pickerButtonColor")(pickerButtonColor.asInstanceOf[js.Any])
    if (pickerItemStyle != null) __obj.updateDynamic("pickerItemStyle")(pickerItemStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textComponent != null) __obj.updateDynamic("textComponent")(textComponent.asInstanceOf[js.Any])
    if (textProps != null) __obj.updateDynamic("textProps")(textProps.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativePhoneInput.mod.ReactNativePhoneInputProps[TextComponentType], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativePhoneInput.mod.default[TextComponentType]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativePhoneInput.mod.ReactNativePhoneInputProps[TextComponentType]])(children: _*)
  }
  @JSImport("react-native-phone-input", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

