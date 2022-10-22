package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sendgrid.anon.Utmcampaign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ganalytics extends StObject {
  
  def getContent(): String
  
  def getEnable(): Boolean
  
  def getUrmMedium(): String
  
  def getUrmTerm(): String
  
  def getUtmCampaign(): String
  
  def getUtmSource(): String
  
  def setContent(content: String): Unit
  
  def setEnable(enabled: Boolean): Unit
  
  def setUrmMedium(medium: String): Unit
  
  def setUrmTerm(term: String): Unit
  
  def setUtmCampaign(campaign: String): Unit
  
  def setUtmSource(source: String): Unit
  
  def toJSON(): Utmcampaign
}
object Ganalytics {
  
  inline def apply(
    getContent: CallbackTo[String],
    getEnable: CallbackTo[Boolean],
    getUrmMedium: CallbackTo[String],
    getUrmTerm: CallbackTo[String],
    getUtmCampaign: CallbackTo[String],
    getUtmSource: CallbackTo[String],
    setContent: String => Callback,
    setEnable: Boolean => Callback,
    setUrmMedium: String => Callback,
    setUrmTerm: String => Callback,
    setUtmCampaign: String => Callback,
    setUtmSource: String => Callback,
    toJSON: CallbackTo[Utmcampaign]
  ): Ganalytics = {
    val __obj = js.Dynamic.literal(getContent = getContent.toJsFn, getEnable = getEnable.toJsFn, getUrmMedium = getUrmMedium.toJsFn, getUrmTerm = getUrmTerm.toJsFn, getUtmCampaign = getUtmCampaign.toJsFn, getUtmSource = getUtmSource.toJsFn, setContent = js.Any.fromFunction1((t0: String) => setContent(t0).runNow()), setEnable = js.Any.fromFunction1((t0: Boolean) => setEnable(t0).runNow()), setUrmMedium = js.Any.fromFunction1((t0: String) => setUrmMedium(t0).runNow()), setUrmTerm = js.Any.fromFunction1((t0: String) => setUrmTerm(t0).runNow()), setUtmCampaign = js.Any.fromFunction1((t0: String) => setUtmCampaign(t0).runNow()), setUtmSource = js.Any.fromFunction1((t0: String) => setUtmSource(t0).runNow()), toJSON = toJSON.toJsFn)
    __obj.asInstanceOf[Ganalytics]
  }
  
  extension [Self <: Ganalytics](x: Self) {
    
    inline def setGetContent(value: CallbackTo[String]): Self = StObject.set(x, "getContent", value.toJsFn)
    
    inline def setGetEnable(value: CallbackTo[Boolean]): Self = StObject.set(x, "getEnable", value.toJsFn)
    
    inline def setGetUrmMedium(value: CallbackTo[String]): Self = StObject.set(x, "getUrmMedium", value.toJsFn)
    
    inline def setGetUrmTerm(value: CallbackTo[String]): Self = StObject.set(x, "getUrmTerm", value.toJsFn)
    
    inline def setGetUtmCampaign(value: CallbackTo[String]): Self = StObject.set(x, "getUtmCampaign", value.toJsFn)
    
    inline def setGetUtmSource(value: CallbackTo[String]): Self = StObject.set(x, "getUtmSource", value.toJsFn)
    
    inline def setSetContent(value: String => Callback): Self = StObject.set(x, "setContent", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetEnable(value: Boolean => Callback): Self = StObject.set(x, "setEnable", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetUrmMedium(value: String => Callback): Self = StObject.set(x, "setUrmMedium", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetUrmTerm(value: String => Callback): Self = StObject.set(x, "setUrmTerm", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetUtmCampaign(value: String => Callback): Self = StObject.set(x, "setUtmCampaign", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetUtmSource(value: String => Callback): Self = StObject.set(x, "setUtmSource", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setToJSON(value: CallbackTo[Utmcampaign]): Self = StObject.set(x, "toJSON", value.toJsFn)
  }
}
