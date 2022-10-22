package typingsJapgolly.atom

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcScopeDescriptorMod {
  
  trait ScopeDescriptor extends StObject {
    
    /** Returns all scopes for this descriptor. */
    def getScopesArray(): js.Array[String]
  }
  object ScopeDescriptor {
    
    inline def apply(getScopesArray: CallbackTo[js.Array[String]]): ScopeDescriptor = {
      val __obj = js.Dynamic.literal(getScopesArray = getScopesArray.toJsFn)
      __obj.asInstanceOf[ScopeDescriptor]
    }
    
    extension [Self <: ScopeDescriptor](x: Self) {
      
      inline def setGetScopesArray(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getScopesArray", value.toJsFn)
    }
  }
}
