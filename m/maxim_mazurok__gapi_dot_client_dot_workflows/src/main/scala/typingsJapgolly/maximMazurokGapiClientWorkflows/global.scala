package typingsJapgolly.maximMazurokGapiClientWorkflows

import typingsJapgolly.maximMazurokGapiClientWorkflows.gapi.client.workflows.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientWorkflows.maximMazurokGapiClientWorkflowsStrings.v1
import typingsJapgolly.maximMazurokGapiClientWorkflows.maximMazurokGapiClientWorkflowsStrings.workflows
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
      
      /** Load Workflows API v1 */
      inline def load(name: workflows, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: workflows, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object workflows {
        
        @JSGlobal("gapi.client.workflows.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
