package typingsJapgolly.chromeApps.WebView

import typingsJapgolly.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options that determine what data should be cleared by *clearData* */
trait ClearDataOptions extends StObject {
  
  /**
    * Clear data accumulated on or after this date,
    * represented in milliseconds since the epoch
    * (accessible via the getTime method of the JavaScript Date object).
    * If absent, defaults to 0 (which would remove all browsing data).
    * @default 0
    */
  var since: js.UndefOr[integer] = js.undefined
}
object ClearDataOptions {
  
  inline def apply(): ClearDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearDataOptions]
  }
  
  extension [Self <: ClearDataOptions](x: Self) {
    
    inline def setSince(value: integer): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
  }
}
