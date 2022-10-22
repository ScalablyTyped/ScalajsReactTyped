package typingsJapgolly.maximMazurokGapiClientAlertcenter

import typingsJapgolly.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter.AlertsResource
import typingsJapgolly.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter.V1beta1Resource
import typingsJapgolly.maximMazurokGapiClientAlertcenter.maximMazurokGapiClientAlertcenterStrings.alertcenter
import typingsJapgolly.maximMazurokGapiClientAlertcenter.maximMazurokGapiClientAlertcenterStrings.v1beta1
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
      
      object alertcenter {
        
        @JSGlobal("gapi.client.alertcenter.alerts")
        @js.native
        val alerts: AlertsResource = js.native
        
        @JSGlobal("gapi.client.alertcenter.v1beta1")
        @js.native
        val v1beta1: V1beta1Resource = js.native
      }
      
      /** Load Google Workspace Alert Center API v1beta1 */
      inline def load(name: alertcenter, version: v1beta1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: alertcenter, version: v1beta1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
