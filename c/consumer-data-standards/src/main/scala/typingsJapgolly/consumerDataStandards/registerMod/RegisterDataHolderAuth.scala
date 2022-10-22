package typingsJapgolly.consumerDataStandards.registerMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.consumerDataStandards.consumerDataStandardsStrings.`SIGNED-JWT`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterDataHolderAuth
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * JWKS endpoint used for authentication by the Data Holder with the Data Recipient
    */
  var jwksEndpoint: String
  
  /**
    * The type of authentication and authorisation mechanism in use
    */
  var registerUType: `SIGNED-JWT`
}
object RegisterDataHolderAuth {
  
  inline def apply(jwksEndpoint: String): RegisterDataHolderAuth = {
    val __obj = js.Dynamic.literal(jwksEndpoint = jwksEndpoint.asInstanceOf[js.Any], registerUType = "SIGNED-JWT")
    __obj.asInstanceOf[RegisterDataHolderAuth]
  }
  
  extension [Self <: RegisterDataHolderAuth](x: Self) {
    
    inline def setJwksEndpoint(value: String): Self = StObject.set(x, "jwksEndpoint", value.asInstanceOf[js.Any])
    
    inline def setRegisterUType(value: `SIGNED-JWT`): Self = StObject.set(x, "registerUType", value.asInstanceOf[js.Any])
  }
}
