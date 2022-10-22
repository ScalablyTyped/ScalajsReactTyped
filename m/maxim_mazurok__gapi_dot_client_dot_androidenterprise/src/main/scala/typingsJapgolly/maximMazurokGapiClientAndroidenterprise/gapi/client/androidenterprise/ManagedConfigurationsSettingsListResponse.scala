package typingsJapgolly.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedConfigurationsSettingsListResponse extends StObject {
  
  /** A managed configurations settings for an app that may be assigned to a group of users in an enterprise. */
  var managedConfigurationsSettings: js.UndefOr[js.Array[ManagedConfigurationsSettings]] = js.undefined
}
object ManagedConfigurationsSettingsListResponse {
  
  inline def apply(): ManagedConfigurationsSettingsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedConfigurationsSettingsListResponse]
  }
  
  extension [Self <: ManagedConfigurationsSettingsListResponse](x: Self) {
    
    inline def setManagedConfigurationsSettings(value: js.Array[ManagedConfigurationsSettings]): Self = StObject.set(x, "managedConfigurationsSettings", value.asInstanceOf[js.Any])
    
    inline def setManagedConfigurationsSettingsUndefined: Self = StObject.set(x, "managedConfigurationsSettings", js.undefined)
    
    inline def setManagedConfigurationsSettingsVarargs(value: ManagedConfigurationsSettings*): Self = StObject.set(x, "managedConfigurationsSettings", js.Array(value*))
  }
}
