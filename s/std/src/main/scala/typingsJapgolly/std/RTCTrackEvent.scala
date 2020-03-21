package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCTrackEvent extends Event_ {
  val receiver: RTCRtpReceiver = js.native
  val streams: js.Array[org.scalajs.dom.experimental.mediastream.MediaStream] = js.native
  val track: org.scalajs.dom.experimental.mediastream.MediaStreamTrack = js.native
  val transceiver: RTCRtpTransceiver = js.native
}

@JSGlobal("RTCTrackEvent")
@js.native
object RTCTrackEvent
  extends Instantiable2[/* type */ java.lang.String, /* eventInitDict */ RTCTrackEventInit, RTCTrackEvent]

