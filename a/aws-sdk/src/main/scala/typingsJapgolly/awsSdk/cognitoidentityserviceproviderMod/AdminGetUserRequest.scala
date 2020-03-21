package typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminGetUserRequest extends js.Object {
  /**
    * The user pool ID for the user pool where you want to get information about the user.
    */
  var UserPoolId: UserPoolIdType = js.native
  /**
    * The user name of the user you wish to retrieve.
    */
  var Username: UsernameType = js.native
}

object AdminGetUserRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType, Username: UsernameType): AdminGetUserRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdminGetUserRequest]
  }
}

