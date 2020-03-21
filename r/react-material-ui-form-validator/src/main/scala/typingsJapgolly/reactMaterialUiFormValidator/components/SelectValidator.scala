package typingsJapgolly.reactMaterialUiFormValidator.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.materialUi.MaterialUI.Menus.DropDownMenuProps
import typingsJapgolly.materialUi.MaterialUI.SelectFieldProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactMaterialUiFormValidator.mod.ValidatorComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SelectValidator {
  def apply(
    name: String,
    value: js.Any,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropDownMenuProps: DropDownMenuProps = null,
    errorMessages: js.Array[_] | String = null,
    errorStyle: CSSProperties = null,
    errorText: VdomNode = null,
    floatingLabelFixed: js.UndefOr[Boolean] = js.undefined,
    floatingLabelStyle: CSSProperties = null,
    floatingLabelText: VdomNode = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    hintStyle: CSSProperties = null,
    hintText: VdomNode = null,
    iconStyle: CSSProperties = null,
    id: String = null,
    labelStyle: CSSProperties = null,
    listStyle: CSSProperties = null,
    maxHeight: Int | Double = null,
    menuItemStyle: CSSProperties = null,
    menuStyle: js.Any = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    onBlur: ReactFocusEventFrom[js.Object with Element] => Callback = null,
    onChange: (/* e */ ReactEventFrom[js.Object with Element], /* index */ Double, /* menuItemValue */ js.Any) => Callback = null,
    onFocus: ReactFocusEventFrom[js.Object with Element] => Callback = null,
    openImmediately: js.UndefOr[Boolean] = js.undefined,
    selectFieldRoot: CSSProperties = null,
    selectedMenuItemStyle: CSSProperties = null,
    selectionRenderer: /* value */ js.Any => CallbackTo[Node] = null,
    style: CSSProperties = null,
    underlineDisabledStyle: CSSProperties = null,
    underlineFocusStyle: CSSProperties = null,
    underlineStyle: CSSProperties = null,
    validatorListener: /* isValid */ Boolean => Callback = null,
    validators: js.Array[_] = null,
    withRequiredValidator: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ValidatorComponentProps with SelectFieldProps, 
    typingsJapgolly.reactMaterialUiFormValidator.mod.SelectValidator, 
    Unit, 
    ValidatorComponentProps with SelectFieldProps
  ] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dropDownMenuProps != null) __obj.updateDynamic("dropDownMenuProps")(dropDownMenuProps.asInstanceOf[js.Any])
    if (errorMessages != null) __obj.updateDynamic("errorMessages")(errorMessages.asInstanceOf[js.Any])
    if (errorStyle != null) __obj.updateDynamic("errorStyle")(errorStyle.asInstanceOf[js.Any])
    if (errorText != null) __obj.updateDynamic("errorText")(errorText.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(floatingLabelFixed)) __obj.updateDynamic("floatingLabelFixed")(floatingLabelFixed.asInstanceOf[js.Any])
    if (floatingLabelStyle != null) __obj.updateDynamic("floatingLabelStyle")(floatingLabelStyle.asInstanceOf[js.Any])
    if (floatingLabelText != null) __obj.updateDynamic("floatingLabelText")(floatingLabelText.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (hintStyle != null) __obj.updateDynamic("hintStyle")(hintStyle.asInstanceOf[js.Any])
    if (hintText != null) __obj.updateDynamic("hintText")(hintText.rawNode.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle.asInstanceOf[js.Any])
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (menuItemStyle != null) __obj.updateDynamic("menuItemStyle")(menuItemStyle.asInstanceOf[js.Any])
    if (menuStyle != null) __obj.updateDynamic("menuStyle")(menuStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[js.Object with org.scalajs.dom.raw.Element], t1: /* index */ scala.Double, t2: /* menuItemValue */ js.Any) => onChange(t0, t1, t2).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (!js.isUndefined(openImmediately)) __obj.updateDynamic("openImmediately")(openImmediately.asInstanceOf[js.Any])
    if (selectFieldRoot != null) __obj.updateDynamic("selectFieldRoot")(selectFieldRoot.asInstanceOf[js.Any])
    if (selectedMenuItemStyle != null) __obj.updateDynamic("selectedMenuItemStyle")(selectedMenuItemStyle.asInstanceOf[js.Any])
    if (selectionRenderer != null) __obj.updateDynamic("selectionRenderer")(js.Any.fromFunction1((t0: /* value */ js.Any) => selectionRenderer(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (underlineDisabledStyle != null) __obj.updateDynamic("underlineDisabledStyle")(underlineDisabledStyle.asInstanceOf[js.Any])
    if (underlineFocusStyle != null) __obj.updateDynamic("underlineFocusStyle")(underlineFocusStyle.asInstanceOf[js.Any])
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle.asInstanceOf[js.Any])
    if (validatorListener != null) __obj.updateDynamic("validatorListener")(js.Any.fromFunction1((t0: /* isValid */ scala.Boolean) => validatorListener(t0).runNow()))
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    if (!js.isUndefined(withRequiredValidator)) __obj.updateDynamic("withRequiredValidator")(withRequiredValidator.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactMaterialUiFormValidator.mod.ValidatorComponentProps with typingsJapgolly.materialUi.MaterialUI.SelectFieldProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactMaterialUiFormValidator.mod.SelectValidator](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactMaterialUiFormValidator.mod.ValidatorComponentProps with typingsJapgolly.materialUi.MaterialUI.SelectFieldProps])(children: _*)
  }
  @JSImport("react-material-ui-form-validator", "SelectValidator")
  @js.native
  object componentImport extends js.Object
  
}

