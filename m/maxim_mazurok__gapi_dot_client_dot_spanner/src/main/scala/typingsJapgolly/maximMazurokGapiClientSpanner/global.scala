package typingsJapgolly.maximMazurokGapiClientSpanner

import typingsJapgolly.maximMazurokGapiClientSpanner.gapi.client.spanner.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientSpanner.gapi.client.spanner.ScansResource
import typingsJapgolly.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.spanner
import typingsJapgolly.maximMazurokGapiClientSpanner.maximMazurokGapiClientSpannerStrings.v1
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
      
      /** Load Cloud Spanner API v1 */
      inline def load(name: spanner, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: spanner, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object spanner {
        
        @JSGlobal("gapi.client.spanner.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.spanner.scans")
        @js.native
        val scans: ScansResource = js.native
      }
    }
  }
}
