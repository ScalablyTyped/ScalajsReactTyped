package typingsJapgolly.maximMazurokGapiClientWebmasters

import typingsJapgolly.maximMazurokGapiClientWebmasters.gapi.client.webmasters.SearchanalyticsResource
import typingsJapgolly.maximMazurokGapiClientWebmasters.gapi.client.webmasters.SitemapsResource
import typingsJapgolly.maximMazurokGapiClientWebmasters.gapi.client.webmasters.SitesResource
import typingsJapgolly.maximMazurokGapiClientWebmasters.maximMazurokGapiClientWebmastersStrings.v3
import typingsJapgolly.maximMazurokGapiClientWebmasters.maximMazurokGapiClientWebmastersStrings.webmasters
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Search Console API v3 */
      inline def load(name: webmasters, version: v3): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: webmasters, version: v3, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object webmasters {
        
        @JSGlobal("gapi.client.webmasters.searchanalytics")
        @js.native
        val searchanalytics: SearchanalyticsResource = js.native
        
        @JSGlobal("gapi.client.webmasters.sitemaps")
        @js.native
        val sitemaps: SitemapsResource = js.native
        
        @JSGlobal("gapi.client.webmasters.sites")
        @js.native
        val sites: SitesResource = js.native
      }
    }
  }
}
