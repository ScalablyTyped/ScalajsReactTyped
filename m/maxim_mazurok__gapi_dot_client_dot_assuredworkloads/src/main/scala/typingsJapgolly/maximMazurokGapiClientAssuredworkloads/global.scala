package typingsJapgolly.maximMazurokGapiClientAssuredworkloads

import typingsJapgolly.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads.OrganizationsResource
import typingsJapgolly.maximMazurokGapiClientAssuredworkloads.maximMazurokGapiClientAssuredworkloadsStrings.assuredworkloads
import typingsJapgolly.maximMazurokGapiClientAssuredworkloads.maximMazurokGapiClientAssuredworkloadsStrings.v1
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
      
      object assuredworkloads {
        
        @JSGlobal("gapi.client.assuredworkloads.organizations")
        @js.native
        val organizations: OrganizationsResource = js.native
      }
      
      /** Load Assured Workloads API v1 */
      inline def load(name: assuredworkloads, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: assuredworkloads, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
