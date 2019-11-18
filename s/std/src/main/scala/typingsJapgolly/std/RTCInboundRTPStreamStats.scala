package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCInboundRTPStreamStats extends RTCRTPStreamStats {
  var bytesReceived: js.UndefOr[Double] = js.undefined
  var fractionLost: js.UndefOr[Double] = js.undefined
  var jitter: js.UndefOr[Double] = js.undefined
  var packetsLost: js.UndefOr[Double] = js.undefined
  var packetsReceived: js.UndefOr[Double] = js.undefined
}

object RTCInboundRTPStreamStats {
  @scala.inline
  def apply(
    id: java.lang.String,
    timestamp: Double,
    `type`: org.scalajs.dom.experimental.webrtc.RTCStatsType,
    associateStatsId: java.lang.String = null,
    bytesReceived: Int | Double = null,
    codecId: java.lang.String = null,
    firCount: Int | Double = null,
    fractionLost: Int | Double = null,
    isRemote: js.UndefOr[scala.Boolean] = js.undefined,
    jitter: Int | Double = null,
    mediaTrackId: java.lang.String = null,
    mediaType: java.lang.String = null,
    nackCount: Int | Double = null,
    packetsLost: Int | Double = null,
    packetsReceived: Int | Double = null,
    pliCount: Int | Double = null,
    sliCount: Int | Double = null,
    ssrc: java.lang.String = null,
    transportId: java.lang.String = null
  ): RTCInboundRTPStreamStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (associateStatsId != null) __obj.updateDynamic("associateStatsId")(associateStatsId.asInstanceOf[js.Any])
    if (bytesReceived != null) __obj.updateDynamic("bytesReceived")(bytesReceived.asInstanceOf[js.Any])
    if (codecId != null) __obj.updateDynamic("codecId")(codecId.asInstanceOf[js.Any])
    if (firCount != null) __obj.updateDynamic("firCount")(firCount.asInstanceOf[js.Any])
    if (fractionLost != null) __obj.updateDynamic("fractionLost")(fractionLost.asInstanceOf[js.Any])
    if (!js.isUndefined(isRemote)) __obj.updateDynamic("isRemote")(isRemote.asInstanceOf[js.Any])
    if (jitter != null) __obj.updateDynamic("jitter")(jitter.asInstanceOf[js.Any])
    if (mediaTrackId != null) __obj.updateDynamic("mediaTrackId")(mediaTrackId.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    if (nackCount != null) __obj.updateDynamic("nackCount")(nackCount.asInstanceOf[js.Any])
    if (packetsLost != null) __obj.updateDynamic("packetsLost")(packetsLost.asInstanceOf[js.Any])
    if (packetsReceived != null) __obj.updateDynamic("packetsReceived")(packetsReceived.asInstanceOf[js.Any])
    if (pliCount != null) __obj.updateDynamic("pliCount")(pliCount.asInstanceOf[js.Any])
    if (sliCount != null) __obj.updateDynamic("sliCount")(sliCount.asInstanceOf[js.Any])
    if (ssrc != null) __obj.updateDynamic("ssrc")(ssrc.asInstanceOf[js.Any])
    if (transportId != null) __obj.updateDynamic("transportId")(transportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCInboundRTPStreamStats]
  }
}

