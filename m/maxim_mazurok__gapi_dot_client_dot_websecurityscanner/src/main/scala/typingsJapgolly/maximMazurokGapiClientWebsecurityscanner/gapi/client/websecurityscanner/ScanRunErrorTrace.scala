package typingsJapgolly.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanRunErrorTrace extends StObject {
  
  /** Output only. Indicates the error reason code. */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. If the scan encounters TOO_MANY_HTTP_ERRORS, this field indicates the most common HTTP error code, if such is available. For example, if this code is 404, the scan has
    * encountered too many NOT_FOUND responses.
    */
  var mostCommonHttpErrorCode: js.UndefOr[Double] = js.undefined
  
  /**
    * Output only. If the scan encounters SCAN_CONFIG_ISSUE error, this field has the error message encountered during scan configuration validation that is performed before each scan
    * run.
    */
  var scanConfigError: js.UndefOr[ScanConfigError] = js.undefined
}
object ScanRunErrorTrace {
  
  inline def apply(): ScanRunErrorTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanRunErrorTrace]
  }
  
  extension [Self <: ScanRunErrorTrace](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMostCommonHttpErrorCode(value: Double): Self = StObject.set(x, "mostCommonHttpErrorCode", value.asInstanceOf[js.Any])
    
    inline def setMostCommonHttpErrorCodeUndefined: Self = StObject.set(x, "mostCommonHttpErrorCode", js.undefined)
    
    inline def setScanConfigError(value: ScanConfigError): Self = StObject.set(x, "scanConfigError", value.asInstanceOf[js.Any])
    
    inline def setScanConfigErrorUndefined: Self = StObject.set(x, "scanConfigError", js.undefined)
  }
}
