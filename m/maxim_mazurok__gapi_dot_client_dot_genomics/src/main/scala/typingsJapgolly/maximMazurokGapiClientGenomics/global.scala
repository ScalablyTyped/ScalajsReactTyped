package typingsJapgolly.maximMazurokGapiClientGenomics

import typingsJapgolly.maximMazurokGapiClientGenomics.gapi.client.genomics.PipelinesResource
import typingsJapgolly.maximMazurokGapiClientGenomics.gapi.client.genomics.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientGenomics.gapi.client.genomics.WorkersResource
import typingsJapgolly.maximMazurokGapiClientGenomics.maximMazurokGapiClientGenomicsStrings.genomics
import typingsJapgolly.maximMazurokGapiClientGenomics.maximMazurokGapiClientGenomicsStrings.v2alpha1
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
      
      object genomics {
        
        @JSGlobal("gapi.client.genomics.pipelines")
        @js.native
        val pipelines: PipelinesResource = js.native
        
        @JSGlobal("gapi.client.genomics.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.genomics.workers")
        @js.native
        val workers: WorkersResource = js.native
      }
      
      /** Load Genomics API v2alpha1 */
      inline def load(name: genomics, version: v2alpha1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: genomics, version: v2alpha1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
