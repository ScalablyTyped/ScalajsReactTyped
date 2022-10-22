package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A continuation to get a password from interaction helper.
  * @since OOo 1.1.2
  */
trait XInteractionPassword
  extends StObject
     with XInteractionContinuation {
  
  /**
    * Get result password from the continuation.
    * @returns the stored password.
    */
  var Password: String
  
  /**
    * Get result password from the continuation.
    * @returns the stored password.
    */
  def getPassword(): String
  
  /**
    * Store result password to the continuation.
    * @param aPasswd the result password.
    */
  def setPassword(aPasswd: String): Unit
}
object XInteractionPassword {
  
  inline def apply(
    Password: String,
    acquire: Callback,
    getPassword: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    select: Callback,
    setPassword: String => Callback
  ): XInteractionPassword = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], acquire = acquire.toJsFn, getPassword = getPassword.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, select = select.toJsFn, setPassword = js.Any.fromFunction1((t0: String) => setPassword(t0).runNow()))
    __obj.asInstanceOf[XInteractionPassword]
  }
  
  extension [Self <: XInteractionPassword](x: Self) {
    
    inline def setGetPassword(value: CallbackTo[String]): Self = StObject.set(x, "getPassword", value.toJsFn)
    
    inline def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setSetPassword(value: String => Callback): Self = StObject.set(x, "setPassword", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
