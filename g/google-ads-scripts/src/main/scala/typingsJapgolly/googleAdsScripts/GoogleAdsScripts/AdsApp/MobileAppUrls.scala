package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileAppUrls extends StObject {
  
  def clearFinalUrlSuffix(): Unit
  
  def clearMobileFinalUrl(): Unit
  
  def clearTrackingTemplate(): Unit
  
  def getCustomParameters(): Record[String, String]
  
  def getFinalUrl(): String
  
  def getFinalUrlSuffix(): String
  
  def getMobileFinalUrl(): String
  
  def getTrackingTemplate(): String
  
  def setCustomParameters(customParameters: Record[String, String]): Unit
  
  def setFinalUrl(finalUrl: String): Unit
  
  def setFinalUrlSuffix(suffix: String): Unit
  
  def setMobileFinalUrl(mobileFinalUrl: String): Unit
  
  def setTrackingTemplate(trackingTemplate: String): Unit
}
object MobileAppUrls {
  
  inline def apply(
    clearFinalUrlSuffix: Callback,
    clearMobileFinalUrl: Callback,
    clearTrackingTemplate: Callback,
    getCustomParameters: CallbackTo[Record[String, String]],
    getFinalUrl: CallbackTo[String],
    getFinalUrlSuffix: CallbackTo[String],
    getMobileFinalUrl: CallbackTo[String],
    getTrackingTemplate: CallbackTo[String],
    setCustomParameters: Record[String, String] => Callback,
    setFinalUrl: String => Callback,
    setFinalUrlSuffix: String => Callback,
    setMobileFinalUrl: String => Callback,
    setTrackingTemplate: String => Callback
  ): MobileAppUrls = {
    val __obj = js.Dynamic.literal(clearFinalUrlSuffix = clearFinalUrlSuffix.toJsFn, clearMobileFinalUrl = clearMobileFinalUrl.toJsFn, clearTrackingTemplate = clearTrackingTemplate.toJsFn, getCustomParameters = getCustomParameters.toJsFn, getFinalUrl = getFinalUrl.toJsFn, getFinalUrlSuffix = getFinalUrlSuffix.toJsFn, getMobileFinalUrl = getMobileFinalUrl.toJsFn, getTrackingTemplate = getTrackingTemplate.toJsFn, setCustomParameters = js.Any.fromFunction1((t0: Record[String, String]) => setCustomParameters(t0).runNow()), setFinalUrl = js.Any.fromFunction1((t0: String) => setFinalUrl(t0).runNow()), setFinalUrlSuffix = js.Any.fromFunction1((t0: String) => setFinalUrlSuffix(t0).runNow()), setMobileFinalUrl = js.Any.fromFunction1((t0: String) => setMobileFinalUrl(t0).runNow()), setTrackingTemplate = js.Any.fromFunction1((t0: String) => setTrackingTemplate(t0).runNow()))
    __obj.asInstanceOf[MobileAppUrls]
  }
  
  extension [Self <: MobileAppUrls](x: Self) {
    
    inline def setClearFinalUrlSuffix(value: Callback): Self = StObject.set(x, "clearFinalUrlSuffix", value.toJsFn)
    
    inline def setClearMobileFinalUrl(value: Callback): Self = StObject.set(x, "clearMobileFinalUrl", value.toJsFn)
    
    inline def setClearTrackingTemplate(value: Callback): Self = StObject.set(x, "clearTrackingTemplate", value.toJsFn)
    
    inline def setGetCustomParameters(value: CallbackTo[Record[String, String]]): Self = StObject.set(x, "getCustomParameters", value.toJsFn)
    
    inline def setGetFinalUrl(value: CallbackTo[String]): Self = StObject.set(x, "getFinalUrl", value.toJsFn)
    
    inline def setGetFinalUrlSuffix(value: CallbackTo[String]): Self = StObject.set(x, "getFinalUrlSuffix", value.toJsFn)
    
    inline def setGetMobileFinalUrl(value: CallbackTo[String]): Self = StObject.set(x, "getMobileFinalUrl", value.toJsFn)
    
    inline def setGetTrackingTemplate(value: CallbackTo[String]): Self = StObject.set(x, "getTrackingTemplate", value.toJsFn)
    
    inline def setSetCustomParameters(value: Record[String, String] => Callback): Self = StObject.set(x, "setCustomParameters", js.Any.fromFunction1((t0: Record[String, String]) => value(t0).runNow()))
    
    inline def setSetFinalUrl(value: String => Callback): Self = StObject.set(x, "setFinalUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetFinalUrlSuffix(value: String => Callback): Self = StObject.set(x, "setFinalUrlSuffix", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetMobileFinalUrl(value: String => Callback): Self = StObject.set(x, "setMobileFinalUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetTrackingTemplate(value: String => Callback): Self = StObject.set(x, "setTrackingTemplate", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
