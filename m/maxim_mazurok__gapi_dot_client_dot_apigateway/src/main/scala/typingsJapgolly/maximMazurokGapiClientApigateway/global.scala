package typingsJapgolly.maximMazurokGapiClientApigateway

import typingsJapgolly.maximMazurokGapiClientApigateway.gapi.client.apigateway.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientApigateway.maximMazurokGapiClientApigatewayStrings.apigateway
import typingsJapgolly.maximMazurokGapiClientApigateway.maximMazurokGapiClientApigatewayStrings.v1
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
      
      object apigateway {
        
        @JSGlobal("gapi.client.apigateway.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load API Gateway API v1 */
      inline def load(name: apigateway, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: apigateway, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
