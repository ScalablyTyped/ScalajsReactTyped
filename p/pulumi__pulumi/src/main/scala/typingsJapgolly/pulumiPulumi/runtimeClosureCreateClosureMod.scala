package typingsJapgolly.pulumiPulumi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeClosureCreateClosureMod {
  
  trait ClosureInfo extends StObject {
    
    var containsSecrets: Boolean
    
    var func: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FunctionInfo */ Any
  }
  object ClosureInfo {
    
    inline def apply(
      containsSecrets: Boolean,
      func: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FunctionInfo */ Any
    ): ClosureInfo = {
      val __obj = js.Dynamic.literal(containsSecrets = containsSecrets.asInstanceOf[js.Any], func = func.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClosureInfo]
    }
    
    extension [Self <: ClosureInfo](x: Self) {
      
      inline def setContainsSecrets(value: Boolean): Self = StObject.set(x, "containsSecrets", value.asInstanceOf[js.Any])
      
      inline def setFunc(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FunctionInfo */ Any
      ): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    }
  }
}
