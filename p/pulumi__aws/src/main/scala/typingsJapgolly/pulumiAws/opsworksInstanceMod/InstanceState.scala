package typingsJapgolly.pulumiAws.opsworksInstanceMod

import typingsJapgolly.pulumiAws.inputMod.opsworks.InstanceEbsBlockDevice
import typingsJapgolly.pulumiAws.inputMod.opsworks.InstanceEphemeralBlockDevice
import typingsJapgolly.pulumiAws.inputMod.opsworks.InstanceRootBlockDevice
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceState extends js.Object {
  /**
    * The AWS OpsWorks agent to install.  Defaults to `"INHERIT"`.
    */
  val agentVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The AMI to use for the instance.  If an AMI is specified, `os` must be `"Custom"`.
    */
  val amiId: js.UndefOr[Input[String]] = js.native
  /**
    * Machine architecture for created instances.  Can be either `"x8664"` (the default) or `"i386"`
    */
  val architecture: js.UndefOr[Input[String]] = js.native
  /**
    * Creates load-based or time-based instances.  If set, can be either: `"load"` or `"timer"`.
    */
  val autoScalingType: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the availability zone where instances will be created
    * by default.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  val createdAt: js.UndefOr[Input[String]] = js.native
  val deleteEbs: js.UndefOr[Input[Boolean]] = js.native
  val deleteEip: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Additional EBS block devices to attach to the
    * instance.  See Block Devices below for details.
    */
  val ebsBlockDevices: js.UndefOr[Input[js.Array[Input[InstanceEbsBlockDevice]]]] = js.native
  /**
    * If true, the launched EC2 instance will be EBS-optimized.
    */
  val ebsOptimized: js.UndefOr[Input[Boolean]] = js.native
  /**
    * EC2 instance ID
    */
  val ec2InstanceId: js.UndefOr[Input[String]] = js.native
  val ecsClusterArn: js.UndefOr[Input[String]] = js.native
  val elasticIp: js.UndefOr[Input[String]] = js.native
  /**
    * Customize Ephemeral (also known as
    * "Instance Store") volumes on the instance. See Block Devices below for details.
    */
  val ephemeralBlockDevices: js.UndefOr[Input[js.Array[Input[InstanceEphemeralBlockDevice]]]] = js.native
  /**
    * The instance's host name.
    */
  val hostname: js.UndefOr[Input[String]] = js.native
  val infrastructureClass: js.UndefOr[Input[String]] = js.native
  /**
    * Controls where to install OS and package updates when the instance boots.  Defaults to `true`.
    */
  val installUpdatesOnBoot: js.UndefOr[Input[Boolean]] = js.native
  val instanceProfileArn: js.UndefOr[Input[String]] = js.native
  /**
    * The type of instance to start
    */
  val instanceType: js.UndefOr[Input[String]] = js.native
  val lastServiceErrorId: js.UndefOr[Input[String]] = js.native
  /**
    * The ids of the layers the instance will belong to.
    */
  val layerIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Name of operating system that will be installed.
    */
  val os: js.UndefOr[Input[String]] = js.native
  val platform: js.UndefOr[Input[String]] = js.native
  /**
    * The private DNS name assigned to the instance. Can only be
    * used inside the Amazon EC2, and only available if you've enabled DNS hostnames
    * for your VPC
    */
  val privateDns: js.UndefOr[Input[String]] = js.native
  /**
    * The private IP address assigned to the instance
    */
  val privateIp: js.UndefOr[Input[String]] = js.native
  /**
    * The public DNS name assigned to the instance. For EC2-VPC, this
    * is only available if you've enabled DNS hostnames for your VPC
    */
  val publicDns: js.UndefOr[Input[String]] = js.native
  /**
    * The public IP address assigned to the instance, if applicable.
    */
  val publicIp: js.UndefOr[Input[String]] = js.native
  val registeredBy: js.UndefOr[Input[String]] = js.native
  val reportedAgentVersion: js.UndefOr[Input[String]] = js.native
  val reportedOsFamily: js.UndefOr[Input[String]] = js.native
  val reportedOsName: js.UndefOr[Input[String]] = js.native
  val reportedOsVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Customize details about the root block
    * device of the instance. See Block Devices below for details.
    */
  val rootBlockDevices: js.UndefOr[Input[js.Array[Input[InstanceRootBlockDevice]]]] = js.native
  /**
    * Name of the type of root device instances will have by default.  Can be either `"ebs"` or `"instance-store"`
    */
  val rootDeviceType: js.UndefOr[Input[String]] = js.native
  val rootDeviceVolumeId: js.UndefOr[Input[String]] = js.native
  /**
    * The associated security groups.
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  val sshHostDsaKeyFingerprint: js.UndefOr[Input[String]] = js.native
  val sshHostRsaKeyFingerprint: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the SSH keypair that instances will have by default.
    */
  val sshKeyName: js.UndefOr[Input[String]] = js.native
  /**
    * The id of the stack the instance will belong to.
    */
  val stackId: js.UndefOr[Input[String]] = js.native
  /**
    * The desired state of the instance.  Can be either `"running"` or `"stopped"`.
    */
  val state: js.UndefOr[Input[String]] = js.native
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * Subnet ID to attach to
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
  /**
    * Instance tenancy to use. Can be one of `"default"`, `"dedicated"` or `"host"`
    */
  val tenancy: js.UndefOr[Input[String]] = js.native
  /**
    * Keyword to choose what virtualization mode created instances
    * will use. Can be either `"paravirtual"` or `"hvm"`.
    */
  val virtualizationType: js.UndefOr[Input[String]] = js.native
}

