package typingsJapgolly.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2SensitivityScore extends StObject {
  
  /** The score applied to the resource. */
  var score: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2SensitivityScore {
  
  inline def apply(): GooglePrivacyDlpV2SensitivityScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2SensitivityScore]
  }
  
  extension [Self <: GooglePrivacyDlpV2SensitivityScore](x: Self) {
    
    inline def setScore(value: String): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
