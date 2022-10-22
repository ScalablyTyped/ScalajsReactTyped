package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileAppAssignment
  extends StObject
     with Entity {
  
  /**
    * The install intent defined by the admin. Possible values are: available, required, uninstall,
    * availableWithoutEnrollment.
    */
  var intent: js.UndefOr[InstallIntent] = js.undefined
  
  // The settings for target assignment defined by the admin.
  var settings: js.UndefOr[NullableOption[MobileAppAssignmentSettings]] = js.undefined
  
  // The target group assignment defined by the admin.
  var target: js.UndefOr[NullableOption[DeviceAndAppManagementAssignmentTarget]] = js.undefined
}
object MobileAppAssignment {
  
  inline def apply(): MobileAppAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileAppAssignment]
  }
  
  extension [Self <: MobileAppAssignment](x: Self) {
    
    inline def setIntent(value: InstallIntent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setSettings(value: NullableOption[MobileAppAssignmentSettings]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsNull: Self = StObject.set(x, "settings", null)
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setTarget(value: NullableOption[DeviceAndAppManagementAssignmentTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
