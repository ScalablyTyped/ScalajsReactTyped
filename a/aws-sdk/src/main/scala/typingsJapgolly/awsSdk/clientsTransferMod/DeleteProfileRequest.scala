package typingsJapgolly.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteProfileRequest extends StObject {
  
  /**
    * The identifier of the profile that you are deleting.
    */
  var ProfileId: typingsJapgolly.awsSdk.clientsTransferMod.ProfileId
}
object DeleteProfileRequest {
  
  inline def apply(ProfileId: ProfileId): DeleteProfileRequest = {
    val __obj = js.Dynamic.literal(ProfileId = ProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProfileRequest]
  }
  
  extension [Self <: DeleteProfileRequest](x: Self) {
    
    inline def setProfileId(value: ProfileId): Self = StObject.set(x, "ProfileId", value.asInstanceOf[js.Any])
  }
}
