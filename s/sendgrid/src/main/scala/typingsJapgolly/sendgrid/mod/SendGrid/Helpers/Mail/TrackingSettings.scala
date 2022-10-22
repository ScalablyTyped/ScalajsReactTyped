package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sendgrid.anon.Clicktracking
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackingSettings extends StObject {
  
  def getClickTracking(): ClickTracking
  
  def getGanalytics(): Ganalytics
  
  def getOpenTracking(): OpenTracking
  
  def getSubscriptionTracking(): SubscriptionTracking
  
  def setClickTracking(value: ClickTracking): Unit
  
  def setGanalytics(value: Ganalytics): Unit
  
  def setOpenTracking(value: OpenTracking): Unit
  
  def setSubscriptionTracking(value: SubscriptionTracking): Unit
  
  def toJSON(): Clicktracking
}
object TrackingSettings {
  
  inline def apply(
    getClickTracking: CallbackTo[ClickTracking],
    getGanalytics: CallbackTo[Ganalytics],
    getOpenTracking: CallbackTo[OpenTracking],
    getSubscriptionTracking: CallbackTo[SubscriptionTracking],
    setClickTracking: ClickTracking => Callback,
    setGanalytics: Ganalytics => Callback,
    setOpenTracking: OpenTracking => Callback,
    setSubscriptionTracking: SubscriptionTracking => Callback,
    toJSON: CallbackTo[Clicktracking]
  ): TrackingSettings = {
    val __obj = js.Dynamic.literal(getClickTracking = getClickTracking.toJsFn, getGanalytics = getGanalytics.toJsFn, getOpenTracking = getOpenTracking.toJsFn, getSubscriptionTracking = getSubscriptionTracking.toJsFn, setClickTracking = js.Any.fromFunction1((t0: ClickTracking) => setClickTracking(t0).runNow()), setGanalytics = js.Any.fromFunction1((t0: Ganalytics) => setGanalytics(t0).runNow()), setOpenTracking = js.Any.fromFunction1((t0: OpenTracking) => setOpenTracking(t0).runNow()), setSubscriptionTracking = js.Any.fromFunction1((t0: SubscriptionTracking) => setSubscriptionTracking(t0).runNow()), toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[TrackingSettings]
  }
  
  extension [Self <: TrackingSettings](x: Self) {
    
    inline def setGetClickTracking(value: CallbackTo[ClickTracking]): Self = StObject.set(x, "getClickTracking", value.toJsFn)
    
    inline def setGetGanalytics(value: CallbackTo[Ganalytics]): Self = StObject.set(x, "getGanalytics", value.toJsFn)
    
    inline def setGetOpenTracking(value: CallbackTo[OpenTracking]): Self = StObject.set(x, "getOpenTracking", value.toJsFn)
    
    inline def setGetSubscriptionTracking(value: CallbackTo[SubscriptionTracking]): Self = StObject.set(x, "getSubscriptionTracking", value.toJsFn)
    
    inline def setSetClickTracking(value: ClickTracking => Callback): Self = StObject.set(x, "setClickTracking", js.Any.fromFunction1((t0: ClickTracking) => value(t0).runNow()))
    
    inline def setSetGanalytics(value: Ganalytics => Callback): Self = StObject.set(x, "setGanalytics", js.Any.fromFunction1((t0: Ganalytics) => value(t0).runNow()))
    
    inline def setSetOpenTracking(value: OpenTracking => Callback): Self = StObject.set(x, "setOpenTracking", js.Any.fromFunction1((t0: OpenTracking) => value(t0).runNow()))
    
    inline def setSetSubscriptionTracking(value: SubscriptionTracking => Callback): Self = StObject.set(x, "setSubscriptionTracking", js.Any.fromFunction1((t0: SubscriptionTracking) => value(t0).runNow()))
    
    inline def setToJSON(value: CallbackTo[Clicktracking]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
