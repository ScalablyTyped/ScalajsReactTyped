package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.devextreme.mod.DevExpress.core.DxElement_
import typingsJapgolly.devextreme.mod.DevExpress.core.UserDefinedElement
import typingsJapgolly.devextreme.mod.DevExpress.core.template
import typingsJapgolly.devextreme.mod.DevExpress.events.EventInfo
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxPopup.Properties
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxSelectBox.CustomItemCreatingInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxSelectBoxOptions[TComponent]
  extends StObject
     with dxDropDownListOptions[TComponent] {
  
  /**
    * Configures the drop-down field which holds the content.
    */
  @JSName("dropDownOptions")
  var dropDownOptions_dxSelectBoxOptions: js.UndefOr[Properties] = js.undefined
  
  /**
    * Specifies a custom template for the text field. Must contain the TextBox UI component.
    */
  var fieldTemplate: js.UndefOr[
    template | (js.Function2[
      /* selectedItem */ Any, 
      /* fieldElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * A function that is executed when a user adds a custom item. Requires acceptCustomValue to be set to true.
    */
  var onCustomItemCreating: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent] & CustomItemCreatingInfo, Unit]] = js.undefined
  
  /**
    * Specifies whether or not to display selection controls.
    */
  var showSelectionControls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the DOM events after which the UI component&apos;s value should be updated. Applies only if acceptCustomValue is set to true.
    */
  @JSName("valueChangeEvent")
  var valueChangeEvent_dxSelectBoxOptions: js.UndefOr[String] = js.undefined
}
object dxSelectBoxOptions {
  
  inline def apply[TComponent](): dxSelectBoxOptions[TComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSelectBoxOptions[TComponent]]
  }
  
  extension [Self <: dxSelectBoxOptions[?], TComponent](x: Self & dxSelectBoxOptions[TComponent]) {
    
    inline def setDropDownOptions(value: Properties): Self = StObject.set(x, "dropDownOptions", value.asInstanceOf[js.Any])
    
    inline def setDropDownOptionsUndefined: Self = StObject.set(x, "dropDownOptions", js.undefined)
    
    inline def setFieldTemplate(
      value: template | (js.Function2[
          /* selectedItem */ Any, 
          /* fieldElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "fieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setFieldTemplateFunction2(
      value: (/* selectedItem */ Any, /* fieldElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "fieldTemplate", js.Any.fromFunction2(value))
    
    inline def setFieldTemplateUndefined: Self = StObject.set(x, "fieldTemplate", js.undefined)
    
    inline def setOnCustomItemCreating(value: /* e */ EventInfo[TComponent] & CustomItemCreatingInfo => Callback): Self = StObject.set(x, "onCustomItemCreating", js.Any.fromFunction1((t0: /* e */ EventInfo[TComponent] & CustomItemCreatingInfo) => value(t0).runNow()))
    
    inline def setOnCustomItemCreatingUndefined: Self = StObject.set(x, "onCustomItemCreating", js.undefined)
    
    inline def setShowSelectionControls(value: Boolean): Self = StObject.set(x, "showSelectionControls", value.asInstanceOf[js.Any])
    
    inline def setShowSelectionControlsUndefined: Self = StObject.set(x, "showSelectionControls", js.undefined)
    
    inline def setValueChangeEvent(value: String): Self = StObject.set(x, "valueChangeEvent", value.asInstanceOf[js.Any])
    
    inline def setValueChangeEventUndefined: Self = StObject.set(x, "valueChangeEvent", js.undefined)
  }
}
