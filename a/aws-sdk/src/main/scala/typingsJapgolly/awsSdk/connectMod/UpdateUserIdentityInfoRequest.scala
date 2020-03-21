package typingsJapgolly.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserIdentityInfoRequest extends js.Object {
  /**
    * The identity information for the user.
    */
  var IdentityInfo: UserIdentityInfo = js.native
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.connectMod.InstanceId = js.native
  /**
    * The identifier of the user account.
    */
  var UserId: typingsJapgolly.awsSdk.connectMod.UserId = js.native
}

object UpdateUserIdentityInfoRequest {
  @scala.inline
  def apply(IdentityInfo: UserIdentityInfo, InstanceId: InstanceId, UserId: UserId): UpdateUserIdentityInfoRequest = {
    val __obj = js.Dynamic.literal(IdentityInfo = IdentityInfo.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateUserIdentityInfoRequest]
  }
}

