package typingsJapgolly.maximMazurokGapiClientDatafusion

import typingsJapgolly.maximMazurokGapiClientDatafusion.gapi.client.datafusion.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientDatafusion.maximMazurokGapiClientDatafusionStrings.datafusion
import typingsJapgolly.maximMazurokGapiClientDatafusion.maximMazurokGapiClientDatafusionStrings.v1
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
      
      object datafusion {
        
        @JSGlobal("gapi.client.datafusion.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Data Fusion API v1 */
      inline def load(name: datafusion, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: datafusion, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
