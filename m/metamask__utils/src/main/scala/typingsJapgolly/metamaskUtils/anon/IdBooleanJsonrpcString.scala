package typingsJapgolly.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdBooleanJsonrpcString extends StObject {
  
  var id: Boolean
  
  var jsonrpc: String
  
  var result: String
}
object IdBooleanJsonrpcString {
  
  inline def apply(id: Boolean, jsonrpc: String, result: String): IdBooleanJsonrpcString = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdBooleanJsonrpcString]
  }
  
  extension [Self <: IdBooleanJsonrpcString](x: Self) {
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
