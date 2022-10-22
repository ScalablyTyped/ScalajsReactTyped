package typingsJapgolly.maximMazurokGapiClientAnalytics

import typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics.DataResource
import typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics.ManagementResource
import typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics.MetadataResource
import typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics.ProvisioningResource
import typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics.UserDeletionResource
import typingsJapgolly.maximMazurokGapiClientAnalytics.maximMazurokGapiClientAnalyticsStrings.analytics
import typingsJapgolly.maximMazurokGapiClientAnalytics.maximMazurokGapiClientAnalyticsStrings.v3
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
      
      object analytics {
        
        @JSGlobal("gapi.client.analytics.data")
        @js.native
        val data: DataResource = js.native
        
        @JSGlobal("gapi.client.analytics.management")
        @js.native
        val management: ManagementResource = js.native
        
        @JSGlobal("gapi.client.analytics.metadata")
        @js.native
        val metadata: MetadataResource = js.native
        
        @JSGlobal("gapi.client.analytics.provisioning")
        @js.native
        val provisioning: ProvisioningResource = js.native
        
        @JSGlobal("gapi.client.analytics.userDeletion")
        @js.native
        val userDeletion: UserDeletionResource = js.native
      }
      
      /** Load Google Analytics API v3 */
      inline def load(name: analytics, version: v3): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: analytics, version: v3, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
