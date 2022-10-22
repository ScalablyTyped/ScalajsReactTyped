package typingsJapgolly.webdriver

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.URL
import typingsJapgolly.std.Record
import typingsJapgolly.wdioTypes.anon.Http
import typingsJapgolly.wdioTypes.buildOptionsMod.RequestLibResponse
import typingsJapgolly.wdioTypes.buildOptionsMod.WebDriverLogTypes
import typingsJapgolly.webdriver.anon.Body
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildRequestBrowserMod {
  
  @JSImport("webdriver/build/request/browser", JSImport.Default)
  @js.native
  open class default protected () extends BrowserRequest {
    def this(method: String, endpoint: String) = this()
    def this(method: String, endpoint: String, body: Record[String, Any]) = this()
    def this(method: String, endpoint: String, body: Unit, isHubCommand: Boolean) = this()
    def this(method: String, endpoint: String, body: Record[String, Any], isHubCommand: Boolean) = this()
  }
  
  @js.native
  trait BrowserRequest
    extends typingsJapgolly.webdriver.buildRequestMod.default {
    
    /* protected */ def _createOptions(options: RequestOptions): RequestLibOptions = js.native
    /* protected */ def _createOptions(options: RequestOptions, sessionId: String): RequestLibOptions = js.native
    
    /* protected */ def _libRequest(url: URL, options: RequestLibOptions): js.Promise[Body] = js.native
  }
  
  type RequestLibOptions = typingsJapgolly.wdioTypes.buildOptionsMod.RequestLibOptions
  
  /* Inlined std.Omit<@wdio/types.@wdio/types.Options.WebDriver, 'capabilities'> */
  trait RequestOptions extends StObject {
    
    var agent: js.UndefOr[Http] = js.undefined
    
    var connectionRetryCount: js.UndefOr[Double] = js.undefined
    
    var connectionRetryTimeout: js.UndefOr[Double] = js.undefined
    
    var enableDirectConnect: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var logLevel: js.UndefOr[WebDriverLogTypes] = js.undefined
    
    var logLevels: js.UndefOr[Record[String, WebDriverLogTypes]] = js.undefined
    
    var outputDir: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var queryParams: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var strictSSL: js.UndefOr[Boolean] = js.undefined
    
    var transformRequest: js.UndefOr[
        js.Function1[
          /* requestOptions */ typingsJapgolly.wdioTypes.buildOptionsMod.RequestLibOptions, 
          typingsJapgolly.wdioTypes.buildOptionsMod.RequestLibOptions
        ]
      ] = js.undefined
    
    var transformResponse: js.UndefOr[
        js.Function2[
          /* response */ RequestLibResponse, 
          /* requestOptions */ typingsJapgolly.wdioTypes.buildOptionsMod.RequestLibOptions, 
          RequestLibResponse
        ]
      ] = js.undefined
    
    var user: js.UndefOr[String] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    extension [Self <: RequestOptions](x: Self) {
      
      inline def setAgent(value: Http): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setConnectionRetryCount(value: Double): Self = StObject.set(x, "connectionRetryCount", value.asInstanceOf[js.Any])
      
      inline def setConnectionRetryCountUndefined: Self = StObject.set(x, "connectionRetryCount", js.undefined)
      
      inline def setConnectionRetryTimeout(value: Double): Self = StObject.set(x, "connectionRetryTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectionRetryTimeoutUndefined: Self = StObject.set(x, "connectionRetryTimeout", js.undefined)
      
      inline def setEnableDirectConnect(value: Boolean): Self = StObject.set(x, "enableDirectConnect", value.asInstanceOf[js.Any])
      
      inline def setEnableDirectConnectUndefined: Self = StObject.set(x, "enableDirectConnect", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLogLevel(value: WebDriverLogTypes): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setLogLevels(value: Record[String, WebDriverLogTypes]): Self = StObject.set(x, "logLevels", value.asInstanceOf[js.Any])
      
      inline def setLogLevelsUndefined: Self = StObject.set(x, "logLevels", js.undefined)
      
      inline def setOutputDir(value: String): Self = StObject.set(x, "outputDir", value.asInstanceOf[js.Any])
      
      inline def setOutputDirUndefined: Self = StObject.set(x, "outputDir", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setQueryParams(value: StringDictionary[String]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      inline def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
      
      inline def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
      
      inline def setTransformRequest(
        value: /* requestOptions */ typingsJapgolly.wdioTypes.buildOptionsMod.RequestLibOptions => typingsJapgolly.wdioTypes.buildOptionsMod.RequestLibOptions
      ): Self = StObject.set(x, "transformRequest", js.Any.fromFunction1(value))
      
      inline def setTransformRequestUndefined: Self = StObject.set(x, "transformRequest", js.undefined)
      
      inline def setTransformResponse(
        value: (/* response */ RequestLibResponse, /* requestOptions */ typingsJapgolly.wdioTypes.buildOptionsMod.RequestLibOptions) => RequestLibResponse
      ): Self = StObject.set(x, "transformResponse", js.Any.fromFunction2(value))
      
      inline def setTransformResponseUndefined: Self = StObject.set(x, "transformResponse", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
