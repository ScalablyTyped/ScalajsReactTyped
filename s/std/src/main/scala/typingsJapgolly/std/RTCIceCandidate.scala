package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The RTCIceCandidate interface—part of the WebRTC API—represents a candidate Internet Connectivity Establishment (ICE) configuration which may be used to establish an RTCPeerConnection. */
trait RTCIceCandidate extends js.Object {
  val candidate: java.lang.String
  val component: RTCIceComponent | Null
  val foundation: java.lang.String | Null
  val ip: java.lang.String | Null
  val port: Double | Null
  val priority: Double | Null
  val protocol: RTCIceProtocol | Null
  val relatedAddress: java.lang.String | Null
  val relatedPort: Double | Null
  val sdpMLineIndex: Double | Null
  val sdpMid: java.lang.String | Null
  val tcpType: RTCIceTcpCandidateType | Null
  val `type`: RTCIceCandidateType | Null
  val usernameFragment: java.lang.String | Null
  def toJSON(): org.scalajs.dom.experimental.webrtc.RTCIceCandidateInit
}

@JSGlobal("RTCIceCandidate")
@js.native
object RTCIceCandidate
  extends Instantiable0[RTCIceCandidate]
     with Instantiable1[/* candidateInitDict */ RTCIceCandidateInit, RTCIceCandidate]

