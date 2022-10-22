package typingsJapgolly.maximMazurokGapiClientDatalabeling

import typingsJapgolly.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientDatalabeling.maximMazurokGapiClientDatalabelingStrings.datalabeling
import typingsJapgolly.maximMazurokGapiClientDatalabeling.maximMazurokGapiClientDatalabelingStrings.v1beta1
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
      
      object datalabeling {
        
        @JSGlobal("gapi.client.datalabeling.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Data Labeling API v1beta1 */
      inline def load(name: datalabeling, version: v1beta1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: datalabeling, version: v1beta1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
