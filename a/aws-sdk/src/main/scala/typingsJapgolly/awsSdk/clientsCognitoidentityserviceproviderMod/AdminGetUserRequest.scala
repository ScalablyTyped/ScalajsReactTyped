package typingsJapgolly.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminGetUserRequest extends StObject {
  
  /**
    * The user pool ID for the user pool where you want to get information about the user.
    */
  var UserPoolId: UserPoolIdType
  
  /**
    * The user name of the user you want to retrieve.
    */
  var Username: UsernameType
}
object AdminGetUserRequest {
  
  inline def apply(UserPoolId: UserPoolIdType, Username: UsernameType): AdminGetUserRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminGetUserRequest]
  }
  
  extension [Self <: AdminGetUserRequest](x: Self) {
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: UsernameType): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
