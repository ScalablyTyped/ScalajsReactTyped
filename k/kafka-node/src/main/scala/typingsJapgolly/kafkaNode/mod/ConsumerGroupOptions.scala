package typingsJapgolly.kafkaNode.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kafkaNode.kafkaNodeStrings.buffer
import typingsJapgolly.kafkaNode.kafkaNodeStrings.earliest
import typingsJapgolly.kafkaNode.kafkaNodeStrings.latest
import typingsJapgolly.kafkaNode.kafkaNodeStrings.none
import typingsJapgolly.kafkaNode.kafkaNodeStrings.range
import typingsJapgolly.kafkaNode.kafkaNodeStrings.roundrobin
import typingsJapgolly.kafkaNode.kafkaNodeStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerGroupOptions extends js.Object {
  var autoCommit: js.UndefOr[Boolean] = js.undefined
  var autoCommitIntervalMs: js.UndefOr[Double] = js.undefined
  var batch: js.UndefOr[AckBatchOptions] = js.undefined
  var connectOnReady: js.UndefOr[Boolean] = js.undefined
  var encoding: js.UndefOr[buffer | utf8] = js.undefined
  var fetchMaxBytes: js.UndefOr[Double] = js.undefined
  var fetchMaxWaitMs: js.UndefOr[Double] = js.undefined
  var fetchMinBytes: js.UndefOr[Double] = js.undefined
  var fromOffset: js.UndefOr[earliest | latest | none] = js.undefined
  var groupId: String
  var heartbeatInterval: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kafkaHost: js.UndefOr[String] = js.undefined
  var keyEncoding: js.UndefOr[buffer | utf8] = js.undefined
  var maxNumSegments: js.UndefOr[Double] = js.undefined
  var maxTickMessages: js.UndefOr[Double] = js.undefined
  var migrateHLC: js.UndefOr[Boolean] = js.undefined
  var migrateRolling: js.UndefOr[Boolean] = js.undefined
  var onRebalance: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  var outOfRangeOffset: js.UndefOr[earliest | latest | none] = js.undefined
  var protocol: js.UndefOr[js.Array[roundrobin | range | CustomPartitionAssignmentProtocol]] = js.undefined
  var retries: js.UndefOr[Double] = js.undefined
  var retryFactor: js.UndefOr[Double] = js.undefined
  var retryMinTimeout: js.UndefOr[Double] = js.undefined
  var sasl: js.UndefOr[js.Any] = js.undefined
  var sessionTimeout: js.UndefOr[Double] = js.undefined
  var ssl: js.UndefOr[Boolean] = js.undefined
  var sslOptions: js.UndefOr[js.Any] = js.undefined
}

object ConsumerGroupOptions {
  @scala.inline
  def apply(
    groupId: String,
    autoCommit: js.UndefOr[Boolean] = js.undefined,
    autoCommitIntervalMs: Int | Double = null,
    batch: AckBatchOptions = null,
    connectOnReady: js.UndefOr[Boolean] = js.undefined,
    encoding: buffer | utf8 = null,
    fetchMaxBytes: Int | Double = null,
    fetchMaxWaitMs: Int | Double = null,
    fetchMinBytes: Int | Double = null,
    fromOffset: earliest | latest | none = null,
    heartbeatInterval: Int | Double = null,
    id: String = null,
    kafkaHost: String = null,
    keyEncoding: buffer | utf8 = null,
    maxNumSegments: Int | Double = null,
    maxTickMessages: Int | Double = null,
    migrateHLC: js.UndefOr[Boolean] = js.undefined,
    migrateRolling: js.UndefOr[Boolean] = js.undefined,
    onRebalance: js.UndefOr[CallbackTo[js.Promise[Unit]]] = js.undefined,
    outOfRangeOffset: earliest | latest | none = null,
    protocol: js.Array[roundrobin | range | CustomPartitionAssignmentProtocol] = null,
    retries: Int | Double = null,
    retryFactor: Int | Double = null,
    retryMinTimeout: Int | Double = null,
    sasl: js.Any = null,
    sessionTimeout: Int | Double = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    sslOptions: js.Any = null
  ): ConsumerGroupOptions = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCommit)) __obj.updateDynamic("autoCommit")(autoCommit.asInstanceOf[js.Any])
    if (autoCommitIntervalMs != null) __obj.updateDynamic("autoCommitIntervalMs")(autoCommitIntervalMs.asInstanceOf[js.Any])
    if (batch != null) __obj.updateDynamic("batch")(batch.asInstanceOf[js.Any])
    if (!js.isUndefined(connectOnReady)) __obj.updateDynamic("connectOnReady")(connectOnReady.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (fetchMaxBytes != null) __obj.updateDynamic("fetchMaxBytes")(fetchMaxBytes.asInstanceOf[js.Any])
    if (fetchMaxWaitMs != null) __obj.updateDynamic("fetchMaxWaitMs")(fetchMaxWaitMs.asInstanceOf[js.Any])
    if (fetchMinBytes != null) __obj.updateDynamic("fetchMinBytes")(fetchMinBytes.asInstanceOf[js.Any])
    if (fromOffset != null) __obj.updateDynamic("fromOffset")(fromOffset.asInstanceOf[js.Any])
    if (heartbeatInterval != null) __obj.updateDynamic("heartbeatInterval")(heartbeatInterval.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kafkaHost != null) __obj.updateDynamic("kafkaHost")(kafkaHost.asInstanceOf[js.Any])
    if (keyEncoding != null) __obj.updateDynamic("keyEncoding")(keyEncoding.asInstanceOf[js.Any])
    if (maxNumSegments != null) __obj.updateDynamic("maxNumSegments")(maxNumSegments.asInstanceOf[js.Any])
    if (maxTickMessages != null) __obj.updateDynamic("maxTickMessages")(maxTickMessages.asInstanceOf[js.Any])
    if (!js.isUndefined(migrateHLC)) __obj.updateDynamic("migrateHLC")(migrateHLC.asInstanceOf[js.Any])
    if (!js.isUndefined(migrateRolling)) __obj.updateDynamic("migrateRolling")(migrateRolling.asInstanceOf[js.Any])
    onRebalance.foreach(p => __obj.updateDynamic("onRebalance")(p.toJsFn))
    if (outOfRangeOffset != null) __obj.updateDynamic("outOfRangeOffset")(outOfRangeOffset.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (retryFactor != null) __obj.updateDynamic("retryFactor")(retryFactor.asInstanceOf[js.Any])
    if (retryMinTimeout != null) __obj.updateDynamic("retryMinTimeout")(retryMinTimeout.asInstanceOf[js.Any])
    if (sasl != null) __obj.updateDynamic("sasl")(sasl.asInstanceOf[js.Any])
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (sslOptions != null) __obj.updateDynamic("sslOptions")(sslOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerGroupOptions]
  }
}

