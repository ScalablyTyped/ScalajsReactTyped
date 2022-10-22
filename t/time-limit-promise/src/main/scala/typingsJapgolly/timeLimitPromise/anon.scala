package typingsJapgolly.timeLimitPromise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait RejectWith extends StObject {
    
    var rejectWith: Any
  }
  object RejectWith {
    
    inline def apply(rejectWith: Any): RejectWith = {
      val __obj = js.Dynamic.literal(rejectWith = rejectWith.asInstanceOf[js.Any])
      __obj.asInstanceOf[RejectWith]
    }
    
    extension [Self <: RejectWith](x: Self) {
      
      inline def setRejectWith(value: Any): Self = StObject.set(x, "rejectWith", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolveWith[R] extends StObject {
    
    var resolveWith: R
  }
  object ResolveWith {
    
    inline def apply[R](resolveWith: R): ResolveWith[R] = {
      val __obj = js.Dynamic.literal(resolveWith = resolveWith.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolveWith[R]]
    }
    
    extension [Self <: ResolveWith[?], R](x: Self & ResolveWith[R]) {
      
      inline def setResolveWith(value: R): Self = StObject.set(x, "resolveWith", value.asInstanceOf[js.Any])
    }
  }
}
