package typingsJapgolly.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableUserRequest extends StObject {
  
  /**
    * The authentication type for the user. You must specify USERPOOL.
    */
  var AuthenticationType: typingsJapgolly.awsSdk.clientsAppstreamMod.AuthenticationType
  
  /**
    * The email address of the user.  Users' email addresses are case-sensitive. 
    */
  var UserName: Username
}
object DisableUserRequest {
  
  inline def apply(AuthenticationType: AuthenticationType, UserName: Username): DisableUserRequest = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableUserRequest]
  }
  
  extension [Self <: DisableUserRequest](x: Self) {
    
    inline def setAuthenticationType(value: AuthenticationType): Self = StObject.set(x, "AuthenticationType", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: Username): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
