package typingsJapgolly.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLoginProfileResponse extends StObject {
  
  /**
    * A structure containing the user name and password create date.
    */
  var LoginProfile: typingsJapgolly.awsSdk.clientsIamMod.LoginProfile
}
object CreateLoginProfileResponse {
  
  inline def apply(LoginProfile: LoginProfile): CreateLoginProfileResponse = {
    val __obj = js.Dynamic.literal(LoginProfile = LoginProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoginProfileResponse]
  }
  
  extension [Self <: CreateLoginProfileResponse](x: Self) {
    
    inline def setLoginProfile(value: LoginProfile): Self = StObject.set(x, "LoginProfile", value.asInstanceOf[js.Any])
  }
}
