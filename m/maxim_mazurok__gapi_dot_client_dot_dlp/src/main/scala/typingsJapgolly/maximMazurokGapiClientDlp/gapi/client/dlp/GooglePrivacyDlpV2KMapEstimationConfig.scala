package typingsJapgolly.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2KMapEstimationConfig extends StObject {
  
  /** Several auxiliary tables can be used in the analysis. Each custom_tag used to tag a quasi-identifiers column must appear in exactly one column of one auxiliary table. */
  var auxiliaryTables: js.UndefOr[js.Array[GooglePrivacyDlpV2AuxiliaryTable]] = js.undefined
  
  /** Required. Fields considered to be quasi-identifiers. No two columns can have the same tag. */
  var quasiIds: js.UndefOr[js.Array[GooglePrivacyDlpV2TaggedField]] = js.undefined
  
  /** ISO 3166-1 alpha-2 region code to use in the statistical modeling. Set if no column is tagged with a region-specific InfoType (like US_ZIP_5) or a region code. */
  var regionCode: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2KMapEstimationConfig {
  
  inline def apply(): GooglePrivacyDlpV2KMapEstimationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2KMapEstimationConfig]
  }
  
  extension [Self <: GooglePrivacyDlpV2KMapEstimationConfig](x: Self) {
    
    inline def setAuxiliaryTables(value: js.Array[GooglePrivacyDlpV2AuxiliaryTable]): Self = StObject.set(x, "auxiliaryTables", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryTablesUndefined: Self = StObject.set(x, "auxiliaryTables", js.undefined)
    
    inline def setAuxiliaryTablesVarargs(value: GooglePrivacyDlpV2AuxiliaryTable*): Self = StObject.set(x, "auxiliaryTables", js.Array(value*))
    
    inline def setQuasiIds(value: js.Array[GooglePrivacyDlpV2TaggedField]): Self = StObject.set(x, "quasiIds", value.asInstanceOf[js.Any])
    
    inline def setQuasiIdsUndefined: Self = StObject.set(x, "quasiIds", js.undefined)
    
    inline def setQuasiIdsVarargs(value: GooglePrivacyDlpV2TaggedField*): Self = StObject.set(x, "quasiIds", js.Array(value*))
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
