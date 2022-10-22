package typingsJapgolly.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2SaveFindings extends StObject {
  
  /** Location to store findings outside of DLP. */
  var outputConfig: js.UndefOr[GooglePrivacyDlpV2OutputStorageConfig] = js.undefined
}
object GooglePrivacyDlpV2SaveFindings {
  
  inline def apply(): GooglePrivacyDlpV2SaveFindings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2SaveFindings]
  }
  
  extension [Self <: GooglePrivacyDlpV2SaveFindings](x: Self) {
    
    inline def setOutputConfig(value: GooglePrivacyDlpV2OutputStorageConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
