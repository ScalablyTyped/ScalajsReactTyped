package typingsJapgolly.maximMazurokGapiClientSasportal

import typingsJapgolly.maximMazurokGapiClientSasportal.gapi.client.sasportal.CustomersResource
import typingsJapgolly.maximMazurokGapiClientSasportal.gapi.client.sasportal.DeploymentsResource
import typingsJapgolly.maximMazurokGapiClientSasportal.gapi.client.sasportal.InstallerResource
import typingsJapgolly.maximMazurokGapiClientSasportal.gapi.client.sasportal.NodesResource
import typingsJapgolly.maximMazurokGapiClientSasportal.gapi.client.sasportal.PoliciesResource
import typingsJapgolly.maximMazurokGapiClientSasportal.maximMazurokGapiClientSasportalStrings.sasportal
import typingsJapgolly.maximMazurokGapiClientSasportal.maximMazurokGapiClientSasportalStrings.v1alpha1
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
      
      /** Load SAS Portal API v1alpha1 */
      inline def load(name: sasportal, version: v1alpha1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: sasportal, version: v1alpha1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object sasportal {
        
        @JSGlobal("gapi.client.sasportal.customers")
        @js.native
        val customers: CustomersResource = js.native
        
        @JSGlobal("gapi.client.sasportal.deployments")
        @js.native
        val deployments: DeploymentsResource = js.native
        
        @JSGlobal("gapi.client.sasportal.installer")
        @js.native
        val installer: InstallerResource = js.native
        
        @JSGlobal("gapi.client.sasportal.nodes")
        @js.native
        val nodes: NodesResource = js.native
        
        @JSGlobal("gapi.client.sasportal.policies")
        @js.native
        val policies: PoliciesResource = js.native
      }
    }
  }
}
