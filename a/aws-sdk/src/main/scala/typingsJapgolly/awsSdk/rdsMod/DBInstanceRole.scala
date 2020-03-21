package typingsJapgolly.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBInstanceRole extends js.Object {
  /**
    * The name of the feature associated with the AWS Identity and Access Management (IAM) role. For the list of supported feature names, see DBEngineVersion. 
    */
  var FeatureName: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role that is associated with the DB instance.
    */
  var RoleArn: js.UndefOr[String] = js.native
  /**
    * Describes the state of association between the IAM role and the DB instance. The Status property returns one of the following values:    ACTIVE - the IAM role ARN is associated with the DB instance and can be used to access other AWS services on your behalf.    PENDING - the IAM role ARN is being associated with the DB instance.    INVALID - the IAM role ARN is associated with the DB instance, but the DB instance is unable to assume the IAM role in order to access other AWS services on your behalf.  
    */
  var Status: js.UndefOr[String] = js.native
}

object DBInstanceRole {
  @scala.inline
  def apply(FeatureName: String = null, RoleArn: String = null, Status: String = null): DBInstanceRole = {
    val __obj = js.Dynamic.literal()
    if (FeatureName != null) __obj.updateDynamic("FeatureName")(FeatureName.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBInstanceRole]
  }
}

