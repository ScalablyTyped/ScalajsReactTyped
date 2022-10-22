package typingsJapgolly.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2LDiversityEquivalenceClass extends StObject {
  
  /** Size of the k-anonymity equivalence class. */
  var equivalenceClassSize: js.UndefOr[String] = js.undefined
  
  /** Number of distinct sensitive values in this equivalence class. */
  var numDistinctSensitiveValues: js.UndefOr[String] = js.undefined
  
  /** Quasi-identifier values defining the k-anonymity equivalence class. The order is always the same as the original request. */
  var quasiIdsValues: js.UndefOr[js.Array[GooglePrivacyDlpV2Value]] = js.undefined
  
  /** Estimated frequencies of top sensitive values. */
  var topSensitiveValues: js.UndefOr[js.Array[GooglePrivacyDlpV2ValueFrequency]] = js.undefined
}
object GooglePrivacyDlpV2LDiversityEquivalenceClass {
  
  inline def apply(): GooglePrivacyDlpV2LDiversityEquivalenceClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2LDiversityEquivalenceClass]
  }
  
  extension [Self <: GooglePrivacyDlpV2LDiversityEquivalenceClass](x: Self) {
    
    inline def setEquivalenceClassSize(value: String): Self = StObject.set(x, "equivalenceClassSize", value.asInstanceOf[js.Any])
    
    inline def setEquivalenceClassSizeUndefined: Self = StObject.set(x, "equivalenceClassSize", js.undefined)
    
    inline def setNumDistinctSensitiveValues(value: String): Self = StObject.set(x, "numDistinctSensitiveValues", value.asInstanceOf[js.Any])
    
    inline def setNumDistinctSensitiveValuesUndefined: Self = StObject.set(x, "numDistinctSensitiveValues", js.undefined)
    
    inline def setQuasiIdsValues(value: js.Array[GooglePrivacyDlpV2Value]): Self = StObject.set(x, "quasiIdsValues", value.asInstanceOf[js.Any])
    
    inline def setQuasiIdsValuesUndefined: Self = StObject.set(x, "quasiIdsValues", js.undefined)
    
    inline def setQuasiIdsValuesVarargs(value: GooglePrivacyDlpV2Value*): Self = StObject.set(x, "quasiIdsValues", js.Array(value*))
    
    inline def setTopSensitiveValues(value: js.Array[GooglePrivacyDlpV2ValueFrequency]): Self = StObject.set(x, "topSensitiveValues", value.asInstanceOf[js.Any])
    
    inline def setTopSensitiveValuesUndefined: Self = StObject.set(x, "topSensitiveValues", js.undefined)
    
    inline def setTopSensitiveValuesVarargs(value: GooglePrivacyDlpV2ValueFrequency*): Self = StObject.set(x, "topSensitiveValues", js.Array(value*))
  }
}
