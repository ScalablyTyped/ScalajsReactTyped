package typingsJapgolly.maximMazurokGapiClientReseller

import typingsJapgolly.maximMazurokGapiClientReseller.gapi.client.reseller.CustomersResource
import typingsJapgolly.maximMazurokGapiClientReseller.gapi.client.reseller.ResellernotifyResource
import typingsJapgolly.maximMazurokGapiClientReseller.gapi.client.reseller.SubscriptionsResource
import typingsJapgolly.maximMazurokGapiClientReseller.maximMazurokGapiClientResellerStrings.reseller
import typingsJapgolly.maximMazurokGapiClientReseller.maximMazurokGapiClientResellerStrings.v1
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
      
      /** Load Google Workspace Reseller API v1 */
      inline def load(name: reseller, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: reseller, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object reseller {
        
        @JSGlobal("gapi.client.reseller.customers")
        @js.native
        val customers: CustomersResource = js.native
        
        @JSGlobal("gapi.client.reseller.resellernotify")
        @js.native
        val resellernotify: ResellernotifyResource = js.native
        
        @JSGlobal("gapi.client.reseller.subscriptions")
        @js.native
        val subscriptions: SubscriptionsResource = js.native
      }
    }
  }
}
