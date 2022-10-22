package typingsJapgolly.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2Trigger extends StObject {
  
  /** For use with hybrid jobs. Jobs must be manually created and finished. */
  var manual: js.UndefOr[Any] = js.undefined
  
  /** Create a job on a repeating basis based on the elapse of time. */
  var schedule: js.UndefOr[GooglePrivacyDlpV2Schedule] = js.undefined
}
object GooglePrivacyDlpV2Trigger {
  
  inline def apply(): GooglePrivacyDlpV2Trigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Trigger]
  }
  
  extension [Self <: GooglePrivacyDlpV2Trigger](x: Self) {
    
    inline def setManual(value: Any): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
    
    inline def setManualUndefined: Self = StObject.set(x, "manual", js.undefined)
    
    inline def setSchedule(value: GooglePrivacyDlpV2Schedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}
