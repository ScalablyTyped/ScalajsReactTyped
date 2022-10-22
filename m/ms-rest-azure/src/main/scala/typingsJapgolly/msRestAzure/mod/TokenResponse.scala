package typingsJapgolly.msRestAzure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenResponse
  extends StObject
     with typingsJapgolly.adalNode.mod.TokenResponse {
  
  /**
    * @property {number} [notBefore] The time from which the access token becomes usable.
    * The date is represented as the number of seconds from 1970-01-01T0:0:0Z UTC until time of validity for the token.
    */
  var notBefore: js.UndefOr[Double] = js.undefined
}
object TokenResponse {
  
  inline def apply(
    accessToken: String,
    expiresIn: Double,
    expiresOn: js.Date | String,
    resource: String,
    tokenType: String
  ): TokenResponse = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], expiresOn = expiresOn.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenResponse]
  }
  
  extension [Self <: TokenResponse](x: Self) {
    
    inline def setNotBefore(value: Double): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
  }
}
