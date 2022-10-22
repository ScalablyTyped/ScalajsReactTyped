package typingsJapgolly.maximMazurokGapiClientYoutubeanalytics

import typingsJapgolly.maximMazurokGapiClientYoutubeanalytics.gapi.client.youtubeanalytics.GroupItemsResource
import typingsJapgolly.maximMazurokGapiClientYoutubeanalytics.gapi.client.youtubeanalytics.GroupsResource
import typingsJapgolly.maximMazurokGapiClientYoutubeanalytics.gapi.client.youtubeanalytics.ReportsResource
import typingsJapgolly.maximMazurokGapiClientYoutubeanalytics.maximMazurokGapiClientYoutubeanalyticsStrings.v2
import typingsJapgolly.maximMazurokGapiClientYoutubeanalytics.maximMazurokGapiClientYoutubeanalyticsStrings.youtubeanalytics
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
      
      /** Load YouTube Analytics API v2 */
      inline def load(name: youtubeanalytics, version: v2): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: youtubeanalytics, version: v2, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object youtubeanalytics {
        
        @JSGlobal("gapi.client.youtubeanalytics.groupItems")
        @js.native
        val groupItems: GroupItemsResource = js.native
        
        @JSGlobal("gapi.client.youtubeanalytics.groups")
        @js.native
        val groups: GroupsResource = js.native
        
        @JSGlobal("gapi.client.youtubeanalytics.reports")
        @js.native
        val reports: ReportsResource = js.native
      }
    }
  }
}
