package typingsJapgolly.metamaskUtils.anon

import typingsJapgolly.metamaskUtils.metamaskUtilsStrings.`2Dot0`
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonrpcMethodString extends StObject {
  
  var jsonrpc: `2Dot0`
  
  var method: String
  
  var params: js.UndefOr[js.Array[Any] | (Record[String, Any])] = js.undefined
}
object JsonrpcMethodString {
  
  inline def apply(method: String): JsonrpcMethodString = {
    val __obj = js.Dynamic.literal(jsonrpc = "2.0", method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonrpcMethodString]
  }
  
  extension [Self <: JsonrpcMethodString](x: Self) {
    
    inline def setJsonrpc(value: `2Dot0`): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[Any] | (Record[String, Any])): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setParamsVarargs(value: Any*): Self = StObject.set(x, "params", js.Array(value*))
  }
}
