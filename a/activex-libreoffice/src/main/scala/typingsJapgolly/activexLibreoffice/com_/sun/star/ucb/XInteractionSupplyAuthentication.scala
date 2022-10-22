package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XInteractionContinuation
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interaction continuation handing back some authentication data.
  *
  * This continuation is typically used in conjunction with {@link AuthenticationRequest} .
  */
trait XInteractionSupplyAuthentication
  extends StObject
     with XInteractionContinuation {
  
  /** Specifies if an "account" value can be handed back. */
  def canSetAccount(): Boolean
  
  /** Specifies if a "password" value can be handed back. */
  def canSetPassword(): Boolean
  
  /** Specifies if a new "realm" value can be handed back. */
  def canSetRealm(): Boolean
  
  /** Specifies if a "user name" value can be handed back. */
  def canSetUserName(): Boolean
  
  /**
    * Specifies the available modes of how long to remember the account.
    * @param Default Returns the default mode (to be initially displayed to the user).
    * @returns A sequence of available modes to hand back. Each individual mode should appear at most once in the sequence. If the sequence is empty, a new mode
    */
  def getRememberAccountModes(Default: js.Array[RememberAuthentication]): SafeArray[RememberAuthentication]
  
  /**
    * Specifies the available modes of how long to remember the password.
    * @param Default Returns the default mode (to be initially displayed to the user).
    * @returns A sequence of available modes to hand back. Each individual mode should appear at most once in the sequence. If the sequence is empty, a new mode
    */
  def getRememberPasswordModes(Default: js.Array[RememberAuthentication]): SafeArray[RememberAuthentication]
  
  /**
    * Set a new "account" value to hand back.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.canSetAccount()} returned `TRUE` .
    */
  def setAccount(Account: String): Unit
  
  /**
    * Set a new "password" value to hand back.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.canSetPassword()} returned `TRUE` .
    */
  def setPassword(Password: String): Unit
  
  /**
    * Set a new "realm" value to hand back.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.canSetRealm()} returned `TRUE` .
    */
  def setRealm(Realm: String): Unit
  
  /**
    * Set a new mode of how long to remember the account.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.setAccount()} is also called.
    * @param Remember The mode to hand back, should be contained in the sequence returned by {@link XInteractionSupplyAuthentication.getRememberAccountModes()} .
    */
  def setRememberAccount(Remember: RememberAuthentication): Unit
  
  /**
    * Set a new mode of how long to remember the password.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.setPassword()} is also called.
    * @param Remember The mode to hand back, should be contained in the sequence returned by {@link XInteractionSupplyAuthentication.getRememberPasswordModes()} .
    */
  def setRememberPassword(Remember: RememberAuthentication): Unit
  
  /**
    * Set a new "user name" value to hand back.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.canSetUserName()} returned `TRUE` .
    */
  def setUserName(UserName: String): Unit
}
object XInteractionSupplyAuthentication {
  
  inline def apply(
    acquire: Callback,
    canSetAccount: CallbackTo[Boolean],
    canSetPassword: CallbackTo[Boolean],
    canSetRealm: CallbackTo[Boolean],
    canSetUserName: CallbackTo[Boolean],
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
    setUserName: String => Callback
  ): XInteractionSupplyAuthentication = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, canSetAccount = canSetAccount.toJsFn, canSetPassword = canSetPassword.toJsFn, canSetRealm = canSetRealm.toJsFn, canSetUserName = canSetUserName.toJsFn, getRememberAccountModes = js.Any.fromFunction1(getRememberAccountModes), getRememberPasswordModes = js.Any.fromFunction1(getRememberPasswordModes), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, select = select.toJsFn, setAccount = js.Any.fromFunction1((t0: String) => setAccount(t0).runNow()), setPassword = js.Any.fromFunction1((t0: String) => setPassword(t0).runNow()), setRealm = js.Any.fromFunction1((t0: String) => setRealm(t0).runNow()), setRememberAccount = js.Any.fromFunction1((t0: RememberAuthentication) => setRememberAccount(t0).runNow()), setRememberPassword = js.Any.fromFunction1((t0: RememberAuthentication) => setRememberPassword(t0).runNow()), setUserName = js.Any.fromFunction1((t0: String) => setUserName(t0).runNow()))
    __obj.asInstanceOf[XInteractionSupplyAuthentication]
  }
  
  extension [Self <: XInteractionSupplyAuthentication](x: Self) {
    
    inline def setCanSetAccount(value: CallbackTo[Boolean]): Self = StObject.set(x, "canSetAccount", value.toJsFn)
    
    inline def setCanSetPassword(value: CallbackTo[Boolean]): Self = StObject.set(x, "canSetPassword", value.toJsFn)
    
    inline def setCanSetRealm(value: CallbackTo[Boolean]): Self = StObject.set(x, "canSetRealm", value.toJsFn)
    
    inline def setCanSetUserName(value: CallbackTo[Boolean]): Self = StObject.set(x, "canSetUserName", value.toJsFn)
    
    inline def setGetRememberAccountModes(value: js.Array[RememberAuthentication] => SafeArray[RememberAuthentication]): Self = StObject.set(x, "getRememberAccountModes", js.Any.fromFunction1(value))
    
    inline def setGetRememberPasswordModes(value: js.Array[RememberAuthentication] => SafeArray[RememberAuthentication]): Self = StObject.set(x, "getRememberPasswordModes", js.Any.fromFunction1(value))
    
    inline def setSetAccount(value: String => Callback): Self = StObject.set(x, "setAccount", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetPassword(value: String => Callback): Self = StObject.set(x, "setPassword", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetRealm(value: String => Callback): Self = StObject.set(x, "setRealm", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetRememberAccount(value: RememberAuthentication => Callback): Self = StObject.set(x, "setRememberAccount", js.Any.fromFunction1((t0: RememberAuthentication) => value(t0).runNow()))
    
    inline def setSetRememberPassword(value: RememberAuthentication => Callback): Self = StObject.set(x, "setRememberPassword", js.Any.fromFunction1((t0: RememberAuthentication) => value(t0).runNow()))
    
    inline def setSetUserName(value: String => Callback): Self = StObject.set(x, "setUserName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
