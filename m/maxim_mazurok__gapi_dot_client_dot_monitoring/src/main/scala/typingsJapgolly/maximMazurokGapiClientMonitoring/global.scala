package typingsJapgolly.maximMazurokGapiClientMonitoring

import typingsJapgolly.maximMazurokGapiClientMonitoring.gapi.client.monitoring.FoldersResource
import typingsJapgolly.maximMazurokGapiClientMonitoring.gapi.client.monitoring.OrganizationsResource
import typingsJapgolly.maximMazurokGapiClientMonitoring.gapi.client.monitoring.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientMonitoring.gapi.client.monitoring.ServicesResource
import typingsJapgolly.maximMazurokGapiClientMonitoring.gapi.client.monitoring.UptimeCheckIpsResource
import typingsJapgolly.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.monitoring
import typingsJapgolly.maximMazurokGapiClientMonitoring.maximMazurokGapiClientMonitoringStrings.v3
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
      
      /** Load Cloud Monitoring API v3 */
      inline def load(name: monitoring, version: v3): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: monitoring, version: v3, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object monitoring {
        
        @JSGlobal("gapi.client.monitoring.folders")
        @js.native
        val folders: FoldersResource = js.native
        
        @JSGlobal("gapi.client.monitoring.organizations")
        @js.native
        val organizations: OrganizationsResource = js.native
        
        @JSGlobal("gapi.client.monitoring.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.monitoring.services")
        @js.native
        val services: ServicesResource = js.native
        
        @JSGlobal("gapi.client.monitoring.uptimeCheckIps")
        @js.native
        val uptimeCheckIps: UptimeCheckIpsResource = js.native
      }
    }
  }
}
