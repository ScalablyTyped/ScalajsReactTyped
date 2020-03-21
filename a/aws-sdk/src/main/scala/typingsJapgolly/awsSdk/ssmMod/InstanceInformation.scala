package typingsJapgolly.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceInformation extends js.Object {
  /**
    * The activation ID created by Systems Manager when the server or VM was registered.
    */
  var ActivationId: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.ActivationId] = js.native
  /**
    * The version of SSM Agent running on your Linux instance. 
    */
  var AgentVersion: js.UndefOr[Version] = js.native
  /**
    * Information about the association.
    */
  var AssociationOverview: js.UndefOr[InstanceAggregatedAssociationOverview] = js.native
  /**
    * The status of the association.
    */
  var AssociationStatus: js.UndefOr[StatusName] = js.native
  /**
    * The fully qualified host name of the managed instance.
    */
  var ComputerName: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.ComputerName] = js.native
  /**
    * The IP address of the managed instance.
    */
  var IPAddress: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.IPAddress] = js.native
  /**
    * The Amazon Identity and Access Management (IAM) role assigned to the on-premises Systems Manager managed instances. This call does not return the IAM role for Amazon EC2 instances. 
    */
  var IamRole: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.IamRole] = js.native
  /**
    * The instance ID. 
    */
  var InstanceId: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.InstanceId] = js.native
  /**
    * Indicates whether the latest version of SSM Agent is running on your Linux Managed Instance. This field does not indicate whether or not the latest version is installed on Windows managed instances, because some older versions of Windows Server use the EC2Config service to process SSM requests.
    */
  var IsLatestVersion: js.UndefOr[Boolean] = js.native
  /**
    * The date the association was last run.
    */
  var LastAssociationExecutionDate: js.UndefOr[js.Date] = js.native
  /**
    * The date and time when agent last pinged Systems Manager service. 
    */
  var LastPingDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The last date the association was successfully run.
    */
  var LastSuccessfulAssociationExecutionDate: js.UndefOr[js.Date] = js.native
  /**
    * The name of the managed instance.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * Connection status of SSM Agent. 
    */
  var PingStatus: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.PingStatus] = js.native
  /**
    * The name of the operating system platform running on your instance. 
    */
  var PlatformName: js.UndefOr[String] = js.native
  /**
    * The operating system platform type. 
    */
  var PlatformType: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.PlatformType] = js.native
  /**
    * The version of the OS platform running on your instance. 
    */
  var PlatformVersion: js.UndefOr[String] = js.native
  /**
    * The date the server or VM was registered with AWS as a managed instance.
    */
  var RegistrationDate: js.UndefOr[js.Date] = js.native
  /**
    * The type of instance. Instances are either EC2 instances or managed instances. 
    */
  var ResourceType: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.ResourceType] = js.native
}

object InstanceInformation {
  @scala.inline
  def apply(
    ActivationId: ActivationId = null,
    AgentVersion: Version = null,
    AssociationOverview: InstanceAggregatedAssociationOverview = null,
    AssociationStatus: StatusName = null,
    ComputerName: ComputerName = null,
    IPAddress: IPAddress = null,
    IamRole: IamRole = null,
    InstanceId: InstanceId = null,
    IsLatestVersion: js.UndefOr[scala.Boolean] = js.undefined,
    LastAssociationExecutionDate: js.Date = null,
    LastPingDateTime: js.Date = null,
    LastSuccessfulAssociationExecutionDate: js.Date = null,
    Name: String = null,
    PingStatus: PingStatus = null,
    PlatformName: String = null,
    PlatformType: PlatformType = null,
    PlatformVersion: String = null,
    RegistrationDate: js.Date = null,
    ResourceType: ResourceType = null
  ): InstanceInformation = {
    val __obj = js.Dynamic.literal()
    if (ActivationId != null) __obj.updateDynamic("ActivationId")(ActivationId.asInstanceOf[js.Any])
    if (AgentVersion != null) __obj.updateDynamic("AgentVersion")(AgentVersion.asInstanceOf[js.Any])
    if (AssociationOverview != null) __obj.updateDynamic("AssociationOverview")(AssociationOverview.asInstanceOf[js.Any])
    if (AssociationStatus != null) __obj.updateDynamic("AssociationStatus")(AssociationStatus.asInstanceOf[js.Any])
    if (ComputerName != null) __obj.updateDynamic("ComputerName")(ComputerName.asInstanceOf[js.Any])
    if (IPAddress != null) __obj.updateDynamic("IPAddress")(IPAddress.asInstanceOf[js.Any])
    if (IamRole != null) __obj.updateDynamic("IamRole")(IamRole.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (!js.isUndefined(IsLatestVersion)) __obj.updateDynamic("IsLatestVersion")(IsLatestVersion.asInstanceOf[js.Any])
    if (LastAssociationExecutionDate != null) __obj.updateDynamic("LastAssociationExecutionDate")(LastAssociationExecutionDate.asInstanceOf[js.Any])
    if (LastPingDateTime != null) __obj.updateDynamic("LastPingDateTime")(LastPingDateTime.asInstanceOf[js.Any])
    if (LastSuccessfulAssociationExecutionDate != null) __obj.updateDynamic("LastSuccessfulAssociationExecutionDate")(LastSuccessfulAssociationExecutionDate.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (PingStatus != null) __obj.updateDynamic("PingStatus")(PingStatus.asInstanceOf[js.Any])
    if (PlatformName != null) __obj.updateDynamic("PlatformName")(PlatformName.asInstanceOf[js.Any])
    if (PlatformType != null) __obj.updateDynamic("PlatformType")(PlatformType.asInstanceOf[js.Any])
    if (PlatformVersion != null) __obj.updateDynamic("PlatformVersion")(PlatformVersion.asInstanceOf[js.Any])
    if (RegistrationDate != null) __obj.updateDynamic("RegistrationDate")(RegistrationDate.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceInformation]
  }
}

