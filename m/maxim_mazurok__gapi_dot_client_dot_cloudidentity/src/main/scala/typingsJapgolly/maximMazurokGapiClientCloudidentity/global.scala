package typingsJapgolly.maximMazurokGapiClientCloudidentity

import typingsJapgolly.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity.CustomersResource
import typingsJapgolly.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity.DevicesResource
import typingsJapgolly.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity.GroupsResource
import typingsJapgolly.maximMazurokGapiClientCloudidentity.maximMazurokGapiClientCloudidentityStrings.cloudidentity
import typingsJapgolly.maximMazurokGapiClientCloudidentity.maximMazurokGapiClientCloudidentityStrings.v1
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
      
      object cloudidentity {
        
        @JSGlobal("gapi.client.cloudidentity.customers")
        @js.native
        val customers: CustomersResource = js.native
        
        @JSGlobal("gapi.client.cloudidentity.devices")
        @js.native
        val devices: DevicesResource = js.native
        
        @JSGlobal("gapi.client.cloudidentity.groups")
        @js.native
        val groups: GroupsResource = js.native
      }
      
      /** Load Cloud Identity API v1 */
      inline def load(name: cloudidentity, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: cloudidentity, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
