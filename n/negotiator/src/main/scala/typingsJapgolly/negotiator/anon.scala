package typingsJapgolly.negotiator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Headers extends StObject {
    
    var headers: typingsJapgolly.negotiator.mod.Headers
  }
  object Headers {
    
    inline def apply(headers: typingsJapgolly.negotiator.mod.Headers): Headers = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    extension [Self <: Headers](x: Self) {
      
      inline def setHeaders(value: typingsJapgolly.negotiator.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
}
