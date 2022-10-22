package typingsJapgolly.httpCookieAgent

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.URL
import typingsJapgolly.httpCookieAgent.anon.Cookies
import typingsJapgolly.httpCookieAgent.httpCookieAgentBooleans.`true`
import typingsJapgolly.httpCookieAgent.undiciMod.CookieAgent.Options
import typingsJapgolly.toughCookie.mod.CookieJar
import typingsJapgolly.undici.mod.Agent
import typingsJapgolly.undici.mod.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object undiciMod {
  
  @JSImport("http-cookie-agent/undici", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("http-cookie-agent/undici", "CookieAgent")
  @js.native
  open class CookieAgent () extends Agent {
    def this(options: Options) = this()
  }
  object CookieAgent {
    
    trait Options
      extends StObject
         with typingsJapgolly.undici.typesAgentMod.Options {
      
      var cookies: js.UndefOr[CookieOptions] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setCookies(value: CookieOptions): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
        
        inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      }
    }
  }
  
  @JSImport("http-cookie-agent/undici", "CookieClient")
  @js.native
  open class CookieClient protected () extends Client {
    def this(url: String) = this()
    def this(url: URL) = this()
    def this(url: String, options: typingsJapgolly.httpCookieAgent.undiciMod.CookieClient.Options) = this()
    def this(url: URL, options: typingsJapgolly.httpCookieAgent.undiciMod.CookieClient.Options) = this()
  }
  object CookieClient {
    
    trait Options
      extends StObject
         with typingsJapgolly.undici.typesClientMod.Options {
      
      var cookies: js.UndefOr[CookieOptions] = js.undefined
    }
    object Options {
      
      inline def apply(): typingsJapgolly.httpCookieAgent.undiciMod.CookieClient.Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typingsJapgolly.httpCookieAgent.undiciMod.CookieClient.Options]
      }
      
      extension [Self <: typingsJapgolly.httpCookieAgent.undiciMod.CookieClient.Options](x: Self) {
        
        inline def setCookies(value: CookieOptions): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
        
        inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      }
    }
  }
  
  inline def createCookieClient[BaseClient /* <: Client */, BaseClientOptions](
    BaseClientClass: Instantiable2[/* origin */ String | URL, /* options */ BaseClientOptions, BaseClient]
  ): Instantiable2[
    /* origin */ String | URL, 
    /* options */ js.UndefOr[BaseClientOptions & Cookies], 
    BaseClient
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCookieClient")(BaseClientClass.asInstanceOf[js.Any]).asInstanceOf[Instantiable2[
    /* origin */ String | URL, 
    /* options */ js.UndefOr[BaseClientOptions & Cookies], 
    BaseClient
  ]]
  
  trait CookieOptions extends StObject {
    
    var async_UNSTABLE: js.UndefOr[`true`] = js.undefined
    
    var jar: CookieJar
  }
  object CookieOptions {
    
    inline def apply(jar: CookieJar): CookieOptions = {
      val __obj = js.Dynamic.literal(jar = jar.asInstanceOf[js.Any])
      __obj.asInstanceOf[CookieOptions]
    }
    
    extension [Self <: CookieOptions](x: Self) {
      
      inline def setAsync_UNSTABLE(value: `true`): Self = StObject.set(x, "async_UNSTABLE", value.asInstanceOf[js.Any])
      
      inline def setAsync_UNSTABLEUndefined: Self = StObject.set(x, "async_UNSTABLE", js.undefined)
      
      inline def setJar(value: CookieJar): Self = StObject.set(x, "jar", value.asInstanceOf[js.Any])
    }
  }
}
