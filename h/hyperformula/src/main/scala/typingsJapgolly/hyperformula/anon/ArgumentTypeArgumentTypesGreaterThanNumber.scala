package typingsJapgolly.hyperformula.anon

import typingsJapgolly.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgumentTypeArgumentTypesGreaterThanNumber extends StObject {
  
  var argumentType: ArgumentTypes
  
  var greaterThan: Double
  
  var minValue: Unit
}
object ArgumentTypeArgumentTypesGreaterThanNumber {
  
  inline def apply(argumentType: ArgumentTypes, greaterThan: Double, minValue: Unit): ArgumentTypeArgumentTypesGreaterThanNumber = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], greaterThan = greaterThan.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentTypeArgumentTypesGreaterThanNumber]
  }
  
  extension [Self <: ArgumentTypeArgumentTypesGreaterThanNumber](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setGreaterThan(value: Double): Self = StObject.set(x, "greaterThan", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Unit): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
  }
}
