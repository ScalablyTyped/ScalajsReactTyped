package typingsJapgolly.kurentoClient.mod

import org.scalajs.dom.RTCIceCandidate
import typingsJapgolly.kurentoClient.anon.EventDataChannelClosechan
import typingsJapgolly.kurentoClient.anon.EventDataChannelOpenchann
import typingsJapgolly.kurentoClient.anon.EventIceCandidateFoundcan
import typingsJapgolly.kurentoClient.anon.EventIceComponentStateCha
import typingsJapgolly.kurentoClient.anon.EventIceGatheringDone
import typingsJapgolly.kurentoClient.anon.EventNewCandidatePairSele
import typingsJapgolly.kurentoClient.anon.EventOnIceCandidatecandid
import typingsJapgolly.kurentoClient.kurentoClientStrings.DataChannelClose
import typingsJapgolly.kurentoClient.kurentoClientStrings.DataChannelOpen
import typingsJapgolly.kurentoClient.kurentoClientStrings.IceCandidateFound
import typingsJapgolly.kurentoClient.kurentoClientStrings.IceComponentStateChange
import typingsJapgolly.kurentoClient.kurentoClientStrings.IceGatheringDone
import typingsJapgolly.kurentoClient.kurentoClientStrings.NewCandidatePairSelected
import typingsJapgolly.kurentoClient.kurentoClientStrings.OnIceCandidate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebRtcEndpoint
  extends StObject
     with BaseRtpEndpoint {
  
  def addIceCandidate(candidate: RTCIceCandidate): js.Promise[Unit] = js.native
  def addIceCandidate(candidate: RTCIceCandidate, callback: Callback[Unit]): js.Promise[Unit] = js.native
  
  def closeDataChannel(channelId: Double): js.Promise[Unit] = js.native
  def closeDataChannel(channelId: Double, callback: Callback[Unit]): js.Promise[Unit] = js.native
  
  def createDataChannel(
    label: js.UndefOr[String],
    ordered: js.UndefOr[Boolean],
    maxPacketLifeTime: js.UndefOr[Double],
    maxRetransmits: js.UndefOr[Double],
    protocol: js.UndefOr[String],
    callback: js.UndefOr[Callback[Unit]]
  ): js.Promise[Unit] = js.native
  
  def gatherCandidates(): js.Promise[Unit] = js.native
  def gatherCandidates(callback: Callback[Unit]): js.Promise[Unit] = js.native
  
  def getICECandidatePairs(): js.Promise[Any] = js.native
  def getICECandidatePairs(callback: Callback[Any]): js.Promise[Any] = js.native
  
  def getIceConnectionState(): js.Promise[IceConnection] = js.native
  def getIceConnectionState(callback: Callback[IceConnection]): js.Promise[IceConnection] = js.native
  
  def getMaxOutputBitrate(): js.Promise[Double] = js.native
  def getMaxOutputBitrate(callback: Callback[Double]): js.Promise[Double] = js.native
  
  def getMaxVideoSendBandwidth(): js.Promise[Double] = js.native
  def getMaxVideoSendBandwidth(callback: Callback[Double]): js.Promise[Double] = js.native
  
  def getMinOutputBitrate(): js.Promise[Double] = js.native
  def getMinOutputBitrate(callback: Callback[Double]): js.Promise[Double] = js.native
  
  def getMinVideoRecvBandwidth(): js.Promise[Double] = js.native
  def getMinVideoRecvBandwidth(callback: Callback[Double]): js.Promise[Double] = js.native
  
  def getMinVideoSendBandwidth(): js.Promise[Double] = js.native
  def getMinVideoSendBandwidth(callback: Callback[Double]): js.Promise[Double] = js.native
  
  def getStunServerAddress(): js.Promise[String] = js.native
  def getStunServerAddress(callback: Callback[String]): js.Promise[String] = js.native
  
  def getStunServerPort(): js.Promise[Double] = js.native
  def getStunServerPort(callback: Callback[Double]): js.Promise[Double] = js.native
  
  def getTurnUrl(): js.Promise[String] = js.native
  def getTurnUrl(callback: Callback[String]): js.Promise[String] = js.native
  
  @JSName("on")
  def on_DataChannelClose(event: DataChannelClose, callback: js.Function1[/* event */ EventDataChannelClosechan, Unit]): WebRtcEndpoint = js.native
  @JSName("on")
  def on_DataChannelOpen(event: DataChannelOpen, callback: js.Function1[/* event */ EventDataChannelOpenchann, Unit]): WebRtcEndpoint = js.native
  @JSName("on")
  def on_IceCandidateFound(event: IceCandidateFound, callback: js.Function1[/* event */ EventIceCandidateFoundcan, Unit]): WebRtcEndpoint = js.native
  @JSName("on")
  def on_IceComponentStateChange(
    event: IceComponentStateChange,
    callback: js.Function1[/* event */ EventIceComponentStateCha, Unit]
  ): WebRtcEndpoint = js.native
  @JSName("on")
  def on_IceGatheringDone(event: IceGatheringDone, callback: js.Function1[/* event */ EventIceGatheringDone, Unit]): WebRtcEndpoint = js.native
  @JSName("on")
  def on_NewCandidatePairSelected(
    event: NewCandidatePairSelected,
    callback: js.Function1[/* event */ EventNewCandidatePairSele, Unit]
  ): WebRtcEndpoint = js.native
  // Deprecated. See https://doc-kurento.readthedocs.io/en/stable/_static/client-jsdoc/module-elements.html#event:OnIceCandidate
  @JSName("on")
  def on_OnIceCandidate(event: OnIceCandidate, callback: js.Function1[/* event */ EventOnIceCandidatecandid, Unit]): WebRtcEndpoint = js.native
  
  def setMaxOutputBitrate(value: Double): js.Promise[Unit] = js.native
  def setMaxOutputBitrate(value: Double, callback: Callback[Unit]): js.Promise[Unit] = js.native
  
  def setMaxVideoSendBandwidth(value: Double): js.Promise[Unit] = js.native
  def setMaxVideoSendBandwidth(value: Double, callback: Callback[Unit]): js.Promise[Unit] = js.native
  
  def setMinOutputBitrate(value: Double): js.Promise[Unit] = js.native
  def setMinOutputBitrate(value: Double, callback: Callback[Unit]): js.Promise[Unit] = js.native
  
  def setMinVideoRecvBandwidth(value: Double): js.Promise[Unit] = js.native
  def setMinVideoRecvBandwidth(value: Double, callback: Callback[Unit]): js.Promise[Unit] = js.native
  
  def setMinVideoSendBandwidth(value: Double): js.Promise[Unit] = js.native
  def setMinVideoSendBandwidth(value: Double, callback: Callback[Unit]): js.Promise[Unit] = js.native
  
  def setStunServerAddress(server: String): js.Promise[Unit] = js.native
  def setStunServerAddress(server: String, callback: Callback[Unit]): js.Promise[Unit] = js.native
  
  def setStunServerPort(port: Double): js.Promise[Unit] = js.native
  def setStunServerPort(port: Double, callback: Callback[Unit]): js.Promise[Unit] = js.native
  
  def setTurnUrl(url: String): js.Promise[Unit] = js.native
  def setTurnUrl(url: String, callback: Callback[Unit]): js.Promise[Unit] = js.native
}
