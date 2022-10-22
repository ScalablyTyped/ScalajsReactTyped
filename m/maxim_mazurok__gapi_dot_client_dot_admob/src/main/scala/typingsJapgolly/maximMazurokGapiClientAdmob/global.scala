package typingsJapgolly.maximMazurokGapiClientAdmob

import typingsJapgolly.maximMazurokGapiClientAdmob.gapi.client.admob.AccountsResource
import typingsJapgolly.maximMazurokGapiClientAdmob.maximMazurokGapiClientAdmobStrings.admob
import typingsJapgolly.maximMazurokGapiClientAdmob.maximMazurokGapiClientAdmobStrings.v1
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
      
      object admob {
        
        @JSGlobal("gapi.client.admob.accounts")
        @js.native
        val accounts: AccountsResource = js.native
      }
      
      /** Load AdMob API v1 */
      inline def load(name: admob, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: admob, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
