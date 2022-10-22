package typingsJapgolly.maximMazurokGapiClientWebsecurityscanner

import typingsJapgolly.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientWebsecurityscanner.maximMazurokGapiClientWebsecurityscannerStrings.v1
import typingsJapgolly.maximMazurokGapiClientWebsecurityscanner.maximMazurokGapiClientWebsecurityscannerStrings.websecurityscanner
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
      
      /** Load Web Security Scanner API v1 */
      inline def load(name: websecurityscanner, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: websecurityscanner, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object websecurityscanner {
        
        @JSGlobal("gapi.client.websecurityscanner.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
