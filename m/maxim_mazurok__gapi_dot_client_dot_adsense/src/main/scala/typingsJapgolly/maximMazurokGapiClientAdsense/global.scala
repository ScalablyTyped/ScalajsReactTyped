package typingsJapgolly.maximMazurokGapiClientAdsense

import typingsJapgolly.maximMazurokGapiClientAdsense.gapi.client.adsense.AccountsResource
import typingsJapgolly.maximMazurokGapiClientAdsense.maximMazurokGapiClientAdsenseStrings.adsense
import typingsJapgolly.maximMazurokGapiClientAdsense.maximMazurokGapiClientAdsenseStrings.v2
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
      
      object adsense {
        
        @JSGlobal("gapi.client.adsense.accounts")
        @js.native
        val accounts: AccountsResource = js.native
      }
      
      /** Load AdSense Management API v2 */
      inline def load(name: adsense, version: v2): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: adsense, version: v2, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
