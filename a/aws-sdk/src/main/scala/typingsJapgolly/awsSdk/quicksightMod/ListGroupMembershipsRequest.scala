package typingsJapgolly.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGroupMembershipsRequest extends js.Object {
  /**
    * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typingsJapgolly.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The name of the group that you want to see a membership list of.
    */
  var GroupName: typingsJapgolly.awsSdk.quicksightMod.GroupName = js.native
  /**
    * The maximum number of results to return from this request.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.MaxResults] = js.native
  /**
    * The namespace. Currently, you should set this to default.
    */
  var Namespace: typingsJapgolly.awsSdk.quicksightMod.Namespace = js.native
  /**
    * A pagination token that can be used in a subsequent request.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListGroupMembershipsRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    GroupName: GroupName,
    Namespace: Namespace,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null
  ): ListGroupMembershipsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], GroupName = GroupName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroupMembershipsRequest]
  }
}

