package typingsJapgolly.maximMazurokGapiClientAndroiddeviceprovisioning

import typingsJapgolly.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning.CustomersResource
import typingsJapgolly.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning.OperationsResource
import typingsJapgolly.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning.PartnersResource
import typingsJapgolly.maximMazurokGapiClientAndroiddeviceprovisioning.maximMazurokGapiClientAndroiddeviceprovisioningStrings.androiddeviceprovisioning
import typingsJapgolly.maximMazurokGapiClientAndroiddeviceprovisioning.maximMazurokGapiClientAndroiddeviceprovisioningStrings.v1
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
      
      object androiddeviceprovisioning {
        
        @JSGlobal("gapi.client.androiddeviceprovisioning.customers")
        @js.native
        val customers: CustomersResource = js.native
        
        @JSGlobal("gapi.client.androiddeviceprovisioning.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.androiddeviceprovisioning.partners")
        @js.native
        val partners: PartnersResource = js.native
      }
      
      /** Load Android Device Provisioning Partner API v1 */
      inline def load(name: androiddeviceprovisioning, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: androiddeviceprovisioning, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
