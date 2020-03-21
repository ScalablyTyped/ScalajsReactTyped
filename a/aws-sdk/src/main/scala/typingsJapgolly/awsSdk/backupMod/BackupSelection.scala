package typingsJapgolly.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupSelection extends js.Object {
  /**
    * The ARN of the IAM role that AWS Backup uses to authenticate when restoring the target resource; for example, arn:aws:iam::123456789012:role/S3Access.
    */
  var IamRoleArn: IAMRoleArn = js.native
  /**
    * An array of conditions used to specify a set of resources to assign to a backup plan; for example, "STRINGEQUALS": {"ec2:ResourceTag/Department": "accounting".
    */
  var ListOfTags: js.UndefOr[typingsJapgolly.awsSdk.backupMod.ListOfTags] = js.native
  /**
    * An array of strings that contain Amazon Resource Names (ARNs) of resources to assign to a backup plan.
    */
  var Resources: js.UndefOr[ResourceArns] = js.native
  /**
    * The display name of a resource selection document.
    */
  var SelectionName: BackupSelectionName = js.native
}

object BackupSelection {
  @scala.inline
  def apply(
    IamRoleArn: IAMRoleArn,
    SelectionName: BackupSelectionName,
    ListOfTags: ListOfTags = null,
    Resources: ResourceArns = null
  ): BackupSelection = {
    val __obj = js.Dynamic.literal(IamRoleArn = IamRoleArn.asInstanceOf[js.Any], SelectionName = SelectionName.asInstanceOf[js.Any])
    if (ListOfTags != null) __obj.updateDynamic("ListOfTags")(ListOfTags.asInstanceOf[js.Any])
    if (Resources != null) __obj.updateDynamic("Resources")(Resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupSelection]
  }
}

