package typingsJapgolly.maximMazurokGapiClientClouderrorreporting

import typingsJapgolly.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientClouderrorreporting.maximMazurokGapiClientClouderrorreportingStrings.clouderrorreporting
import typingsJapgolly.maximMazurokGapiClientClouderrorreporting.maximMazurokGapiClientClouderrorreportingStrings.v1beta1
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
      
      object clouderrorreporting {
        
        @JSGlobal("gapi.client.clouderrorreporting.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Error Reporting API v1beta1 */
      inline def load(name: clouderrorreporting, version: v1beta1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: clouderrorreporting, version: v1beta1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
