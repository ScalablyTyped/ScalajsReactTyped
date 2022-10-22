package typingsJapgolly.hyperformula.anon

import typingsJapgolly.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxValueMinValueOptionalArg extends StObject {
  
  var argumentType: ArgumentTypes
  
  var maxValue: Double
  
  var minValue: Double
  
  var optionalArg: Boolean
}
object MaxValueMinValueOptionalArg {
  
  inline def apply(argumentType: ArgumentTypes, maxValue: Double, minValue: Double, optionalArg: Boolean): MaxValueMinValueOptionalArg = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], optionalArg = optionalArg.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxValueMinValueOptionalArg]
  }
  
  extension [Self <: MaxValueMinValueOptionalArg](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setOptionalArg(value: Boolean): Self = StObject.set(x, "optionalArg", value.asInstanceOf[js.Any])
  }
}
