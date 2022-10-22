package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A continuation to get a password from interaction helper, extends {@link XInteractionPassword} with possibility to provide password to modify.
  * @since OOo 3.3
  */
trait XInteractionPassword2
  extends StObject
     with XInteractionPassword {
  
  /** gets "password to modify" from the continuation. */
  var PasswordToModify: String
  
  /** gets "recommend readonly" from the continuation. It specifies whether the document should be loaded readonly per default. */
  var RecommendReadOnly: Boolean
  
  /** gets "password to modify" from the continuation. */
  def getPasswordToModify(): String
  
  /** gets "recommend readonly" from the continuation. It specifies whether the document should be loaded readonly per default. */
  def getRecommendReadOnly(): Boolean
  
  /** stores "password to modify" to the continuation. */
  def setPasswordToModify(aPasswd: String): Unit
  
  /** stores "recommend readonly" to the continuation. It specifies whether the document should be loaded readonly per default. */
  def setRecommendReadOnly(bReadOnly: Boolean): Unit
}
object XInteractionPassword2 {
  
  inline def apply(
    Password: String,
    PasswordToModify: String,
    RecommendReadOnly: Boolean,
    acquire: Callback,
    getPassword: CallbackTo[String],
    getPasswordToModify: CallbackTo[String],
    getRecommendReadOnly: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    select: Callback,
    setPassword: String => Callback,
    setPasswordToModify: String => Callback,
    setRecommendReadOnly: Boolean => Callback
  ): XInteractionPassword2 = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], PasswordToModify = PasswordToModify.asInstanceOf[js.Any], RecommendReadOnly = RecommendReadOnly.asInstanceOf[js.Any], acquire = acquire.toJsFn, getPassword = getPassword.toJsFn, getPasswordToModify = getPasswordToModify.toJsFn, getRecommendReadOnly = getRecommendReadOnly.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, select = select.toJsFn, setPassword = js.Any.fromFunction1((t0: String) => setPassword(t0).runNow()), setPasswordToModify = js.Any.fromFunction1((t0: String) => setPasswordToModify(t0).runNow()), setRecommendReadOnly = js.Any.fromFunction1((t0: Boolean) => setRecommendReadOnly(t0).runNow()))
    __obj.asInstanceOf[XInteractionPassword2]
  }
  
  extension [Self <: XInteractionPassword2](x: Self) {
    
    inline def setGetPasswordToModify(value: CallbackTo[String]): Self = StObject.set(x, "getPasswordToModify", value.toJsFn)
    
    inline def setGetRecommendReadOnly(value: CallbackTo[Boolean]): Self = StObject.set(x, "getRecommendReadOnly", value.toJsFn)
    
    inline def setPasswordToModify(value: String): Self = StObject.set(x, "PasswordToModify", value.asInstanceOf[js.Any])
    
    inline def setRecommendReadOnly(value: Boolean): Self = StObject.set(x, "RecommendReadOnly", value.asInstanceOf[js.Any])
    
    inline def setSetPasswordToModify(value: String => Callback): Self = StObject.set(x, "setPasswordToModify", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetRecommendReadOnly(value: Boolean => Callback): Self = StObject.set(x, "setRecommendReadOnly", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
