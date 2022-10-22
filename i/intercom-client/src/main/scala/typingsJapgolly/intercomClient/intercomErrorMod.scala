package typingsJapgolly.intercomClient

import typingsJapgolly.intercomClient.anon.Dictk
import typingsJapgolly.intercomClient.anon.Errors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intercomErrorMod {
  
  trait IntercomError extends StObject {
    
    var body: Errors
    
    var headers: Dictk
    
    var statusCode: Double
  }
  object IntercomError {
    
    inline def apply(body: Errors, headers: Dictk, statusCode: Double): IntercomError = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntercomError]
    }
    
    extension [Self <: IntercomError](x: Self) {
      
      inline def setBody(value: Errors): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Dictk): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
}
