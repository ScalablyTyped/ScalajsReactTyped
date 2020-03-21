package typingsJapgolly.webrtc

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#dom-rtccertificate
trait RTCCertificate extends js.Object {
  val expires: Double
  def getAlgorithm(): String
}

object RTCCertificate {
  @scala.inline
  def apply(expires: Double, getAlgorithm: CallbackTo[String]): RTCCertificate = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any])
    __obj.updateDynamic("getAlgorithm")(getAlgorithm.toJsFn)
    __obj.asInstanceOf[RTCCertificate]
  }
}

