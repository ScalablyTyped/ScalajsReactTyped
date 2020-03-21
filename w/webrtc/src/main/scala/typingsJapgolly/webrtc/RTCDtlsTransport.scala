package typingsJapgolly.webrtc

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCDtlsTransport extends js.Object {
  var onstatechange: DtlsTransportEventHandler
  val transport: RTCIceTransport
  //readonly state: RTCDtlsTransportState;
  def getRemoteCertificates(): js.Array[scala.scalajs.js.typedarray.ArrayBuffer]
}

object RTCDtlsTransport {
  @scala.inline
  def apply(
    getRemoteCertificates: CallbackTo[js.Array[scala.scalajs.js.typedarray.ArrayBuffer]],
    transport: RTCIceTransport,
    onstatechange: DtlsTransportEventHandler = null
  ): RTCDtlsTransport = {
    val __obj = js.Dynamic.literal(transport = transport.asInstanceOf[js.Any])
    __obj.updateDynamic("getRemoteCertificates")(getRemoteCertificates.toJsFn)
    if (onstatechange != null) __obj.updateDynamic("onstatechange")(onstatechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCDtlsTransport]
  }
}

