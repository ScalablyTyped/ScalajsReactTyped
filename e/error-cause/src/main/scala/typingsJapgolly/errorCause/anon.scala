package typingsJapgolly.errorCause

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cause extends StObject {
    
    var cause: js.UndefOr[Any] = js.undefined
  }
  object Cause {
    
    inline def apply(): Cause = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cause]
    }
    
    extension [Self <: Cause](x: Self) {
      
      inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    }
  }
}
