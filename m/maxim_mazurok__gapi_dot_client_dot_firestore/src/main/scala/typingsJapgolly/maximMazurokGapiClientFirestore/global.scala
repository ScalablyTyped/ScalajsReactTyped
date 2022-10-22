package typingsJapgolly.maximMazurokGapiClientFirestore

import typingsJapgolly.maximMazurokGapiClientFirestore.gapi.client.firestore.ProjectsResource
import typingsJapgolly.maximMazurokGapiClientFirestore.maximMazurokGapiClientFirestoreStrings.firestore
import typingsJapgolly.maximMazurokGapiClientFirestore.maximMazurokGapiClientFirestoreStrings.v1
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
      
      object firestore {
        
        @JSGlobal("gapi.client.firestore.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
      
      /** Load Cloud Firestore API v1 */
      inline def load(name: firestore, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: firestore, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
