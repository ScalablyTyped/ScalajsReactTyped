package typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminAddUserToGroupRequest extends js.Object {
  /**
    * The group name.
    */
  var GroupName: GroupNameType = js.native
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType = js.native
  /**
    * The username for the user.
    */
  var Username: UsernameType = js.native
}

object AdminAddUserToGroupRequest {
  @scala.inline
  def apply(GroupName: GroupNameType, UserPoolId: UserPoolIdType, Username: UsernameType): AdminAddUserToGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AdminAddUserToGroupRequest]
  }
}

