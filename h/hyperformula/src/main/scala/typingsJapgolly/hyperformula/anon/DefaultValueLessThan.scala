package typingsJapgolly.hyperformula.anon

import typingsJapgolly.hyperformula.typingsInterpreterPluginFunctionPluginMod.ArgumentTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultValueLessThan extends StObject {
  
  var argumentType: ArgumentTypes
  
  var defaultValue: Unit
  
  var lessThan: Double
  
  var minValue: Double
  
  var optionalArg: Unit
}
object DefaultValueLessThan {
  
  inline def apply(
    argumentType: ArgumentTypes,
    defaultValue: Unit,
    lessThan: Double,
    minValue: Double,
    optionalArg: Unit
  ): DefaultValueLessThan = {
    val __obj = js.Dynamic.literal(argumentType = argumentType.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], lessThan = lessThan.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], optionalArg = optionalArg.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValueLessThan]
  }
  
  extension [Self <: DefaultValueLessThan](x: Self) {
    
    inline def setArgumentType(value: ArgumentTypes): Self = StObject.set(x, "argumentType", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: Unit): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setLessThan(value: Double): Self = StObject.set(x, "lessThan", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setOptionalArg(value: Unit): Self = StObject.set(x, "optionalArg", value.asInstanceOf[js.Any])
  }
}
