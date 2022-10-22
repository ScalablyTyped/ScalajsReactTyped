package typingsJapgolly.maximMazurokGapiClientRun

import typingsJapgolly.maximMazurokGapiClientRun.gapi.client.run.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.run
import typingsJapgolly.maximMazurokGapiClientRun.maximMazurokGapiClientRunStrings.v2
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
      
      /** Load Cloud Run Admin API v2 */
      inline def load(name: run, version: v2): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: run, version: v2, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object run {
        
        @JSGlobal("gapi.client.run.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
