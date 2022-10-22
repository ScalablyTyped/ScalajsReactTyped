package typingsJapgolly.maximMazurokGapiClientPrivateca

import typingsJapgolly.maximMazurokGapiClientPrivateca.gapi.client.privateca.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientPrivateca.maximMazurokGapiClientPrivatecaStrings.privateca
import typingsJapgolly.maximMazurokGapiClientPrivateca.maximMazurokGapiClientPrivatecaStrings.v1
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
      
      /** Load Certificate Authority API v1 */
      inline def load(name: privateca, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: privateca, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object privateca {
        
        @JSGlobal("gapi.client.privateca.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
