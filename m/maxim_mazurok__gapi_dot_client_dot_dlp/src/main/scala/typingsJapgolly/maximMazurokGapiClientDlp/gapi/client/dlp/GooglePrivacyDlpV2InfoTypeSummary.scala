package typingsJapgolly.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2InfoTypeSummary extends StObject {
  
  /** Approximate percentage of non-null rows that contained data detected by this infotype. */
  var estimatedPrevalence: js.UndefOr[Double] = js.undefined
  
  /** The infoType. */
  var infoType: js.UndefOr[GooglePrivacyDlpV2InfoType] = js.undefined
}
object GooglePrivacyDlpV2InfoTypeSummary {
  
  inline def apply(): GooglePrivacyDlpV2InfoTypeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2InfoTypeSummary]
  }
  
  extension [Self <: GooglePrivacyDlpV2InfoTypeSummary](x: Self) {
    
    inline def setEstimatedPrevalence(value: Double): Self = StObject.set(x, "estimatedPrevalence", value.asInstanceOf[js.Any])
    
    inline def setEstimatedPrevalenceUndefined: Self = StObject.set(x, "estimatedPrevalence", js.undefined)
    
    inline def setInfoType(value: GooglePrivacyDlpV2InfoType): Self = StObject.set(x, "infoType", value.asInstanceOf[js.Any])
    
    inline def setInfoTypeUndefined: Self = StObject.set(x, "infoType", js.undefined)
  }
}
