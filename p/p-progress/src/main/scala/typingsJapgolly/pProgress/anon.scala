package typingsJapgolly.pProgress

import typingsJapgolly.pProgress.mod.PromiseSettledResult
import typingsJapgolly.pProgress.pProgressStrings.fulfilled
import typingsJapgolly.pProgress.pProgressStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Reason
    extends StObject
       with PromiseSettledResult[Any] {
    
    var reason: Any
    
    var status: rejected
  }
  object Reason {
    
    inline def apply(reason: Any): Reason = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
      __obj.asInstanceOf[Reason]
    }
    
    extension [Self <: Reason](x: Self) {
      
      inline def setReason(value: Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: rejected): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Status[ResolveValueType]
    extends StObject
       with PromiseSettledResult[ResolveValueType] {
    
    var status: fulfilled
    
    var value: ResolveValueType
  }
  object Status {
    
    inline def apply[ResolveValueType](value: ResolveValueType): Status[ResolveValueType] = {
      val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Status[ResolveValueType]]
    }
    
    extension [Self <: Status[?], ResolveValueType](x: Self & Status[ResolveValueType]) {
      
      inline def setStatus(value: fulfilled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setValue(value: ResolveValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
