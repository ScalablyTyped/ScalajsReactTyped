package typingsJapgolly.socks.typingsCommonConstantsMod

import typingsJapgolly.node.netMod.SocketConnectOpts
import typingsJapgolly.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SocksClient connection options.
  */
trait SocksClientOptions extends StObject {
  
  var command: SocksCommandOption
  
  var destination: SocksRemoteHost
  
  var existing_socket: js.UndefOr[Duplex] = js.undefined
  
  var proxy: SocksProxy
  
  var set_tcp_nodelay: js.UndefOr[Boolean] = js.undefined
  
  var socket_options: js.UndefOr[SocketConnectOpts] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object SocksClientOptions {
  
  inline def apply(command: SocksCommandOption, destination: SocksRemoteHost, proxy: SocksProxy): SocksClientOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocksClientOptions]
  }
  
  extension [Self <: SocksClientOptions](x: Self) {
    
    inline def setCommand(value: SocksCommandOption): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: SocksRemoteHost): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setExisting_socket(value: Duplex): Self = StObject.set(x, "existing_socket", value.asInstanceOf[js.Any])
    
    inline def setExisting_socketUndefined: Self = StObject.set(x, "existing_socket", js.undefined)
    
    inline def setProxy(value: SocksProxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setSet_tcp_nodelay(value: Boolean): Self = StObject.set(x, "set_tcp_nodelay", value.asInstanceOf[js.Any])
    
    inline def setSet_tcp_nodelayUndefined: Self = StObject.set(x, "set_tcp_nodelay", js.undefined)
    
    inline def setSocket_options(value: SocketConnectOpts): Self = StObject.set(x, "socket_options", value.asInstanceOf[js.Any])
    
    inline def setSocket_optionsUndefined: Self = StObject.set(x, "socket_options", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
