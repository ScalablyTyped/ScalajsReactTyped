package typingsJapgolly.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminCreateUserResponse extends StObject {
  
  /**
    * The newly created user.
    */
  var User: js.UndefOr[UserType] = js.undefined
}
object AdminCreateUserResponse {
  
  inline def apply(): AdminCreateUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminCreateUserResponse]
  }
  
  extension [Self <: AdminCreateUserResponse](x: Self) {
    
    inline def setUser(value: UserType): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
