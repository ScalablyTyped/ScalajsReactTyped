package typingsJapgolly.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsNumber extends StObject {
  
  var id: Unit
  
  var jsonrpc: String
  
  var method: String
  
  var params: Double
}
object ParamsNumber {
  
  inline def apply(id: Unit, jsonrpc: String, method: String, params: Double): ParamsNumber = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsNumber]
  }
  
  extension [Self <: ParamsNumber](x: Self) {
    
    inline def setId(value: Unit): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Double): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
