package typingsJapgolly.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIAMPolicyAssignmentRequest extends js.Object {
  /**
    * The name of the assignment. 
    */
  var AssignmentName: IAMPolicyAssignmentName = js.native
  /**
    * The AWS account ID where you want to delete the IAM policy assignment.
    */
  var AwsAccountId: typingsJapgolly.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The namespace that contains the assignment.
    */
  var Namespace: typingsJapgolly.awsSdk.quicksightMod.Namespace = js.native
}

object DeleteIAMPolicyAssignmentRequest {
  @scala.inline
  def apply(AssignmentName: IAMPolicyAssignmentName, AwsAccountId: AwsAccountId, Namespace: Namespace): DeleteIAMPolicyAssignmentRequest = {
    val __obj = js.Dynamic.literal(AssignmentName = AssignmentName.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteIAMPolicyAssignmentRequest]
  }
}

