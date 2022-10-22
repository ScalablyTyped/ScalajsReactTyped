package typingsJapgolly.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorCodeBoolean extends StObject {
  
  var error: CodeBoolean
  
  var id: Double
  
  var jsonrpc: String
}
object ErrorCodeBoolean {
  
  inline def apply(error: CodeBoolean, id: Double, jsonrpc: String): ErrorCodeBoolean = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCodeBoolean]
  }
  
  extension [Self <: ErrorCodeBoolean](x: Self) {
    
    inline def setError(value: CodeBoolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
  }
}
