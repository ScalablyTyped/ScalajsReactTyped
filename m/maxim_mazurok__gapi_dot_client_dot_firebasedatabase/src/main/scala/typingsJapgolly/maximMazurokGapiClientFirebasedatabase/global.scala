package typingsJapgolly.maximMazurokGapiClientFirebasedatabase

import typingsJapgolly.maximMazurokGapiClientFirebasedatabase.gapi.client.firebasedatabase.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientFirebasedatabase.maximMazurokGapiClientFirebasedatabaseStrings.firebasedatabase
import typingsJapgolly.maximMazurokGapiClientFirebasedatabase.maximMazurokGapiClientFirebasedatabaseStrings.v1beta
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
      
      object firebasedatabase {
        
        @JSGlobal("gapi.client.firebasedatabase.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Firebase Realtime Database Management API v1beta */
      inline def load(name: firebasedatabase, version: v1beta): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: firebasedatabase, version: v1beta, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
