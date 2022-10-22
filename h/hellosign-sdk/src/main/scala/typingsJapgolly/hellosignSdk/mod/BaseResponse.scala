package typingsJapgolly.hellosignSdk.mod

import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseResponse extends StObject {
  
  var resHeaders: IncomingHttpHeaders
  
  var statusCode: js.UndefOr[Double] = js.undefined
  
  var statusMessage: js.UndefOr[String] = js.undefined
}
object BaseResponse {
  
  inline def apply(resHeaders: IncomingHttpHeaders): BaseResponse = {
    val __obj = js.Dynamic.literal(resHeaders = resHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseResponse]
  }
  
  extension [Self <: BaseResponse](x: Self) {
    
    inline def setResHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "resHeaders", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
  }
}
