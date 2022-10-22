package typingsJapgolly.webrtc

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.RTCRtpTransceiverDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webrtc/#idl-def-rtcrtptransceiver
trait RTCRtpTransceiver extends StObject {
  
  var direction: RTCRtpTransceiverDirection
  
  val mid: String | Null
  
  val receiver: RTCRtpReceiver
  
  val sender: RTCRtpSender
  
  def setCodecPreferences(codecs: js.Array[RTCRtpCodecCapability]): Unit
  
  def setDirection(direction: RTCRtpTransceiverDirection): Unit
  
  def stop(): Unit
  
  val stopped: Boolean
}
object RTCRtpTransceiver {
  
  inline def apply(
    direction: RTCRtpTransceiverDirection,
    receiver: RTCRtpReceiver,
    sender: RTCRtpSender,
    setCodecPreferences: js.Array[RTCRtpCodecCapability] => Callback,
    setDirection: RTCRtpTransceiverDirection => Callback,
    stop: Callback,
    stopped: Boolean
  ): RTCRtpTransceiver = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], receiver = receiver.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], setCodecPreferences = js.Any.fromFunction1((t0: js.Array[RTCRtpCodecCapability]) => setCodecPreferences(t0).runNow()), setDirection = js.Any.fromFunction1((t0: RTCRtpTransceiverDirection) => setDirection(t0).runNow()), stop = stop.toJsFn, stopped = stopped.asInstanceOf[js.Any], mid = null)
    __obj.asInstanceOf[RTCRtpTransceiver]
  }
  
  extension [Self <: RTCRtpTransceiver](x: Self) {
    
    inline def setDirection(value: RTCRtpTransceiverDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setMid(value: String): Self = StObject.set(x, "mid", value.asInstanceOf[js.Any])
    
    inline def setMidNull: Self = StObject.set(x, "mid", null)
    
    inline def setReceiver(value: RTCRtpReceiver): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    inline def setSender(value: RTCRtpSender): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSetCodecPreferences(value: js.Array[RTCRtpCodecCapability] => Callback): Self = StObject.set(x, "setCodecPreferences", js.Any.fromFunction1((t0: js.Array[RTCRtpCodecCapability]) => value(t0).runNow()))
    
    inline def setSetDirection(value: RTCRtpTransceiverDirection => Callback): Self = StObject.set(x, "setDirection", js.Any.fromFunction1((t0: RTCRtpTransceiverDirection) => value(t0).runNow()))
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    
    inline def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
  }
}
