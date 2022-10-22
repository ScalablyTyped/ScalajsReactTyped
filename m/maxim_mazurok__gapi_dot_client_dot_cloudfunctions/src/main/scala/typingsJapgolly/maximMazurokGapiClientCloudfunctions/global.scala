package typingsJapgolly.maximMazurokGapiClientCloudfunctions

import typingsJapgolly.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientCloudfunctions.maximMazurokGapiClientCloudfunctionsStrings.cloudfunctions
import typingsJapgolly.maximMazurokGapiClientCloudfunctions.maximMazurokGapiClientCloudfunctionsStrings.v2
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
      
      object cloudfunctions {
        
        @JSGlobal("gapi.client.cloudfunctions.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Functions API v2 */
      inline def load(name: cloudfunctions, version: v2): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: cloudfunctions, version: v2, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
