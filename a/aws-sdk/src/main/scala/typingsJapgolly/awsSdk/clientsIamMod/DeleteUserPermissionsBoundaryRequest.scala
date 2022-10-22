package typingsJapgolly.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserPermissionsBoundaryRequest extends StObject {
  
  /**
    * The name (friendly name, not ARN) of the IAM user from which you want to remove the permissions boundary.
    */
  var UserName: userNameType
}
object DeleteUserPermissionsBoundaryRequest {
  
  inline def apply(UserName: userNameType): DeleteUserPermissionsBoundaryRequest = {
    val __obj = js.Dynamic.literal(UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserPermissionsBoundaryRequest]
  }
  
  extension [Self <: DeleteUserPermissionsBoundaryRequest](x: Self) {
    
    inline def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
