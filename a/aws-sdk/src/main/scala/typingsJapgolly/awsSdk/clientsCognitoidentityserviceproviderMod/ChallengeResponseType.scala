package typingsJapgolly.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChallengeResponseType extends StObject {
  
  /**
    * The challenge name.
    */
  var ChallengeName: js.UndefOr[typingsJapgolly.awsSdk.clientsCognitoidentityserviceproviderMod.ChallengeName] = js.undefined
  
  /**
    * The challenge response.
    */
  var ChallengeResponse: js.UndefOr[
    typingsJapgolly.awsSdk.clientsCognitoidentityserviceproviderMod.ChallengeResponse
  ] = js.undefined
}
object ChallengeResponseType {
  
  inline def apply(): ChallengeResponseType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChallengeResponseType]
  }
  
  extension [Self <: ChallengeResponseType](x: Self) {
    
    inline def setChallengeName(value: ChallengeName): Self = StObject.set(x, "ChallengeName", value.asInstanceOf[js.Any])
    
    inline def setChallengeNameUndefined: Self = StObject.set(x, "ChallengeName", js.undefined)
    
    inline def setChallengeResponse(value: ChallengeResponse): Self = StObject.set(x, "ChallengeResponse", value.asInstanceOf[js.Any])
    
    inline def setChallengeResponseUndefined: Self = StObject.set(x, "ChallengeResponse", js.undefined)
  }
}
