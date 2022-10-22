package typingsJapgolly.ddTrace.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [http2](https://nodejs.org/api/http2.html) module.
  *
  * By default any option set at the root will apply to both clients and
  * servers. To configure only one or the other, use the `client` and `server`
  * options.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.ddTrace.mod.Analyzable because Already inherited
- typingsJapgolly.ddTrace.mod.plugins.Integration because Already inherited
- typingsJapgolly.ddTrace.mod.plugins.Instrumentation because Already inherited
- typingsJapgolly.ddTrace.mod.plugins.Http_ because Already inherited
- typingsJapgolly.ddTrace.mod.plugins.Http2Server because var conflicts: allowlist, blacklist, blocklist, enabled, headers, measured, service, validateStatus, whitelist. Inlined  */ trait http2
  extends StObject
     with Http2Client {
  
  /**
    * Configuration for HTTP clients.
    */
  var client: js.UndefOr[Http2Client | Boolean] = js.undefined
  
  /**
    * Configuration for HTTP servers.
    */
  var server: js.UndefOr[Http2Server | Boolean] = js.undefined
}
object http2 {
  
  inline def apply(): http2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[http2]
  }
  
  extension [Self <: http2](x: Self) {
    
    inline def setClient(value: Http2Client | Boolean): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setServer(value: Http2Server | Boolean): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
