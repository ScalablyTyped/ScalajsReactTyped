package typingsJapgolly.undici

import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.node.tlsMod.TLSSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesConnectorMod {
  
  inline def apply(): connector = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[connector]
  inline def apply(options: BuildOptions): connector = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[connector]
  
  @JSImport("undici/types/connector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.undici.anon.ConnectionOptionsmaxCache
    - typingsJapgolly.undici.anon.TcpNetConnectOptsmaxCache
    - typingsJapgolly.undici.anon.IpcNetConnectOptsmaxCache
  */
  trait BuildOptions extends StObject
  object BuildOptions {
    
    inline def ConnectionOptionsmaxCache(timeout: js.UndefOr[Double] & (js.UndefOr[Double | Null])): typingsJapgolly.undici.anon.ConnectionOptionsmaxCache = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.undici.anon.ConnectionOptionsmaxCache]
    }
    
    inline def IpcNetConnectOptsmaxCache(path: String, timeout: js.UndefOr[Double] & (js.UndefOr[Double | Null])): typingsJapgolly.undici.anon.IpcNetConnectOptsmaxCache = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.undici.anon.IpcNetConnectOptsmaxCache]
    }
    
    inline def TcpNetConnectOptsmaxCache(port: Double & js.UndefOr[Double], timeout: js.UndefOr[Double] & (js.UndefOr[Double | Null])): typingsJapgolly.undici.anon.TcpNetConnectOptsmaxCache = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.undici.anon.TcpNetConnectOptsmaxCache]
    }
  }
  
  type Callback = js.Function1[/* args */ CallbackArgs, Unit]
  
  type CallbackArgs = js.Tuple2[js.Error | Null, Null | Socket | TLSSocket]
  
  trait Options extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var hostname: String
    
    var port: Double
    
    var protocol: String
    
    var servername: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(hostname: String, port: Double, protocol: String): Options = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      inline def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
    }
  }
  
  type connector = connectorAsync | connectorSync
  
  type connectorAsync = js.Function2[/* options */ Options, /* callback */ Callback, Unit]
  
  type connectorSync = js.Function1[/* options */ Options, Socket | TLSSocket]
}
