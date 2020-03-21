package typingsJapgolly.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGroupRequest extends js.Object {
  /**
    * The updated filter expression defining criteria by which to group traces.
    */
  var FilterExpression: js.UndefOr[typingsJapgolly.awsSdk.xrayMod.FilterExpression] = js.native
  /**
    * The ARN that was generated upon creation.
    */
  var GroupARN: js.UndefOr[typingsJapgolly.awsSdk.xrayMod.GroupARN] = js.native
  /**
    * The case-sensitive name of the group.
    */
  var GroupName: js.UndefOr[typingsJapgolly.awsSdk.xrayMod.GroupName] = js.native
}

object UpdateGroupRequest {
  @scala.inline
  def apply(FilterExpression: FilterExpression = null, GroupARN: GroupARN = null, GroupName: GroupName = null): UpdateGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (FilterExpression != null) __obj.updateDynamic("FilterExpression")(FilterExpression.asInstanceOf[js.Any])
    if (GroupARN != null) __obj.updateDynamic("GroupARN")(GroupARN.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGroupRequest]
  }
}

