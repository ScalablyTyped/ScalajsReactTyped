package typingsJapgolly.pulumiAws.eventSourceMappingMod

import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSourceMappingState extends js.Object {
  /**
    * The largest number of records that Lambda will retrieve from your event source at the time of invocation. Defaults to `100` for DynamoDB and Kinesis, `10` for SQS.
    */
  val batchSize: js.UndefOr[Input[Double]] = js.native
  /**
    * Determines if the mapping will be enabled on creation. Defaults to `true`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The event source ARN - can be a Kinesis stream, DynamoDB stream, or SQS queue.
    */
  val eventSourceArn: js.UndefOr[Input[String]] = js.native
  /**
    * The the ARN of the Lambda function the event source mapping is sending events to. (Note: this is a computed value that differs from `functionName` above.)
    */
  val functionArn: js.UndefOr[Input[String]] = js.native
  /**
    * The name or the ARN of the Lambda function that will be subscribing to events.
    */
  val functionName: js.UndefOr[Input[String]] = js.native
  /**
    * The date this resource was last modified.
    */
  val lastModified: js.UndefOr[Input[String]] = js.native
  /**
    * The result of the last AWS Lambda invocation of your Lambda function.
    */
  val lastProcessingResult: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum amount of time to gather records before invoking the function, in seconds.  Records will continue to buffer until either `maximumBatchingWindowInSeconds` expires or `batchSize` has been met. Defaults to as soon as records are available in the stream. If the batch it reads from the stream only has one record in it, Lambda only sends one record to the function.
    */
  val maximumBatchingWindowInSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * The position in the stream where AWS Lambda should start reading. Must be one of `AT_TIMESTAMP` (Kinesis only), `LATEST` or `TRIM_HORIZON` if getting events from Kinesis or DynamoDB. Must not be provided if getting events from SQS. More information about these positions can be found in the [AWS DynamoDB Streams API Reference](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html) and [AWS Kinesis API Reference](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType).
    */
  val startingPosition: js.UndefOr[Input[String]] = js.native
  /**
    * A timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) of the data record which to start reading when using `startingPosition` set to `AT_TIMESTAMP`. If a record with this exact timestamp does not exist, the next later record is chosen. If the timestamp is older than the current trim horizon, the oldest available record is chosen.
    */
  val startingPositionTimestamp: js.UndefOr[Input[String]] = js.native
  /**
    * The state of the event source mapping.
    */
  val state: js.UndefOr[Input[String]] = js.native
  /**
    * The reason the event source mapping is in its current state.
    */
  val stateTransitionReason: js.UndefOr[Input[String]] = js.native
  /**
    * The UUID of the created event source mapping.
    */
  val uuid: js.UndefOr[Input[String]] = js.native
}

object EventSourceMappingState {
  @scala.inline
  def apply(
    batchSize: Input[Double] = null,
    enabled: Input[Boolean] = null,
    eventSourceArn: Input[String] = null,
    functionArn: Input[String] = null,
    functionName: Input[String] = null,
    lastModified: Input[String] = null,
    lastProcessingResult: Input[String] = null,
    maximumBatchingWindowInSeconds: Input[Double] = null,
    startingPosition: Input[String] = null,
    startingPositionTimestamp: Input[String] = null,
    state: Input[String] = null,
    stateTransitionReason: Input[String] = null,
    uuid: Input[String] = null
  ): EventSourceMappingState = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (eventSourceArn != null) __obj.updateDynamic("eventSourceArn")(eventSourceArn.asInstanceOf[js.Any])
    if (functionArn != null) __obj.updateDynamic("functionArn")(functionArn.asInstanceOf[js.Any])
    if (functionName != null) __obj.updateDynamic("functionName")(functionName.asInstanceOf[js.Any])
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified.asInstanceOf[js.Any])
    if (lastProcessingResult != null) __obj.updateDynamic("lastProcessingResult")(lastProcessingResult.asInstanceOf[js.Any])
    if (maximumBatchingWindowInSeconds != null) __obj.updateDynamic("maximumBatchingWindowInSeconds")(maximumBatchingWindowInSeconds.asInstanceOf[js.Any])
    if (startingPosition != null) __obj.updateDynamic("startingPosition")(startingPosition.asInstanceOf[js.Any])
    if (startingPositionTimestamp != null) __obj.updateDynamic("startingPositionTimestamp")(startingPositionTimestamp.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (stateTransitionReason != null) __obj.updateDynamic("stateTransitionReason")(stateTransitionReason.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSourceMappingState]
  }
}

