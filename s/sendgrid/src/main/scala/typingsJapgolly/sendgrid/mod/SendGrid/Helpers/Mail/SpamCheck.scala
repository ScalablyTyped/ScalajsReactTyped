package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sendgrid.anon.Posttourl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpamCheck extends StObject {
  
  def getEnable(): Boolean
  
  def getPosttoUrl(): String
  
  def getThreshold(): Double
  
  def setEnable(enabled: Boolean): Unit
  
  def setPosttoUrl(post_to_url: String): Unit
  
  def setThreshold(threshold: Double): Unit
  
  def toJSON(): Posttourl
}
object SpamCheck {
  
  inline def apply(
    getEnable: CallbackTo[Boolean],
    getPosttoUrl: CallbackTo[String],
    getThreshold: CallbackTo[Double],
    setEnable: Boolean => Callback,
    setPosttoUrl: String => Callback,
    setThreshold: Double => Callback,
    toJSON: CallbackTo[Posttourl]
  ): SpamCheck = {
    val __obj = js.Dynamic.literal(getEnable = getEnable.toJsFn, getPosttoUrl = getPosttoUrl.toJsFn, getThreshold = getThreshold.toJsFn, setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), setPosttoUrl = js.Any.fromFunction1((t0: String) => setPosttoUrl(t0).runNow()), setThreshold = js.Any.fromFunction1((t0: Double) => setThreshold(t0).runNow()), toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[SpamCheck]
  }
  
  extension [Self <: SpamCheck](x: Self) {
    
    inline def setGetEnable(value: CallbackTo[Boolean]): Self = StObject.set(x, "getEnable", value.toJsFn)
    
    inline def setGetPosttoUrl(value: CallbackTo[String]): Self = StObject.set(x, "getPosttoUrl", value.toJsFn)
    
    inline def setGetThreshold(value: CallbackTo[Double]): Self = StObject.set(x, "getThreshold", value.toJsFn)
    
    inline def setSetEnable(value: Boolean => Callback): Self = StObject.set(x, "setEnable", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetPosttoUrl(value: String => Callback): Self = StObject.set(x, "setPosttoUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetThreshold(value: Double => Callback): Self = StObject.set(x, "setThreshold", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setToJSON(value: CallbackTo[Posttourl]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
