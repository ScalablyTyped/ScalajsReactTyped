package typingsJapgolly.angularDevkitBuildAngular

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBuildersDevServerSchemaMod {
  
  trait Schema extends StObject {
    
    /**
      * List of hosts that are allowed to access the dev server.
      */
    var allowedHosts: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A browser builder target to serve in the format of `project:target[:configuration]`. You
      * can also pass in more than one configuration name as a comma-separated list. Example:
      * `project:target:production,staging`.
      */
    var browserTarget: String
    
    /**
      * Don't verify connected clients are part of allowed hosts.
      */
    var disableHostCheck: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom HTTP headers to be added to all responses.
      */
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Enable hot module replacement.
      */
    var hmr: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Host to listen on.
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to reload the page on change, using live-reload.
      */
    var liveReload: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Opens the url in default browser.
      */
    var open: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable and define the file watching poll time period in milliseconds.
      */
    var poll: js.UndefOr[Double] = js.undefined
    
    /**
      * Port to listen on.
      */
    var port: js.UndefOr[Double] = js.undefined
    
    /**
      * Proxy configuration file. For more information, see
      * https://angular.io/guide/build#proxying-to-a-backend-server.
      */
    var proxyConfig: js.UndefOr[String] = js.undefined
    
    /**
      * The URL that the browser client (or live-reload client, if enabled) should use to connect
      * to the development server. Use for a complex dev server setup, such as one with reverse
      * proxies.
      */
    var publicHost: js.UndefOr[String] = js.undefined
    
    /**
      * The pathname where the application will be served.
      */
    var servePath: js.UndefOr[String] = js.undefined
    
    /**
      * Serve using HTTPS.
      */
    var ssl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * SSL certificate to use for serving HTTPS.
      */
    var sslCert: js.UndefOr[String] = js.undefined
    
    /**
      * SSL key to use for serving HTTPS.
      */
    var sslKey: js.UndefOr[String] = js.undefined
    
    /**
      * Adds more details to output logging.
      */
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Rebuild on change.
      */
    var watch: js.UndefOr[Boolean] = js.undefined
  }
  object Schema {
    
    inline def apply(browserTarget: String): Schema = {
      val __obj = js.Dynamic.literal(browserTarget = browserTarget.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setAllowedHosts(value: js.Array[String]): Self = StObject.set(x, "allowedHosts", value.asInstanceOf[js.Any])
      
      inline def setAllowedHostsUndefined: Self = StObject.set(x, "allowedHosts", js.undefined)
      
      inline def setAllowedHostsVarargs(value: String*): Self = StObject.set(x, "allowedHosts", js.Array(value*))
      
      inline def setBrowserTarget(value: String): Self = StObject.set(x, "browserTarget", value.asInstanceOf[js.Any])
      
      inline def setDisableHostCheck(value: Boolean): Self = StObject.set(x, "disableHostCheck", value.asInstanceOf[js.Any])
      
      inline def setDisableHostCheckUndefined: Self = StObject.set(x, "disableHostCheck", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHmr(value: Boolean): Self = StObject.set(x, "hmr", value.asInstanceOf[js.Any])
      
      inline def setHmrUndefined: Self = StObject.set(x, "hmr", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setLiveReload(value: Boolean): Self = StObject.set(x, "liveReload", value.asInstanceOf[js.Any])
      
      inline def setLiveReloadUndefined: Self = StObject.set(x, "liveReload", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPoll(value: Double): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
      
      inline def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProxyConfig(value: String): Self = StObject.set(x, "proxyConfig", value.asInstanceOf[js.Any])
      
      inline def setProxyConfigUndefined: Self = StObject.set(x, "proxyConfig", js.undefined)
      
      inline def setPublicHost(value: String): Self = StObject.set(x, "publicHost", value.asInstanceOf[js.Any])
      
      inline def setPublicHostUndefined: Self = StObject.set(x, "publicHost", js.undefined)
      
      inline def setServePath(value: String): Self = StObject.set(x, "servePath", value.asInstanceOf[js.Any])
      
      inline def setServePathUndefined: Self = StObject.set(x, "servePath", js.undefined)
      
      inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslCert(value: String): Self = StObject.set(x, "sslCert", value.asInstanceOf[js.Any])
      
      inline def setSslCertUndefined: Self = StObject.set(x, "sslCert", js.undefined)
      
      inline def setSslKey(value: String): Self = StObject.set(x, "sslKey", value.asInstanceOf[js.Any])
      
      inline def setSslKeyUndefined: Self = StObject.set(x, "sslKey", js.undefined)
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
}
