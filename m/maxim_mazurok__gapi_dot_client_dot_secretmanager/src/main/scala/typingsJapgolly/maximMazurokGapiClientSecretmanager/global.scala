package typingsJapgolly.maximMazurokGapiClientSecretmanager

import typingsJapgolly.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientSecretmanager.maximMazurokGapiClientSecretmanagerStrings.secretmanager
import typingsJapgolly.maximMazurokGapiClientSecretmanager.maximMazurokGapiClientSecretmanagerStrings.v1
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
      
      /** Load Secret Manager API v1 */
      inline def load(name: secretmanager, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: secretmanager, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object secretmanager {
        
        @JSGlobal("gapi.client.secretmanager.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
