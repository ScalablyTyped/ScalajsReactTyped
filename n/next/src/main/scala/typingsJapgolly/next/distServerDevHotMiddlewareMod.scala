package typingsJapgolly.next

import japgolly.scalajs.react.Callback
import typingsJapgolly.next.anon.Stats
import typingsJapgolly.next.distCompiledWebpackWebpackMod.webpack.Compiler
import typingsJapgolly.std.Set
import typingsJapgolly.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerDevHotMiddlewareMod {
  
  @JSImport("next/dist/server/dev/hot-middleware", "WebpackHotMiddleware")
  @js.native
  open class WebpackHotMiddleware protected () extends StObject {
    def this(compilers: js.Array[Compiler]) = this()
    
    var clientLatestStats: Stats | Null = js.native
    
    def close(): Unit = js.native
    
    var closed: Boolean = js.native
    
    var eventStream: EventStream = js.native
    
    var middlewareLatestStats: Stats | Null = js.native
    
    def onClientDone(statsResult: typingsJapgolly.next.distCompiledWebpackWebpackMod.webpack.Stats): Unit = js.native
    
    def onClientInvalid(): Unit = js.native
    
    def onEdgeServerDone(statsResult: typingsJapgolly.next.distCompiledWebpackWebpackMod.webpack.Stats): Unit = js.native
    
    def onEdgeServerInvalid(): Unit = js.native
    
    /**
      * To sync we use the most recent stats but also we append middleware
      * errors. This is because it is possible that middleware fails to compile
      * and we still want to show the client overlay with the error while
      * the error page should be rendered just fine.
      */
    def onHMR(client: WebSocket): Unit = js.native
    
    def onServerDone(statsResult: typingsJapgolly.next.distCompiledWebpackWebpackMod.webpack.Stats): Unit = js.native
    
    def onServerInvalid(): Unit = js.native
    
    def publish(payload: Any): Unit = js.native
    
    def publishStats(action: String, statsResult: typingsJapgolly.next.distCompiledWebpackWebpackMod.webpack.Stats): Unit = js.native
    
    var serverLatestStats: Stats | Null = js.native
  }
  
  trait EventStream extends StObject {
    
    var clients: Set[WebSocket]
    
    def close(): Unit
    
    def everyClient(fn: js.Function1[/* client */ WebSocket, Unit]): Unit
    
    def handler(client: WebSocket): Unit
    
    def publish(payload: Any): Unit
  }
  object EventStream {
    
    inline def apply(
      clients: Set[WebSocket],
      close: Callback,
      everyClient: js.Function1[/* client */ WebSocket, Unit] => Callback,
      handler: WebSocket => Callback,
      publish: Any => Callback
    ): EventStream = {
      val __obj = js.Dynamic.literal(clients = clients.asInstanceOf[js.Any], close = close.toJsFn, everyClient = js.Any.fromFunction1((t0: js.Function1[/* client */ WebSocket, Unit]) => everyClient(t0).runNow()), handler = js.Any.fromFunction1((t0: WebSocket) => handler(t0).runNow()), publish = js.Any.fromFunction1((t0: Any) => publish(t0).runNow()))
      __obj.asInstanceOf[EventStream]
    }
    
    extension [Self <: EventStream](x: Self) {
      
      inline def setClients(value: Set[WebSocket]): Self = StObject.set(x, "clients", value.asInstanceOf[js.Any])
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setEveryClient(value: js.Function1[/* client */ WebSocket, Unit] => Callback): Self = StObject.set(x, "everyClient", js.Any.fromFunction1((t0: js.Function1[/* client */ WebSocket, Unit]) => value(t0).runNow()))
      
      inline def setHandler(value: WebSocket => Callback): Self = StObject.set(x, "handler", js.Any.fromFunction1((t0: WebSocket) => value(t0).runNow()))
      
      inline def setPublish(value: Any => Callback): Self = StObject.set(x, "publish", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
}
