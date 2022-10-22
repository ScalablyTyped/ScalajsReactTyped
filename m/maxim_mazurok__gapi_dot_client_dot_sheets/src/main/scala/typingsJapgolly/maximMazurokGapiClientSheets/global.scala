package typingsJapgolly.maximMazurokGapiClientSheets

import typingsJapgolly.maximMazurokGapiClientSheets.gapi.client.sheets.SpreadsheetsResource
import typingsJapgolly.maximMazurokGapiClientSheets.maximMazurokGapiClientSheetsStrings.sheets
import typingsJapgolly.maximMazurokGapiClientSheets.maximMazurokGapiClientSheetsStrings.v4
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
      
      /** Load Google Sheets API v4 */
      inline def load(name: sheets, version: v4): PromiseLike[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[PromiseLike[Unit]]
      inline def load(name: sheets, version: v4, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object sheets {
        
        @JSGlobal("gapi.client.sheets.spreadsheets")
        @js.native
        val spreadsheets: SpreadsheetsResource = js.native
      }
    }
  }
}
