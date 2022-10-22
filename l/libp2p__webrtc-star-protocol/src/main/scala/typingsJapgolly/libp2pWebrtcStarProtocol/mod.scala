package typingsJapgolly.libp2pWebrtcStarProtocol

import japgolly.scalajs.react.Callback
import typingsJapgolly.libp2pWebrtcStarProtocol.anon.Candidate
import typingsJapgolly.libp2pWebrtcStarProtocol.libp2pWebrtcStarProtocolStrings.answer
import typingsJapgolly.libp2pWebrtcStarProtocol.libp2pWebrtcStarProtocolStrings.candidate
import typingsJapgolly.libp2pWebrtcStarProtocol.libp2pWebrtcStarProtocolStrings.goodbye
import typingsJapgolly.libp2pWebrtcStarProtocol.libp2pWebrtcStarProtocolStrings.offer
import typingsJapgolly.libp2pWebrtcStarProtocol.libp2pWebrtcStarProtocolStrings.renegotiate
import typingsJapgolly.socketIoClient.mod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait AnswerSignal
    extends StObject
       with Signal {
    
    var sdp: String
    
    var `type`: answer
  }
  object AnswerSignal {
    
    inline def apply(sdp: String): AnswerSignal = {
      val __obj = js.Dynamic.literal(sdp = sdp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("answer")
      __obj.asInstanceOf[AnswerSignal]
    }
    
    extension [Self <: AnswerSignal](x: Self) {
      
      inline def setSdp(value: String): Self = StObject.set(x, "sdp", value.asInstanceOf[js.Any])
      
      inline def setType(value: answer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CandidateSignal
    extends StObject
       with Signal {
    
    var candidate: Candidate
    
    var `type`: candidate
  }
  object CandidateSignal {
    
    inline def apply(candidate: Candidate): CandidateSignal = {
      val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("candidate")
      __obj.asInstanceOf[CandidateSignal]
    }
    
    extension [Self <: CandidateSignal](x: Self) {
      
      inline def setCandidate(value: Candidate): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
      
      inline def setType(value: candidate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait GoodbyeSignal
    extends StObject
       with Signal {
    
    var `type`: goodbye
  }
  object GoodbyeSignal {
    
    inline def apply(): GoodbyeSignal = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("goodbye")
      __obj.asInstanceOf[GoodbyeSignal]
    }
    
    extension [Self <: GoodbyeSignal](x: Self) {
      
      inline def setType(value: goodbye): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait HandshakeSignal extends StObject {
    
    var answer: js.UndefOr[Boolean] = js.undefined
    
    var dstMultiaddr: String
    
    var err: js.UndefOr[String] = js.undefined
    
    var intentId: String
    
    var signal: Signal
    
    var srcMultiaddr: String
  }
  object HandshakeSignal {
    
    inline def apply(dstMultiaddr: String, intentId: String, signal: Signal, srcMultiaddr: String): HandshakeSignal = {
      val __obj = js.Dynamic.literal(dstMultiaddr = dstMultiaddr.asInstanceOf[js.Any], intentId = intentId.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], srcMultiaddr = srcMultiaddr.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandshakeSignal]
    }
    
    extension [Self <: HandshakeSignal](x: Self) {
      
      inline def setAnswer(value: Boolean): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
      
      inline def setAnswerUndefined: Self = StObject.set(x, "answer", js.undefined)
      
      inline def setDstMultiaddr(value: String): Self = StObject.set(x, "dstMultiaddr", value.asInstanceOf[js.Any])
      
      inline def setErr(value: String): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      inline def setIntentId(value: String): Self = StObject.set(x, "intentId", value.asInstanceOf[js.Any])
      
      inline def setSignal(value: Signal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSrcMultiaddr(value: String): Self = StObject.set(x, "srcMultiaddr", value.asInstanceOf[js.Any])
    }
  }
  
  trait OfferSignal
    extends StObject
       with Signal {
    
    var sdp: String
    
    var `type`: offer
  }
  object OfferSignal {
    
    inline def apply(sdp: String): OfferSignal = {
      val __obj = js.Dynamic.literal(sdp = sdp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("offer")
      __obj.asInstanceOf[OfferSignal]
    }
    
    extension [Self <: OfferSignal](x: Self) {
      
      inline def setSdp(value: String): Self = StObject.set(x, "sdp", value.asInstanceOf[js.Any])
      
      inline def setType(value: offer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RenegotiateSignal
    extends StObject
       with Signal {
    
    var `type`: renegotiate
  }
  object RenegotiateSignal {
    
    inline def apply(): RenegotiateSignal = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("renegotiate")
      __obj.asInstanceOf[RenegotiateSignal]
    }
    
    extension [Self <: RenegotiateSignal](x: Self) {
      
      inline def setType(value: renegotiate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.libp2pWebrtcStarProtocol.mod.OfferSignal
    - typingsJapgolly.libp2pWebrtcStarProtocol.mod.AnswerSignal
    - typingsJapgolly.libp2pWebrtcStarProtocol.mod.CandidateSignal
    - typingsJapgolly.libp2pWebrtcStarProtocol.mod.RenegotiateSignal
    - typingsJapgolly.libp2pWebrtcStarProtocol.mod.GoodbyeSignal
  */
  trait Signal extends StObject
  object Signal {
    
    inline def AnswerSignal(sdp: String): typingsJapgolly.libp2pWebrtcStarProtocol.mod.AnswerSignal = {
      val __obj = js.Dynamic.literal(sdp = sdp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("answer")
      __obj.asInstanceOf[typingsJapgolly.libp2pWebrtcStarProtocol.mod.AnswerSignal]
    }
    
    inline def CandidateSignal(candidate: Candidate): typingsJapgolly.libp2pWebrtcStarProtocol.mod.CandidateSignal = {
      val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("candidate")
      __obj.asInstanceOf[typingsJapgolly.libp2pWebrtcStarProtocol.mod.CandidateSignal]
    }
    
    inline def GoodbyeSignal(): typingsJapgolly.libp2pWebrtcStarProtocol.mod.GoodbyeSignal = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("goodbye")
      __obj.asInstanceOf[typingsJapgolly.libp2pWebrtcStarProtocol.mod.GoodbyeSignal]
    }
    
    inline def OfferSignal(sdp: String): typingsJapgolly.libp2pWebrtcStarProtocol.mod.OfferSignal = {
      val __obj = js.Dynamic.literal(sdp = sdp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("offer")
      __obj.asInstanceOf[typingsJapgolly.libp2pWebrtcStarProtocol.mod.OfferSignal]
    }
    
    inline def RenegotiateSignal(): typingsJapgolly.libp2pWebrtcStarProtocol.mod.RenegotiateSignal = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("renegotiate")
      __obj.asInstanceOf[typingsJapgolly.libp2pWebrtcStarProtocol.mod.RenegotiateSignal]
    }
  }
  
  trait SocketEvents extends StObject {
    
    def close(): Unit
    
    def error(err: js.Error): Unit
    
    def listening(): Unit
    
    def `ss-handshake`(offer: HandshakeSignal): Unit
    
    def `ss-join`(maStr: String): Unit
    
    def `ss-leave`(maStr: String): Unit
    
    def `ws-handshake`(offer: HandshakeSignal): Unit
    
    def `ws-peer`(maStr: String): Unit
  }
  object SocketEvents {
    
    inline def apply(
      close: Callback,
      error: js.Error => Callback,
      listening: Callback,
      `ss-handshake`: HandshakeSignal => Callback,
      `ss-join`: String => Callback,
      `ss-leave`: String => Callback,
      `ws-handshake`: HandshakeSignal => Callback,
      `ws-peer`: String => Callback
    ): SocketEvents = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, error = js.Any.fromFunction1((t0: js.Error) => error(t0).runNow()), listening = listening.toJsFn)
      __obj.updateDynamic("ss-handshake")(js.Any.fromFunction1((t0: HandshakeSignal) => `ss-handshake`(t0).runNow()))
      __obj.updateDynamic("ss-join")(js.Any.fromFunction1((t0: String) => `ss-join`(t0).runNow()))
      __obj.updateDynamic("ss-leave")(js.Any.fromFunction1((t0: String) => `ss-leave`(t0).runNow()))
      __obj.updateDynamic("ws-handshake")(js.Any.fromFunction1((t0: HandshakeSignal) => `ws-handshake`(t0).runNow()))
      __obj.updateDynamic("ws-peer")(js.Any.fromFunction1((t0: String) => `ws-peer`(t0).runNow()))
      __obj.asInstanceOf[SocketEvents]
    }
    
    extension [Self <: SocketEvents](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setError(value: js.Error => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
      
      inline def setListening(value: Callback): Self = StObject.set(x, "listening", value.toJsFn)
      
      inline def `setSs-handshake`(value: HandshakeSignal => Callback): Self = StObject.set(x, "ss-handshake", js.Any.fromFunction1((t0: HandshakeSignal) => value(t0).runNow()))
      
      inline def `setSs-join`(value: String => Callback): Self = StObject.set(x, "ss-join", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def `setSs-leave`(value: String => Callback): Self = StObject.set(x, "ss-leave", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def `setWs-handshake`(value: HandshakeSignal => Callback): Self = StObject.set(x, "ws-handshake", js.Any.fromFunction1((t0: HandshakeSignal) => value(t0).runNow()))
      
      inline def `setWs-peer`(value: String => Callback): Self = StObject.set(x, "ws-peer", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  type WebRTCStarSocket = Socket[SocketEvents, SocketEvents]
}
