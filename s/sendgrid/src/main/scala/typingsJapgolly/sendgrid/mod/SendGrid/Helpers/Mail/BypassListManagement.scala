package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sendgrid.anon.EnableBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BypassListManagement extends StObject {
  
  def getEnable(): Boolean
  
  def setEnable(enabled: Boolean): Unit
  
  def toJSON(): EnableBoolean
}
object BypassListManagement {
  
  inline def apply(getEnable: CallbackTo[Boolean], setEnable: Boolean => Callback, toJSON: CallbackTo[EnableBoolean]): BypassListManagement = {
    val __obj = js.Dynamic.literal(getEnable = getEnable.toJsFn, setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[BypassListManagement]
  }
  
  extension [Self <: BypassListManagement](x: Self) {
    
    inline def setGetEnable(value: CallbackTo[Boolean]): Self = StObject.set(x, "getEnable", value.toJsFn)
    
    inline def setSetEnable(value: Boolean => Callback): Self = StObject.set(x, "setEnable", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setToJSON(value: CallbackTo[EnableBoolean]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
