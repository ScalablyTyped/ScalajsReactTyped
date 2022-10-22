package typingsJapgolly.firebaseAuth.distAuthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @internal
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firebaseAuth.distAuthMod.SignInWithPhoneNumberResponse
  - typingsJapgolly.firebaseAuth.distAuthMod.SignInWithIdpResponse
  - typingsJapgolly.firebaseAuth.distAuthMod.IdTokenResponse
*/
trait PhoneOrOauthTokenResponse extends StObject
object PhoneOrOauthTokenResponse {
  
  inline def IdTokenResponse(localId: String): typingsJapgolly.firebaseAuth.distAuthMod.IdTokenResponse = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.firebaseAuth.distAuthMod.IdTokenResponse]
  }
  
  inline def SignInWithIdpResponse(localId: String): typingsJapgolly.firebaseAuth.distAuthMod.SignInWithIdpResponse = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.firebaseAuth.distAuthMod.SignInWithIdpResponse]
  }
  
  inline def SignInWithPhoneNumberResponse(localId: String): typingsJapgolly.firebaseAuth.distAuthMod.SignInWithPhoneNumberResponse = {
    val __obj = js.Dynamic.literal(localId = localId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.firebaseAuth.distAuthMod.SignInWithPhoneNumberResponse]
  }
}
