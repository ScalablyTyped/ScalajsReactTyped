package typingsJapgolly.maximMazurokGapiClientFirebase

import typingsJapgolly.maximMazurokGapiClientFirebase.gapi.client.firebase.AvailableProjectsResource
import typingsJapgolly.maximMazurokGapiClientFirebase.gapi.client.firebase.OperationsResource
import typingsJapgolly.maximMazurokGapiClientFirebase.gapi.client.firebase.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientFirebase.maximMazurokGapiClientFirebaseStrings.firebase
import typingsJapgolly.maximMazurokGapiClientFirebase.maximMazurokGapiClientFirebaseStrings.v1beta1
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
      
      object firebase {
        
        @JSGlobal("gapi.client.firebase.availableProjects")
        @js.native
        val availableProjects: AvailableProjectsResource = js.native
        
        @JSGlobal("gapi.client.firebase.operations")
        @js.native
        val operations: OperationsResource = js.native
        
        @JSGlobal("gapi.client.firebase.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Firebase Management API v1beta1 */
      inline def load(name: firebase, version: v1beta1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: firebase, version: v1beta1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
