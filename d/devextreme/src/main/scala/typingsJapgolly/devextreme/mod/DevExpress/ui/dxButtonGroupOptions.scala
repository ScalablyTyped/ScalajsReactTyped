package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.devextreme.mod.DevExpress.common.ButtonStyle
import typingsJapgolly.devextreme.mod.DevExpress.common.SingleMultipleOrNone
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.core.UserDefinedElement
import typingsJapgolly.devextreme.mod.DevExpress.core.template
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxButtonGroup.Item
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxButtonGroup.ItemClickEvent
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxButtonGroup.SelectionChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxButtonGroupOptions
  extends StObject
     with WidgetOptions[dxButtonGroup] {
  
  /**
    * Specifies a template for all the buttons in the group.
    */
  var buttonTemplate: js.UndefOr[
    template | (js.Function2[
      /* buttonData */ Any, 
      /* buttonContent */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Configures buttons in the group.
    */
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  
  /**
    * Specifies which data field provides keys used to distinguish between the selected buttons.
    */
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * A function that is executed when a button is clicked or tapped.
    */
  var onItemClick: js.UndefOr[js.Function1[/* e */ ItemClickEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a button is selected or selection is canceled.
    */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ SelectionChangedEvent, Unit]] = js.undefined
  
  /**
    * Contains the keys of the selected buttons and allows selecting buttons initially.
    */
  var selectedItemKeys: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Contains the data objects that correspond to the selected buttons. The data objects are taken from the items array.
    */
  var selectedItems: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Specifies the button selection mode.
    */
  var selectionMode: js.UndefOr[SingleMultipleOrNone] = js.undefined
  
  /**
    * Specifies how buttons in the group are styled.
    */
  var stylingMode: js.UndefOr[ButtonStyle] = js.undefined
}
object dxButtonGroupOptions {
  
  inline def apply(): dxButtonGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxButtonGroupOptions]
  }
  
  extension [Self <: dxButtonGroupOptions](x: Self) {
    
    inline def setButtonTemplate(
      value: template | (js.Function2[
          /* buttonData */ Any, 
          /* buttonContent */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "buttonTemplate", value.asInstanceOf[js.Any])
    
    inline def setButtonTemplateFunction2(
      value: (/* buttonData */ Any, /* buttonContent */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "buttonTemplate", js.Any.fromFunction2(value))
    
    inline def setButtonTemplateUndefined: Self = StObject.set(x, "buttonTemplate", js.undefined)
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKeyExpr(value: String | js.Function): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
    
    inline def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
    
    inline def setOnItemClick(value: /* e */ ItemClickEvent => Callback): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1((t0: /* e */ ItemClickEvent) => value(t0).runNow()))
    
    inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
    
    inline def setOnSelectionChanged(value: /* e */ SelectionChangedEvent => Callback): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction1((t0: /* e */ SelectionChangedEvent) => value(t0).runNow()))
    
    inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
    
    inline def setSelectedItemKeys(value: js.Array[Any]): Self = StObject.set(x, "selectedItemKeys", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemKeysUndefined: Self = StObject.set(x, "selectedItemKeys", js.undefined)
    
    inline def setSelectedItemKeysVarargs(value: Any*): Self = StObject.set(x, "selectedItemKeys", js.Array(value*))
    
    inline def setSelectedItems(value: js.Array[Any]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    inline def setSelectedItemsVarargs(value: Any*): Self = StObject.set(x, "selectedItems", js.Array(value*))
    
    inline def setSelectionMode(value: SingleMultipleOrNone): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setStylingMode(value: ButtonStyle): Self = StObject.set(x, "stylingMode", value.asInstanceOf[js.Any])
    
    inline def setStylingModeUndefined: Self = StObject.set(x, "stylingMode", js.undefined)
  }
}
