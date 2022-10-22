package typingsJapgolly.maximMazurokGapiClientAnalyticsadmin

import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin.AccountSummariesResource
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin.AccountsResource
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin.PropertiesResource
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.maximMazurokGapiClientAnalyticsadminStrings.analyticsadmin
import typingsJapgolly.maximMazurokGapiClientAnalyticsadmin.maximMazurokGapiClientAnalyticsadminStrings.v1alpha
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
      
      object analyticsadmin {
        
        @JSGlobal("gapi.client.analyticsadmin.accountSummaries")
        @js.native
        val accountSummaries: AccountSummariesResource = js.native
        
        @JSGlobal("gapi.client.analyticsadmin.accounts")
        @js.native
        val accounts: AccountsResource = js.native
        
        @JSGlobal("gapi.client.analyticsadmin.properties")
        @js.native
        val properties: PropertiesResource = js.native
      }
      
      /** Load Google Analytics Admin API v1alpha */
      inline def load(name: analyticsadmin, version: v1alpha): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: analyticsadmin, version: v1alpha, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
