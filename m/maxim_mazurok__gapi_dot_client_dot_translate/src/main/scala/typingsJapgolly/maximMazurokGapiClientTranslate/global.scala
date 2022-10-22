package typingsJapgolly.maximMazurokGapiClientTranslate

import typingsJapgolly.maximMazurokGapiClientTranslate.gapi.client.translate.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.translate
import typingsJapgolly.maximMazurokGapiClientTranslate.maximMazurokGapiClientTranslateStrings.v3
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
      
      /** Load Cloud Translation API v3 */
      inline def load(name: translate, version: v3): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: translate, version: v3, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object translate {
        
        @JSGlobal("gapi.client.translate.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
