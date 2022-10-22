package typingsJapgolly.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserSettingsResponse extends StObject {
  
  /**
    * The user settings.
    */
  var userSettings: UserSettings
}
object UpdateUserSettingsResponse {
  
  inline def apply(userSettings: UserSettings): UpdateUserSettingsResponse = {
    val __obj = js.Dynamic.literal(userSettings = userSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserSettingsResponse]
  }
  
  extension [Self <: UpdateUserSettingsResponse](x: Self) {
    
    inline def setUserSettings(value: UserSettings): Self = StObject.set(x, "userSettings", value.asInstanceOf[js.Any])
  }
}
