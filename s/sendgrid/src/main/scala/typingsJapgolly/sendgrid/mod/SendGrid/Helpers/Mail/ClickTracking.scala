package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sendgrid.anon.Enable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickTracking extends StObject {
  
  def getEnable(): Boolean
  
  def getEnableText(): Boolean
  
  def setEnable(enabled: Boolean): Unit
  
  def setEnableText(enableText: Boolean): Unit
  
  def toJSON(): Enable
}
object ClickTracking {
  
  inline def apply(
    getEnable: CallbackTo[Boolean],
    getEnableText: CallbackTo[Boolean],
    setEnable: Boolean => Callback,
    setEnableText: Boolean => Callback,
    toJSON: CallbackTo[Enable]
  ): ClickTracking = {
    val __obj = js.Dynamic.literal(getEnable = getEnable.toJsFn, getEnableText = getEnableText.toJsFn, setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), setEnableText = js.Any.fromFunction1((t0: Boolean) => setEnableText(t0).runNow()), toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[ClickTracking]
  }
  
  extension [Self <: ClickTracking](x: Self) {
    
    inline def setGetEnable(value: CallbackTo[Boolean]): Self = StObject.set(x, "getEnable", value.toJsFn)
    
    inline def setGetEnableText(value: CallbackTo[Boolean]): Self = StObject.set(x, "getEnableText", value.toJsFn)
    
    inline def setSetEnable(value: Boolean => Callback): Self = StObject.set(x, "setEnable", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetEnableText(value: Boolean => Callback): Self = StObject.set(x, "setEnableText", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setToJSON(value: CallbackTo[Enable]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
