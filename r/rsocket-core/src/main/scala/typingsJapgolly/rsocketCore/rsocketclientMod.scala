package typingsJapgolly.rsocketCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rsocketCore.anon.DataMimeType
import typingsJapgolly.rsocketCore.rsocketleaseMod.Leases
import typingsJapgolly.rsocketCore.rsocketserializationMod.PayloadSerializers
import typingsJapgolly.rsocketFlowable.mod.Single
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.ReactiveSocket
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Responder
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketclientMod {
  
  @JSImport("rsocket-core/RSocketClient", JSImport.Default)
  @js.native
  open class default[D, M] protected ()
    extends StObject
       with RSocketClient[D, M] {
    def this(config: ClientConfig[D, M]) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def connect(): Single[ReactiveSocket[D, M]] = js.native
  }
  
  trait ClientConfig[D, M] extends StObject {
    
    var errorHandler: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    var leases: js.UndefOr[js.Function0[Leases[Any]]] = js.undefined
    
    var responder: js.UndefOr[Partial[Responder[D, M]]] = js.undefined
    
    var serializers: js.UndefOr[PayloadSerializers[D, M]] = js.undefined
    
    var setup: DataMimeType[D, M]
    
    var transport: DuplexConnection
  }
  object ClientConfig {
    
    inline def apply[D, M](setup: DataMimeType[D, M], transport: DuplexConnection): ClientConfig[D, M] = {
      val __obj = js.Dynamic.literal(setup = setup.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientConfig[D, M]]
    }
    
    extension [Self <: ClientConfig[?, ?], D, M](x: Self & (ClientConfig[D, M])) {
      
      inline def setErrorHandler(value: /* error */ js.Error => Callback): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1((t0: /* error */ js.Error) => value(t0).runNow()))
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setLeases(value: CallbackTo[Leases[Any]]): Self = StObject.set(x, "leases", value.toJsFn)
      
      inline def setLeasesUndefined: Self = StObject.set(x, "leases", js.undefined)
      
      inline def setResponder(value: Partial[Responder[D, M]]): Self = StObject.set(x, "responder", value.asInstanceOf[js.Any])
      
      inline def setResponderUndefined: Self = StObject.set(x, "responder", js.undefined)
      
      inline def setSerializers(value: PayloadSerializers[D, M]): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
      
      inline def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
      
      inline def setSetup(value: DataMimeType[D, M]): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
      
      inline def setTransport(value: DuplexConnection): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
  
  trait RSocketClient[D, M] extends StObject {
    
    def close(): Unit
    
    def connect(): Single[ReactiveSocket[D, M]]
  }
  object RSocketClient {
    
    inline def apply[D, M](close: Callback, connect: CallbackTo[Single[ReactiveSocket[D, M]]]): RSocketClient[D, M] = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, connect = connect.toJsFn)
      __obj.asInstanceOf[RSocketClient[D, M]]
    }
    
    extension [Self <: RSocketClient[?, ?], D, M](x: Self & (RSocketClient[D, M])) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setConnect(value: CallbackTo[Single[ReactiveSocket[D, M]]]): Self = StObject.set(x, "connect", value.toJsFn)
    }
  }
}
