package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyInstanceAttributeRequest extends StObject {
  
  /**
    * The name of the attribute to modify.  You can modify the following attributes only: disableApiTermination | instanceType | kernel | ramdisk | instanceInitiatedShutdownBehavior | blockDeviceMapping | userData | sourceDestCheck | groupSet | ebsOptimized | sriovNetSupport | enaSupport | nvmeSupport | disableApiStop | enclaveOptions  
    */
  var Attribute: js.UndefOr[InstanceAttributeName] = js.undefined
  
  /**
    * Modifies the DeleteOnTermination attribute for volumes that are currently attached. The volume must be owned by the caller. If no value is specified for DeleteOnTermination, the default is true and the volume is deleted when the instance is terminated. To add instance store volumes to an Amazon EBS-backed instance, you must add them when you launch the instance. For more information, see Update the block device mapping when launching an instance in the Amazon EC2 User Guide.
    */
  var BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingSpecificationList] = js.undefined
  
  /**
    * Indicates whether an instance is enabled for stop protection. For more information, see Stop Protection. 
    */
  var DisableApiStop: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    * If the value is true, you can't terminate the instance using the Amazon EC2 console, CLI, or API; otherwise, you can. You cannot use this parameter for Spot Instances.
    */
  var DisableApiTermination: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS Optimized instance.
    */
  var EbsOptimized: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    * Set to true to enable enhanced networking with ENA for the instance. This option is supported only for HVM instances. Specifying this option with a PV instance can make it unreachable.
    */
  var EnaSupport: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    * [EC2-VPC] Replaces the security groups of the instance with the specified security groups. You must specify at least one security group, even if it's just the default security group for the VPC. You must specify the security group ID, not the security group name.
    */
  var Groups: js.UndefOr[GroupIdStringList] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsEc2Mod.InstanceId
  
  /**
    * Specifies whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown).
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * Changes the instance type to the specified value. For more information, see Instance types in the Amazon EC2 User Guide. If the instance type is not valid, the error returned is InvalidInstanceAttributeValue.
    */
  var InstanceType: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * Changes the instance's kernel to the specified value. We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see PV-GRUB.
    */
  var Kernel: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * Changes the instance's RAM disk to the specified value. We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see PV-GRUB.
    */
  var Ramdisk: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * Enable or disable source/destination checks, which ensure that the instance is either the source or the destination of any traffic that it receives. If the value is true, source/destination checks are enabled; otherwise, they are disabled. The default value is true. You must disable source/destination checks if the instance runs services such as network address translation, routing, or firewalls.
    */
  var SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    * Set to simple to enable enhanced networking with the Intel 82599 Virtual Function interface for the instance. There is no way to disable enhanced networking with the Intel 82599 Virtual Function interface at this time. This option is supported only for HVM instances. Specifying this option with a PV instance can make it unreachable.
    */
  var SriovNetSupport: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * Changes the instance's user data to the specified value. If you are using an Amazon Web Services SDK or command line tool, base64-encoding is performed for you, and you can load the text from a file. Otherwise, you must provide base64-encoded text.
    */
  var UserData: js.UndefOr[BlobAttributeValue] = js.undefined
  
  /**
    * A new value for the attribute. Use only with the kernel, ramdisk, userData, disableApiTermination, or instanceInitiatedShutdownBehavior attribute.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object ModifyInstanceAttributeRequest {
  
  inline def apply(InstanceId: InstanceId): ModifyInstanceAttributeRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceAttributeRequest]
  }
  
  extension [Self <: ModifyInstanceAttributeRequest](x: Self) {
    
    inline def setAttribute(value: InstanceAttributeName): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "Attribute", js.undefined)
    
    inline def setBlockDeviceMappings(value: InstanceBlockDeviceMappingSpecificationList): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    inline def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    inline def setBlockDeviceMappingsVarargs(value: InstanceBlockDeviceMappingSpecification*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value*))
    
    inline def setDisableApiStop(value: AttributeBooleanValue): Self = StObject.set(x, "DisableApiStop", value.asInstanceOf[js.Any])
    
    inline def setDisableApiStopUndefined: Self = StObject.set(x, "DisableApiStop", js.undefined)
    
    inline def setDisableApiTermination(value: AttributeBooleanValue): Self = StObject.set(x, "DisableApiTermination", value.asInstanceOf[js.Any])
    
    inline def setDisableApiTerminationUndefined: Self = StObject.set(x, "DisableApiTermination", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setEbsOptimized(value: AttributeBooleanValue): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    inline def setEnaSupport(value: AttributeBooleanValue): Self = StObject.set(x, "EnaSupport", value.asInstanceOf[js.Any])
    
    inline def setEnaSupportUndefined: Self = StObject.set(x, "EnaSupport", js.undefined)
    
    inline def setGroups(value: GroupIdStringList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceInitiatedShutdownBehavior(value: AttributeValue): Self = StObject.set(x, "InstanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
    
    inline def setInstanceInitiatedShutdownBehaviorUndefined: Self = StObject.set(x, "InstanceInitiatedShutdownBehavior", js.undefined)
    
    inline def setInstanceType(value: AttributeValue): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setKernel(value: AttributeValue): Self = StObject.set(x, "Kernel", value.asInstanceOf[js.Any])
    
    inline def setKernelUndefined: Self = StObject.set(x, "Kernel", js.undefined)
    
    inline def setRamdisk(value: AttributeValue): Self = StObject.set(x, "Ramdisk", value.asInstanceOf[js.Any])
    
    inline def setRamdiskUndefined: Self = StObject.set(x, "Ramdisk", js.undefined)
    
    inline def setSourceDestCheck(value: AttributeBooleanValue): Self = StObject.set(x, "SourceDestCheck", value.asInstanceOf[js.Any])
    
    inline def setSourceDestCheckUndefined: Self = StObject.set(x, "SourceDestCheck", js.undefined)
    
    inline def setSriovNetSupport(value: AttributeValue): Self = StObject.set(x, "SriovNetSupport", value.asInstanceOf[js.Any])
    
    inline def setSriovNetSupportUndefined: Self = StObject.set(x, "SriovNetSupport", js.undefined)
    
    inline def setUserData(value: BlobAttributeValue): Self = StObject.set(x, "UserData", value.asInstanceOf[js.Any])
    
    inline def setUserDataUndefined: Self = StObject.set(x, "UserData", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
