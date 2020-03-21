package typingsJapgolly.pulumiAws.mskClusterMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiAws.inputMod.msk.ClusterBrokerNodeGroupInfo
import typingsJapgolly.pulumiAws.inputMod.msk.ClusterClientAuthentication
import typingsJapgolly.pulumiAws.inputMod.msk.ClusterConfigurationInfo
import typingsJapgolly.pulumiAws.inputMod.msk.ClusterEncryptionInfo
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the MSK Configuration to use in the cluster.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A comma separated list of one or more hostname:port pairs of kafka brokers suitable to boostrap connectivity to the kafka cluster. Only contains value if `clientBroker` encryption in transit is set to `PLAINTEXT` or `TLS_PLAINTEXT`.
    */
  val bootstrapBrokers: js.UndefOr[Input[String]] = js.native
  /**
    * A comma separated list of one or more DNS names (or IPs) and TLS port pairs kafka brokers suitable to boostrap connectivity to the kafka cluster. Only contains value if `clientBroker` encryption in transit is set to `TLS_PLAINTEXT` or `TLS`.
    */
  val bootstrapBrokersTls: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block for the broker nodes of the Kafka cluster.
    */
  val brokerNodeGroupInfo: js.UndefOr[Input[ClusterBrokerNodeGroupInfo]] = js.native
  /**
    * Configuration block for specifying a client authentication. See below.
    */
  val clientAuthentication: js.UndefOr[Input[ClusterClientAuthentication]] = js.native
  /**
    * Name of the MSK cluster.
    */
  val clusterName: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block for specifying a MSK Configuration to attach to Kafka brokers. See below.
    */
  val configurationInfo: js.UndefOr[Input[ClusterConfigurationInfo]] = js.native
  /**
    * Current version of the MSK Cluster used for updates, e.g. `K13V1IB3VIYZZH`
    * * `encryption_info.0.encryption_at_rest_kms_key_arn` - The ARN of the KMS key used for encryption at rest of the broker data volumes.
    */
  val currentVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Configuration block for specifying encryption. See below.
    */
  val encryptionInfo: js.UndefOr[Input[ClusterEncryptionInfo]] = js.native
  /**
    * Specify the desired enhanced MSK CloudWatch monitoring level.  See [Monitoring Amazon MSK with Amazon CloudWatch](https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html)
    */
  val enhancedMonitoring: js.UndefOr[Input[String]] = js.native
  /**
    * Specify the desired Kafka software version.
    */
  val kafkaVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The desired total number of broker nodes in the kafka cluster.  It must be a multiple of the number of specified client subnets.
    */
  val numberOfBrokerNodes: js.UndefOr[Input[Double]] = js.native
  /**
    * A mapping of tags to assign to the resource
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * A comma separated list of one or more IP:port pairs to use to connect to the Apache Zookeeper cluster.
    */
  val zookeeperConnectString: js.UndefOr[Input[String]] = js.native
}

object ClusterState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    bootstrapBrokers: Input[String] = null,
    bootstrapBrokersTls: Input[String] = null,
    brokerNodeGroupInfo: Input[ClusterBrokerNodeGroupInfo] = null,
    clientAuthentication: Input[ClusterClientAuthentication] = null,
    clusterName: Input[String] = null,
    configurationInfo: Input[ClusterConfigurationInfo] = null,
    currentVersion: Input[String] = null,
    encryptionInfo: Input[ClusterEncryptionInfo] = null,
    enhancedMonitoring: Input[String] = null,
    kafkaVersion: Input[String] = null,
    numberOfBrokerNodes: Input[Double] = null,
    tags: Input[StringDictionary[_]] = null,
    zookeeperConnectString: Input[String] = null
  ): ClusterState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (bootstrapBrokers != null) __obj.updateDynamic("bootstrapBrokers")(bootstrapBrokers.asInstanceOf[js.Any])
    if (bootstrapBrokersTls != null) __obj.updateDynamic("bootstrapBrokersTls")(bootstrapBrokersTls.asInstanceOf[js.Any])
    if (brokerNodeGroupInfo != null) __obj.updateDynamic("brokerNodeGroupInfo")(brokerNodeGroupInfo.asInstanceOf[js.Any])
    if (clientAuthentication != null) __obj.updateDynamic("clientAuthentication")(clientAuthentication.asInstanceOf[js.Any])
    if (clusterName != null) __obj.updateDynamic("clusterName")(clusterName.asInstanceOf[js.Any])
    if (configurationInfo != null) __obj.updateDynamic("configurationInfo")(configurationInfo.asInstanceOf[js.Any])
    if (currentVersion != null) __obj.updateDynamic("currentVersion")(currentVersion.asInstanceOf[js.Any])
    if (encryptionInfo != null) __obj.updateDynamic("encryptionInfo")(encryptionInfo.asInstanceOf[js.Any])
    if (enhancedMonitoring != null) __obj.updateDynamic("enhancedMonitoring")(enhancedMonitoring.asInstanceOf[js.Any])
    if (kafkaVersion != null) __obj.updateDynamic("kafkaVersion")(kafkaVersion.asInstanceOf[js.Any])
    if (numberOfBrokerNodes != null) __obj.updateDynamic("numberOfBrokerNodes")(numberOfBrokerNodes.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (zookeeperConnectString != null) __obj.updateDynamic("zookeeperConnectString")(zookeeperConnectString.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterState]
  }
}

