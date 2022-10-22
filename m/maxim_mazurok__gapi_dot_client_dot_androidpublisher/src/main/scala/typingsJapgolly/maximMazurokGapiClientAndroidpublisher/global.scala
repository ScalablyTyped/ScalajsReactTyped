package typingsJapgolly.maximMazurokGapiClientAndroidpublisher

import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.ApplicationsResource
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.EditsResource
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.GeneratedapksResource
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.GrantsResource
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.InappproductsResource
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.InternalappsharingartifactsResource
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.MonetizationResource
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.OrdersResource
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.PurchasesResource
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.ReviewsResource
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.SystemapksResource
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher.UsersResource
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.maximMazurokGapiClientAndroidpublisherStrings.androidpublisher
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.maximMazurokGapiClientAndroidpublisherStrings.v3
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
      
      object androidpublisher {
        
        @JSGlobal("gapi.client.androidpublisher.applications")
        @js.native
        val applications: ApplicationsResource = js.native
        
        @JSGlobal("gapi.client.androidpublisher.edits")
        @js.native
        val edits: EditsResource = js.native
        
        @JSGlobal("gapi.client.androidpublisher.generatedapks")
        @js.native
        val generatedapks: GeneratedapksResource = js.native
        
        @JSGlobal("gapi.client.androidpublisher.grants")
        @js.native
        val grants: GrantsResource = js.native
        
        @JSGlobal("gapi.client.androidpublisher.inappproducts")
        @js.native
        val inappproducts: InappproductsResource = js.native
        
        @JSGlobal("gapi.client.androidpublisher.internalappsharingartifacts")
        @js.native
        val internalappsharingartifacts: InternalappsharingartifactsResource = js.native
        
        @JSGlobal("gapi.client.androidpublisher.monetization")
        @js.native
        val monetization: MonetizationResource = js.native
        
        @JSGlobal("gapi.client.androidpublisher.orders")
        @js.native
        val orders: OrdersResource = js.native
        
        @JSGlobal("gapi.client.androidpublisher.purchases")
        @js.native
        val purchases: PurchasesResource = js.native
        
        @JSGlobal("gapi.client.androidpublisher.reviews")
        @js.native
        val reviews: ReviewsResource = js.native
        
        @JSGlobal("gapi.client.androidpublisher.systemapks")
        @js.native
        val systemapks: SystemapksResource = js.native
        
        @JSGlobal("gapi.client.androidpublisher.users")
        @js.native
        val users: UsersResource = js.native
      }
      
      /** Load Google Play Android Developer API v3 */
      inline def load(name: androidpublisher, version: v3): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: androidpublisher, version: v3, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
