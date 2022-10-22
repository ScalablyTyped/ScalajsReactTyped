package typingsJapgolly.stompit

import typingsJapgolly.node.netMod.IpcNetConnectOpts
import typingsJapgolly.node.netMod.Socket
import typingsJapgolly.node.netMod.TcpNetConnectOpts
import typingsJapgolly.node.tlsMod.ConnectionOptions
import typingsJapgolly.stompit.libSocketMod.SocketOptions
import typingsJapgolly.stompit.stompitBooleans.`false`
import typingsJapgolly.stompit.stompitBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConnectMod {
  
  inline def apply(optionsOrPathOrPort: String): typingsJapgolly.stompit.libClientMod.^ = ^.asInstanceOf[js.Dynamic].apply(optionsOrPathOrPort.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.stompit.libClientMod.^]
  inline def apply(optionsOrPathOrPort: String, connectionListener: ConnectionListener): typingsJapgolly.stompit.libClientMod.^ = (^.asInstanceOf[js.Dynamic].apply(optionsOrPathOrPort.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.stompit.libClientMod.^]
  inline def apply(optionsOrPathOrPort: Double): typingsJapgolly.stompit.libClientMod.^ = ^.asInstanceOf[js.Dynamic].apply(optionsOrPathOrPort.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.stompit.libClientMod.^]
  inline def apply(optionsOrPathOrPort: Double, connectionListener: ConnectionListener): typingsJapgolly.stompit.libClientMod.^ = (^.asInstanceOf[js.Dynamic].apply(optionsOrPathOrPort.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.stompit.libClientMod.^]
  inline def apply(optionsOrPathOrPort: ConnectOptions): typingsJapgolly.stompit.libClientMod.^ = ^.asInstanceOf[js.Dynamic].apply(optionsOrPathOrPort.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.stompit.libClientMod.^]
  inline def apply(optionsOrPathOrPort: ConnectOptions, connectionListener: ConnectionListener): typingsJapgolly.stompit.libClientMod.^ = (^.asInstanceOf[js.Dynamic].apply(optionsOrPathOrPort.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.stompit.libClientMod.^]
  inline def apply(port: Double, host: String): typingsJapgolly.stompit.libClientMod.^ = (^.asInstanceOf[js.Dynamic].apply(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.stompit.libClientMod.^]
  inline def apply(port: Double, host: String, connectionListener: ConnectionListener): typingsJapgolly.stompit.libClientMod.^ = (^.asInstanceOf[js.Dynamic].apply(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.stompit.libClientMod.^]
  inline def apply(port: Double, host: Unit, connectionListener: ConnectionListener): typingsJapgolly.stompit.libClientMod.^ = (^.asInstanceOf[js.Dynamic].apply(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.stompit.libClientMod.^]
  
  @JSImport("stompit/lib/connect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait BaseConnectOptions
    extends StObject
       with SocketOptions {
    
    // This connectionListener type comes from @types/node
    var connect: js.UndefOr[
        js.Function2[
          /* options */ ConnectOptions, 
          /* connectionListener */ js.UndefOr[js.Function0[Unit]], 
          Socket
        ]
      ] = js.undefined
    
    var connectHeaders: js.UndefOr[ConnectHeaders] = js.undefined
    
    var ssl: js.UndefOr[Boolean] = js.undefined
  }
  object BaseConnectOptions {
    
    inline def apply(): BaseConnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseConnectOptions]
    }
    
    extension [Self <: BaseConnectOptions](x: Self) {
      
      inline def setConnect(
        value: (/* options */ ConnectOptions, /* connectionListener */ js.UndefOr[js.Function0[Unit]]) => Socket
      ): Self = StObject.set(x, "connect", js.Any.fromFunction2(value))
      
      inline def setConnectHeaders(value: ConnectHeaders): Self = StObject.set(x, "connectHeaders", value.asInstanceOf[js.Any])
      
      inline def setConnectHeadersUndefined: Self = StObject.set(x, "connectHeaders", js.undefined)
      
      inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    }
  }
  
  trait ConnectHeaders extends StObject {
    
    var `accept-version`: js.UndefOr[String] = js.undefined
    
    var `heart-beat`: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var login: js.UndefOr[String] = js.undefined
    
    var passcode: js.UndefOr[String] = js.undefined
  }
  object ConnectHeaders {
    
    inline def apply(): ConnectHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectHeaders]
    }
    
    extension [Self <: ConnectHeaders](x: Self) {
      
      inline def `setAccept-version`(value: String): Self = StObject.set(x, "accept-version", value.asInstanceOf[js.Any])
      
      inline def `setAccept-versionUndefined`: Self = StObject.set(x, "accept-version", js.undefined)
      
      inline def `setHeart-beat`(value: String): Self = StObject.set(x, "heart-beat", value.asInstanceOf[js.Any])
      
      inline def `setHeart-beatUndefined`: Self = StObject.set(x, "heart-beat", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setLogin(value: String): Self = StObject.set(x, "login", value.asInstanceOf[js.Any])
      
      inline def setLoginUndefined: Self = StObject.set(x, "login", js.undefined)
      
      inline def setPasscode(value: String): Self = StObject.set(x, "passcode", value.asInstanceOf[js.Any])
      
      inline def setPasscodeUndefined: Self = StObject.set(x, "passcode", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.stompit.libConnectMod.NetTcpConnectOptions
    - typingsJapgolly.stompit.libConnectMod.NetIpcConnectOptions
    - typingsJapgolly.stompit.libConnectMod.SslConnectOptions
  */
  trait ConnectOptions extends StObject
  object ConnectOptions {
    
    inline def NetIpcConnectOptions(path: String): typingsJapgolly.stompit.libConnectMod.NetIpcConnectOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.stompit.libConnectMod.NetIpcConnectOptions]
    }
    
    inline def NetTcpConnectOptions(port: Double): typingsJapgolly.stompit.libConnectMod.NetTcpConnectOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.stompit.libConnectMod.NetTcpConnectOptions]
    }
    
    inline def SslConnectOptions(): typingsJapgolly.stompit.libConnectMod.SslConnectOptions = {
      val __obj = js.Dynamic.literal(ssl = true)
      __obj.asInstanceOf[typingsJapgolly.stompit.libConnectMod.SslConnectOptions]
    }
  }
  
  type ConnectionListener = js.Function2[/* err */ js.Error | Null, /* client */ typingsJapgolly.stompit.libClientMod.^, Unit]
  
  trait NetIpcConnectOptions
    extends StObject
       with BaseConnectOptions
       with IpcNetConnectOpts
       with ConnectOptions {
    
    @JSName("ssl")
    var ssl_NetIpcConnectOptions: js.UndefOr[`false`] = js.undefined
  }
  object NetIpcConnectOptions {
    
    inline def apply(path: String): NetIpcConnectOptions = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetIpcConnectOptions]
    }
    
    extension [Self <: NetIpcConnectOptions](x: Self) {
      
      inline def setSsl(value: `false`): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    }
  }
  
  trait NetTcpConnectOptions
    extends StObject
       with BaseConnectOptions
       with TcpNetConnectOpts
       with ConnectOptions {
    
    @JSName("ssl")
    var ssl_NetTcpConnectOptions: js.UndefOr[`false`] = js.undefined
  }
  object NetTcpConnectOptions {
    
    inline def apply(port: Double): NetTcpConnectOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetTcpConnectOptions]
    }
    
    extension [Self <: NetTcpConnectOptions](x: Self) {
      
      inline def setSsl(value: `false`): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    }
  }
  
  trait SslConnectOptions
    extends StObject
       with BaseConnectOptions
       with ConnectionOptions
       with ConnectOptions {
    
    @JSName("ssl")
    var ssl_SslConnectOptions: `true`
  }
  object SslConnectOptions {
    
    inline def apply(): SslConnectOptions = {
      val __obj = js.Dynamic.literal(ssl = true)
      __obj.asInstanceOf[SslConnectOptions]
    }
    
    extension [Self <: SslConnectOptions](x: Self) {
      
      inline def setSsl(value: `true`): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    }
  }
}
