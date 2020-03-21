package typingsJapgolly.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeerSessionDiagnostics extends js.Object {
  /** Connected time in milliseconds. */
  var connectedTimestampMillis: js.UndefOr[String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#peerSessionDiagnostics. */
  var kind: js.UndefOr[String] = js.undefined
  /** The participant ID of the peer. */
  var participantId: js.UndefOr[String] = js.undefined
  /** Reliable channel diagnostics. */
  var reliableChannel: js.UndefOr[PeerChannelDiagnostics] = js.undefined
  /** Unreliable channel diagnostics. */
  var unreliableChannel: js.UndefOr[PeerChannelDiagnostics] = js.undefined
}

object PeerSessionDiagnostics {
  @scala.inline
  def apply(
    connectedTimestampMillis: String = null,
    kind: String = null,
    participantId: String = null,
    reliableChannel: PeerChannelDiagnostics = null,
    unreliableChannel: PeerChannelDiagnostics = null
  ): PeerSessionDiagnostics = {
    val __obj = js.Dynamic.literal()
    if (connectedTimestampMillis != null) __obj.updateDynamic("connectedTimestampMillis")(connectedTimestampMillis.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (participantId != null) __obj.updateDynamic("participantId")(participantId.asInstanceOf[js.Any])
    if (reliableChannel != null) __obj.updateDynamic("reliableChannel")(reliableChannel.asInstanceOf[js.Any])
    if (unreliableChannel != null) __obj.updateDynamic("unreliableChannel")(unreliableChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerSessionDiagnostics]
  }
}

