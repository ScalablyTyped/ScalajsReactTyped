package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typingsJapgolly.officeUiFabricReact.editingItemTypesMod.IEditingSelectedPeopleItemProps
import typingsJapgolly.officeUiFabricReact.personaTypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps
import typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.ISelectedPeopleItemProps
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object EditingItem {
  def apply(
    onEditingComplete: (js.Any, js.Any) => Callback,
    ISelectedPeopleItemProps: ISelectedPeopleItemProps = null,
    floatingPickerProps: IBaseFloatingPickerProps[IPersonaProps] = null,
    getEditingItemText: /* item */ IExtendedPersonaProps => CallbackTo[String] = null,
    onRenderFloatingPicker: ComponentType[IBaseFloatingPickerProps[IPersonaProps]] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IEditingSelectedPeopleItemProps, 
    typingsJapgolly.officeUiFabricReact.editingItemMod.EditingItem, 
    Unit, 
    IEditingSelectedPeopleItemProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("onEditingComplete")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => onEditingComplete(t0, t1).runNow()))
    if (ISelectedPeopleItemProps != null) js.Dynamic.global.Object.assign(__obj, ISelectedPeopleItemProps)
    if (floatingPickerProps != null) __obj.updateDynamic("floatingPickerProps")(floatingPickerProps.asInstanceOf[js.Any])
    if (getEditingItemText != null) __obj.updateDynamic("getEditingItemText")(js.Any.fromFunction1((t0: /* item */ typingsJapgolly.officeUiFabricReact.selectedPeopleListMod.IExtendedPersonaProps) => getEditingItemText(t0).runNow()))
    if (onRenderFloatingPicker != null) __obj.updateDynamic("onRenderFloatingPicker")(onRenderFloatingPicker.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.editingItemTypesMod.IEditingSelectedPeopleItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.editingItemMod.EditingItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.editingItemTypesMod.IEditingSelectedPeopleItemProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react/lib/components/SelectedItemsList/SelectedPeopleList/Items/EditingItem", "EditingItem")
  @js.native
  object componentImport extends js.Object
  
}

