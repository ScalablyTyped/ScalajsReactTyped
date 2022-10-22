package typingsJapgolly.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLoginProfileResponse extends StObject {
  
  /**
    * A structure containing the user name and the profile creation date for the user.
    */
  var LoginProfile: typingsJapgolly.awsSdk.clientsIamMod.LoginProfile
}
object GetLoginProfileResponse {
  
  inline def apply(LoginProfile: LoginProfile): GetLoginProfileResponse = {
    val __obj = js.Dynamic.literal(LoginProfile = LoginProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoginProfileResponse]
  }
  
  extension [Self <: GetLoginProfileResponse](x: Self) {
    
    inline def setLoginProfile(value: LoginProfile): Self = StObject.set(x, "LoginProfile", value.asInstanceOf[js.Any])
  }
}
