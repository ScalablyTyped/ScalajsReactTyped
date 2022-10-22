package typingsJapgolly.hapiHapi.mod

import typingsJapgolly.hapiShot.anon.Req
import typingsJapgolly.node.NodeJS.Dict
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerInjectResponse
  extends StObject
     with typingsJapgolly.hapiShot.mod.ResponseObject {
  
  /**
    * the request object.
    */
  var request: Request
  
  /**
    * the raw handler response (e.g. when not a stream or a view) before it is serialized for transmission. If not available, the value is set to payload. Useful for inspection and reuse of the
    * internal objects returned (instead of parsing the response string).
    */
  var result: js.UndefOr[js.Object] = js.undefined
}
object ServerInjectResponse {
  
  inline def apply(
    headers: OutgoingHttpHeaders,
    payload: String,
    raw: Req,
    rawPayload: Buffer,
    request: Request,
    statusCode: Double,
    statusMessage: String,
    trailers: Dict[String]
  ): ServerInjectResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], rawPayload = rawPayload.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], trailers = trailers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInjectResponse]
  }
  
  extension [Self <: ServerInjectResponse](x: Self) {
    
    inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResult(value: js.Object): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
