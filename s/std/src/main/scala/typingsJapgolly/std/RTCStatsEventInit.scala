package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCStatsEventInit extends EventInit {
  var report: org.scalajs.dom.experimental.webrtc.RTCStatsReport
}

object RTCStatsEventInit {
  @scala.inline
  def apply(
    report: org.scalajs.dom.experimental.webrtc.RTCStatsReport,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined
  ): RTCStatsEventInit = {
    val __obj = js.Dynamic.literal(report = report.asInstanceOf[js.Any])
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCStatsEventInit]
  }
}

