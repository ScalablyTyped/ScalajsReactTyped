package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.officeUiFabricReact.AnonInput
import typingsJapgolly.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPicker
import typingsJapgolly.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsJapgolly.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerSuggestionProps
import typingsJapgolly.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps
import typingsJapgolly.officeUiFabricReact.suggestionsStoreMod.SuggestionsStore
import typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IPeopleFloatingPickerProps_1544184363[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    suggestionsStore: SuggestionsStore[IPersonaProps],
    onResolveSuggestions: (String, js.UndefOr[js.Array[IPersonaProps]]) => CallbackTo[js.Array[IPersonaProps] | Null | js.Thenable[js.Array[IPersonaProps]]],
    calloutWidth: Int | Double = null,
    className: String = null,
    componentRef: IRefObject[IBaseFloatingPicker] = null,
    createGenericItem: (/* input */ String, /* isValid */ Boolean) => CallbackTo[ISuggestionModel[IPersonaProps]] = null,
    getTextFromItem: (IPersonaProps, /* currentValue */ js.UndefOr[String]) => CallbackTo[String] = null,
    inputElement: HTMLInputElement = null,
    onChange: IPersonaProps => Callback = null,
    onInputChanged: /* filter */ String => Callback = null,
    onRemoveSuggestion: IPersonaProps => Callback = null,
    onRenderSuggestionsItem: (IPersonaProps, /* itemProps */ ISuggestionItemProps[IPersonaProps]) => CallbackTo[Element] = null,
    onSuggestionsHidden: js.UndefOr[Callback] = js.undefined,
    onSuggestionsShown: js.UndefOr[Callback] = js.undefined,
    onValidateInput: /* input */ String => CallbackTo[Boolean] = null,
    onZeroQuerySuggestion: /* selectedItems */ js.UndefOr[js.Array[IPersonaProps]] => CallbackTo[js.Array[IPersonaProps] | js.Thenable[js.Array[IPersonaProps]] | Null] = null,
    pickerCalloutProps: ICalloutProps = null,
    pickerSuggestionsProps: IBaseFloatingPickerSuggestionProps = null,
    resolveDelay: Int | Double = null,
    searchingText: (js.Function1[/* props */ AnonInput, String]) | String = null,
    selectedItems: js.Array[IPersonaProps] = null,
    showForceResolve: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    suggestionItems: js.Array[IPersonaProps] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IBaseFloatingPickerProps[IPersonaProps], 
    ComponentRef, 
    Unit, 
    IBaseFloatingPickerProps[IPersonaProps]
  ] = {
    val __obj = js.Dynamic.literal(suggestionsStore = suggestionsStore.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onResolveSuggestions")(js.Any.fromFunction2((t0: java.lang.String, t1: js.UndefOr[js.Array[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps]]) => onResolveSuggestions(t0, t1).runNow()))
    if (calloutWidth != null) __obj.updateDynamic("calloutWidth")(calloutWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (createGenericItem != null) __obj.updateDynamic("createGenericItem")(js.Any.fromFunction2((t0: /* input */ java.lang.String, t1: /* isValid */ scala.Boolean) => createGenericItem(t0, t1).runNow()))
    if (getTextFromItem != null) __obj.updateDynamic("getTextFromItem")(js.Any.fromFunction2((t0: typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps, t1: /* currentValue */ js.UndefOr[java.lang.String]) => getTextFromItem(t0, t1).runNow()))
    if (inputElement != null) __obj.updateDynamic("inputElement")(inputElement.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps) => onChange(t0).runNow()))
    if (onInputChanged != null) __obj.updateDynamic("onInputChanged")(js.Any.fromFunction1((t0: /* filter */ java.lang.String) => onInputChanged(t0).runNow()))
    if (onRemoveSuggestion != null) __obj.updateDynamic("onRemoveSuggestion")(js.Any.fromFunction1((t0: typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps) => onRemoveSuggestion(t0).runNow()))
    if (onRenderSuggestionsItem != null) __obj.updateDynamic("onRenderSuggestionsItem")(js.Any.fromFunction2((t0: typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps, t1: /* itemProps */ typingsJapgolly.officeUiFabricReact.suggestionsItemTypesMod.ISuggestionItemProps[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps]) => onRenderSuggestionsItem(t0, t1).runNow()))
    onSuggestionsHidden.foreach(p => __obj.updateDynamic("onSuggestionsHidden")(p.toJsFn))
    onSuggestionsShown.foreach(p => __obj.updateDynamic("onSuggestionsShown")(p.toJsFn))
    if (onValidateInput != null) __obj.updateDynamic("onValidateInput")(js.Any.fromFunction1((t0: /* input */ java.lang.String) => onValidateInput(t0).runNow()))
    if (onZeroQuerySuggestion != null) __obj.updateDynamic("onZeroQuerySuggestion")(js.Any.fromFunction1((t0: /* selectedItems */ js.UndefOr[js.Array[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps]]) => onZeroQuerySuggestion(t0).runNow()))
    if (pickerCalloutProps != null) __obj.updateDynamic("pickerCalloutProps")(pickerCalloutProps.asInstanceOf[js.Any])
    if (pickerSuggestionsProps != null) __obj.updateDynamic("pickerSuggestionsProps")(pickerSuggestionsProps.asInstanceOf[js.Any])
    if (resolveDelay != null) __obj.updateDynamic("resolveDelay")(resolveDelay.asInstanceOf[js.Any])
    if (searchingText != null) __obj.updateDynamic("searchingText")(searchingText.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    showForceResolve.foreach(p => __obj.updateDynamic("showForceResolve")(p.toJsFn))
    if (suggestionItems != null) __obj.updateDynamic("suggestionItems")(suggestionItems.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps], 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps]])(children: _*)
  }
}

