package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bcc extends StObject {
  
  def getEmail(): Email
  
  def getEnable(): Boolean
  
  def setEmail(value: Email): Unit
  
  def setEnable(enabled: Boolean): Unit
  
  def toJSON(): typingsJapgolly.sendgrid.anon.Email
}
object Bcc {
  
  inline def apply(
    getEmail: CallbackTo[Email],
    getEnable: CallbackTo[Boolean],
    setEmail: Email => Callback,
    setEnable: Boolean => Callback,
    toJSON: CallbackTo[typingsJapgolly.sendgrid.anon.Email]
  ): Bcc = {
    val __obj = js.Dynamic.literal(getEmail = getEmail.toJsFn, getEnable = getEnable.toJsFn, setEmail = js.Any.fromFunction1((t0: Email) => setEmail(t0).runNow()), setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[Bcc]
  }
  
  extension [Self <: Bcc](x: Self) {
    
    inline def setGetEmail(value: CallbackTo[Email]): Self = StObject.set(x, "getEmail", value.toJsFn)
    
    inline def setGetEnable(value: CallbackTo[Boolean]): Self = StObject.set(x, "getEnable", value.toJsFn)
    
    inline def setSetEmail(value: Email => Callback): Self = StObject.set(x, "setEmail", js.Any.fromFunction1((t0: Email) => value(t0).runNow()))
    
    inline def setSetEnable(value: Boolean => Callback): Self = StObject.set(x, "setEnable", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setToJSON(value: CallbackTo[typingsJapgolly.sendgrid.anon.Email]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
