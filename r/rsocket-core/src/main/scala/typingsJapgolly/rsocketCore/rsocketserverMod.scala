package typingsJapgolly.rsocketCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rsocketCore.rsocketleaseMod.Leases
import typingsJapgolly.rsocketCore.rsocketserializationMod.PayloadSerializers
import typingsJapgolly.rsocketFlowable.mod.Flowable
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Payload
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.ReactiveSocket
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Responder
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketserverMod {
  
  @JSImport("rsocket-core/RSocketServer", JSImport.Default)
  @js.native
  open class default[D, M] protected ()
    extends StObject
       with RSocketServer[D, M] {
    def this(config: ServerConfig[D, M]) = this()
    
    /* CompleteClass */
    override def start(): Unit = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
  trait RSocketServer[D, M] extends StObject {
    
    def start(): Unit
    
    def stop(): Unit
  }
  object RSocketServer {
    
    inline def apply[D, M](start: Callback, stop: Callback): RSocketServer[D, M] = {
      val __obj = js.Dynamic.literal(start = start.toJsFn, stop = stop.toJsFn)
      __obj.asInstanceOf[RSocketServer[D, M]]
    }
    
    extension [Self <: RSocketServer[?, ?], D, M](x: Self & (RSocketServer[D, M])) {
      
      inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
  
  trait ServerConfig[D, M] extends StObject {
    
    var errorHandler: js.UndefOr[js.Function1[/* e */ js.Error, Unit]] = js.undefined
    
    def getRequestHandler(socket: ReactiveSocket[D, M], payload: Payload[D, M]): Partial[Responder[D, M]]
    
    var leases: js.UndefOr[js.Function0[Leases[Any]]] = js.undefined
    
    var serializers: js.UndefOr[PayloadSerializers[D, M]] = js.undefined
    
    var transport: TransportServer
  }
  object ServerConfig {
    
    inline def apply[D, M](
      getRequestHandler: (ReactiveSocket[D, M], Payload[D, M]) => Partial[Responder[D, M]],
      transport: TransportServer
    ): ServerConfig[D, M] = {
      val __obj = js.Dynamic.literal(getRequestHandler = js.Any.fromFunction2(getRequestHandler), transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerConfig[D, M]]
    }
    
    extension [Self <: ServerConfig[?, ?], D, M](x: Self & (ServerConfig[D, M])) {
      
      inline def setErrorHandler(value: /* e */ js.Error => Callback): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1((t0: /* e */ js.Error) => value(t0).runNow()))
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setGetRequestHandler(value: (ReactiveSocket[D, M], Payload[D, M]) => Partial[Responder[D, M]]): Self = StObject.set(x, "getRequestHandler", js.Any.fromFunction2(value))
      
      inline def setLeases(value: CallbackTo[Leases[Any]]): Self = StObject.set(x, "leases", value.toJsFn)
      
      inline def setLeasesUndefined: Self = StObject.set(x, "leases", js.undefined)
      
      inline def setSerializers(value: PayloadSerializers[D, M]): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
      
      inline def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
      
      inline def setTransport(value: TransportServer): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransportServer extends StObject {
    
    def start(): Flowable[DuplexConnection]
    
    def stop(): Unit
  }
  object TransportServer {
    
    inline def apply(start: CallbackTo[Flowable[DuplexConnection]], stop: Callback): TransportServer = {
      val __obj = js.Dynamic.literal(start = start.toJsFn, stop = stop.toJsFn)
      __obj.asInstanceOf[TransportServer]
    }
    
    extension [Self <: TransportServer](x: Self) {
      
      inline def setStart(value: CallbackTo[Flowable[DuplexConnection]]): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
}
