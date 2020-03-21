package typingsJapgolly.pulumiAws.streamMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamArgs extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the Stream (same as `id`)
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The encryption type to use. The only acceptable values are `NONE` or `KMS`. The default value is `NONE`.
    */
  val encryptionType: js.UndefOr[Input[String]] = js.native
  /**
    * A boolean that indicates all registered consumers should be deregistered from the stream so that the stream can be destroyed without error. The default value is `false`.
    */
  val enforceConsumerDeletion: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The GUID for the customer-managed KMS key to use for encryption. You can also use a Kinesis-owned master key by specifying the alias `alias/aws/kinesis`.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * A name to identify the stream. This is unique to the AWS account and region the Stream is created in.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Length of time data records are accessible after they are added to the stream. The maximum value of a stream's retention period is 168 hours. Minimum value is 24. Default is 24.
    */
  val retentionPeriod: js.UndefOr[Input[Double]] = js.native
  /**
    * The number of shards that the stream will use.
    * Amazon has guidelines for specifying the Stream size that should be referenced when creating a Kinesis stream. See [Amazon Kinesis Streams][2] for more.
    */
  val shardCount: Input[Double] = js.native
  /**
    * A list of shard-level CloudWatch metrics which can be enabled for the stream. See [Monitoring with CloudWatch][3] for more. Note that the value ALL should not be used; instead you should provide an explicit list of metrics you wish to enable.
    */
  val shardLevelMetrics: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object StreamArgs {
  @scala.inline
  def apply(
    shardCount: Input[Double],
    arn: Input[String] = null,
    encryptionType: Input[String] = null,
    enforceConsumerDeletion: Input[Boolean] = null,
    kmsKeyId: Input[String] = null,
    name: Input[String] = null,
    retentionPeriod: Input[Double] = null,
    shardLevelMetrics: Input[js.Array[Input[String]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): StreamArgs = {
    val __obj = js.Dynamic.literal(shardCount = shardCount.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (encryptionType != null) __obj.updateDynamic("encryptionType")(encryptionType.asInstanceOf[js.Any])
    if (enforceConsumerDeletion != null) __obj.updateDynamic("enforceConsumerDeletion")(enforceConsumerDeletion.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod.asInstanceOf[js.Any])
    if (shardLevelMetrics != null) __obj.updateDynamic("shardLevelMetrics")(shardLevelMetrics.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamArgs]
  }
}

