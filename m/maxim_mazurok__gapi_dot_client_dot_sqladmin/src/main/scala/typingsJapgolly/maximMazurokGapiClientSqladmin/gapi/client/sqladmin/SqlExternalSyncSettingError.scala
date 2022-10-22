package typingsJapgolly.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlExternalSyncSettingError extends StObject {
  
  /** Additional information about the error encountered. */
  var detail: js.UndefOr[String] = js.undefined
  
  /** Can be `sql#externalSyncSettingError` or `sql#externalSyncSettingWarning`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Identifies the specific error that occurred. */
  var `type`: js.UndefOr[String] = js.undefined
}
object SqlExternalSyncSettingError {
  
  inline def apply(): SqlExternalSyncSettingError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlExternalSyncSettingError]
  }
  
  extension [Self <: SqlExternalSyncSettingError](x: Self) {
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
