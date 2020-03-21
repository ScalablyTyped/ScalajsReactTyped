package typingsJapgolly.webrtc

import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#h-rtcpeerconnectioniceerrorevent
@js.native
trait RTCPeerConnectionIceErrorEvent extends Event_ {
  val errorCode: Double = js.native
  val errorText: String = js.native
  val hostCandidate: String = js.native
  val url: String = js.native
}

