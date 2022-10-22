package typingsJapgolly.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorCodeNumberMessage extends StObject {
  
  var error: CodeNumberMessage
  
  var id: Double
  
  var jsonrpc: String
}
object ErrorCodeNumberMessage {
  
  inline def apply(error: CodeNumberMessage, id: Double, jsonrpc: String): ErrorCodeNumberMessage = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCodeNumberMessage]
  }
  
  extension [Self <: ErrorCodeNumberMessage](x: Self) {
    
    inline def setError(value: CodeNumberMessage): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
  }
}
