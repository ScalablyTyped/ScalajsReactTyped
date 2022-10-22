package typingsJapgolly.metamaskUtils.anon

import typingsJapgolly.metamaskUtils.distJsonMod.Json
import typingsJapgolly.metamaskUtils.metamaskUtilsStrings.`2Dot0`
import typingsJapgolly.superstruct.mod.Struct_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonrpcStruct extends StObject {
  
  var id: Struct_[String | Double | Null, Null]
  
  var jsonrpc: Struct_[`2Dot0`, `2Dot0`]
  
  var result: Struct_[Json, Any]
}
object JsonrpcStruct {
  
  inline def apply(
    id: Struct_[String | Double | Null, Null],
    jsonrpc: Struct_[`2Dot0`, `2Dot0`],
    result: Struct_[Json, Any]
  ): JsonrpcStruct = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonrpcStruct]
  }
  
  extension [Self <: JsonrpcStruct](x: Self) {
    
    inline def setId(value: Struct_[String | Double | Null, Null]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: Struct_[`2Dot0`, `2Dot0`]): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Struct_[Json, Any]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
