package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsJapgolly.officeUiFabricReact.basePickerTypesMod.ValidationState
import typingsJapgolly.officeUiFabricReact.baseSelectedItemsListTypesMod.IBaseSelectedItemsList
import typingsJapgolly.officeUiFabricReact.baseSelectedItemsListTypesMod.ISelectedItemProps
import typingsJapgolly.officeUiFabricReact.libSelectionMod.Selection
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleProps
import typingsJapgolly.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.selectionTypesMod.IObjectWithKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ISelectedPeopleProps_880506390[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    canRemoveItem: IExtendedPersonaProps => CallbackTo[Boolean] = null,
    componentRef: IRefObject[IBaseSelectedItemsList[IExtendedPersonaProps]] = null,
    copyMenuItemText: String = null,
    createGenericItem: (/* input */ String, /* ValidationState */ ValidationState) => CallbackTo[ISuggestionModel[IExtendedPersonaProps]] = null,
    defaultSelectedItems: js.Array[IExtendedPersonaProps] = null,
    editMenuItemText: String = null,
    floatingPickerProps: IBaseFloatingPickerProps[IPersonaProps] = null,
    getEditingItemText: /* item */ IExtendedPersonaProps => CallbackTo[String] = null,
    onChange: /* items */ js.UndefOr[js.Array[IExtendedPersonaProps]] => Callback = null,
    onCopyItems: /* items */ js.Array[IExtendedPersonaProps] => CallbackTo[String] = null,
    onExpandGroup: /* item */ IExtendedPersonaProps => Callback = null,
    onItemDeleted: IExtendedPersonaProps => Callback = null,
    onItemSelected: /* selectedItem */ js.UndefOr[IExtendedPersonaProps] => CallbackTo[IExtendedPersonaProps | js.Thenable[IExtendedPersonaProps]] = null,
    onItemsDeleted: /* deletedItems */ js.Array[IExtendedPersonaProps] => Callback = null,
    onRenderFloatingPicker: ComponentType[IBaseFloatingPickerProps[IPersonaProps]] = null,
    onRenderItem: /* props */ ISelectedItemProps[IExtendedPersonaProps] => CallbackTo[Element] = null,
    removeButtonAriaLabel: String = null,
    removeMenuItemText: String = null,
    selectedItems: js.Array[IExtendedPersonaProps] = null,
    selection: Selection[IObjectWithKey] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ISelectedPeopleProps, ComponentRef, Unit, ISelectedPeopleProps] = {
    val __obj = js.Dynamic.literal()
  
      if (canRemoveItem != null) __obj.updateDynamic("canRemoveItem")(js.Any.fromFunction1((t0: typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps) => canRemoveItem(t0).runNow()))
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (copyMenuItemText != null) __obj.updateDynamic("copyMenuItemText")(copyMenuItemText.asInstanceOf[js.Any])
    if (createGenericItem != null) __obj.updateDynamic("createGenericItem")(js.Any.fromFunction2((t0: /* input */ java.lang.String, t1: /* ValidationState */ typingsJapgolly.officeUiFabricReact.basePickerTypesMod.ValidationState) => createGenericItem(t0, t1).runNow()))
    if (defaultSelectedItems != null) __obj.updateDynamic("defaultSelectedItems")(defaultSelectedItems.asInstanceOf[js.Any])
    if (editMenuItemText != null) __obj.updateDynamic("editMenuItemText")(editMenuItemText.asInstanceOf[js.Any])
    if (floatingPickerProps != null) __obj.updateDynamic("floatingPickerProps")(floatingPickerProps.asInstanceOf[js.Any])
    if (getEditingItemText != null) __obj.updateDynamic("getEditingItemText")(js.Any.fromFunction1((t0: /* item */ typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps) => getEditingItemText(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* items */ js.UndefOr[
  js.Array[typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps]]) => onChange(t0).runNow()))
    if (onCopyItems != null) __obj.updateDynamic("onCopyItems")(js.Any.fromFunction1((t0: /* items */ js.Array[typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps]) => onCopyItems(t0).runNow()))
    if (onExpandGroup != null) __obj.updateDynamic("onExpandGroup")(js.Any.fromFunction1((t0: /* item */ typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps) => onExpandGroup(t0).runNow()))
    if (onItemDeleted != null) __obj.updateDynamic("onItemDeleted")(js.Any.fromFunction1((t0: typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps) => onItemDeleted(t0).runNow()))
    if (onItemSelected != null) __obj.updateDynamic("onItemSelected")(js.Any.fromFunction1((t0: /* selectedItem */ js.UndefOr[typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps]) => onItemSelected(t0).runNow()))
    if (onItemsDeleted != null) __obj.updateDynamic("onItemsDeleted")(js.Any.fromFunction1((t0: /* deletedItems */ js.Array[typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps]) => onItemsDeleted(t0).runNow()))
    if (onRenderFloatingPicker != null) __obj.updateDynamic("onRenderFloatingPicker")(onRenderFloatingPicker.asInstanceOf[js.Any])
    if (onRenderItem != null) __obj.updateDynamic("onRenderItem")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.officeUiFabricReact.baseSelectedItemsListTypesMod.ISelectedItemProps[typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps]) => onRenderItem(t0).runNow()))
    if (removeButtonAriaLabel != null) __obj.updateDynamic("removeButtonAriaLabel")(removeButtonAriaLabel.asInstanceOf[js.Any])
    if (removeMenuItemText != null) __obj.updateDynamic("removeMenuItemText")(removeMenuItemText.asInstanceOf[js.Any])
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleProps])(children: _*)
  }
}

