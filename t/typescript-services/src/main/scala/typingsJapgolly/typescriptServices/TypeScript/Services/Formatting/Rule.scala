package typingsJapgolly.typescriptServices.TypeScript.Services.Formatting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule extends StObject {
  
  var Descriptor: RuleDescriptor
  
  var Flag: RuleFlags
  
  var Operation: RuleOperation
}
object Rule {
  
  inline def apply(Descriptor: RuleDescriptor, Flag: RuleFlags, Operation: RuleOperation): Rule = {
    val __obj = js.Dynamic.literal(Descriptor = Descriptor.asInstanceOf[js.Any], Flag = Flag.asInstanceOf[js.Any], Operation = Operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  extension [Self <: Rule](x: Self) {
    
    inline def setDescriptor(value: RuleDescriptor): Self = StObject.set(x, "Descriptor", value.asInstanceOf[js.Any])
    
    inline def setFlag(value: RuleFlags): Self = StObject.set(x, "Flag", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: RuleOperation): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
  }
}
