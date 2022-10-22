package typingsJapgolly.hpagent

import typingsJapgolly.node.httpMod.Agent
import typingsJapgolly.node.httpMod.AgentOptions
import typingsJapgolly.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hpagent", "HttpProxyAgent")
  @js.native
  open class HttpProxyAgent protected () extends Agent {
    def this(options: HttpProxyAgentOptions) = this()
  }
  
  @JSImport("hpagent", "HttpsProxyAgent")
  @js.native
  open class HttpsProxyAgent protected ()
    extends typingsJapgolly.node.httpsMod.Agent {
    def this(options: HttpsProxyAgentOptions) = this()
  }
  
  trait HttpProxyAgentOptions
    extends StObject
       with AgentOptions {
    
    var proxy: String | URL_
  }
  object HttpProxyAgentOptions {
    
    inline def apply(proxy: String | URL_): HttpProxyAgentOptions = {
      val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpProxyAgentOptions]
    }
    
    extension [Self <: HttpProxyAgentOptions](x: Self) {
      
      inline def setProxy(value: String | URL_): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    }
  }
  
  trait HttpsProxyAgentOptions
    extends StObject
       with typingsJapgolly.node.httpsMod.AgentOptions {
    
    var proxy: String | URL_
  }
  object HttpsProxyAgentOptions {
    
    inline def apply(proxy: String | URL_): HttpsProxyAgentOptions = {
      val __obj = js.Dynamic.literal(proxy = proxy.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpsProxyAgentOptions]
    }
    
    extension [Self <: HttpsProxyAgentOptions](x: Self) {
      
      inline def setProxy(value: String | URL_): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    }
  }
}
