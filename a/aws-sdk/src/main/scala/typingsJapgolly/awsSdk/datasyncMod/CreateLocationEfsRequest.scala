package typingsJapgolly.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLocationEfsRequest extends js.Object {
  /**
    * The subnet and security group that the Amazon EFS file system uses. The security group that you provide needs to be able to communicate with the security group on the mount target in the subnet specified. The exact relationship between security group M (of the mount target) and security group S (which you provide for DataSync to use at this stage) is as follows:     Security group M (which you associate with the mount target) must allow inbound access for the Transmission Control Protocol (TCP) on the NFS port (2049) from security group S. You can enable inbound connections either by IP address (CIDR range) or security group.    Security group S (provided to DataSync to access EFS) should have a rule that enables outbound connections to the NFS port on one of the file system’s mount targets. You can enable outbound connections either by IP address (CIDR range) or security group. For information about security groups and mount targets, see Security Groups for Amazon EC2 Instances and Mount Targets in the Amazon EFS User Guide.   
    */
  var Ec2Config: typingsJapgolly.awsSdk.datasyncMod.Ec2Config = js.native
  /**
    * The Amazon Resource Name (ARN) for the Amazon EFS file system.
    */
  var EfsFilesystemArn: typingsJapgolly.awsSdk.datasyncMod.EfsFilesystemArn = js.native
  /**
    * A subdirectory in the location’s path. This subdirectory in the EFS file system is used to read data from the EFS source location or write data to the EFS destination. By default, AWS DataSync uses the root directory.   Subdirectory must be specified with forward slashes. For example /path/to/folder. 
    */
  var Subdirectory: js.UndefOr[EfsSubdirectory] = js.native
  /**
    * The key-value pair that represents a tag that you want to add to the resource. The value can be an empty string. This value helps you manage, filter, and search for your resources. We recommend that you create a name tag for your location.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateLocationEfsRequest {
  @scala.inline
  def apply(
    Ec2Config: Ec2Config,
    EfsFilesystemArn: EfsFilesystemArn,
    Subdirectory: EfsSubdirectory = null,
    Tags: TagList = null
  ): CreateLocationEfsRequest = {
    val __obj = js.Dynamic.literal(Ec2Config = Ec2Config.asInstanceOf[js.Any], EfsFilesystemArn = EfsFilesystemArn.asInstanceOf[js.Any])
    if (Subdirectory != null) __obj.updateDynamic("Subdirectory")(Subdirectory.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocationEfsRequest]
  }
}

