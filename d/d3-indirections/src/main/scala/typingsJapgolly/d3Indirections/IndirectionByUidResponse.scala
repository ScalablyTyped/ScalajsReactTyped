package typingsJapgolly.d3Indirections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response from a GET indirection by UID request.
  */
trait IndirectionByUidResponse
  extends StObject
     with ResponseBase {
  
  @JSName("result")
  var result_IndirectionByUidResponse: Indirection
}
object IndirectionByUidResponse {
  
  inline def apply(result: Indirection): IndirectionByUidResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndirectionByUidResponse]
  }
  
  extension [Self <: IndirectionByUidResponse](x: Self) {
    
    inline def setResult(value: Indirection): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
