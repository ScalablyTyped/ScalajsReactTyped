package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserSettings
  extends StObject
     with Entity {
  
  var contributionToContentDiscoveryAsOrganizationDisabled: js.UndefOr[Boolean] = js.undefined
  
  var contributionToContentDiscoveryDisabled: js.UndefOr[Boolean] = js.undefined
  
  var shiftPreferences: js.UndefOr[NullableOption[ShiftPreferences]] = js.undefined
}
object UserSettings {
  
  inline def apply(): UserSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSettings]
  }
  
  extension [Self <: UserSettings](x: Self) {
    
    inline def setContributionToContentDiscoveryAsOrganizationDisabled(value: Boolean): Self = StObject.set(x, "contributionToContentDiscoveryAsOrganizationDisabled", value.asInstanceOf[js.Any])
    
    inline def setContributionToContentDiscoveryAsOrganizationDisabledUndefined: Self = StObject.set(x, "contributionToContentDiscoveryAsOrganizationDisabled", js.undefined)
    
    inline def setContributionToContentDiscoveryDisabled(value: Boolean): Self = StObject.set(x, "contributionToContentDiscoveryDisabled", value.asInstanceOf[js.Any])
    
    inline def setContributionToContentDiscoveryDisabledUndefined: Self = StObject.set(x, "contributionToContentDiscoveryDisabled", js.undefined)
    
    inline def setShiftPreferences(value: NullableOption[ShiftPreferences]): Self = StObject.set(x, "shiftPreferences", value.asInstanceOf[js.Any])
    
    inline def setShiftPreferencesNull: Self = StObject.set(x, "shiftPreferences", null)
    
    inline def setShiftPreferencesUndefined: Self = StObject.set(x, "shiftPreferences", js.undefined)
  }
}
