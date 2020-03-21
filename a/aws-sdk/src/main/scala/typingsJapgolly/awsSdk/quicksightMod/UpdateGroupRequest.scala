package typingsJapgolly.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGroupRequest extends js.Object {
  /**
    * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typingsJapgolly.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The description for the group that you want to update.
    */
  var Description: js.UndefOr[GroupDescription] = js.native
  /**
    * The name of the group that you want to update.
    */
  var GroupName: typingsJapgolly.awsSdk.quicksightMod.GroupName = js.native
  /**
    * The namespace. Currently, you should set this to default.
    */
  var Namespace: typingsJapgolly.awsSdk.quicksightMod.Namespace = js.native
}

object UpdateGroupRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    GroupName: GroupName,
    Namespace: Namespace,
    Description: GroupDescription = null
  ): UpdateGroupRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], GroupName = GroupName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGroupRequest]
  }
}

