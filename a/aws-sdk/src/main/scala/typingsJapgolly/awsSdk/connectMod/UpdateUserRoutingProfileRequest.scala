package typingsJapgolly.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUserRoutingProfileRequest extends js.Object {
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.connectMod.InstanceId = js.native
  /**
    * The identifier of the routing profile for the user.
    */
  var RoutingProfileId: typingsJapgolly.awsSdk.connectMod.RoutingProfileId = js.native
  /**
    * The identifier of the user account.
    */
  var UserId: typingsJapgolly.awsSdk.connectMod.UserId = js.native
}

object UpdateUserRoutingProfileRequest {
  @scala.inline
  def apply(InstanceId: InstanceId, RoutingProfileId: RoutingProfileId, UserId: UserId): UpdateUserRoutingProfileRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], RoutingProfileId = RoutingProfileId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateUserRoutingProfileRequest]
  }
}

