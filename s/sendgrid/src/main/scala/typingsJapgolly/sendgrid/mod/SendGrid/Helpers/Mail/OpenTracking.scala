package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sendgrid.anon.Substitutiontag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenTracking extends StObject {
  
  def getEnable(): Boolean
  
  def getSubscriptionTag(): String
  
  def setEnable(enabled: Boolean): Unit
  
  def setSubscriptionTag(subscriptionTag: String): Unit
  
  def toJSON(): Substitutiontag
}
object OpenTracking {
  
  inline def apply(
    getEnable: CallbackTo[Boolean],
    getSubscriptionTag: CallbackTo[String],
    setEnable: Boolean => Callback,
    setSubscriptionTag: String => Callback,
    toJSON: CallbackTo[Substitutiontag]
  ): OpenTracking = {
    val __obj = js.Dynamic.literal(getEnable = getEnable.toJsFn, getSubscriptionTag = getSubscriptionTag.toJsFn, setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), setSubscriptionTag = js.Any.fromFunction1((t0: String) => setSubscriptionTag(t0).runNow()), toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[OpenTracking]
  }
  
  extension [Self <: OpenTracking](x: Self) {
    
    inline def setGetEnable(value: CallbackTo[Boolean]): Self = StObject.set(x, "getEnable", value.toJsFn)
    
    inline def setGetSubscriptionTag(value: CallbackTo[String]): Self = StObject.set(x, "getSubscriptionTag", value.toJsFn)
    
    inline def setSetEnable(value: Boolean => Callback): Self = StObject.set(x, "setEnable", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetSubscriptionTag(value: String => Callback): Self = StObject.set(x, "setSubscriptionTag", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setToJSON(value: CallbackTo[Substitutiontag]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
