package typingsJapgolly.freedom.freedom.RTCPeerConnection

import typingsJapgolly.freedom.AnonChannel
import typingsJapgolly.freedom.AnonStream
import typingsJapgolly.freedom.freedomStrings.onaddstream
import typingsJapgolly.freedom.freedomStrings.ondatachannel
import typingsJapgolly.freedom.freedomStrings.onicecandidate
import typingsJapgolly.freedom.freedomStrings.oniceconnectionstatechange
import typingsJapgolly.freedom.freedomStrings.onnegotiationneeded
import typingsJapgolly.freedom.freedomStrings.onremovestream
import typingsJapgolly.freedom.freedomStrings.onsignalingstatechange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Note: the freedom factory constructor
// |freedom['rtcpeerconnection'](config)| to create an RTCPeerConnection has
// |RTCConfiguration| as the type of its config its argument.
@js.native
trait RTCPeerConnection extends js.Object {
  def addIceCandidate(candidate: RTCIceCandidate): js.Promise[Unit] = js.native
  def addStream(ref: String): js.Promise[Unit] = js.native
  def close(): js.Promise[Unit] = js.native
  def createAnswer(): js.Promise[RTCSessionDescription] = js.native
  def createDataChannel(label: String, init: RTCDataChannelInit): js.Promise[String] = js.native
  def createOffer(): js.Promise[RTCSessionDescription] = js.native
  def createOffer(options: RTCOfferOptions): js.Promise[RTCSessionDescription] = js.native
  def getConfiguration(): js.Promise[RTCConfiguration] = js.native
  def getIceConnectionState(): js.Promise[String] = js.native
  def getIceGatheringState(): js.Promise[String] = js.native
  def getLocalDescription(): js.Promise[RTCSessionDescription] = js.native
  def getLocalStreams(): js.Promise[js.Array[String]] = js.native
  def getRemoteDescription(): js.Promise[RTCSessionDescription] = js.native
  def getRemoteStreams(): js.Promise[js.Array[String]] = js.native
  def getSignalingState(): js.Promise[String] = js.native
  def getStats(): js.Promise[_] = js.native
  def getStats(selector: String): js.Promise[_] = js.native
  def getStreamById(id: String): js.Promise[String] = js.native
  def on(t: String, f: js.Function): Unit = js.native
  @JSName("on")
  def on_onaddstream(t: onaddstream, f: js.Function1[/* d */ AnonStream, Unit]): Unit = js.native
  @JSName("on")
  def on_ondatachannel(t: ondatachannel, f: js.Function1[/* d */ AnonChannel, Unit]): Unit = js.native
  @JSName("on")
  def on_onicecandidate(t: onicecandidate, f: js.Function1[/* d */ OnIceCandidateEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_oniceconnectionstatechange(t: oniceconnectionstatechange, f: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_onnegotiationneeded(t: onnegotiationneeded, f: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_onremovestream(t: onremovestream, f: js.Function1[/* d */ AnonStream, Unit]): Unit = js.native
  @JSName("on")
  def on_onsignalingstatechange(t: onsignalingstatechange, f: js.Function0[Unit]): Unit = js.native
  def removeStream(ref: String): js.Promise[Unit] = js.native
  def setLocalDescription(desc: RTCSessionDescription): js.Promise[Unit] = js.native
  def setRemoteDescription(desc: RTCSessionDescription): js.Promise[Unit] = js.native
  def updateIce(configuration: RTCConfiguration): js.Promise[Unit] = js.native
}

