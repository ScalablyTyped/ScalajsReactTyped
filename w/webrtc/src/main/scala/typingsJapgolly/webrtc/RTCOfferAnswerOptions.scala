package typingsJapgolly.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcofferansweroptions
trait RTCOfferAnswerOptions extends js.Object {
  var voiceActivityDetection: js.UndefOr[Boolean] = js.undefined
}

object RTCOfferAnswerOptions {
  @scala.inline
  def apply(voiceActivityDetection: js.UndefOr[Boolean] = js.undefined): RTCOfferAnswerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(voiceActivityDetection)) __obj.updateDynamic("voiceActivityDetection")(voiceActivityDetection.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCOfferAnswerOptions]
  }
}

