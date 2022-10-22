package typingsJapgolly.maximMazurokGapiClientManagedidentities

import typingsJapgolly.maximMazurokGapiClientManagedidentities.gapi.client.managedidentities.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientManagedidentities.maximMazurokGapiClientManagedidentitiesStrings.managedidentities
import typingsJapgolly.maximMazurokGapiClientManagedidentities.maximMazurokGapiClientManagedidentitiesStrings.v1
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
      
      /** Load Managed Service for Microsoft Active Directory API v1 */
      inline def load(name: managedidentities, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: managedidentities, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object managedidentities {
        
        @JSGlobal("gapi.client.managedidentities.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
