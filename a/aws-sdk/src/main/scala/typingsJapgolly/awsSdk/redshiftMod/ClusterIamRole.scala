package typingsJapgolly.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterIamRole extends js.Object {
  /**
    * A value that describes the status of the IAM role's association with an Amazon Redshift cluster. The following are possible statuses and descriptions.    in-sync: The role is available for use by the cluster.    adding: The role is in the process of being associated with the cluster.    removing: The role is in the process of being disassociated with the cluster.  
    */
  var ApplyStatus: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role, for example, arn:aws:iam::123456789012:role/RedshiftCopyUnload. 
    */
  var IamRoleArn: js.UndefOr[String] = js.native
}

object ClusterIamRole {
  @scala.inline
  def apply(ApplyStatus: String = null, IamRoleArn: String = null): ClusterIamRole = {
    val __obj = js.Dynamic.literal()
    if (ApplyStatus != null) __obj.updateDynamic("ApplyStatus")(ApplyStatus.asInstanceOf[js.Any])
    if (IamRoleArn != null) __obj.updateDynamic("IamRoleArn")(IamRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterIamRole]
  }
}

