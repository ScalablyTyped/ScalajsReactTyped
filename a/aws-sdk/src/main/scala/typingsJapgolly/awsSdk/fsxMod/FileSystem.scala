package typingsJapgolly.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystem extends js.Object {
  /**
    * The time that the file system was created, in seconds (since 1970-01-01T00:00:00Z), also known as Unix time.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The DNS name for the file system.
    */
  var DNSName: js.UndefOr[typingsJapgolly.awsSdk.fsxMod.DNSName] = js.native
  var FailureDetails: js.UndefOr[FileSystemFailureDetails] = js.native
  /**
    * The system-generated, unique 17-digit ID of the file system.
    */
  var FileSystemId: js.UndefOr[typingsJapgolly.awsSdk.fsxMod.FileSystemId] = js.native
  /**
    * The type of Amazon FSx file system, either LUSTRE or WINDOWS.
    */
  var FileSystemType: js.UndefOr[typingsJapgolly.awsSdk.fsxMod.FileSystemType] = js.native
  /**
    * The ID of the AWS Key Management Service (AWS KMS) key used to encrypt the file system's data for an Amazon FSx for Windows File Server file system. Amazon FSx for Lustre does not support KMS encryption. 
    */
  var KmsKeyId: js.UndefOr[typingsJapgolly.awsSdk.fsxMod.KmsKeyId] = js.native
  /**
    * The lifecycle status of the file system, following are the possible values and what they mean:    AVAILABLE - The file system is in a healthy state, and is reachable and available for use.    CREATING - Amazon FSx is creating the new file system.    DELETING - Amazon FSx is deleting an existing file system.    FAILED - An existing file system has experienced an unrecoverable failure. When creating a new file system, Amazon FSx was unable to create the file system.    MISCONFIGURED indicates that the file system is in a failed but recoverable state.    UPDATING indicates that the file system is undergoing a customer initiated update.  
    */
  var Lifecycle: js.UndefOr[FileSystemLifecycle] = js.native
  var LustreConfiguration: js.UndefOr[LustreFileSystemConfiguration] = js.native
  /**
    * The IDs of the elastic network interface from which a specific file system is accessible. The elastic network interface is automatically created in the same VPC that the Amazon FSx file system was created in. For more information, see Elastic Network Interfaces in the Amazon EC2 User Guide.  For an Amazon FSx for Windows File Server file system, you can have one network interface ID. For an Amazon FSx for Lustre file system, you can have more than one.
    */
  var NetworkInterfaceIds: js.UndefOr[typingsJapgolly.awsSdk.fsxMod.NetworkInterfaceIds] = js.native
  /**
    * The AWS account that created the file system. If the file system was created by an AWS Identity and Access Management (IAM) user, the AWS account to which the IAM user belongs is the owner.
    */
  var OwnerId: js.UndefOr[AWSAccountId] = js.native
  /**
    * The Amazon Resource Name (ARN) for the file system resource.
    */
  var ResourceARN: js.UndefOr[typingsJapgolly.awsSdk.fsxMod.ResourceARN] = js.native
  /**
    * The storage capacity of the file system in gigabytes (GB).
    */
  var StorageCapacity: js.UndefOr[typingsJapgolly.awsSdk.fsxMod.StorageCapacity] = js.native
  /**
    * The ID of the subnet to contain the endpoint for the file system. One and only one is supported. The file system is launched in the Availability Zone associated with this subnet.
    */
  var SubnetIds: js.UndefOr[typingsJapgolly.awsSdk.fsxMod.SubnetIds] = js.native
  /**
    * The tags to associate with the file system. For more information, see Tagging Your Amazon EC2 Resources in the Amazon EC2 User Guide.
    */
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.fsxMod.Tags] = js.native
  /**
    * The ID of the primary VPC for the file system.
    */
  var VpcId: js.UndefOr[typingsJapgolly.awsSdk.fsxMod.VpcId] = js.native
  /**
    * The configuration for this Microsoft Windows file system.
    */
  var WindowsConfiguration: js.UndefOr[WindowsFileSystemConfiguration] = js.native
}

object FileSystem {
  @scala.inline
  def apply(
    CreationTime: js.Date = null,
    DNSName: DNSName = null,
    FailureDetails: FileSystemFailureDetails = null,
    FileSystemId: FileSystemId = null,
    FileSystemType: FileSystemType = null,
    KmsKeyId: KmsKeyId = null,
    Lifecycle: FileSystemLifecycle = null,
    LustreConfiguration: LustreFileSystemConfiguration = null,
    NetworkInterfaceIds: NetworkInterfaceIds = null,
    OwnerId: AWSAccountId = null,
    ResourceARN: ResourceARN = null,
    StorageCapacity: Int | Double = null,
    SubnetIds: SubnetIds = null,
    Tags: Tags = null,
    VpcId: VpcId = null,
    WindowsConfiguration: WindowsFileSystemConfiguration = null
  ): FileSystem = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (DNSName != null) __obj.updateDynamic("DNSName")(DNSName.asInstanceOf[js.Any])
    if (FailureDetails != null) __obj.updateDynamic("FailureDetails")(FailureDetails.asInstanceOf[js.Any])
    if (FileSystemId != null) __obj.updateDynamic("FileSystemId")(FileSystemId.asInstanceOf[js.Any])
    if (FileSystemType != null) __obj.updateDynamic("FileSystemType")(FileSystemType.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (Lifecycle != null) __obj.updateDynamic("Lifecycle")(Lifecycle.asInstanceOf[js.Any])
    if (LustreConfiguration != null) __obj.updateDynamic("LustreConfiguration")(LustreConfiguration.asInstanceOf[js.Any])
    if (NetworkInterfaceIds != null) __obj.updateDynamic("NetworkInterfaceIds")(NetworkInterfaceIds.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN.asInstanceOf[js.Any])
    if (StorageCapacity != null) __obj.updateDynamic("StorageCapacity")(StorageCapacity.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    if (WindowsConfiguration != null) __obj.updateDynamic("WindowsConfiguration")(WindowsConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystem]
  }
}

