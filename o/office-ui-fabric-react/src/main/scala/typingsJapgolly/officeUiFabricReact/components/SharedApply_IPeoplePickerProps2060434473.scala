package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.officeUiFabricReact.AnonInput
import typingsJapgolly.officeUiFabricReact.basePickerTypesMod.IBasePicker
import typingsJapgolly.officeUiFabricReact.basePickerTypesMod.IBasePickerProps
import typingsJapgolly.officeUiFabricReact.basePickerTypesMod.IBasePickerStyleProps
import typingsJapgolly.officeUiFabricReact.basePickerTypesMod.IBasePickerStyles
import typingsJapgolly.officeUiFabricReact.basePickerTypesMod.IBasePickerSuggestionsProps
import typingsJapgolly.officeUiFabricReact.basePickerTypesMod.IInputProps
import typingsJapgolly.officeUiFabricReact.basePickerTypesMod.ValidationState
import typingsJapgolly.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps
import typingsJapgolly.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps
import typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricStyling.ithemeMod.ITheme
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IPeoplePickerProps2060434473 () {
  val componentImport: js.Any
  def apply(
    onResolveSuggestions: (String, js.UndefOr[js.Array[IPersonaProps]]) => CallbackTo[js.Array[IPersonaProps] | js.Thenable[js.Array[IPersonaProps]]],
    className: String = null,
    componentRef: IRefObject[IBasePicker[IPersonaProps]] = null,
    createGenericItem: (/* input */ String, /* ValidationState */ ValidationState) => CallbackTo[ISuggestionModel[IPersonaProps] | IPersonaProps] = null,
    defaultSelectedItems: js.Array[IPersonaProps] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    enableSelectedSuggestionAlert: js.UndefOr[Boolean] = js.undefined,
    getTextFromItem: (IPersonaProps, /* currentValue */ js.UndefOr[String]) => CallbackTo[String] = null,
    inputProps: IInputProps = null,
    itemLimit: Int | Double = null,
    onBlur: ReactFocusEventFrom[
      (HTMLInputElement | typingsJapgolly.officeUiFabricReact.baseAutoFillMod.BaseAutoFill) with Element
    ] => Callback = null,
    onChange: /* items */ js.UndefOr[js.Array[IPersonaProps]] => Callback = null,
    onDismiss: (/* ev */ js.UndefOr[js.Any], /* selectedItem */ js.UndefOr[IPersonaProps]) => Callback = null,
    onEmptyInputFocus: /* selectedItems */ js.UndefOr[js.Array[IPersonaProps]] => CallbackTo[js.Array[IPersonaProps] | js.Thenable[js.Array[IPersonaProps]]] = null,
    onEmptyResolveSuggestions: /* selectedItems */ js.UndefOr[js.Array[IPersonaProps]] => CallbackTo[js.Array[IPersonaProps] | js.Thenable[js.Array[IPersonaProps]]] = null,
    onFocus: ReactFocusEventFrom[
      (HTMLInputElement | typingsJapgolly.officeUiFabricReact.baseAutoFillMod.BaseAutoFill) with Element
    ] => Callback = null,
    onGetMoreResults: (/* filter */ String, /* selectedItems */ js.UndefOr[js.Array[IPersonaProps]]) => CallbackTo[js.Array[IPersonaProps] | js.Thenable[js.Array[IPersonaProps]]] = null,
    onInputChange: /* input */ String => CallbackTo[String] = null,
    onItemSelected: /* selectedItem */ js.UndefOr[IPersonaProps] => CallbackTo[IPersonaProps | js.Thenable[IPersonaProps] | Null] = null,
    onRemoveSuggestion: IPersonaProps => Callback = null,
    onRenderItem: /* props */ IPickerItemProps[IPersonaProps] => CallbackTo[japgolly.scalajs.react.raw.React.Element] = null,
    onRenderSuggestionsItem: (IPersonaProps, /* itemProps */ ISuggestionItemProps[IPersonaProps]) => CallbackTo[japgolly.scalajs.react.raw.React.Element] = null,
    onValidateInput: /* input */ String => CallbackTo[ValidationState] = null,
    pickerCalloutProps: ICalloutProps = null,
    pickerSuggestionsProps: IBasePickerSuggestionsProps[_] = null,
    removeButtonAriaLabel: String = null,
    resolveDelay: Int | Double = null,
    searchingText: (js.Function1[/* props */ AnonInput, String]) | String = null,
    selectedItems: js.Array[IPersonaProps] = null,
    styles: IStyleFunctionOrObject[IBasePickerStyleProps, IBasePickerStyles] = null,
    theme: ITheme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IBasePickerProps[IPersonaProps], 
    LegacyRef[js.Any], 
    Unit, 
    IBasePickerProps[IPersonaProps]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onResolveSuggestions")(js.Any.fromFunction2((t0: java.lang.String, t1: js.UndefOr[js.Array[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps]]) => onResolveSuggestions(t0, t1).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (createGenericItem != null) __obj.updateDynamic("createGenericItem")(js.Any.fromFunction2((t0: /* input */ java.lang.String, t1: /* ValidationState */ typingsJapgolly.officeUiFabricReact.basePickerTypesMod.ValidationState) => createGenericItem(t0, t1).runNow()))
    if (defaultSelectedItems != null) __obj.updateDynamic("defaultSelectedItems")(defaultSelectedItems.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSelectedSuggestionAlert)) __obj.updateDynamic("enableSelectedSuggestionAlert")(enableSelectedSuggestionAlert.asInstanceOf[js.Any])
    if (getTextFromItem != null) __obj.updateDynamic("getTextFromItem")(js.Any.fromFunction2((t0: typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps, t1: /* currentValue */ js.UndefOr[java.lang.String]) => getTextFromItem(t0, t1).runNow()))
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (itemLimit != null) __obj.updateDynamic("itemLimit")(itemLimit.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[
  (org.scalajs.dom.raw.HTMLInputElement | typingsJapgolly.officeUiFabricReact.baseAutoFillMod.BaseAutoFill) with org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* items */ js.UndefOr[js.Array[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps]]) => onChange(t0).runNow()))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction2((t0: /* ev */ js.UndefOr[js.Any], t1: /* selectedItem */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps]) => onDismiss(t0, t1).runNow()))
    if (onEmptyInputFocus != null) __obj.updateDynamic("onEmptyInputFocus")(js.Any.fromFunction1((t0: /* selectedItems */ js.UndefOr[js.Array[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps]]) => onEmptyInputFocus(t0).runNow()))
    if (onEmptyResolveSuggestions != null) __obj.updateDynamic("onEmptyResolveSuggestions")(js.Any.fromFunction1((t0: /* selectedItems */ js.UndefOr[js.Array[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps]]) => onEmptyResolveSuggestions(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[
  (org.scalajs.dom.raw.HTMLInputElement | typingsJapgolly.officeUiFabricReact.baseAutoFillMod.BaseAutoFill) with org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (onGetMoreResults != null) __obj.updateDynamic("onGetMoreResults")(js.Any.fromFunction2((t0: /* filter */ java.lang.String, t1: /* selectedItems */ js.UndefOr[js.Array[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps]]) => onGetMoreResults(t0, t1).runNow()))
    if (onInputChange != null) __obj.updateDynamic("onInputChange")(js.Any.fromFunction1((t0: /* input */ java.lang.String) => onInputChange(t0).runNow()))
    if (onItemSelected != null) __obj.updateDynamic("onItemSelected")(js.Any.fromFunction1((t0: /* selectedItem */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps]) => onItemSelected(t0).runNow()))
    if (onRemoveSuggestion != null) __obj.updateDynamic("onRemoveSuggestion")(js.Any.fromFunction1((t0: typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps) => onRemoveSuggestion(t0).runNow()))
    if (onRenderItem != null) __obj.updateDynamic("onRenderItem")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps]) => onRenderItem(t0).runNow()))
    if (onRenderSuggestionsItem != null) __obj.updateDynamic("onRenderSuggestionsItem")(js.Any.fromFunction2((t0: typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps, t1: /* itemProps */ typingsJapgolly.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps]) => onRenderSuggestionsItem(t0, t1).runNow()))
    if (onValidateInput != null) __obj.updateDynamic("onValidateInput")(js.Any.fromFunction1((t0: /* input */ java.lang.String) => onValidateInput(t0).runNow()))
    if (pickerCalloutProps != null) __obj.updateDynamic("pickerCalloutProps")(pickerCalloutProps.asInstanceOf[js.Any])
    if (pickerSuggestionsProps != null) __obj.updateDynamic("pickerSuggestionsProps")(pickerSuggestionsProps.asInstanceOf[js.Any])
    if (removeButtonAriaLabel != null) __obj.updateDynamic("removeButtonAriaLabel")(removeButtonAriaLabel.asInstanceOf[js.Any])
    if (resolveDelay != null) __obj.updateDynamic("resolveDelay")(resolveDelay.asInstanceOf[js.Any])
    if (searchingText != null) __obj.updateDynamic("searchingText")(searchingText.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.basePickerTypesMod.IBasePickerProps[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.react.mod.LegacyRef[js.Any]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.basePickerTypesMod.IBasePickerProps[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps]])(children: _*)
  }
}

