package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegerParameterRangeSpecification extends StObject {
  
  /**
    * The maximum integer value allowed.
    */
  var MaxValue: ParameterValue
  
  /**
    * The minimum integer value allowed.
    */
  var MinValue: ParameterValue
}
object IntegerParameterRangeSpecification {
  
  inline def apply(MaxValue: ParameterValue, MinValue: ParameterValue): IntegerParameterRangeSpecification = {
    val __obj = js.Dynamic.literal(MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerParameterRangeSpecification]
  }
  
  extension [Self <: IntegerParameterRangeSpecification](x: Self) {
    
    inline def setMaxValue(value: ParameterValue): Self = StObject.set(x, "MaxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: ParameterValue): Self = StObject.set(x, "MinValue", value.asInstanceOf[js.Any])
  }
}
