package typingsJapgolly.maximMazurokGapiClientGroupssettings

import typingsJapgolly.maximMazurokGapiClientGroupssettings.gapi.client.groupssettings.GroupsResource
import typingsJapgolly.maximMazurokGapiClientGroupssettings.maximMazurokGapiClientGroupssettingsStrings.groupssettings
import typingsJapgolly.maximMazurokGapiClientGroupssettings.maximMazurokGapiClientGroupssettingsStrings.v1
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
      
      object groupssettings {
        
        @JSGlobal("gapi.client.groupssettings.groups")
        @js.native
        val groups: GroupsResource = js.native
      }
      
      /** Load Groups Settings API v1 */
      inline def load(name: groupssettings, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: groupssettings, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
