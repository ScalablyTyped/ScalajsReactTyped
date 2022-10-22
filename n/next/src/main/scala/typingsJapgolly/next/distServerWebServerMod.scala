package typingsJapgolly.next

import typingsJapgolly.next.anon.AppRenderToHTML
import typingsJapgolly.next.anon.Components
import typingsJapgolly.next.anon.GenerateEtags
import typingsJapgolly.next.anon.Query
import typingsJapgolly.next.distServerBaseHttpWebMod.WebNextRequest
import typingsJapgolly.next.distServerBaseHttpWebMod.WebNextResponse
import typingsJapgolly.next.distServerBaseServerMod.Options
import typingsJapgolly.next.distServerConfigSharedMod.NextConfig
import typingsJapgolly.next.distServerRenderMod.RenderOpts
import typingsJapgolly.next.distServerRequestMetaMod.NextParsedUrlQuery
import typingsJapgolly.next.distServerRequestMetaMod.NextUrlWithParsedQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerWebServerMod {
  
  @JSImport("next/dist/server/web-server", JSImport.Default)
  @js.native
  open class default protected () extends NextWebServer {
    def this(options: WebServerOptions) = this()
  }
  
  @js.native
  trait NextWebServer
    extends typingsJapgolly.next.distServerBaseServerMod.default[WebServerOptions] {
    
    /* protected */ def attachRequestMeta(req: WebNextRequest, parsedUrl: NextUrlWithParsedQuery): Unit = js.native
    
    /* protected */ def findPageComponents(hasPathnameQueryParams: Query): js.Promise[Components | Null] = js.native
    
    /* protected */ def getFallback(): js.Promise[String] = js.native
    
    /* protected */ def getResponseCache(): typingsJapgolly.next.distServerResponseCacheWebMod.default = js.native
    
    /* protected */ def handleApiRequest(): js.Promise[Boolean] = js.native
    
    /* protected */ def handleCompression(): Unit = js.native
    
    /* protected */ def loadEnvConfig(): Unit = js.native
    
    /* protected */ def renderHTML(
      req: WebNextRequest,
      _res: WebNextResponse,
      pathname: String,
      query: NextParsedUrlQuery,
      renderOpts: RenderOpts
    ): js.Promise[typingsJapgolly.next.distServerRenderResultMod.default | Null] = js.native
    
    /* protected */ def runApi(): js.Promise[Boolean] = js.native
    
    /* protected */ def sendRenderResult(_req: WebNextRequest, res: WebNextResponse, options: GenerateEtags): js.Promise[Unit] = js.native
  }
  
  trait WebServerOptions
    extends StObject
       with Options {
    
    var webServerConfig: AppRenderToHTML
  }
  object WebServerOptions {
    
    inline def apply(conf: NextConfig, webServerConfig: AppRenderToHTML): WebServerOptions = {
      val __obj = js.Dynamic.literal(conf = conf.asInstanceOf[js.Any], webServerConfig = webServerConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebServerOptions]
    }
    
    extension [Self <: WebServerOptions](x: Self) {
      
      inline def setWebServerConfig(value: AppRenderToHTML): Self = StObject.set(x, "webServerConfig", value.asInstanceOf[js.Any])
    }
  }
}
