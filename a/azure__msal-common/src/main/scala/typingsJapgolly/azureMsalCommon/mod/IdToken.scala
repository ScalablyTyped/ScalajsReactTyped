package typingsJapgolly.azureMsalCommon.mod

import typingsJapgolly.azureMsalCommon.distAccountTokenClaimsMod.TokenClaims
import typingsJapgolly.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "IdToken")
@js.native
open class IdToken protected ()
  extends typingsJapgolly.azureMsalCommon.distAccountAuthTokenMod.AuthToken {
  def this(rawToken: String, crypto: ICrypto) = this()
}
/* static members */
object IdToken {
  
  @JSImport("@azure/msal-common", "IdToken")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Extract token by decoding the rawToken
    *
    * @param encodedToken
    */
  inline def extractTokenClaims(encodedToken: String, crypto: ICrypto): TokenClaims = (^.asInstanceOf[js.Dynamic].applyDynamic("extractTokenClaims")(encodedToken.asInstanceOf[js.Any], crypto.asInstanceOf[js.Any])).asInstanceOf[TokenClaims]
}
