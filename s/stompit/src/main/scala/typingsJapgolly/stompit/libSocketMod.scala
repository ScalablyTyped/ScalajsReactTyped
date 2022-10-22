package typingsJapgolly.stompit

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.streamMod.Writable
import typingsJapgolly.node.streamMod.WritableOptions
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSocketMod {
  
  @JSImport("stompit/lib/Socket", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Socket {
    def this(transportSocket: Duplex, options: SocketOptions) = this()
  }
  
  type CommandHandlers = StringDictionary[js.Function2[/* frame */ Writable, /* callback */ commandHandler, Unit]]
  
  type Heartbeat = js.Array[Double]
  
  @js.native
  trait Socket extends EventEmitter {
    
    def createApplicationError(): SocketError = js.native
    def createApplicationError(message: String): SocketError = js.native
    def createApplicationError(message: js.Error): SocketError = js.native
    
    def createProtocolError(): SocketError = js.native
    def createProtocolError(message: String): SocketError = js.native
    def createProtocolError(message: js.Error): SocketError = js.native
    
    def createTransportError(): SocketError = js.native
    def createTransportError(message: String): SocketError = js.native
    def createTransportError(message: js.Error): SocketError = js.native
    
    def destroy(exception: js.Error): Unit = js.native
    
    def getHeartbeat(): Heartbeat = js.native
    
    def getTransportSocket(): Duplex = js.native
    
    def hasFinishedOutput(): Boolean = js.native
    
    def sendFrame(command: String): Writable = js.native
    def sendFrame(command: String, headers: Any): Writable = js.native
    def sendFrame(command: String, headers: Any, streamOptions: WritableOptions): Writable = js.native
    def sendFrame(command: String, headers: Unit, streamOptions: WritableOptions): Writable = js.native
    
    def setCommandHandler(command: String, handler: commandHandler): Unit = js.native
    
    def setCommandHandlers(handlers: CommandHandlers): Unit = js.native
    
    def setHeartbeat(heartbeat: Heartbeat): Unit = js.native
    
    def setUnknownCommandHandler(handler: js.Function0[Unit]): Unit = js.native
    
    def setVersion(version: String): Unit = js.native
  }
  
  trait SocketError
    extends StObject
       with Error {
    
    def isApplicationError(): Boolean
    
    def isProtocolError(): Boolean
    
    def isTransportError(): Boolean
  }
  object SocketError {
    
    inline def apply(
      isApplicationError: CallbackTo[Boolean],
      isProtocolError: CallbackTo[Boolean],
      isTransportError: CallbackTo[Boolean],
      message: String,
      name: String
    ): SocketError = {
      val __obj = js.Dynamic.literal(isApplicationError = isApplicationError.toJsFn, isProtocolError = isProtocolError.toJsFn, isTransportError = isTransportError.toJsFn, message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocketError]
    }
    
    extension [Self <: SocketError](x: Self) {
      
      inline def setIsApplicationError(value: CallbackTo[Boolean]): Self = StObject.set(x, "isApplicationError", value.toJsFn)
      
      inline def setIsProtocolError(value: CallbackTo[Boolean]): Self = StObject.set(x, "isProtocolError", value.toJsFn)
      
      inline def setIsTransportError(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTransportError", value.toJsFn)
    }
  }
  
  trait SocketOptions extends StObject {
    
    var commandHandlers: js.UndefOr[CommandHandlers] = js.undefined
    
    var heartbeat: js.UndefOr[Heartbeat] = js.undefined
    
    var heartbeatDelayMargin: js.UndefOr[Double] = js.undefined
    
    var heartbeatOutputMargin: js.UndefOr[Double] = js.undefined
    
    var outgoingFrameStream: js.UndefOr[typingsJapgolly.stompit.libOutgoingFrameStreamMod.^] = js.undefined
    
    var resetDisconnect: js.UndefOr[Boolean] = js.undefined
    
    var unknownCommand: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object SocketOptions {
    
    inline def apply(): SocketOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocketOptions]
    }
    
    extension [Self <: SocketOptions](x: Self) {
      
      inline def setCommandHandlers(value: CommandHandlers): Self = StObject.set(x, "commandHandlers", value.asInstanceOf[js.Any])
      
      inline def setCommandHandlersUndefined: Self = StObject.set(x, "commandHandlers", js.undefined)
      
      inline def setHeartbeat(value: Heartbeat): Self = StObject.set(x, "heartbeat", value.asInstanceOf[js.Any])
      
      inline def setHeartbeatDelayMargin(value: Double): Self = StObject.set(x, "heartbeatDelayMargin", value.asInstanceOf[js.Any])
      
      inline def setHeartbeatDelayMarginUndefined: Self = StObject.set(x, "heartbeatDelayMargin", js.undefined)
      
      inline def setHeartbeatOutputMargin(value: Double): Self = StObject.set(x, "heartbeatOutputMargin", value.asInstanceOf[js.Any])
      
      inline def setHeartbeatOutputMarginUndefined: Self = StObject.set(x, "heartbeatOutputMargin", js.undefined)
      
      inline def setHeartbeatUndefined: Self = StObject.set(x, "heartbeat", js.undefined)
      
      inline def setHeartbeatVarargs(value: Double*): Self = StObject.set(x, "heartbeat", js.Array(value*))
      
      inline def setOutgoingFrameStream(value: typingsJapgolly.stompit.libOutgoingFrameStreamMod.^): Self = StObject.set(x, "outgoingFrameStream", value.asInstanceOf[js.Any])
      
      inline def setOutgoingFrameStreamUndefined: Self = StObject.set(x, "outgoingFrameStream", js.undefined)
      
      inline def setResetDisconnect(value: Boolean): Self = StObject.set(x, "resetDisconnect", value.asInstanceOf[js.Any])
      
      inline def setResetDisconnectUndefined: Self = StObject.set(x, "resetDisconnect", js.undefined)
      
      inline def setUnknownCommand(value: Callback): Self = StObject.set(x, "unknownCommand", value.toJsFn)
      
      inline def setUnknownCommandUndefined: Self = StObject.set(x, "unknownCommand", js.undefined)
    }
  }
  
  type commandHandler = js.Function1[/* frame */ Writable, Unit]
}
