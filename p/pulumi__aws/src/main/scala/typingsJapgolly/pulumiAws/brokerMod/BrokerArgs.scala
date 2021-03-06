package typingsJapgolly.pulumiAws.brokerMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.inputMod.mq.BrokerConfiguration
import typingsJapgolly.pulumiAws.inputMod.mq.BrokerEncryptionOptions
import typingsJapgolly.pulumiAws.inputMod.mq.BrokerLogs
import typingsJapgolly.pulumiAws.inputMod.mq.BrokerMaintenanceWindowStartTime
import typingsJapgolly.pulumiAws.inputMod.mq.BrokerUser
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerArgs extends js.Object {
  /**
    * Specifies whether any broker modifications
    * are applied immediately, or during the next maintenance window. Default is `false`.
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions.
    */
  val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name of the broker.
    */
  val brokerName: Input[String] = js.native
  /**
    * Configuration of the broker. See below.
    */
  val configuration: js.UndefOr[Input[BrokerConfiguration]] = js.native
  /**
    * The deployment mode of the broker. Supported: `SINGLE_INSTANCE` and `ACTIVE_STANDBY_MULTI_AZ`. Defaults to `SINGLE_INSTANCE`.
    */
  val deploymentMode: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block containing encryption options. See below.
    */
  val encryptionOptions: js.UndefOr[Input[BrokerEncryptionOptions]] = js.native
  /**
    * The type of broker engine. Currently, Amazon MQ supports only `ActiveMQ`.
    */
  val engineType: Input[String] = js.native
  /**
    * The version of the broker engine. See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions.
    */
  val engineVersion: Input[String] = js.native
  /**
    * The broker's instance type. e.g. `mq.t2.micro` or `mq.m4.large`
    */
  val hostInstanceType: Input[String] = js.native
  /**
    * Logging configuration of the broker. See below.
    */
  val logs: js.UndefOr[Input[BrokerLogs]] = js.native
  /**
    * Maintenance window start time. See below.
    */
  val maintenanceWindowStartTime: js.UndefOr[Input[BrokerMaintenanceWindowStartTime]] = js.native
  /**
    * Whether to enable connections from applications outside of the VPC that hosts the broker's subnets.
    */
  val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The list of security group IDs assigned to the broker.
    */
  val securityGroups: Input[js.Array[Input[String]]] = js.native
  /**
    * The list of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires two subnets.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The list of all ActiveMQ usernames for the specified broker. See below.
    */
  val users: Input[js.Array[Input[BrokerUser]]] = js.native
}

object BrokerArgs {
  @scala.inline
  def apply(
    brokerName: Input[String],
    engineType: Input[String],
    engineVersion: Input[String],
    hostInstanceType: Input[String],
    securityGroups: Input[js.Array[Input[String]]],
    users: Input[js.Array[Input[BrokerUser]]],
    applyImmediately: Input[Boolean] = null,
    autoMinorVersionUpgrade: Input[Boolean] = null,
    configuration: Input[BrokerConfiguration] = null,
    deploymentMode: Input[String] = null,
    encryptionOptions: Input[BrokerEncryptionOptions] = null,
    logs: Input[BrokerLogs] = null,
    maintenanceWindowStartTime: Input[BrokerMaintenanceWindowStartTime] = null,
    publiclyAccessible: Input[Boolean] = null,
    subnetIds: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): BrokerArgs = {
    val __obj = js.Dynamic.literal(brokerName = brokerName.asInstanceOf[js.Any], engineType = engineType.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], hostInstanceType = hostInstanceType.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    if (applyImmediately != null) __obj.updateDynamic("applyImmediately")(applyImmediately.asInstanceOf[js.Any])
    if (autoMinorVersionUpgrade != null) __obj.updateDynamic("autoMinorVersionUpgrade")(autoMinorVersionUpgrade.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (deploymentMode != null) __obj.updateDynamic("deploymentMode")(deploymentMode.asInstanceOf[js.Any])
    if (encryptionOptions != null) __obj.updateDynamic("encryptionOptions")(encryptionOptions.asInstanceOf[js.Any])
    if (logs != null) __obj.updateDynamic("logs")(logs.asInstanceOf[js.Any])
    if (maintenanceWindowStartTime != null) __obj.updateDynamic("maintenanceWindowStartTime")(maintenanceWindowStartTime.asInstanceOf[js.Any])
    if (publiclyAccessible != null) __obj.updateDynamic("publiclyAccessible")(publiclyAccessible.asInstanceOf[js.Any])
    if (subnetIds != null) __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerArgs]
  }
}

