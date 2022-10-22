package typingsJapgolly.maximMazurokGapiClientContainer

import typingsJapgolly.maximMazurokGapiClientContainer.gapi.client.container.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.container
import typingsJapgolly.maximMazurokGapiClientContainer.maximMazurokGapiClientContainerStrings.v1
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
      
      object container {
        
        @JSGlobal("gapi.client.container.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Kubernetes Engine API v1 */
      inline def load(name: container, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: container, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
