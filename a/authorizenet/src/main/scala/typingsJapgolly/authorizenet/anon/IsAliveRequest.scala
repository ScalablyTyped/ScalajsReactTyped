package typingsJapgolly.authorizenet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsAliveRequest extends StObject {
  
  var isAliveRequest: typingsJapgolly.authorizenet.mod.APIContracts.IsAliveRequest
}
object IsAliveRequest {
  
  inline def apply(isAliveRequest: typingsJapgolly.authorizenet.mod.APIContracts.IsAliveRequest): IsAliveRequest = {
    val __obj = js.Dynamic.literal(isAliveRequest = isAliveRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsAliveRequest]
  }
  
  extension [Self <: IsAliveRequest](x: Self) {
    
    inline def setIsAliveRequest(value: typingsJapgolly.authorizenet.mod.APIContracts.IsAliveRequest): Self = StObject.set(x, "isAliveRequest", value.asInstanceOf[js.Any])
  }
}
