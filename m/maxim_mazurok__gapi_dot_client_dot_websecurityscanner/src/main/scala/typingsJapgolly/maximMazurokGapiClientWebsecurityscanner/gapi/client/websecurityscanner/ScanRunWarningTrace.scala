package typingsJapgolly.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanRunWarningTrace extends StObject {
  
  /** Output only. Indicates the warning code. */
  var code: js.UndefOr[String] = js.undefined
}
object ScanRunWarningTrace {
  
  inline def apply(): ScanRunWarningTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanRunWarningTrace]
  }
  
  extension [Self <: ScanRunWarningTrace](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
