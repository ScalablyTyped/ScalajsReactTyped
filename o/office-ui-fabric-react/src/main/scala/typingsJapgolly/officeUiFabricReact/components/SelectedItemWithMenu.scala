package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.peoplePickerItemTypesMod.IPersonaWithMenu
import typingsJapgolly.officeUiFabricReact.pickerItemTypesMod.IPickerItem
import typingsJapgolly.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SelectedItemWithMenu {
  def apply(
    index: Double,
    item: IPersonaWithMenu,
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    componentRef: IRefObject[IPickerItem] = null,
    onItemChange: (IPersonaWithMenu, /* index */ Double) => Callback = null,
    onRemoveItem: js.UndefOr[Callback] = js.undefined,
    removeButtonAriaLabel: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IPickerItemProps[IPersonaWithMenu], 
    typingsJapgolly.officeUiFabricReact.selectedItemWithMenuMod.SelectedItemWithMenu, 
    Unit, 
    IPickerItemProps[IPersonaWithMenu]
  ] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (onItemChange != null) __obj.updateDynamic("onItemChange")(js.Any.fromFunction2((t0: typingsJapgolly.officeUiFabricReact.peoplePickerItemTypesMod.IPersonaWithMenu, t1: /* index */ scala.Double) => onItemChange(t0, t1).runNow()))
    onRemoveItem.foreach(p => __obj.updateDynamic("onRemoveItem")(p.toJsFn))
    if (removeButtonAriaLabel != null) __obj.updateDynamic("removeButtonAriaLabel")(removeButtonAriaLabel.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps[typingsJapgolly.officeUiFabricReact.peoplePickerItemTypesMod.IPersonaWithMenu], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.selectedItemWithMenuMod.SelectedItemWithMenu](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps[typingsJapgolly.officeUiFabricReact.peoplePickerItemTypesMod.IPersonaWithMenu]])(children: _*)
  }
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePickerItems/SelectedItemWithMenu", "SelectedItemWithMenu")
  @js.native
  object componentImport extends js.Object
  
}

