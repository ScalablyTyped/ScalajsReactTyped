package typingsJapgolly.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2InspectContentResponse extends StObject {
  
  /** The findings. */
  var result: js.UndefOr[GooglePrivacyDlpV2InspectResult] = js.undefined
}
object GooglePrivacyDlpV2InspectContentResponse {
  
  inline def apply(): GooglePrivacyDlpV2InspectContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InspectContentResponse]
  }
  
  extension [Self <: GooglePrivacyDlpV2InspectContentResponse](x: Self) {
    
    inline def setResult(value: GooglePrivacyDlpV2InspectResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
