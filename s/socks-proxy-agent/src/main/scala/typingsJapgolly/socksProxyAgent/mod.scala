package typingsJapgolly.socksProxyAgent

import typingsJapgolly.agentBase.mod.Agent
import typingsJapgolly.agentBase.mod.AgentOptions
import typingsJapgolly.node.tlsMod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socks-proxy-agent", "SocksProxyAgent")
  @js.native
  open class SocksProxyAgent protected () extends Agent {
    def this(input: String) = this()
    def this(input: SocksProxyAgentOptions) = this()
    def this(input: String, options: SocksProxyAgentOptionsExtra) = this()
    def this(input: SocksProxyAgentOptions, options: SocksProxyAgentOptionsExtra) = this()
    
    /* private */ val proxy: Any = js.native
    
    /* private */ val shouldLookup: Any = js.native
    
    /* private */ val tlsConnectionOptions: Any = js.native
  }
  
  trait BaseSocksProxyAgentOptions extends StObject {
    
    var host: js.UndefOr[String | Null] = js.undefined
    
    var port: js.UndefOr[String | Double | Null] = js.undefined
    
    var tls: js.UndefOr[ConnectionOptions | Null] = js.undefined
    
    var username: js.UndefOr[String | Null] = js.undefined
  }
  object BaseSocksProxyAgentOptions {
    
    inline def apply(): BaseSocksProxyAgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseSocksProxyAgentOptions]
    }
    
    extension [Self <: BaseSocksProxyAgentOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostNull: Self = StObject.set(x, "host", null)
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortNull: Self = StObject.set(x, "port", null)
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setTls(value: ConnectionOptions): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
      
      inline def setTlsNull: Self = StObject.set(x, "tls", null)
      
      inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameNull: Self = StObject.set(x, "username", null)
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof std.Omit<node.url.Url & socks.socks/typings/common/constants.SocksProxy, 'host' | 'port' | 'username' | 'tls'> ]:? std.Omit<node.url.Url & socks.socks/typings/common/constants.SocksProxy, 'host' | 'port' | 'username' | 'tls'>[P]} */ trait SocksProxyAgentOptions
    extends StObject
       with AgentOptions
       with BaseSocksProxyAgentOptions
  object SocksProxyAgentOptions {
    
    inline def apply(): SocksProxyAgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocksProxyAgentOptions]
    }
  }
  
  trait SocksProxyAgentOptionsExtra extends StObject {
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object SocksProxyAgentOptionsExtra {
    
    inline def apply(): SocksProxyAgentOptionsExtra = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocksProxyAgentOptionsExtra]
    }
    
    extension [Self <: SocksProxyAgentOptionsExtra](x: Self) {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
