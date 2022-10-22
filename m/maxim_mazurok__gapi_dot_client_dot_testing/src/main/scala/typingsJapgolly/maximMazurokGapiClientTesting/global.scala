package typingsJapgolly.maximMazurokGapiClientTesting

import typingsJapgolly.maximMazurokGapiClientTesting.gapi.client.testing.ApplicationDetailServiceResource
import typingsJapgolly.maximMazurokGapiClientTesting.gapi.client.testing.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientTesting.gapi.client.testing.TestEnvironmentCatalogResource
import typingsJapgolly.maximMazurokGapiClientTesting.maximMazurokGapiClientTestingStrings.testing
import typingsJapgolly.maximMazurokGapiClientTesting.maximMazurokGapiClientTestingStrings.v1
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
      
      /** Load Cloud Testing API v1 */
      inline def load(name: testing, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: testing, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object testing {
        
        @JSGlobal("gapi.client.testing.applicationDetailService")
        @js.native
        val applicationDetailService: ApplicationDetailServiceResource = js.native
        
        @JSGlobal("gapi.client.testing.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.testing.testEnvironmentCatalog")
        @js.native
        val testEnvironmentCatalog: TestEnvironmentCatalogResource = js.native
      }
    }
  }
}
