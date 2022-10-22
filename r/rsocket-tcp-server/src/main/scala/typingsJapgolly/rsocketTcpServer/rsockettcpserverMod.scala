package typingsJapgolly.rsocketTcpServer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.netMod.Server
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.rsocketCore.rsocketencodingMod.Encoders
import typingsJapgolly.rsocketCore.rsocketserverMod.TransportServer
import typingsJapgolly.rsocketFlowable.mod.Flowable
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsockettcpserverMod {
  
  @JSImport("rsocket-tcp-server/RSocketTCPServer", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RSocketTCPServer {
    def this(options: ServerOptions) = this()
    def this(options: ServerOptions, encoders: Encoders[Any]) = this()
    
    /* CompleteClass */
    override def start(): Flowable[DuplexConnection] = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
  trait RSocketTCPServer
    extends StObject
       with TransportServer
  object RSocketTCPServer {
    
    inline def apply(start: CallbackTo[Flowable[DuplexConnection]], stop: Callback): RSocketTCPServer = {
      val __obj = js.Dynamic.literal(start = start.toJsFn, stop = stop.toJsFn)
      __obj.asInstanceOf[RSocketTCPServer]
    }
  }
  
  trait ServerOptions extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var port: Double
    
    var serverFactory: js.UndefOr[js.Function1[/* onConnect */ js.Function1[/* socket */ Socket, Unit], Server]] = js.undefined
  }
  object ServerOptions {
    
    inline def apply(port: Double): ServerOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerOptions]
    }
    
    extension [Self <: ServerOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setServerFactory(value: /* onConnect */ js.Function1[/* socket */ Socket, Unit] => Server): Self = StObject.set(x, "serverFactory", js.Any.fromFunction1(value))
      
      inline def setServerFactoryUndefined: Self = StObject.set(x, "serverFactory", js.undefined)
    }
  }
}
