package typingsJapgolly.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxAttributeExpressionValues extends StObject {
  
  var qValues: js.Array[NxSimpleValue]
}
object NxAttributeExpressionValues {
  
  inline def apply(qValues: js.Array[NxSimpleValue]): NxAttributeExpressionValues = {
    val __obj = js.Dynamic.literal(qValues = qValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxAttributeExpressionValues]
  }
  
  extension [Self <: NxAttributeExpressionValues](x: Self) {
    
    inline def setQValues(value: js.Array[NxSimpleValue]): Self = StObject.set(x, "qValues", value.asInstanceOf[js.Any])
    
    inline def setQValuesVarargs(value: NxSimpleValue*): Self = StObject.set(x, "qValues", js.Array(value*))
  }
}
