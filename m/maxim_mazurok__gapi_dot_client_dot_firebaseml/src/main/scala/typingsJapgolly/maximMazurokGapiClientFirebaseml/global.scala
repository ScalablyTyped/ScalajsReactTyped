package typingsJapgolly.maximMazurokGapiClientFirebaseml

import typingsJapgolly.maximMazurokGapiClientFirebaseml.gapi.client.firebaseml.OperationsResource
import typingsJapgolly.maximMazurokGapiClientFirebaseml.maximMazurokGapiClientFirebasemlStrings.firebaseml
import typingsJapgolly.maximMazurokGapiClientFirebaseml.maximMazurokGapiClientFirebasemlStrings.v1
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
      
      object firebaseml {
        
        @JSGlobal("gapi.client.firebaseml.operations")
        @js.native
        val operations: OperationsResource = js.native
      }
      
      /** Load Firebase ML API v1 */
      inline def load(name: firebaseml, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: firebaseml, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
