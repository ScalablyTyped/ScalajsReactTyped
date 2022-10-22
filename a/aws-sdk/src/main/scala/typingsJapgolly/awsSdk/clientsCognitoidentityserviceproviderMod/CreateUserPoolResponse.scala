package typingsJapgolly.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserPoolResponse extends StObject {
  
  /**
    * A container for the user pool details.
    */
  var UserPool: js.UndefOr[UserPoolType] = js.undefined
}
object CreateUserPoolResponse {
  
  inline def apply(): CreateUserPoolResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUserPoolResponse]
  }
  
  extension [Self <: CreateUserPoolResponse](x: Self) {
    
    inline def setUserPool(value: UserPoolType): Self = StObject.set(x, "UserPool", value.asInstanceOf[js.Any])
    
    inline def setUserPoolUndefined: Self = StObject.set(x, "UserPool", js.undefined)
  }
}
