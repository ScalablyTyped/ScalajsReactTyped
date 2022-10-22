package typingsJapgolly.qlik.mod

import typingsJapgolly.qlik.qlikStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPropertyNumber
  extends StObject
     with CustomPropertyCommon
     with CustomProperty {
  
  var component: js.UndefOr[String] = js.undefined
  
  var defaultValue: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[String] = js.undefined
  
  var min: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_CustomPropertyNumber: number
}
object CustomPropertyNumber {
  
  inline def apply(): CustomPropertyNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[CustomPropertyNumber]
  }
  
  extension [Self <: CustomPropertyNumber](x: Self) {
    
    inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setType(value: number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
