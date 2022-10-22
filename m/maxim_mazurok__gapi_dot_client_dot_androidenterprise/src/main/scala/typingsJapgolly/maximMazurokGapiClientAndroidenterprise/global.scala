package typingsJapgolly.maximMazurokGapiClientAndroidenterprise

import typingsJapgolly.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.DevicesResource
import typingsJapgolly.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.EnterprisesResource
import typingsJapgolly.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.EntitlementsResource
import typingsJapgolly.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.GrouplicensesResource
import typingsJapgolly.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.GrouplicenseusersResource
import typingsJapgolly.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.InstallsResource
import typingsJapgolly.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.ManagedconfigurationsfordeviceResource
import typingsJapgolly.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.ManagedconfigurationsforuserResource
import typingsJapgolly.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.ManagedconfigurationssettingsResource
import typingsJapgolly.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.PermissionsResource
import typingsJapgolly.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.ProductsResource
import typingsJapgolly.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.ServiceaccountkeysResource
import typingsJapgolly.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.StorelayoutclustersResource
import typingsJapgolly.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.StorelayoutpagesResource
import typingsJapgolly.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.UsersResource
import typingsJapgolly.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise.WebappsResource
import typingsJapgolly.maximMazurokGapiClientAndroidenterprise.maximMazurokGapiClientAndroidenterpriseStrings.androidenterprise
import typingsJapgolly.maximMazurokGapiClientAndroidenterprise.maximMazurokGapiClientAndroidenterpriseStrings.v1
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
      
      object androidenterprise {
        
        @JSGlobal("gapi.client.androidenterprise.devices")
        @js.native
        val devices: DevicesResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.enterprises")
        @js.native
        val enterprises: EnterprisesResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.entitlements")
        @js.native
        val entitlements: EntitlementsResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.grouplicenses")
        @js.native
        val grouplicenses: GrouplicensesResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.grouplicenseusers")
        @js.native
        val grouplicenseusers: GrouplicenseusersResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.installs")
        @js.native
        val installs: InstallsResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.managedconfigurationsfordevice")
        @js.native
        val managedconfigurationsfordevice: ManagedconfigurationsfordeviceResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.managedconfigurationsforuser")
        @js.native
        val managedconfigurationsforuser: ManagedconfigurationsforuserResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.managedconfigurationssettings")
        @js.native
        val managedconfigurationssettings: ManagedconfigurationssettingsResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.permissions")
        @js.native
        val permissions: PermissionsResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.products")
        @js.native
        val products: ProductsResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.serviceaccountkeys")
        @js.native
        val serviceaccountkeys: ServiceaccountkeysResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.storelayoutclusters")
        @js.native
        val storelayoutclusters: StorelayoutclustersResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.storelayoutpages")
        @js.native
        val storelayoutpages: StorelayoutpagesResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.users")
        @js.native
        val users: UsersResource = js.native
        
        @JSGlobal("gapi.client.androidenterprise.webapps")
        @js.native
        val webapps: WebappsResource = js.native
      }
      
      /** Load Google Play EMM API v1 */
      inline def load(name: androidenterprise, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: androidenterprise, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
