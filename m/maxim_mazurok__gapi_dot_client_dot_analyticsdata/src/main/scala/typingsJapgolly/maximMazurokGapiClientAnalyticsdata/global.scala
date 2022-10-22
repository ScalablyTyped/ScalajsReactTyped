package typingsJapgolly.maximMazurokGapiClientAnalyticsdata

import typingsJapgolly.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata.PropertiesResource
import typingsJapgolly.maximMazurokGapiClientAnalyticsdata.maximMazurokGapiClientAnalyticsdataStrings.analyticsdata
import typingsJapgolly.maximMazurokGapiClientAnalyticsdata.maximMazurokGapiClientAnalyticsdataStrings.v1beta
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
      
      object analyticsdata {
        
        @JSGlobal("gapi.client.analyticsdata.properties")
        @js.native
        val properties: PropertiesResource = js.native
      }
      
      /** Load Google Analytics Data API v1beta */
      inline def load(name: analyticsdata, version: v1beta): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: analyticsdata, version: v1beta, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
