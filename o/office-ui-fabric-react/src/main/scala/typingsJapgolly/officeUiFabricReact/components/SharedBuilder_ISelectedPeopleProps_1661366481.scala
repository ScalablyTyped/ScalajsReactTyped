package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerBaseFloatingPickerDottypesMod.IBaseFloatingPickerProps
import typingsJapgolly.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.ValidationState
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.ISuggestionModel
import typingsJapgolly.officeUiFabricReact.libComponentsSelectedItemsListBaseSelectedItemsListDottypesMod.IBaseSelectedItemsList
import typingsJapgolly.officeUiFabricReact.libComponentsSelectedItemsListBaseSelectedItemsListDottypesMod.ISelectedItemProps
import typingsJapgolly.officeUiFabricReact.libComponentsSelectedItemsListSelectedPeopleListSelectedPeopleListMod.IExtendedPersonaProps
import typingsJapgolly.officeUiFabricReact.libSelectionMod.Selection
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.PromiseLike
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.IObjectWithKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ISelectedPeopleProps_1661366481[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def canRemoveItem(value: IExtendedPersonaProps => Boolean): this.type = set("canRemoveItem", js.Any.fromFunction1(value))
  
  inline def componentRef(value: IRefObject[IBaseSelectedItemsList[IExtendedPersonaProps]]): this.type = set("componentRef", value.asInstanceOf[js.Any])
  
  inline def componentRefFunction1(value: /* ref */ IBaseSelectedItemsList[IExtendedPersonaProps] | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IBaseSelectedItemsList[IExtendedPersonaProps] | Null) => value(t0).runNow()))
  
  inline def copyMenuItemText(value: String): this.type = set("copyMenuItemText", value.asInstanceOf[js.Any])
  
  inline def createGenericItem(
    value: (/* input */ String, /* ValidationState */ ValidationState) => ISuggestionModel[IExtendedPersonaProps]
  ): this.type = set("createGenericItem", js.Any.fromFunction2(value))
  
  inline def defaultSelectedItems(value: js.Array[IExtendedPersonaProps]): this.type = set("defaultSelectedItems", value.asInstanceOf[js.Any])
  
  inline def defaultSelectedItemsVarargs(value: IExtendedPersonaProps*): this.type = set("defaultSelectedItems", js.Array(value*))
  
  inline def editMenuItemText(value: String): this.type = set("editMenuItemText", value.asInstanceOf[js.Any])
  
  inline def floatingPickerProps(value: IBaseFloatingPickerProps[IPersonaProps]): this.type = set("floatingPickerProps", value.asInstanceOf[js.Any])
  
  inline def getEditingItemText(value: /* item */ IExtendedPersonaProps => String): this.type = set("getEditingItemText", js.Any.fromFunction1(value))
  
  inline def onChange(value: /* items */ js.UndefOr[js.Array[IExtendedPersonaProps]] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* items */ js.UndefOr[js.Array[IExtendedPersonaProps]]) => value(t0).runNow()))
  
  inline def onCopyItems(value: /* items */ js.Array[IExtendedPersonaProps] => String): this.type = set("onCopyItems", js.Any.fromFunction1(value))
  
  inline def onExpandGroup(value: /* item */ IExtendedPersonaProps => Callback): this.type = set("onExpandGroup", js.Any.fromFunction1((t0: /* item */ IExtendedPersonaProps) => value(t0).runNow()))
  
  inline def onItemDeleted(value: IExtendedPersonaProps => Callback): this.type = set("onItemDeleted", js.Any.fromFunction1((t0: IExtendedPersonaProps) => value(t0).runNow()))
  
  inline def onItemSelected(
    value: /* selectedItem */ js.UndefOr[IExtendedPersonaProps] => IExtendedPersonaProps | PromiseLike[IExtendedPersonaProps]
  ): this.type = set("onItemSelected", js.Any.fromFunction1(value))
  
  inline def onItemsDeleted(value: /* deletedItems */ js.Array[IExtendedPersonaProps] => Callback): this.type = set("onItemsDeleted", js.Any.fromFunction1((t0: /* deletedItems */ js.Array[IExtendedPersonaProps]) => value(t0).runNow()))
  
  inline def onRenderFloatingPicker(value: ComponentType[IBaseFloatingPickerProps[IPersonaProps]]): this.type = set("onRenderFloatingPicker", value.asInstanceOf[js.Any])
  
  inline def onRenderItem(value: /* props */ ISelectedItemProps[IExtendedPersonaProps] => Element): this.type = set("onRenderItem", js.Any.fromFunction1(value))
  
  inline def removeButtonAriaLabel(value: String): this.type = set("removeButtonAriaLabel", value.asInstanceOf[js.Any])
  
  inline def removeMenuItemText(value: String): this.type = set("removeMenuItemText", value.asInstanceOf[js.Any])
  
  inline def selectedItems(value: js.Array[IExtendedPersonaProps]): this.type = set("selectedItems", value.asInstanceOf[js.Any])
  
  inline def selectedItemsVarargs(value: IExtendedPersonaProps*): this.type = set("selectedItems", js.Array(value*))
  
  inline def selection(value: Selection[IObjectWithKey]): this.type = set("selection", value.asInstanceOf[js.Any])
}
