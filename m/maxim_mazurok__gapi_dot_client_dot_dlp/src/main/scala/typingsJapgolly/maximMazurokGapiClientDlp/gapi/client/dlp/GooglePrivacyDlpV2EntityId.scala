package typingsJapgolly.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2EntityId extends StObject {
  
  /** Composite key indicating which field contains the entity identifier. */
  var field: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.undefined
}
object GooglePrivacyDlpV2EntityId {
  
  inline def apply(): GooglePrivacyDlpV2EntityId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2EntityId]
  }
  
  extension [Self <: GooglePrivacyDlpV2EntityId](x: Self) {
    
    inline def setField(value: GooglePrivacyDlpV2FieldId): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
