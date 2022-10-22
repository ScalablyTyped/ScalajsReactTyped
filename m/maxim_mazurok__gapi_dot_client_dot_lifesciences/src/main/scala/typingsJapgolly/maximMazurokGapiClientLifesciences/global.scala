package typingsJapgolly.maximMazurokGapiClientLifesciences

import typingsJapgolly.maximMazurokGapiClientLifesciences.gapi.client.lifesciences.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientLifesciences.maximMazurokGapiClientLifesciencesStrings.lifesciences
import typingsJapgolly.maximMazurokGapiClientLifesciences.maximMazurokGapiClientLifesciencesStrings.v2beta
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
      
      object lifesciences {
        
        @JSGlobal("gapi.client.lifesciences.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Life Sciences API v2beta */
      inline def load(name: lifesciences, version: v2beta): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: lifesciences, version: v2beta, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
