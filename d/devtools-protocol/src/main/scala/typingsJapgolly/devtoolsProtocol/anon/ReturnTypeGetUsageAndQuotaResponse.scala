package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.GetUsageAndQuotaRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Storage.GetUsageAndQuotaResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetUsageAndQuotaResponse extends StObject {
  
  var paramsType: js.Array[GetUsageAndQuotaRequest]
  
  var returnType: GetUsageAndQuotaResponse
}
object ReturnTypeGetUsageAndQuotaResponse {
  
  inline def apply(paramsType: js.Array[GetUsageAndQuotaRequest], returnType: GetUsageAndQuotaResponse): ReturnTypeGetUsageAndQuotaResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetUsageAndQuotaResponse]
  }
  
  extension [Self <: ReturnTypeGetUsageAndQuotaResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetUsageAndQuotaRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetUsageAndQuotaRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetUsageAndQuotaResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
