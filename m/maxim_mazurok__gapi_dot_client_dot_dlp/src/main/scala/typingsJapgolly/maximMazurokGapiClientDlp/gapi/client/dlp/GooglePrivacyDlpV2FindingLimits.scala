package typingsJapgolly.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2FindingLimits extends StObject {
  
  /** Configuration of findings limit given for specified infoTypes. */
  var maxFindingsPerInfoType: js.UndefOr[js.Array[GooglePrivacyDlpV2InfoTypeLimit]] = js.undefined
  
  /**
    * Max number of findings that will be returned for each item scanned. When set within `InspectJobConfig`, the maximum returned is 2000 regardless if this is set higher. When set
    * within `InspectContentRequest`, this field is ignored.
    */
  var maxFindingsPerItem: js.UndefOr[Double] = js.undefined
  
  /** Max number of findings that will be returned per request/job. When set within `InspectContentRequest`, the maximum returned is 2000 regardless if this is set higher. */
  var maxFindingsPerRequest: js.UndefOr[Double] = js.undefined
}
object GooglePrivacyDlpV2FindingLimits {
  
  inline def apply(): GooglePrivacyDlpV2FindingLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2FindingLimits]
  }
  
  extension [Self <: GooglePrivacyDlpV2FindingLimits](x: Self) {
    
    inline def setMaxFindingsPerInfoType(value: js.Array[GooglePrivacyDlpV2InfoTypeLimit]): Self = StObject.set(x, "maxFindingsPerInfoType", value.asInstanceOf[js.Any])
    
    inline def setMaxFindingsPerInfoTypeUndefined: Self = StObject.set(x, "maxFindingsPerInfoType", js.undefined)
    
    inline def setMaxFindingsPerInfoTypeVarargs(value: GooglePrivacyDlpV2InfoTypeLimit*): Self = StObject.set(x, "maxFindingsPerInfoType", js.Array(value*))
    
    inline def setMaxFindingsPerItem(value: Double): Self = StObject.set(x, "maxFindingsPerItem", value.asInstanceOf[js.Any])
    
    inline def setMaxFindingsPerItemUndefined: Self = StObject.set(x, "maxFindingsPerItem", js.undefined)
    
    inline def setMaxFindingsPerRequest(value: Double): Self = StObject.set(x, "maxFindingsPerRequest", value.asInstanceOf[js.Any])
    
    inline def setMaxFindingsPerRequestUndefined: Self = StObject.set(x, "maxFindingsPerRequest", js.undefined)
  }
}
