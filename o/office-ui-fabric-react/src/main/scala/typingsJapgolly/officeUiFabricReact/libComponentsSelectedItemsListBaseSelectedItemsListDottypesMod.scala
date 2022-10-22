package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.Callback
import typingsJapgolly.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.ValidationState
import typingsJapgolly.officeUiFabricReact.libComponentsPickersPickerItemDottypesMod.IPickerItemProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.ISuggestionModel
import typingsJapgolly.officeUiFabricReact.libSelectionMod.Selection
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.PromiseLike
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.libSelectionSelectionDottypesMod.IObjectWithKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSelectedItemsListBaseSelectedItemsListDottypesMod {
  
  trait IBaseSelectedItemsList[T] extends StObject {
    
    def addItems(items: js.Array[T]): Unit
    
    /** Gets the current value of the input. */
    var items: js.UndefOr[js.Array[T]] = js.undefined
  }
  object IBaseSelectedItemsList {
    
    inline def apply[T](addItems: js.Array[T] => Callback): IBaseSelectedItemsList[T] = {
      val __obj = js.Dynamic.literal(addItems = js.Any.fromFunction1((t0: js.Array[T]) => addItems(t0).runNow()))
      __obj.asInstanceOf[IBaseSelectedItemsList[T]]
    }
    
    extension [Self <: IBaseSelectedItemsList[?], T](x: Self & IBaseSelectedItemsList[T]) {
      
      inline def setAddItems(value: js.Array[T] => Callback): Self = StObject.set(x, "addItems", js.Any.fromFunction1((t0: js.Array[T]) => value(t0).runNow()))
      
      inline def setItems(value: js.Array[T]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: T*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  trait IBaseSelectedItemsListProps[T]
    extends StObject
       with ClassAttributes[Any] {
    
    /**
      * A callback on whether this item can be deleted
      */
    var canRemoveItem: js.UndefOr[js.Function1[/* item */ T, Boolean]] = js.undefined
    
    var componentRef: js.UndefOr[IRefObject[IBaseSelectedItemsList[T]]] = js.undefined
    
    /**
      * Function that specifies how arbitrary text entered into the well is handled.
      */
    var createGenericItem: js.UndefOr[
        js.Function2[/* input */ String, /* ValidationState */ ValidationState, ISuggestionModel[T]]
      ] = js.undefined
    
    /**
      * Initial items that have already been selected and should appear in the people picker.
      */
    var defaultSelectedItems: js.UndefOr[js.Array[T]] = js.undefined
    
    /**
      * A callback for when the selected list of items changes.
      */
    var onChange: js.UndefOr[js.Function1[/* items */ js.UndefOr[js.Array[T]], Unit]] = js.undefined
    
    /**
      * A callback for when items are copied
      */
    var onCopyItems: js.UndefOr[js.Function1[/* items */ js.Array[T], String]] = js.undefined
    
    /**
      * A callback when an item is deleted
      * @deprecated Use `onItemsDeleted` instead.
      */
    var onItemDeleted: js.UndefOr[js.Function1[/* deletedItem */ T, Unit]] = js.undefined
    
    /**
      * A callback to process a selection after the user selects something from the picker.
      */
    var onItemSelected: js.UndefOr[js.Function1[/* selectedItem */ js.UndefOr[T], T | PromiseLike[T]]] = js.undefined
    
    /**
      * A callback when and item or items are deleted
      */
    var onItemsDeleted: js.UndefOr[js.Function1[/* deletedItems */ js.Array[T], Unit]] = js.undefined
    
    /**
      * Function that specifies how the selected item will appear.
      */
    var onRenderItem: js.UndefOr[js.Function1[/* props */ ISelectedItemProps[T], Element]] = js.undefined
    
    /**
      * Aria label for the 'X' button in the selected item component.
      * @defaultvalue ''
      */
    var removeButtonAriaLabel: js.UndefOr[String] = js.undefined
    
    /**
      * The items that the base picker should currently display as selected.
      * If this is provided then the picker will act as a controlled component.
      */
    var selectedItems: js.UndefOr[js.Array[T]] = js.undefined
    
    /**
      * The selection
      */
    var selection: js.UndefOr[Selection[IObjectWithKey]] = js.undefined
  }
  object IBaseSelectedItemsListProps {
    
    inline def apply[T](): IBaseSelectedItemsListProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBaseSelectedItemsListProps[T]]
    }
    
    extension [Self <: IBaseSelectedItemsListProps[?], T](x: Self & IBaseSelectedItemsListProps[T]) {
      
      inline def setCanRemoveItem(value: /* item */ T => Boolean): Self = StObject.set(x, "canRemoveItem", js.Any.fromFunction1(value))
      
      inline def setCanRemoveItemUndefined: Self = StObject.set(x, "canRemoveItem", js.undefined)
      
      inline def setComponentRef(value: IRefObject[IBaseSelectedItemsList[T]]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      inline def setComponentRefFunction1(value: /* ref */ IBaseSelectedItemsList[T] | Null => Callback): Self = StObject.set(x, "componentRef", js.Any.fromFunction1((t0: /* ref */ IBaseSelectedItemsList[T] | Null) => value(t0).runNow()))
      
      inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      inline def setCreateGenericItem(value: (/* input */ String, /* ValidationState */ ValidationState) => ISuggestionModel[T]): Self = StObject.set(x, "createGenericItem", js.Any.fromFunction2(value))
      
      inline def setCreateGenericItemUndefined: Self = StObject.set(x, "createGenericItem", js.undefined)
      
      inline def setDefaultSelectedItems(value: js.Array[T]): Self = StObject.set(x, "defaultSelectedItems", value.asInstanceOf[js.Any])
      
      inline def setDefaultSelectedItemsUndefined: Self = StObject.set(x, "defaultSelectedItems", js.undefined)
      
      inline def setDefaultSelectedItemsVarargs(value: T*): Self = StObject.set(x, "defaultSelectedItems", js.Array(value*))
      
      inline def setOnChange(value: /* items */ js.UndefOr[js.Array[T]] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* items */ js.UndefOr[js.Array[T]]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnCopyItems(value: /* items */ js.Array[T] => String): Self = StObject.set(x, "onCopyItems", js.Any.fromFunction1(value))
      
      inline def setOnCopyItemsUndefined: Self = StObject.set(x, "onCopyItems", js.undefined)
      
      inline def setOnItemDeleted(value: /* deletedItem */ T => Callback): Self = StObject.set(x, "onItemDeleted", js.Any.fromFunction1((t0: /* deletedItem */ T) => value(t0).runNow()))
      
      inline def setOnItemDeletedUndefined: Self = StObject.set(x, "onItemDeleted", js.undefined)
      
      inline def setOnItemSelected(value: /* selectedItem */ js.UndefOr[T] => T | PromiseLike[T]): Self = StObject.set(x, "onItemSelected", js.Any.fromFunction1(value))
      
      inline def setOnItemSelectedUndefined: Self = StObject.set(x, "onItemSelected", js.undefined)
      
      inline def setOnItemsDeleted(value: /* deletedItems */ js.Array[T] => Callback): Self = StObject.set(x, "onItemsDeleted", js.Any.fromFunction1((t0: /* deletedItems */ js.Array[T]) => value(t0).runNow()))
      
      inline def setOnItemsDeletedUndefined: Self = StObject.set(x, "onItemsDeleted", js.undefined)
      
      inline def setOnRenderItem(value: /* props */ ISelectedItemProps[T] => Element): Self = StObject.set(x, "onRenderItem", js.Any.fromFunction1(value))
      
      inline def setOnRenderItemUndefined: Self = StObject.set(x, "onRenderItem", js.undefined)
      
      inline def setRemoveButtonAriaLabel(value: String): Self = StObject.set(x, "removeButtonAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setRemoveButtonAriaLabelUndefined: Self = StObject.set(x, "removeButtonAriaLabel", js.undefined)
      
      inline def setSelectedItems(value: js.Array[T]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      inline def setSelectedItemsVarargs(value: T*): Self = StObject.set(x, "selectedItems", js.Array(value*))
      
      inline def setSelection(value: Selection[IObjectWithKey]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    }
  }
  
  trait ISelectedItemProps[T]
    extends StObject
       with IPickerItemProps[T] {
    
    def onCopyItem(item: T): Unit
  }
  object ISelectedItemProps {
    
    inline def apply[T](IPickerItemProps: IPickerItemProps[T], onCopyItem: T => Callback): ISelectedItemProps[T] = {
      val __obj = js.Dynamic.literal(onCopyItem = js.Any.fromFunction1((t0: T) => onCopyItem(t0).runNow()))
      js.Dynamic.global.Object.assign(__obj, IPickerItemProps)
      __obj.asInstanceOf[ISelectedItemProps[T]]
    }
    
    extension [Self <: ISelectedItemProps[?], T](x: Self & ISelectedItemProps[T]) {
      
      inline def setOnCopyItem(value: T => Callback): Self = StObject.set(x, "onCopyItem", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    }
  }
}
