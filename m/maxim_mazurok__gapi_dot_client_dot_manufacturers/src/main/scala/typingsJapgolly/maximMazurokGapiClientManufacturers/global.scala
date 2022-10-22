package typingsJapgolly.maximMazurokGapiClientManufacturers

import typingsJapgolly.maximMazurokGapiClientManufacturers.gapi.client.manufacturers.AccountsResource
import typingsJapgolly.maximMazurokGapiClientManufacturers.maximMazurokGapiClientManufacturersStrings.manufacturers
import typingsJapgolly.maximMazurokGapiClientManufacturers.maximMazurokGapiClientManufacturersStrings.v1
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
      
      /** Load Manufacturer Center API v1 */
      inline def load(name: manufacturers, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: manufacturers, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object manufacturers {
        
        @JSGlobal("gapi.client.manufacturers.accounts")
        @js.native
        val accounts: AccountsResource = js.native
      }
    }
  }
}
