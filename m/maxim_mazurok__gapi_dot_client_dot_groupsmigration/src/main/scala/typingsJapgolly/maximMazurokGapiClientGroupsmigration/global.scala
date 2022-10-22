package typingsJapgolly.maximMazurokGapiClientGroupsmigration

import typingsJapgolly.maximMazurokGapiClientGroupsmigration.gapi.client.groupsmigration.ArchiveResource
import typingsJapgolly.maximMazurokGapiClientGroupsmigration.maximMazurokGapiClientGroupsmigrationStrings.groupsmigration
import typingsJapgolly.maximMazurokGapiClientGroupsmigration.maximMazurokGapiClientGroupsmigrationStrings.v1
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
      
      object groupsmigration {
        
        @JSGlobal("gapi.client.groupsmigration.archive")
        @js.native
        val archive: ArchiveResource = js.native
      }
      
      /** Load Groups Migration API v1 */
      inline def load(name: groupsmigration, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: groupsmigration, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
