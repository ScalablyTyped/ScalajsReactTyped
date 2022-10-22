package typingsJapgolly.maximMazurokGapiClientWebfonts

import typingsJapgolly.maximMazurokGapiClientWebfonts.gapi.client.webfonts.WebfontsResource
import typingsJapgolly.maximMazurokGapiClientWebfonts.maximMazurokGapiClientWebfontsStrings.v1
import typingsJapgolly.maximMazurokGapiClientWebfonts.maximMazurokGapiClientWebfontsStrings.webfonts
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
      
      /** Load Web Fonts Developer API v1 */
      inline def load(name: webfonts, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: webfonts, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object webfonts {
        
        @JSGlobal("gapi.client.webfonts.webfonts")
        @js.native
        val webfonts: WebfontsResource = js.native
      }
    }
  }
}
