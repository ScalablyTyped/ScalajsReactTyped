package typingsJapgolly.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProfileResponse extends StObject {
  
  /**
    * Returns the identifier for the profile that's being updated.
    */
  var ProfileId: typingsJapgolly.awsSdk.clientsTransferMod.ProfileId
}
object UpdateProfileResponse {
  
  inline def apply(ProfileId: ProfileId): UpdateProfileResponse = {
    val __obj = js.Dynamic.literal(ProfileId = ProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProfileResponse]
  }
  
  extension [Self <: UpdateProfileResponse](x: Self) {
    
    inline def setProfileId(value: ProfileId): Self = StObject.set(x, "ProfileId", value.asInstanceOf[js.Any])
  }
}
