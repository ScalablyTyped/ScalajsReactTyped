package typingsJapgolly.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorMessageBoolean extends StObject {
  
  var error: MessageBoolean
  
  var id: Double
  
  var jsonrpc: String
}
object ErrorMessageBoolean {
  
  inline def apply(error: MessageBoolean, id: Double, jsonrpc: String): ErrorMessageBoolean = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorMessageBoolean]
  }
  
  extension [Self <: ErrorMessageBoolean](x: Self) {
    
    inline def setError(value: MessageBoolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
  }
}
