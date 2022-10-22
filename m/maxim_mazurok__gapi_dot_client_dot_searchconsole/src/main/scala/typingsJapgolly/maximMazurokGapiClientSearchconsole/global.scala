package typingsJapgolly.maximMazurokGapiClientSearchconsole

import typingsJapgolly.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole.SearchanalyticsResource
import typingsJapgolly.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole.SitemapsResource
import typingsJapgolly.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole.SitesResource
import typingsJapgolly.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole.UrlInspectionResource
import typingsJapgolly.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole.UrlTestingToolsResource
import typingsJapgolly.maximMazurokGapiClientSearchconsole.maximMazurokGapiClientSearchconsoleStrings.searchconsole
import typingsJapgolly.maximMazurokGapiClientSearchconsole.maximMazurokGapiClientSearchconsoleStrings.v1
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
      
      /** Load Google Search Console API v1 */
      inline def load(name: searchconsole, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: searchconsole, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object searchconsole {
        
        @JSGlobal("gapi.client.searchconsole.searchanalytics")
        @js.native
        val searchanalytics: SearchanalyticsResource = js.native
        
        @JSGlobal("gapi.client.searchconsole.sitemaps")
        @js.native
        val sitemaps: SitemapsResource = js.native
        
        @JSGlobal("gapi.client.searchconsole.sites")
        @js.native
        val sites: SitesResource = js.native
        
        @JSGlobal("gapi.client.searchconsole.urlInspection")
        @js.native
        val urlInspection: UrlInspectionResource = js.native
        
        @JSGlobal("gapi.client.searchconsole.urlTestingTools")
        @js.native
        val urlTestingTools: UrlTestingToolsResource = js.native
      }
    }
  }
}
