package typingsJapgolly.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2RecordSuppression extends StObject {
  
  /** A condition that when it evaluates to true will result in the record being evaluated to be suppressed from the transformed content. */
  var condition: js.UndefOr[GooglePrivacyDlpV2RecordCondition] = js.undefined
}
object GooglePrivacyDlpV2RecordSuppression {
  
  inline def apply(): GooglePrivacyDlpV2RecordSuppression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2RecordSuppression]
  }
  
  extension [Self <: GooglePrivacyDlpV2RecordSuppression](x: Self) {
    
    inline def setCondition(value: GooglePrivacyDlpV2RecordCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
  }
}
