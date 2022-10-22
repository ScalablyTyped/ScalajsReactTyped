package typingsJapgolly.maximMazurokGapiClientBillingbudgets

import typingsJapgolly.maximMazurokGapiClientBillingbudgets.gapi.client.billingbudgets.BillingAccountsResource
import typingsJapgolly.maximMazurokGapiClientBillingbudgets.maximMazurokGapiClientBillingbudgetsStrings.billingbudgets
import typingsJapgolly.maximMazurokGapiClientBillingbudgets.maximMazurokGapiClientBillingbudgetsStrings.v1
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
      
      object billingbudgets {
        
        @JSGlobal("gapi.client.billingbudgets.billingAccounts")
        @js.native
        val billingAccounts: BillingAccountsResource = js.native
      }
      
      /** Load Cloud Billing Budget API v1 */
      inline def load(name: billingbudgets, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: billingbudgets, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
