package typingsJapgolly.postmanCollection.anon

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.postmanCollection.mod.HeaderDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  var body: String | Buffer | js.typedarray.Uint8Array
  
  var elapsedTime: Double
  
  var headers: js.UndefOr[js.Array[HeaderDefinition]] = js.undefined
  
  var statusCode: Double
  
  var statusMessage: js.UndefOr[String] = js.undefined
}
object Body {
  
  inline def apply(body: String | Buffer | js.typedarray.Uint8Array, elapsedTime: Double, statusCode: Double): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], elapsedTime = elapsedTime.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  extension [Self <: Body](x: Self) {
    
    inline def setBody(value: String | Buffer | js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: js.Array[HeaderDefinition]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: HeaderDefinition*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
  }
}
