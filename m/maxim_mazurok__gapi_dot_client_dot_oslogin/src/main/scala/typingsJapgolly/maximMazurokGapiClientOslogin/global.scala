package typingsJapgolly.maximMazurokGapiClientOslogin

import typingsJapgolly.maximMazurokGapiClientOslogin.gapi.client.oslogin.UsersResource
import typingsJapgolly.maximMazurokGapiClientOslogin.maximMazurokGapiClientOsloginStrings.oslogin
import typingsJapgolly.maximMazurokGapiClientOslogin.maximMazurokGapiClientOsloginStrings.v1
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
      
      /** Load Cloud OS Login API v1 */
      inline def load(name: oslogin, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: oslogin, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object oslogin {
        
        @JSGlobal("gapi.client.oslogin.users")
        @js.native
        val users: UsersResource = js.native
      }
    }
  }
}
