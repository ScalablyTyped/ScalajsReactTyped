package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interaction continuation handing back some authentication data.
  *
  * This continuation is typically used in conjunction with {@link AuthenticationRequest} .
  * @since OOo 3.2
  */
trait XInteractionSupplyAuthentication2
  extends StObject
     with XInteractionSupplyAuthentication {
  
  /**
    * Specifies if "system credentials" can be obtained and used by the issuer of the authentication request.
    * @param Default Returns the default behavior for system credentials handling (to be initially displayed to the user).
    * @returns `TRUE` if the issuer is able to obtain and use system credentials. `FALSE` otherwise.
    */
  def canUseSystemCredentials(Default: js.Array[Boolean]): Boolean
  
  /**
    * Set a new "use system credentials" value to hand back.
    * @param UseSystemCredentials `TRUE` means the request issuer shall obtain and use system credentials.
    */
  def setUseSystemCredentials(UseSystemCredentials: Boolean): Unit
}
object XInteractionSupplyAuthentication2 {
  
  inline def apply(
    acquire: Callback,
    canSetAccount: CallbackTo[Boolean],
    canSetPassword: CallbackTo[Boolean],
    canSetRealm: CallbackTo[Boolean],
    canSetUserName: CallbackTo[Boolean],
    canUseSystemCredentials: js.Array[Boolean] => Boolean,
    getRememberAccountModes: js.Array[RememberAuthentication] => SafeArray[RememberAuthentication],
    getRememberPasswordModes: js.Array[RememberAuthentication] => SafeArray[RememberAuthentication],
    queryInterface: `type` => Any,
    release: Callback,
    select: Callback,
    setAccount: String => Callback,
    setPassword: String => Callback,
    setRealm: String => Callback,
    setRememberAccount: RememberAuthentication => Callback,
    setRememberPassword: RememberAuthentication => Callback,
    setUseSystemCredentials: Boolean => Callback,
    setUserName: String => Callback
  ): XInteractionSupplyAuthentication2 = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, canSetAccount = canSetAccount.toJsFn, canSetPassword = canSetPassword.toJsFn, canSetRealm = canSetRealm.toJsFn, canSetUserName = canSetUserName.toJsFn, canUseSystemCredentials = js.Any.fromFunction1(canUseSystemCredentials), getRememberAccountModes = js.Any.fromFunction1(getRememberAccountModes), getRememberPasswordModes = js.Any.fromFunction1(getRememberPasswordModes), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, select = select.toJsFn, setAccount = js.Any.fromFunction1((t0: String) => setAccount(t0).runNow()), setPassword = js.Any.fromFunction1((t0: String) => setPassword(t0).runNow()), setRealm = js.Any.fromFunction1((t0: String) => setRealm(t0).runNow()), setRememberAccount = js.Any.fromFunction1((t0: RememberAuthentication) => setRememberAccount(t0).runNow()), setRememberPassword = js.Any.fromFunction1((t0: RememberAuthentication) => setRememberPassword(t0).runNow()), setUseSystemCredentials = js.Any.fromFunction1((t0: Boolean) => setUseSystemCredentials(t0).runNow()), setUserName = js.Any.fromFunction1((t0: String) => setUserName(t0).runNow()))
    __obj.asInstanceOf[XInteractionSupplyAuthentication2]
  }
  
  extension [Self <: XInteractionSupplyAuthentication2](x: Self) {
    
    inline def setCanUseSystemCredentials(value: js.Array[Boolean] => Boolean): Self = StObject.set(x, "canUseSystemCredentials", js.Any.fromFunction1(value))
    
    inline def setSetUseSystemCredentials(value: Boolean => Callback): Self = StObject.set(x, "setUseSystemCredentials", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
