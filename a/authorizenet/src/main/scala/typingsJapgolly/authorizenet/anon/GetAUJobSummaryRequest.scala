package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAUJobSummaryRequest extends StObject {
  
  var getAUJobSummaryRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetAUJobSummaryRequest
}
object GetAUJobSummaryRequest {
  
  inline def apply(getAUJobSummaryRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetAUJobSummaryRequest): GetAUJobSummaryRequest = {
    val __obj = js.Dynamic.literal(getAUJobSummaryRequest = getAUJobSummaryRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAUJobSummaryRequest]
  }
  
  extension [Self <: GetAUJobSummaryRequest](x: Self) {
    
    inline def setGetAUJobSummaryRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.GetAUJobSummaryRequest): Self = StObject.set(x, "getAUJobSummaryRequest", value.asInstanceOf[js.Any])
  }
}
