package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterImageRequest extends js.Object {
  /**
    * The architecture of the AMI. Default: For Amazon EBS-backed AMIs, i386. For instance store-backed AMIs, the architecture specified in the manifest file.
    */
  var Architecture: js.UndefOr[ArchitectureValues] = js.native
  /**
    * The billing product codes. Your account must be authorized to specify billing product codes. Otherwise, you can use the AWS Marketplace to bill for the use of an AMI.
    */
  var BillingProducts: js.UndefOr[BillingProductList] = js.native
  /**
    * The block device mapping entries.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingRequestList] = js.native
  /**
    * A description for your AMI.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to enable enhanced networking with ENA for the AMI and any instances that you launch from the AMI. This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances launched from the AMI unreachable.
    */
  var EnaSupport: js.UndefOr[Boolean] = js.native
  /**
    * The full path to your AMI manifest in Amazon S3 storage. The specified bucket must have the aws-exec-read canned access control list (ACL) to ensure that it can be accessed by Amazon EC2. For more information, see Canned ACLs in the Amazon S3 Service Developer Guide.
    */
  var ImageLocation: js.UndefOr[String] = js.native
  /**
    * The ID of the kernel.
    */
  var KernelId: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.KernelId] = js.native
  /**
    * A name for your AMI. Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets ([]), spaces ( ), periods (.), slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
    */
  var Name: String = js.native
  /**
    * The ID of the RAM disk.
    */
  var RamdiskId: js.UndefOr[typingsJapgolly.awsSdk.ec2Mod.RamdiskId] = js.native
  /**
    * The device name of the root device volume (for example, /dev/sda1).
    */
  var RootDeviceName: js.UndefOr[String] = js.native
  /**
    * Set to simple to enable enhanced networking with the Intel 82599 Virtual Function interface for the AMI and any instances that you launch from the AMI. There is no way to disable sriovNetSupport at this time. This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances launched from the AMI unreachable.
    */
  var SriovNetSupport: js.UndefOr[String] = js.native
  /**
    * The type of virtualization (hvm | paravirtual). Default: paravirtual 
    */
  var VirtualizationType: js.UndefOr[String] = js.native
}

object RegisterImageRequest {
  @scala.inline
  def apply(
    Name: String,
    Architecture: ArchitectureValues = null,
    BillingProducts: BillingProductList = null,
    BlockDeviceMappings: BlockDeviceMappingRequestList = null,
    Description: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    EnaSupport: js.UndefOr[scala.Boolean] = js.undefined,
    ImageLocation: String = null,
    KernelId: KernelId = null,
    RamdiskId: RamdiskId = null,
    RootDeviceName: String = null,
    SriovNetSupport: String = null,
    VirtualizationType: String = null
  ): RegisterImageRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Architecture != null) __obj.updateDynamic("Architecture")(Architecture.asInstanceOf[js.Any])
    if (BillingProducts != null) __obj.updateDynamic("BillingProducts")(BillingProducts.asInstanceOf[js.Any])
    if (BlockDeviceMappings != null) __obj.updateDynamic("BlockDeviceMappings")(BlockDeviceMappings.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (!js.isUndefined(EnaSupport)) __obj.updateDynamic("EnaSupport")(EnaSupport.asInstanceOf[js.Any])
    if (ImageLocation != null) __obj.updateDynamic("ImageLocation")(ImageLocation.asInstanceOf[js.Any])
    if (KernelId != null) __obj.updateDynamic("KernelId")(KernelId.asInstanceOf[js.Any])
    if (RamdiskId != null) __obj.updateDynamic("RamdiskId")(RamdiskId.asInstanceOf[js.Any])
    if (RootDeviceName != null) __obj.updateDynamic("RootDeviceName")(RootDeviceName.asInstanceOf[js.Any])
    if (SriovNetSupport != null) __obj.updateDynamic("SriovNetSupport")(SriovNetSupport.asInstanceOf[js.Any])
    if (VirtualizationType != null) __obj.updateDynamic("VirtualizationType")(VirtualizationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterImageRequest]
  }
}

