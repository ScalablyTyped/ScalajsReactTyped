package typingsJapgolly.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2ListInfoTypesResponse extends StObject {
  
  /** Set of sensitive infoTypes. */
  var infoTypes: js.UndefOr[js.Array[GooglePrivacyDlpV2InfoTypeDescription]] = js.undefined
}
object GooglePrivacyDlpV2ListInfoTypesResponse {
  
  inline def apply(): GooglePrivacyDlpV2ListInfoTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ListInfoTypesResponse]
  }
  
  extension [Self <: GooglePrivacyDlpV2ListInfoTypesResponse](x: Self) {
    
    inline def setInfoTypes(value: js.Array[GooglePrivacyDlpV2InfoTypeDescription]): Self = StObject.set(x, "infoTypes", value.asInstanceOf[js.Any])
    
    inline def setInfoTypesUndefined: Self = StObject.set(x, "infoTypes", js.undefined)
    
    inline def setInfoTypesVarargs(value: GooglePrivacyDlpV2InfoTypeDescription*): Self = StObject.set(x, "infoTypes", js.Array(value*))
  }
}
