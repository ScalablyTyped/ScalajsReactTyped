package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserProfileRequest extends StObject {
  
  /**
    * The domain ID.
    */
  var DomainId: typingsJapgolly.awsSdk.clientsSagemakerMod.DomainId
  
  /**
    * The user profile name. This value is not case sensitive.
    */
  var UserProfileName: typingsJapgolly.awsSdk.clientsSagemakerMod.UserProfileName
}
object DescribeUserProfileRequest {
  
  inline def apply(DomainId: DomainId, UserProfileName: UserProfileName): DescribeUserProfileRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], UserProfileName = UserProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserProfileRequest]
  }
  
  extension [Self <: DescribeUserProfileRequest](x: Self) {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setUserProfileName(value: UserProfileName): Self = StObject.set(x, "UserProfileName", value.asInstanceOf[js.Any])
  }
}
