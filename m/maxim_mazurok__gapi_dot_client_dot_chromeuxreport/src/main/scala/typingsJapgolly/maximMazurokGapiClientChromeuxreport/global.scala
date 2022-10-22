package typingsJapgolly.maximMazurokGapiClientChromeuxreport

import typingsJapgolly.maximMazurokGapiClientChromeuxreport.gapi.client.chromeuxreport.RecordsResource
import typingsJapgolly.maximMazurokGapiClientChromeuxreport.maximMazurokGapiClientChromeuxreportStrings.chromeuxreport
import typingsJapgolly.maximMazurokGapiClientChromeuxreport.maximMazurokGapiClientChromeuxreportStrings.v1
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
      
      object chromeuxreport {
        
        @JSGlobal("gapi.client.chromeuxreport.records")
        @js.native
        val records: RecordsResource = js.native
      }
      
      /** Load Chrome UX Report API v1 */
      inline def load(name: chromeuxreport, version: v1): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: chromeuxreport, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
