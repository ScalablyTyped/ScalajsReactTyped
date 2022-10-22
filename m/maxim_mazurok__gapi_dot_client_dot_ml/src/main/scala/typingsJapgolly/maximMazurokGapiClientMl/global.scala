package typingsJapgolly.maximMazurokGapiClientMl

import typingsJapgolly.maximMazurokGapiClientMl.gapi.client.ml.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientMl.maximMazurokGapiClientMlStrings.ml
import typingsJapgolly.maximMazurokGapiClientMl.maximMazurokGapiClientMlStrings.v1
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
      
      /** Load AI Platform Training & Prediction API v1 */
      inline def load(name: ml, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: ml, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object ml {
        
        @JSGlobal("gapi.client.ml.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
