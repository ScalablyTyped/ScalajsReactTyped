package typingsJapgolly.clearbladejsServer

import typingsJapgolly.clearbladejsServer.CbServer.BasicReq
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Request extends StObject {
    
    var request: BasicReq
  }
  object Request {
    
    inline def apply(request: BasicReq): Request = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setRequest(value: BasicReq): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
}
