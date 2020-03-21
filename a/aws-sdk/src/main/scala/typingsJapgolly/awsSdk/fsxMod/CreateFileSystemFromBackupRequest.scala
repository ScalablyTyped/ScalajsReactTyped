package typingsJapgolly.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFileSystemFromBackupRequest extends js.Object {
  var BackupId: typingsJapgolly.awsSdk.fsxMod.BackupId = js.native
  /**
    * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
    */
  var ClientRequestToken: js.UndefOr[typingsJapgolly.awsSdk.fsxMod.ClientRequestToken] = js.native
  /**
    * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups apply to all network interfaces. This value isn't returned in later describe requests.
    */
  var SecurityGroupIds: js.UndefOr[typingsJapgolly.awsSdk.fsxMod.SecurityGroupIds] = js.native
  /**
    * A list of IDs for the subnets that the file system will be accessible from. Currently, you can specify only one subnet. The file server is also launched in that subnet's Availability Zone.
    */
  var SubnetIds: typingsJapgolly.awsSdk.fsxMod.SubnetIds = js.native
  /**
    * The tags to be applied to the file system at file system creation. The key value of the Name tag appears in the console as the file system name.
    */
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.fsxMod.Tags] = js.native
  /**
    * The configuration for this Microsoft Windows file system.
    */
  var WindowsConfiguration: js.UndefOr[CreateFileSystemWindowsConfiguration] = js.native
}

object CreateFileSystemFromBackupRequest {
  @scala.inline
  def apply(
    BackupId: BackupId,
    SubnetIds: SubnetIds,
    ClientRequestToken: ClientRequestToken = null,
    SecurityGroupIds: SecurityGroupIds = null,
    Tags: Tags = null,
    WindowsConfiguration: CreateFileSystemWindowsConfiguration = null
  ): CreateFileSystemFromBackupRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (WindowsConfiguration != null) __obj.updateDynamic("WindowsConfiguration")(WindowsConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFileSystemFromBackupRequest]
  }
}

