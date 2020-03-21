package typingsJapgolly.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupResponse extends js.Object {
  /**
    * A structure that contains details about the group.
    */
  var Group: typingsJapgolly.awsSdk.iamMod.Group = js.native
  /**
    * A flag that indicates whether there are more items to return. If your results were truncated, you can make a subsequent pagination request using the Marker request parameter to retrieve more items. Note that IAM might return fewer than the MaxItems number of results even when there are more results available. We recommend that you check IsTruncated after every call to ensure that you receive all your results.
    */
  var IsTruncated: js.UndefOr[booleanType] = js.native
  /**
    * When IsTruncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent pagination request.
    */
  var Marker: js.UndefOr[responseMarkerType] = js.native
  /**
    * A list of users in the group.
    */
  var Users: userListType = js.native
}

object GetGroupResponse {
  @scala.inline
  def apply(
    Group: Group,
    Users: userListType,
    IsTruncated: js.UndefOr[Boolean] = js.undefined,
    Marker: responseMarkerType = null
  ): GetGroupResponse = {
    val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any], Users = Users.asInstanceOf[js.Any])
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupResponse]
  }
}

