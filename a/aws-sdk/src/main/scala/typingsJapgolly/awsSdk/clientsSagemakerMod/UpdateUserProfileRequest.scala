package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserProfileRequest extends StObject {
  
  /**
    * The domain ID.
    */
  var DomainId: typingsJapgolly.awsSdk.clientsSagemakerMod.DomainId
  
  /**
    * The user profile name.
    */
  var UserProfileName: typingsJapgolly.awsSdk.clientsSagemakerMod.UserProfileName
  
  /**
    * A collection of settings.
    */
  var UserSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.UserSettings] = js.undefined
}
object UpdateUserProfileRequest {
  
  inline def apply(DomainId: DomainId, UserProfileName: UserProfileName): UpdateUserProfileRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], UserProfileName = UserProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserProfileRequest]
  }
  
  extension [Self <: UpdateUserProfileRequest](x: Self) {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setUserProfileName(value: UserProfileName): Self = StObject.set(x, "UserProfileName", value.asInstanceOf[js.Any])
    
    inline def setUserSettings(value: UserSettings): Self = StObject.set(x, "UserSettings", value.asInstanceOf[js.Any])
    
    inline def setUserSettingsUndefined: Self = StObject.set(x, "UserSettings", js.undefined)
  }
}
