package typingsJapgolly.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2StoredInfoTypeStats extends StObject {
  
  /** StoredInfoType where findings are defined by a dictionary of phrases. */
  var largeCustomDictionary: js.UndefOr[GooglePrivacyDlpV2LargeCustomDictionaryStats] = js.undefined
}
object GooglePrivacyDlpV2StoredInfoTypeStats {
  
  inline def apply(): GooglePrivacyDlpV2StoredInfoTypeStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2StoredInfoTypeStats]
  }
  
  extension [Self <: GooglePrivacyDlpV2StoredInfoTypeStats](x: Self) {
    
    inline def setLargeCustomDictionary(value: GooglePrivacyDlpV2LargeCustomDictionaryStats): Self = StObject.set(x, "largeCustomDictionary", value.asInstanceOf[js.Any])
    
    inline def setLargeCustomDictionaryUndefined: Self = StObject.set(x, "largeCustomDictionary", js.undefined)
  }
}
