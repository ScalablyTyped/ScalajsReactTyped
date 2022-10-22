package typingsJapgolly.undici.typesDispatcherMod

import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineHandlerData extends StObject {
  
  var body: typingsJapgolly.undici.typesReadableMod.^
  
  var context: js.Object
  
  var headers: IncomingHttpHeaders
  
  var opaque: Any
  
  var statusCode: Double
}
object PipelineHandlerData {
  
  inline def apply(
    body: typingsJapgolly.undici.typesReadableMod.^,
    context: js.Object,
    headers: IncomingHttpHeaders,
    opaque: Any,
    statusCode: Double
  ): PipelineHandlerData = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], opaque = opaque.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineHandlerData]
  }
  
  extension [Self <: PipelineHandlerData](x: Self) {
    
    inline def setBody(value: typingsJapgolly.undici.typesReadableMod.^): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setOpaque(value: Any): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
