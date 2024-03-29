package typingsJapgolly.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLSelect extends StObject {
  
  var DisplayValues: Any
  
  var HTMLName: String
  
  /* private */ @JSName("MSForms.HTMLSelect_typekey")
  var MSFormsDotHTMLSelect_typekey: HTMLSelect
  
  var MultiSelect: Boolean
  
  var Selected: String
  
  var Size: Double
  
  var Values: Any
}
object HTMLSelect {
  
  inline def apply(
    DisplayValues: Any,
    HTMLName: String,
    MSFormsDotHTMLSelect_typekey: HTMLSelect,
    MultiSelect: Boolean,
    Selected: String,
    Size: Double,
    Values: Any
  ): HTMLSelect = {
    val __obj = js.Dynamic.literal(DisplayValues = DisplayValues.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], MultiSelect = MultiSelect.asInstanceOf[js.Any], Selected = Selected.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLSelect_typekey")(MSFormsDotHTMLSelect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLSelect]
  }
  
  extension [Self <: HTMLSelect](x: Self) {
    
    inline def setDisplayValues(value: Any): Self = StObject.set(x, "DisplayValues", value.asInstanceOf[js.Any])
    
    inline def setHTMLName(value: String): Self = StObject.set(x, "HTMLName", value.asInstanceOf[js.Any])
    
    inline def setMSFormsDotHTMLSelect_typekey(value: HTMLSelect): Self = StObject.set(x, "MSForms.HTMLSelect_typekey", value.asInstanceOf[js.Any])
    
    inline def setMultiSelect(value: Boolean): Self = StObject.set(x, "MultiSelect", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: String): Self = StObject.set(x, "Selected", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Any): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
  }
}
