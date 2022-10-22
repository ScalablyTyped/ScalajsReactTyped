package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedValues extends StObject {
  
  var all: scala.Double
  
  var allowedValues: scala.Double
  
  var dependentFields: scala.Double
  
  var none: scala.Double
}
object AllowedValues {
  
  inline def apply(all: scala.Double, allowedValues: scala.Double, dependentFields: scala.Double, none: scala.Double): AllowedValues = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], allowedValues = allowedValues.asInstanceOf[js.Any], dependentFields = dependentFields.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedValues]
  }
  
  extension [Self <: AllowedValues](x: Self) {
    
    inline def setAll(value: scala.Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllowedValues(value: scala.Double): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setDependentFields(value: scala.Double): Self = StObject.set(x, "dependentFields", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
