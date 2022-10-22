package typingsJapgolly.grpcGrpcJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.grpcGrpcJs.buildSrcCallInterfaceMod.InterceptingListener
import typingsJapgolly.grpcGrpcJs.buildSrcCallInterfaceMod.MessageContext
import typingsJapgolly.grpcGrpcJs.buildSrcCallInterfaceMod.StatusObject
import typingsJapgolly.grpcGrpcJs.buildSrcConstantsMod.Status
import typingsJapgolly.grpcGrpcJs.buildSrcSubchannelMod.Subchannel
import typingsJapgolly.grpcGrpcJs.buildSrcSubchannelMod.SubchannelCallStatsTracker
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.http2Mod.ClientHttp2Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcSubchannelCallMod {
  
  @JSImport("@grpc/grpc-js/build/src/subchannel-call", "Http2SubchannelCall")
  @js.native
  open class Http2SubchannelCall protected ()
    extends StObject
       with SubchannelCall {
    def this(
      http2Stream: ClientHttp2Stream,
      callStatsTracker: SubchannelCallStatsTracker,
      listener: InterceptingListener,
      subchannel: Subchannel,
      callId: Double
    ) = this()
    
    /* private */ val callId: Any = js.native
    
    /* private */ val callStatsTracker: Any = js.native
    
    /* private */ var canPush: Any = js.native
    
    /* CompleteClass */
    override def cancelWithStatus(status: Status, details: String): Unit = js.native
    
    /* private */ var decoder: Any = js.native
    
    /* private */ var destroyHttp2Stream: Any = js.native
    
    /* private */ var disconnectListener: Any = js.native
    
    /**
      * On first call, emits a 'status' event with the given StatusObject.
      * Subsequent calls are no-ops.
      * @param status The status of the call.
      */
    /* private */ var endCall: Any = js.native
    
    /* private */ var finalStatus: Any = js.native
    
    /* CompleteClass */
    override def getCallNumber(): Double = js.native
    
    /* CompleteClass */
    override def getPeer(): String = js.native
    
    def getStatus(): StatusObject | Null = js.native
    
    /* CompleteClass */
    override def halfClose(): Unit = js.native
    
    /* private */ var handleTrailers: Any = js.native
    
    /* private */ val http2Stream: Any = js.native
    
    /* private */ var internalError: Any = js.native
    
    /* private */ var isReadFilterPending: Any = js.native
    
    /* private */ val listener: Any = js.native
    
    /* private */ var mappedStatusCode: Any = js.native
    
    /* private */ var maybeOutputStatus: Any = js.native
    
    /* private */ var outputStatus: Any = js.native
    
    /* private */ var push: Any = js.native
    
    /**
      * Indicates that an 'end' event has come from the http2 stream, so there
      * will be no more data events.
      */
    /* private */ var readsClosed: Any = js.native
    
    /* CompleteClass */
    override def sendMessageWithContext(context: MessageContext, message: Buffer): Unit = js.native
    
    /* CompleteClass */
    override def startRead(): Unit = js.native
    
    /* private */ var statusOutput: Any = js.native
    
    /* private */ val subchannel: Any = js.native
    
    /* private */ var trace: Any = js.native
    
    /* private */ var tryPush: Any = js.native
    
    /* private */ var unpushedReadMessages: Any = js.native
  }
  
  trait SubchannelCall extends StObject {
    
    def cancelWithStatus(status: Status, details: String): Unit
    
    def getCallNumber(): Double
    
    def getPeer(): String
    
    def halfClose(): Unit
    
    def sendMessageWithContext(context: MessageContext, message: Buffer): Unit
    
    def startRead(): Unit
  }
  object SubchannelCall {
    
    inline def apply(
      cancelWithStatus: (Status, String) => Callback,
      getCallNumber: CallbackTo[Double],
      getPeer: CallbackTo[String],
      halfClose: Callback,
      sendMessageWithContext: (MessageContext, Buffer) => Callback,
      startRead: Callback
    ): SubchannelCall = {
      val __obj = js.Dynamic.literal(cancelWithStatus = js.Any.fromFunction2((t0: Status, t1: String) => (cancelWithStatus(t0, t1)).runNow()), getCallNumber = getCallNumber.toJsFn, getPeer = getPeer.toJsFn, halfClose = halfClose.toJsFn, sendMessageWithContext = js.Any.fromFunction2((t0: MessageContext, t1: Buffer) => (sendMessageWithContext(t0, t1)).runNow()), startRead = startRead.toJsFn)
      __obj.asInstanceOf[SubchannelCall]
    }
    
    extension [Self <: SubchannelCall](x: Self) {
      
      inline def setCancelWithStatus(value: (Status, String) => Callback): Self = StObject.set(x, "cancelWithStatus", js.Any.fromFunction2((t0: Status, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setGetCallNumber(value: CallbackTo[Double]): Self = StObject.set(x, "getCallNumber", value.toJsFn)
      
      inline def setGetPeer(value: CallbackTo[String]): Self = StObject.set(x, "getPeer", value.toJsFn)
      
      inline def setHalfClose(value: Callback): Self = StObject.set(x, "halfClose", value.toJsFn)
      
      inline def setSendMessageWithContext(value: (MessageContext, Buffer) => Callback): Self = StObject.set(x, "sendMessageWithContext", js.Any.fromFunction2((t0: MessageContext, t1: Buffer) => (value(t0, t1)).runNow()))
      
      inline def setStartRead(value: Callback): Self = StObject.set(x, "startRead", value.toJsFn)
    }
  }
}
