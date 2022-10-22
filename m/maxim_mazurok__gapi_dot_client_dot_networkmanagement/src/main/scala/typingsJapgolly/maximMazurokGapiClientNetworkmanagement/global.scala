package typingsJapgolly.maximMazurokGapiClientNetworkmanagement

import typingsJapgolly.maximMazurokGapiClientNetworkmanagement.gapi.client.networkmanagement.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientNetworkmanagement.maximMazurokGapiClientNetworkmanagementStrings.networkmanagement
import typingsJapgolly.maximMazurokGapiClientNetworkmanagement.maximMazurokGapiClientNetworkmanagementStrings.v1
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
      
      /** Load Network Management API v1 */
      inline def load(name: networkmanagement, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: networkmanagement, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object networkmanagement {
        
        @JSGlobal("gapi.client.networkmanagement.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
