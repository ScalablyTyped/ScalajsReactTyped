package typingsJapgolly.downshift.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseComboboxProps[Item] extends StObject {
  
  var circularNavigation: js.UndefOr[Boolean] = js.undefined
  
  var defaultHighlightedIndex: js.UndefOr[Double] = js.undefined
  
  var defaultInputValue: js.UndefOr[String] = js.undefined
  
  var defaultIsOpen: js.UndefOr[Boolean] = js.undefined
  
  var defaultSelectedItem: js.UndefOr[Item | Null] = js.undefined
  
  var environment: js.UndefOr[Environment] = js.undefined
  
  var getA11ySelectionMessage: js.UndefOr[js.Function1[/* options */ A11yStatusMessageOptions[Item], String]] = js.undefined
  
  var getA11yStatusMessage: js.UndefOr[js.Function1[/* options */ A11yStatusMessageOptions[Item], String]] = js.undefined
  
  var getItemId: js.UndefOr[js.Function1[/* index */ Double, String]] = js.undefined
  
  var highlightedIndex: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var initialHighlightedIndex: js.UndefOr[Double] = js.undefined
  
  var initialInputValue: js.UndefOr[String] = js.undefined
  
  var initialIsOpen: js.UndefOr[Boolean] = js.undefined
  
  var initialSelectedItem: js.UndefOr[Item | Null] = js.undefined
  
  var inputId: js.UndefOr[String] = js.undefined
  
  var inputValue: js.UndefOr[String] = js.undefined
  
  var isOpen: js.UndefOr[Boolean] = js.undefined
  
  var itemToString: js.UndefOr[js.Function1[/* item */ Item | Null, String]] = js.undefined
  
  var items: js.Array[Item]
  
  var labelId: js.UndefOr[String] = js.undefined
  
  var menuId: js.UndefOr[String] = js.undefined
  
  var onHighlightedIndexChange: js.UndefOr[js.Function1[/* changes */ UseComboboxStateChange[Item], Unit]] = js.undefined
  
  var onInputValueChange: js.UndefOr[js.Function1[/* changes */ UseComboboxStateChange[Item], Unit]] = js.undefined
  
  var onIsOpenChange: js.UndefOr[js.Function1[/* changes */ UseComboboxStateChange[Item], Unit]] = js.undefined
  
  var onSelectedItemChange: js.UndefOr[js.Function1[/* changes */ UseComboboxStateChange[Item], Unit]] = js.undefined
  
  var onStateChange: js.UndefOr[js.Function1[/* changes */ UseComboboxStateChange[Item], Unit]] = js.undefined
  
  var scrollIntoView: js.UndefOr[js.Function2[/* node */ HTMLElement, /* menuNode */ HTMLElement, Unit]] = js.undefined
  
  var selectedItem: js.UndefOr[Item | Null] = js.undefined
  
  var stateReducer: js.UndefOr[
    js.Function2[
      /* state */ UseComboboxState[Item], 
      /* actionAndChanges */ UseComboboxStateChangeOptions[Item], 
      Partial[UseComboboxState[Item]]
    ]
  ] = js.undefined
  
  var toggleButtonId: js.UndefOr[String] = js.undefined
}
object UseComboboxProps {
  
