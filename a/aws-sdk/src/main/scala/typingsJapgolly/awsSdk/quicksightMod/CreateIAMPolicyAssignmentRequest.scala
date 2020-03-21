package typingsJapgolly.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIAMPolicyAssignmentRequest extends js.Object {
  /**
    * The name of the assignment. It must be unique within an AWS account.
    */
  var AssignmentName: IAMPolicyAssignmentName = js.native
  /**
    * The status of the assignment. Possible values are as follows:    ENABLED - Anything specified in this assignment is used when creating the data source.    DISABLED - This assignment isn't used when creating the data source.    DRAFT - This assignment is an unfinished draft and isn't used when creating the data source.  
    */
  var AssignmentStatus: typingsJapgolly.awsSdk.quicksightMod.AssignmentStatus = js.native
  /**
    * The ID of the AWS account where you want to assign an IAM policy to QuickSight users or groups.
    */
  var AwsAccountId: typingsJapgolly.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The QuickSight users, groups, or both that you want to assign the policy to.
    */
  var Identities: js.UndefOr[IdentityMap] = js.native
  /**
    * The namespace that contains the assignment.
    */
  var Namespace: typingsJapgolly.awsSdk.quicksightMod.Namespace = js.native
  /**
    * The ARN for the IAM policy to apply to the QuickSight users and groups specified in this assignment.
    */
  var PolicyArn: js.UndefOr[Arn] = js.native
}

object CreateIAMPolicyAssignmentRequest {
  @scala.inline
  def apply(
    AssignmentName: IAMPolicyAssignmentName,
    AssignmentStatus: AssignmentStatus,
    AwsAccountId: AwsAccountId,
    Namespace: Namespace,
    Identities: IdentityMap = null,
    PolicyArn: Arn = null
  ): CreateIAMPolicyAssignmentRequest = {
    val __obj = js.Dynamic.literal(AssignmentName = AssignmentName.asInstanceOf[js.Any], AssignmentStatus = AssignmentStatus.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    if (Identities != null) __obj.updateDynamic("Identities")(Identities.asInstanceOf[js.Any])
    if (PolicyArn != null) __obj.updateDynamic("PolicyArn")(PolicyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIAMPolicyAssignmentRequest]
  }
}

