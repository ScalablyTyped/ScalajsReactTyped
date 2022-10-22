package typingsJapgolly.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2SummaryResult extends StObject {
  
  /** Outcome of the transformation. */
  var code: js.UndefOr[String] = js.undefined
  
  /** Number of transformations counted by this result. */
  var count: js.UndefOr[String] = js.undefined
  
  /** A place for warnings or errors to show up if a transformation didn't work as expected. */
  var details: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2SummaryResult {
  
  inline def apply(): GooglePrivacyDlpV2SummaryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2SummaryResult]
  }
  
  extension [Self <: GooglePrivacyDlpV2SummaryResult](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
  }
}
