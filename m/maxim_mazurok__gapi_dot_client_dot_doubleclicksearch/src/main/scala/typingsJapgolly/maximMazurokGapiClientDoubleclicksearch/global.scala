package typingsJapgolly.maximMazurokGapiClientDoubleclicksearch

import typingsJapgolly.maximMazurokGapiClientDoubleclicksearch.gapi.client.doubleclicksearch.ConversionResource
import typingsJapgolly.maximMazurokGapiClientDoubleclicksearch.gapi.client.doubleclicksearch.ReportsResource
import typingsJapgolly.maximMazurokGapiClientDoubleclicksearch.gapi.client.doubleclicksearch.SavedColumnsResource
import typingsJapgolly.maximMazurokGapiClientDoubleclicksearch.maximMazurokGapiClientDoubleclicksearchStrings.doubleclicksearch
import typingsJapgolly.maximMazurokGapiClientDoubleclicksearch.maximMazurokGapiClientDoubleclicksearchStrings.v2
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
      
      object doubleclicksearch {
        
        @JSGlobal("gapi.client.doubleclicksearch.conversion")
        @js.native
        val conversion: ConversionResource = js.native
        
        @JSGlobal("gapi.client.doubleclicksearch.reports")
        @js.native
        val reports: ReportsResource = js.native
        
        @JSGlobal("gapi.client.doubleclicksearch.savedColumns")
        @js.native
        val savedColumns: SavedColumnsResource = js.native
      }
      
      /** Load Search Ads 360 API v2 */
      inline def load(name: doubleclicksearch, version: v2): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: doubleclicksearch, version: v2, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
