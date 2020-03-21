package typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGroupResponse extends js.Object {
  /**
    * The group object for the group.
    */
  var Group: js.UndefOr[GroupType] = js.native
}

object CreateGroupResponse {
  @scala.inline
  def apply(Group: GroupType = null): CreateGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (Group != null) __obj.updateDynamic("Group")(Group.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupResponse]
  }
}

