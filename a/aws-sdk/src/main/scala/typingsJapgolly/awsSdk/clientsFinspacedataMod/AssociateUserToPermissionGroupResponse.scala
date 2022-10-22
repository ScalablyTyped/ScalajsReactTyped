package typingsJapgolly.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateUserToPermissionGroupResponse extends StObject {
  
  /**
    * The returned status code of the response.
    */
  var statusCode: js.UndefOr[StatusCode] = js.undefined
}
object AssociateUserToPermissionGroupResponse {
  
  inline def apply(): AssociateUserToPermissionGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateUserToPermissionGroupResponse]
  }
  
  extension [Self <: AssociateUserToPermissionGroupResponse](x: Self) {
    
    inline def setStatusCode(value: StatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