object InstanceState {
  @scala.inline
  def apply(
    agentVersion: Input[String] = null,
    amiId: Input[String] = null,
    architecture: Input[String] = null,
    autoScalingType: Input[String] = null,
    availabilityZone: Input[String] = null,
    createdAt: Input[String] = null,
    deleteEbs: Input[Boolean] = null,
    deleteEip: Input[Boolean] = null,
    ebsBlockDevices: Input[js.Array[Input[InstanceEbsBlockDevice]]] = null,
    ebsOptimized: Input[Boolean] = null,
    ec2InstanceId: Input[String] = null,
    ecsClusterArn: Input[String] = null,
    elasticIp: Input[String] = null,
    ephemeralBlockDevices: Input[js.Array[Input[InstanceEphemeralBlockDevice]]] = null,
    hostname: Input[String] = null,
    infrastructureClass: Input[String] = null,
    installUpdatesOnBoot: Input[Boolean] = null,
    instanceProfileArn: Input[String] = null,
    instanceType: Input[String] = null,
    lastServiceErrorId: Input[String] = null,
    layerIds: Input[js.Array[Input[String]]] = null,
    os: Input[String] = null,
    platform: Input[String] = null,
    privateDns: Input[String] = null,
    privateIp: Input[String] = null,
    publicDns: Input[String] = null,
    publicIp: Input[String] = null,
    registeredBy: Input[String] = null,
    reportedAgentVersion: Input[String] = null,
    reportedOsFamily: Input[String] = null,
    reportedOsName: Input[String] = null,
    reportedOsVersion: Input[String] = null,
    rootBlockDevices: Input[js.Array[Input[InstanceRootBlockDevice]]] = null,
    rootDeviceType: Input[String] = null,
    rootDeviceVolumeId: Input[String] = null,
    securityGroupIds: Input[js.Array[Input[String]]] = null,
    sshHostDsaKeyFingerprint: Input[String] = null,
    sshHostRsaKeyFingerprint: Input[String] = null,
    sshKeyName: Input[String] = null,
    stackId: Input[String] = null,
    state: Input[String] = null,
    status: Input[String] = null,
    subnetId: Input[String] = null,
    tenancy: Input[String] = null,
    virtualizationType: Input[String] = null
  ): InstanceState = {
    val __obj = js.Dynamic.literal()
    if (agentVersion != null) __obj.updateDynamic("agentVersion")(agentVersion.asInstanceOf[js.Any])
    if (amiId != null) __obj.updateDynamic("amiId")(amiId.asInstanceOf[js.Any])
    if (architecture != null) __obj.updateDynamic("architecture")(architecture.asInstanceOf[js.Any])
    if (autoScalingType != null) __obj.updateDynamic("autoScalingType")(autoScalingType.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (deleteEbs != null) __obj.updateDynamic("deleteEbs")(deleteEbs.asInstanceOf[js.Any])
    if (deleteEip != null) __obj.updateDynamic("deleteEip")(deleteEip.asInstanceOf[js.Any])
    if (ebsBlockDevices != null) __obj.updateDynamic("ebsBlockDevices")(ebsBlockDevices.asInstanceOf[js.Any])
    if (ebsOptimized != null) __obj.updateDynamic("ebsOptimized")(ebsOptimized.asInstanceOf[js.Any])
    if (ec2InstanceId != null) __obj.updateDynamic("ec2InstanceId")(ec2InstanceId.asInstanceOf[js.Any])
    if (ecsClusterArn != null) __obj.updateDynamic("ecsClusterArn")(ecsClusterArn.asInstanceOf[js.Any])
    if (elasticIp != null) __obj.updateDynamic("elasticIp")(elasticIp.asInstanceOf[js.Any])
    if (ephemeralBlockDevices != null) __obj.updateDynamic("ephemeralBlockDevices")(ephemeralBlockDevices.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (infrastructureClass != null) __obj.updateDynamic("infrastructureClass")(infrastructureClass.asInstanceOf[js.Any])
    if (installUpdatesOnBoot != null) __obj.updateDynamic("installUpdatesOnBoot")(installUpdatesOnBoot.asInstanceOf[js.Any])
    if (instanceProfileArn != null) __obj.updateDynamic("instanceProfileArn")(instanceProfileArn.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (lastServiceErrorId != null) __obj.updateDynamic("lastServiceErrorId")(lastServiceErrorId.asInstanceOf[js.Any])
    if (layerIds != null) __obj.updateDynamic("layerIds")(layerIds.asInstanceOf[js.Any])
    if (os != null) __obj.updateDynamic("os")(os.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (privateDns != null) __obj.updateDynamic("privateDns")(privateDns.asInstanceOf[js.Any])
    if (privateIp != null) __obj.updateDynamic("privateIp")(privateIp.asInstanceOf[js.Any])
    if (publicDns != null) __obj.updateDynamic("publicDns")(publicDns.asInstanceOf[js.Any])
    if (publicIp != null) __obj.updateDynamic("publicIp")(publicIp.asInstanceOf[js.Any])
    if (registeredBy != null) __obj.updateDynamic("registeredBy")(registeredBy.asInstanceOf[js.Any])
    if (reportedAgentVersion != null) __obj.updateDynamic("reportedAgentVersion")(reportedAgentVersion.asInstanceOf[js.Any])
    if (reportedOsFamily != null) __obj.updateDynamic("reportedOsFamily")(reportedOsFamily.asInstanceOf[js.Any])
    if (reportedOsName != null) __obj.updateDynamic("reportedOsName")(reportedOsName.asInstanceOf[js.Any])
    if (reportedOsVersion != null) __obj.updateDynamic("reportedOsVersion")(reportedOsVersion.asInstanceOf[js.Any])
    if (rootBlockDevices != null) __obj.updateDynamic("rootBlockDevices")(rootBlockDevices.asInstanceOf[js.Any])
    if (rootDeviceType != null) __obj.updateDynamic("rootDeviceType")(rootDeviceType.asInstanceOf[js.Any])
    if (rootDeviceVolumeId != null) __obj.updateDynamic("rootDeviceVolumeId")(rootDeviceVolumeId.asInstanceOf[js.Any])
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    if (sshHostDsaKeyFingerprint != null) __obj.updateDynamic("sshHostDsaKeyFingerprint")(sshHostDsaKeyFingerprint.asInstanceOf[js.Any])
    if (sshHostRsaKeyFingerprint != null) __obj.updateDynamic("sshHostRsaKeyFingerprint")(sshHostRsaKeyFingerprint.asInstanceOf[js.Any])
    if (sshKeyName != null) __obj.updateDynamic("sshKeyName")(sshKeyName.asInstanceOf[js.Any])
    if (stackId != null) __obj.updateDynamic("stackId")(stackId.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    if (tenancy != null) __obj.updateDynamic("tenancy")(tenancy.asInstanceOf[js.Any])
    if (virtualizationType != null) __obj.updateDynamic("virtualizationType")(virtualizationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceState]
  }
}

