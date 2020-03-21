package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPicker
import typingsJapgolly.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPickerProps
import typingsJapgolly.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsJapgolly.officeUiFabricReact.basePickerTypesMod.IInputProps
import typingsJapgolly.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsListProps
import typingsJapgolly.officeUiFabricReact.focusZoneTypesMod.IFocusZoneProps
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IExtendedPeoplePickerProps_1680601108[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    floatingPickerProps: IBaseFloatingPickerProps[IPersonaProps],
    onRenderFloatingPicker: ComponentType[IBaseFloatingPickerProps[IPersonaProps]],
    onRenderSelectedItems: ComponentType[IBaseSelectedItemsListProps[IPersonaProps]],
    selectedItemsListProps: IBaseSelectedItemsListProps[IPersonaProps],
    className: String = null,
    componentRef: IRefObject[IBaseExtendedPicker[IPersonaProps]] = null,
    currentRenderedQueryString: String = null,
    defaultSelectedItems: js.Array[IPersonaProps] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focusZoneProps: IFocusZoneProps = null,
    headerComponent: VdomElement = null,
    inputProps: IInputProps = null,
    itemLimit: Int | Double = null,
    onBlur: ReactFocusEventFrom[
      (HTMLInputElement | typingsJapgolly.officeUiFabricReact.libAutofillMod.Autofill) with Element
    ] => Callback = null,
    onChange: /* items */ js.UndefOr[js.Array[IPersonaProps]] => Callback = null,
    onFocus: ReactFocusEventFrom[
      (HTMLInputElement | typingsJapgolly.officeUiFabricReact.libAutofillMod.Autofill) with Element
    ] => Callback = null,
    onItemAdded: IPersonaProps => Callback = null,
    onItemSelected: /* selectedItem */ js.UndefOr[IPersonaProps] => CallbackTo[IPersonaProps | js.Thenable[IPersonaProps]] = null,
    onItemsRemoved: /* removedItems */ js.Array[IPersonaProps] => Callback = null,
    onPaste: /* pastedText */ String => CallbackTo[js.Array[IPersonaProps]] = null,
    selectedItems: js.Array[IPersonaProps] = null,
    suggestionItems: js.Array[IPersonaProps] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IBaseExtendedPickerProps[IPersonaProps], 
    ComponentRef, 
    Unit, 
    IBaseExtendedPickerProps[IPersonaProps]
  ] = {
    val __obj = js.Dynamic.literal(floatingPickerProps = floatingPickerProps.asInstanceOf[js.Any], onRenderFloatingPicker = onRenderFloatingPicker.asInstanceOf[js.Any], onRenderSelectedItems = onRenderSelectedItems.asInstanceOf[js.Any], selectedItemsListProps = selectedItemsListProps.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (currentRenderedQueryString != null) __obj.updateDynamic("currentRenderedQueryString")(currentRenderedQueryString.asInstanceOf[js.Any])
    if (defaultSelectedItems != null) __obj.updateDynamic("defaultSelectedItems")(defaultSelectedItems.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (focusZoneProps != null) __obj.updateDynamic("focusZoneProps")(focusZoneProps.asInstanceOf[js.Any])
    if (headerComponent != null) __obj.updateDynamic("headerComponent")(headerComponent.rawElement.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (itemLimit != null) __obj.updateDynamic("itemLimit")(itemLimit.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[
  (org.scalajs.dom.raw.HTMLInputElement | typingsJapgolly.officeUiFabricReact.libAutofillMod.Autofill) with org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* items */ js.UndefOr[js.Array[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps]]) => onChange(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[
  (org.scalajs.dom.raw.HTMLInputElement | typingsJapgolly.officeUiFabricReact.libAutofillMod.Autofill) with org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (onItemAdded != null) __obj.updateDynamic("onItemAdded")(js.Any.fromFunction1((t0: typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps) => onItemAdded(t0).runNow()))
    if (onItemSelected != null) __obj.updateDynamic("onItemSelected")(js.Any.fromFunction1((t0: /* selectedItem */ js.UndefOr[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps]) => onItemSelected(t0).runNow()))
    if (onItemsRemoved != null) __obj.updateDynamic("onItemsRemoved")(js.Any.fromFunction1((t0: /* removedItems */ js.Array[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps]) => onItemsRemoved(t0).runNow()))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1((t0: /* pastedText */ java.lang.String) => onPaste(t0).runNow()))
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (suggestionItems != null) __obj.updateDynamic("suggestionItems")(suggestionItems.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPickerProps[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps], 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.baseExtendedPickerTypesMod.IBaseExtendedPickerProps[typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps]])(children: _*)
  }
}

