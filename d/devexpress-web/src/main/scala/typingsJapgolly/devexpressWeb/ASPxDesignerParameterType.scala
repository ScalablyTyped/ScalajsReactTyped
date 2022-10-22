package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASPxDesignerParameterType extends StObject {
  
  var defaultVal: Any
  
  var displayValue: String
  
  var specifics: String
  
  var value: String
  
  def valueConverter(`val`: Any): Any
}
object ASPxDesignerParameterType {
  
  inline def apply(
    defaultVal: Any,
    displayValue: String,
    specifics: String,
    value: String,
    valueConverter: Any => Any
  ): ASPxDesignerParameterType = {
    val __obj = js.Dynamic.literal(defaultVal = defaultVal.asInstanceOf[js.Any], displayValue = displayValue.asInstanceOf[js.Any], specifics = specifics.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueConverter = js.Any.fromFunction1(valueConverter))
    __obj.asInstanceOf[ASPxDesignerParameterType]
  }
  
  extension [Self <: ASPxDesignerParameterType](x: Self) {
    
    inline def setDefaultVal(value: Any): Self = StObject.set(x, "defaultVal", value.asInstanceOf[js.Any])
    
    inline def setDisplayValue(value: String): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
    
    inline def setSpecifics(value: String): Self = StObject.set(x, "specifics", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueConverter(value: Any => Any): Self = StObject.set(x, "valueConverter", js.Any.fromFunction1(value))
  }
}