  inline def apply[Item](items: js.Array[Item]): UseComboboxProps[Item] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseComboboxProps[Item]]
  }
  
  extension [Self <: UseComboboxProps[?], Item](x: Self & UseComboboxProps[Item]) {
    
    inline def setCircularNavigation(value: Boolean): Self = StObject.set(x, "circularNavigation", value.asInstanceOf[js.Any])
    
    inline def setCircularNavigationUndefined: Self = StObject.set(x, "circularNavigation", js.undefined)
    
    inline def setDefaultHighlightedIndex(value: Double): Self = StObject.set(x, "defaultHighlightedIndex", value.asInstanceOf[js.Any])
    
    inline def setDefaultHighlightedIndexUndefined: Self = StObject.set(x, "defaultHighlightedIndex", js.undefined)
    
    inline def setDefaultInputValue(value: String): Self = StObject.set(x, "defaultInputValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultInputValueUndefined: Self = StObject.set(x, "defaultInputValue", js.undefined)
    
    inline def setDefaultIsOpen(value: Boolean): Self = StObject.set(x, "defaultIsOpen", value.asInstanceOf[js.Any])
    
    inline def setDefaultIsOpenUndefined: Self = StObject.set(x, "defaultIsOpen", js.undefined)
    
    inline def setDefaultSelectedItem(value: Item): Self = StObject.set(x, "defaultSelectedItem", value.asInstanceOf[js.Any])
    
    inline def setDefaultSelectedItemNull: Self = StObject.set(x, "defaultSelectedItem", null)
    
    inline def setDefaultSelectedItemUndefined: Self = StObject.set(x, "defaultSelectedItem", js.undefined)
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setGetA11ySelectionMessage(value: /* options */ A11yStatusMessageOptions[Item] => String): Self = StObject.set(x, "getA11ySelectionMessage", js.Any.fromFunction1(value))
    
    inline def setGetA11ySelectionMessageUndefined: Self = StObject.set(x, "getA11ySelectionMessage", js.undefined)
    
    inline def setGetA11yStatusMessage(value: /* options */ A11yStatusMessageOptions[Item] => String): Self = StObject.set(x, "getA11yStatusMessage", js.Any.fromFunction1(value))
    
    inline def setGetA11yStatusMessageUndefined: Self = StObject.set(x, "getA11yStatusMessage", js.undefined)
    
    inline def setGetItemId(value: /* index */ Double => String): Self = StObject.set(x, "getItemId", js.Any.fromFunction1(value))
    
    inline def setGetItemIdUndefined: Self = StObject.set(x, "getItemId", js.undefined)
    
    inline def setHighlightedIndex(value: Double): Self = StObject.set(x, "highlightedIndex", value.asInstanceOf[js.Any])
    
    inline def setHighlightedIndexUndefined: Self = StObject.set(x, "highlightedIndex", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInitialHighlightedIndex(value: Double): Self = StObject.set(x, "initialHighlightedIndex", value.asInstanceOf[js.Any])
    
    inline def setInitialHighlightedIndexUndefined: Self = StObject.set(x, "initialHighlightedIndex", js.undefined)
    
    inline def setInitialInputValue(value: String): Self = StObject.set(x, "initialInputValue", value.asInstanceOf[js.Any])
    
    inline def setInitialInputValueUndefined: Self = StObject.set(x, "initialInputValue", js.undefined)
    
    inline def setInitialIsOpen(value: Boolean): Self = StObject.set(x, "initialIsOpen", value.asInstanceOf[js.Any])
    
    inline def setInitialIsOpenUndefined: Self = StObject.set(x, "initialIsOpen", js.undefined)
    
    inline def setInitialSelectedItem(value: Item): Self = StObject.set(x, "initialSelectedItem", value.asInstanceOf[js.Any])
    
    inline def setInitialSelectedItemNull: Self = StObject.set(x, "initialSelectedItem", null)
    
    inline def setInitialSelectedItemUndefined: Self = StObject.set(x, "initialSelectedItem", js.undefined)
    
    inline def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
    
    inline def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    inline def setItemToString(value: /* item */ Item | Null => String): Self = StObject.set(x, "itemToString", js.Any.fromFunction1(value))
    
    inline def setItemToStringUndefined: Self = StObject.set(x, "itemToString", js.undefined)
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
    
    inline def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
    
    inline def setMenuId(value: String): Self = StObject.set(x, "menuId", value.asInstanceOf[js.Any])
    
    inline def setMenuIdUndefined: Self = StObject.set(x, "menuId", js.undefined)
    
    inline def setOnHighlightedIndexChange(value: /* changes */ UseComboboxStateChange[Item] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onHighlightedIndexChange", js.Any.fromFunction1((t0: /* changes */ UseComboboxStateChange[Item]) => value(t0).runNow()))
    
    inline def setOnHighlightedIndexChangeUndefined: Self = StObject.set(x, "onHighlightedIndexChange", js.undefined)
    
    inline def setOnInputValueChange(value: /* changes */ UseComboboxStateChange[Item] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onInputValueChange", js.Any.fromFunction1((t0: /* changes */ UseComboboxStateChange[Item]) => value(t0).runNow()))
    
    inline def setOnInputValueChangeUndefined: Self = StObject.set(x, "onInputValueChange", js.undefined)
    
    inline def setOnIsOpenChange(value: /* changes */ UseComboboxStateChange[Item] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onIsOpenChange", js.Any.fromFunction1((t0: /* changes */ UseComboboxStateChange[Item]) => value(t0).runNow()))
    
    inline def setOnIsOpenChangeUndefined: Self = StObject.set(x, "onIsOpenChange", js.undefined)
    
    inline def setOnSelectedItemChange(value: /* changes */ UseComboboxStateChange[Item] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onSelectedItemChange", js.Any.fromFunction1((t0: /* changes */ UseComboboxStateChange[Item]) => value(t0).runNow()))
    
    inline def setOnSelectedItemChangeUndefined: Self = StObject.set(x, "onSelectedItemChange", js.undefined)
    
    inline def setOnStateChange(value: /* changes */ UseComboboxStateChange[Item] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1((t0: /* changes */ UseComboboxStateChange[Item]) => value(t0).runNow()))
    
    inline def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
    
    inline def setScrollIntoView(value: (/* node */ HTMLElement, /* menuNode */ HTMLElement) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "scrollIntoView", js.Any.fromFunction2((t0: /* node */ HTMLElement, t1: /* menuNode */ HTMLElement) => (value(t0, t1)).runNow()))
    
    inline def setScrollIntoViewUndefined: Self = StObject.set(x, "scrollIntoView", js.undefined)
    
    inline def setSelectedItem(value: Item): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemNull: Self = StObject.set(x, "selectedItem", null)
    
    inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
    
    inline def setStateReducer(
      value: (/* state */ UseComboboxState[Item], /* actionAndChanges */ UseComboboxStateChangeOptions[Item]) => Partial[UseComboboxState[Item]]
    ): Self = StObject.set(x, "stateReducer", js.Any.fromFunction2(value))
    
    inline def setStateReducerUndefined: Self = StObject.set(x, "stateReducer", js.undefined)
    
    inline def setToggleButtonId(value: String): Self = StObject.set(x, "toggleButtonId", value.asInstanceOf[js.Any])
    
    inline def setToggleButtonIdUndefined: Self = StObject.set(x, "toggleButtonId", js.undefined)
  }
}
