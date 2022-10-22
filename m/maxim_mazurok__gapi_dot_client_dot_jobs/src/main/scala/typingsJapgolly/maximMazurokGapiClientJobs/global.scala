package typingsJapgolly.maximMazurokGapiClientJobs

import typingsJapgolly.maximMazurokGapiClientJobs.gapi.client.jobs.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.jobs
import typingsJapgolly.maximMazurokGapiClientJobs.maximMazurokGapiClientJobsStrings.v4
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
      
      object jobs {
        
        @JSGlobal("gapi.client.jobs.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Talent Solution API v4 */
      inline def load(name: jobs, version: v4): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: jobs, version: v4, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
