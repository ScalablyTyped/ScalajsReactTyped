package typingsJapgolly.undici.typesDispatcherMod

import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamFactoryData extends StObject {
  
  var context: js.Object
  
  var headers: IncomingHttpHeaders
  
  var opaque: Any
  
  var statusCode: Double
}
object StreamFactoryData {
  
  inline def apply(context: js.Object, headers: IncomingHttpHeaders, opaque: Any, statusCode: Double): StreamFactoryData = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], opaque = opaque.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamFactoryData]
  }
  
  extension [Self <: StreamFactoryData](x: Self) {
    
    inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setOpaque(value: Any): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
