package typingsJapgolly.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for peer channel diagnostics.
  */
@js.native
trait SchemaPeerChannelDiagnostics extends js.Object {
  /**
    * Number of bytes received.
    */
  var bytesReceived: js.UndefOr[SchemaAggregateStats] = js.native
  /**
    * Number of bytes sent.
    */
  var bytesSent: js.UndefOr[SchemaAggregateStats] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#peerChannelDiagnostics.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Number of messages lost.
    */
  var numMessagesLost: js.UndefOr[Double] = js.native
  /**
    * Number of messages received.
    */
  var numMessagesReceived: js.UndefOr[Double] = js.native
  /**
    * Number of messages sent.
    */
  var numMessagesSent: js.UndefOr[Double] = js.native
  /**
    * Number of send failures.
    */
  var numSendFailures: js.UndefOr[Double] = js.native
  /**
    * Roundtrip latency stats in milliseconds.
    */
  var roundtripLatencyMillis: js.UndefOr[SchemaAggregateStats] = js.native
}

object SchemaPeerChannelDiagnostics {
  @scala.inline
  def apply(
    bytesReceived: SchemaAggregateStats = null,
    bytesSent: SchemaAggregateStats = null,
    kind: String = null,
    numMessagesLost: Int | Double = null,
    numMessagesReceived: Int | Double = null,
    numMessagesSent: Int | Double = null,
    numSendFailures: Int | Double = null,
    roundtripLatencyMillis: SchemaAggregateStats = null
  ): SchemaPeerChannelDiagnostics = {
    val __obj = js.Dynamic.literal()
    if (bytesReceived != null) __obj.updateDynamic("bytesReceived")(bytesReceived.asInstanceOf[js.Any])
    if (bytesSent != null) __obj.updateDynamic("bytesSent")(bytesSent.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (numMessagesLost != null) __obj.updateDynamic("numMessagesLost")(numMessagesLost.asInstanceOf[js.Any])
    if (numMessagesReceived != null) __obj.updateDynamic("numMessagesReceived")(numMessagesReceived.asInstanceOf[js.Any])
    if (numMessagesSent != null) __obj.updateDynamic("numMessagesSent")(numMessagesSent.asInstanceOf[js.Any])
    if (numSendFailures != null) __obj.updateDynamic("numSendFailures")(numSendFailures.asInstanceOf[js.Any])
    if (roundtripLatencyMillis != null) __obj.updateDynamic("roundtripLatencyMillis")(roundtripLatencyMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPeerChannelDiagnostics]
  }
}

