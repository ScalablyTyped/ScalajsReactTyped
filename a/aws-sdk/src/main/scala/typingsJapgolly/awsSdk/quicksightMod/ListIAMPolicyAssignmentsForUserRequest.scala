package typingsJapgolly.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIAMPolicyAssignmentsForUserRequest extends js.Object {
  /**
    * The ID of the AWS account that contains the assignments.
    */
  var AwsAccountId: typingsJapgolly.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.quicksightMod.MaxResults] = js.native
  /**
    * The namespace of the assignment.
    */
  var Namespace: typingsJapgolly.awsSdk.quicksightMod.Namespace = js.native
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The name of the user.
    */
  var UserName: UserName_ = js.native
}

object ListIAMPolicyAssignmentsForUserRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    Namespace: Namespace,
    UserName: UserName_,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null
  ): ListIAMPolicyAssignmentsForUserRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIAMPolicyAssignmentsForUserRequest]
  }
}

