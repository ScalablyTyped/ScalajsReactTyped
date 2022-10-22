package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDatabaseNamesRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDatabaseNamesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeRequestDatabaseNamesResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[RequestDatabaseNamesRequest]]
  
  var returnType: RequestDatabaseNamesResponse
}
object ReturnTypeRequestDatabaseNamesResponse {
  
  inline def apply(
    paramsType: js.Array[js.UndefOr[RequestDatabaseNamesRequest]],
    returnType: RequestDatabaseNamesResponse
  ): ReturnTypeRequestDatabaseNamesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRequestDatabaseNamesResponse]
  }
  
  extension [Self <: ReturnTypeRequestDatabaseNamesResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[RequestDatabaseNamesRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[RequestDatabaseNamesRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: RequestDatabaseNamesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
