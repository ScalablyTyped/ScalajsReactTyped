package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHostedProfilePageRequest extends StObject {
  
  var getHostedProfilePageRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetHostedProfilePageRequest
}
object GetHostedProfilePageRequest {
  
  inline def apply(
    getHostedProfilePageRequest: typingsJapgolly.authorizenet.mod.APIContracts.GetHostedProfilePageRequest
  ): GetHostedProfilePageRequest = {
    val __obj = js.Dynamic.literal(getHostedProfilePageRequest = getHostedProfilePageRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostedProfilePageRequest]
  }
  
  extension [Self <: GetHostedProfilePageRequest](x: Self) {
    
    inline def setGetHostedProfilePageRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.GetHostedProfilePageRequest): Self = StObject.set(x, "getHostedProfilePageRequest", value.asInstanceOf[js.Any])
  }
}
