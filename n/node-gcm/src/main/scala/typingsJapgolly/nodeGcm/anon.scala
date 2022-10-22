package typingsJapgolly.nodeGcm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    var error: js.UndefOr[String] = js.undefined
    
    var message_id: js.UndefOr[String] = js.undefined
    
    var registration_id: js.UndefOr[String] = js.undefined
  }
  object Error {
    
    inline def apply(): Error = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setMessage_id(value: String): Self = StObject.set(x, "message_id", value.asInstanceOf[js.Any])
      
      inline def setMessage_idUndefined: Self = StObject.set(x, "message_id", js.undefined)
      
      inline def setRegistration_id(value: String): Self = StObject.set(x, "registration_id", value.asInstanceOf[js.Any])
      
      inline def setRegistration_idUndefined: Self = StObject.set(x, "registration_id", js.undefined)
    }
  }
}
