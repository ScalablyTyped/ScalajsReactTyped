package typingsJapgolly.maximMazurokGapiClientSecuritycenter

import typingsJapgolly.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter.FoldersResource
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter.OrganizationsResource
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.maximMazurokGapiClientSecuritycenterStrings.securitycenter
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.maximMazurokGapiClientSecuritycenterStrings.v1
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
      
      /** Load Security Command Center API v1 */
      inline def load(name: securitycenter, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: securitycenter, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object securitycenter {
        
        @JSGlobal("gapi.client.securitycenter.folders")
        @js.native
        val folders: FoldersResource = js.native
        
        @JSGlobal("gapi.client.securitycenter.organizations")
        @js.native
        val organizations: OrganizationsResource = js.native
        
        @JSGlobal("gapi.client.securitycenter.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
