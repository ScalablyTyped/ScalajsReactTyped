package typingsJapgolly.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBrokerResponse extends js.Object {
  /**
    * Required. Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot.
    */
  var AutoMinorVersionUpgrade: js.UndefOr[boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the broker.
    */
  var BrokerArn: js.UndefOr[string] = js.native
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[string] = js.native
  /**
    * A list of information about allocated brokers.
    */
  var BrokerInstances: js.UndefOr[listOfBrokerInstance] = js.native
  /**
    * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or special characters.
    */
  var BrokerName: js.UndefOr[string] = js.native
  /**
    * The status of the broker.
    */
  var BrokerState: js.UndefOr[typingsJapgolly.awsSdk.mqMod.BrokerState] = js.native
  /**
    * The list of all revisions for the specified configuration.
    */
  var Configurations: js.UndefOr[typingsJapgolly.awsSdk.mqMod.Configurations] = js.native
  /**
    * The time when the broker was created.
    */
  var Created: js.UndefOr[js.Date] = js.native
  /**
    * Required. The deployment mode of the broker.
    */
  var DeploymentMode: js.UndefOr[typingsJapgolly.awsSdk.mqMod.DeploymentMode] = js.native
  /**
    * Encryption options for the broker.
    */
  var EncryptionOptions: js.UndefOr[typingsJapgolly.awsSdk.mqMod.EncryptionOptions] = js.native
  /**
    * Required. The type of broker engine. Note: Currently, Amazon MQ supports only ACTIVEMQ.
    */
  var EngineType: js.UndefOr[typingsJapgolly.awsSdk.mqMod.EngineType] = js.native
  /**
    * The version of the broker engine. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
    */
  var EngineVersion: js.UndefOr[string] = js.native
  /**
    * The broker's instance type.
    */
  var HostInstanceType: js.UndefOr[string] = js.native
  /**
    * The list of information about logs currently enabled and pending to be deployed for the specified broker.
    */
  var Logs: js.UndefOr[LogsSummary] = js.native
  /**
    * The parameters that determine the WeeklyStartTime.
    */
  var MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime] = js.native
  /**
    * The version of the broker engine to upgrade to. For a list of supported engine versions, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html
    */
  var PendingEngineVersion: js.UndefOr[string] = js.native
  /**
    * The host instance type of the broker to upgrade to. For a list of supported instance types, see https://docs.aws.amazon.com/amazon-mq/latest/developer-guide//broker.html#broker-instance-types
    */
  var PendingHostInstanceType: js.UndefOr[string] = js.native
  /**
    * The list of pending security groups to authorize connections to brokers.
    */
  var PendingSecurityGroups: js.UndefOr[listOfString] = js.native
  /**
    * Required. Enables connections from applications outside of the VPC that hosts the broker's subnets.
    */
  var PubliclyAccessible: js.UndefOr[boolean] = js.native
  /**
    * The list of security groups (1 minimum, 5 maximum) that authorizes connections to brokers.
    */
  var SecurityGroups: js.UndefOr[listOfString] = js.native
  /**
    * The broker's storage type.
    */
  var StorageType: js.UndefOr[BrokerStorageType] = js.native
  /**
    * The list of groups (2 maximum) that define which subnets and IP ranges the broker can use from different Availability Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An ACTIVE_STANDBY_MULTI_AZ deployment requires two subnets.
    */
  var SubnetIds: js.UndefOr[listOfString] = js.native
  /**
    * The list of all tags associated with this broker.
    */
  var Tags: js.UndefOr[mapOfString] = js.native
  /**
    * The list of all ActiveMQ usernames for the specified broker.
    */
  var Users: js.UndefOr[listOfUserSummary] = js.native
}

object DescribeBrokerResponse {
  @scala.inline
  def apply(
    AutoMinorVersionUpgrade: js.UndefOr[Boolean] = js.undefined,
    BrokerArn: string = null,
    BrokerId: string = null,
    BrokerInstances: listOfBrokerInstance = null,
    BrokerName: string = null,
    BrokerState: BrokerState = null,
    Configurations: Configurations = null,
    Created: js.Date = null,
    DeploymentMode: DeploymentMode = null,
    EncryptionOptions: EncryptionOptions = null,
    EngineType: EngineType = null,
    EngineVersion: string = null,
    HostInstanceType: string = null,
    Logs: LogsSummary = null,
    MaintenanceWindowStartTime: WeeklyStartTime = null,
    PendingEngineVersion: string = null,
    PendingHostInstanceType: string = null,
    PendingSecurityGroups: listOfString = null,
    PubliclyAccessible: js.UndefOr[Boolean] = js.undefined,
    SecurityGroups: listOfString = null,
    StorageType: BrokerStorageType = null,
    SubnetIds: listOfString = null,
    Tags: mapOfString = null,
    Users: listOfUserSummary = null
  ): DescribeBrokerResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoMinorVersionUpgrade)) __obj.updateDynamic("AutoMinorVersionUpgrade")(AutoMinorVersionUpgrade.asInstanceOf[js.Any])
    if (BrokerArn != null) __obj.updateDynamic("BrokerArn")(BrokerArn.asInstanceOf[js.Any])
    if (BrokerId != null) __obj.updateDynamic("BrokerId")(BrokerId.asInstanceOf[js.Any])
    if (BrokerInstances != null) __obj.updateDynamic("BrokerInstances")(BrokerInstances.asInstanceOf[js.Any])
    if (BrokerName != null) __obj.updateDynamic("BrokerName")(BrokerName.asInstanceOf[js.Any])
    if (BrokerState != null) __obj.updateDynamic("BrokerState")(BrokerState.asInstanceOf[js.Any])
    if (Configurations != null) __obj.updateDynamic("Configurations")(Configurations.asInstanceOf[js.Any])
    if (Created != null) __obj.updateDynamic("Created")(Created.asInstanceOf[js.Any])
    if (DeploymentMode != null) __obj.updateDynamic("DeploymentMode")(DeploymentMode.asInstanceOf[js.Any])
    if (EncryptionOptions != null) __obj.updateDynamic("EncryptionOptions")(EncryptionOptions.asInstanceOf[js.Any])
    if (EngineType != null) __obj.updateDynamic("EngineType")(EngineType.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (HostInstanceType != null) __obj.updateDynamic("HostInstanceType")(HostInstanceType.asInstanceOf[js.Any])
    if (Logs != null) __obj.updateDynamic("Logs")(Logs.asInstanceOf[js.Any])
    if (MaintenanceWindowStartTime != null) __obj.updateDynamic("MaintenanceWindowStartTime")(MaintenanceWindowStartTime.asInstanceOf[js.Any])
    if (PendingEngineVersion != null) __obj.updateDynamic("PendingEngineVersion")(PendingEngineVersion.asInstanceOf[js.Any])
    if (PendingHostInstanceType != null) __obj.updateDynamic("PendingHostInstanceType")(PendingHostInstanceType.asInstanceOf[js.Any])
    if (PendingSecurityGroups != null) __obj.updateDynamic("PendingSecurityGroups")(PendingSecurityGroups.asInstanceOf[js.Any])
    if (!js.isUndefined(PubliclyAccessible)) __obj.updateDynamic("PubliclyAccessible")(PubliclyAccessible.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Users != null) __obj.updateDynamic("Users")(Users.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBrokerResponse]
  }
}

