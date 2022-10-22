package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to keyword URLs. */
trait KeywordUrls extends StObject {
  
  /** Clears the final URL of the keyword. */
  def clearFinalUrl(): Unit
  
  /** Clears the final URL suffix of the keyword. */
  def clearFinalUrlSuffix(): Unit
  
  /** Clears the mobile final URL of the keyword. */
  def clearMobileFinalUrl(): Unit
  
  /** Clears the tracking template of the keyword. */
  def clearTrackingTemplate(): Unit
  
  /** Returns the custom parameters of the keyword. */
  def getCustomParameters(): Record[String, String]
  
  /** Returns the final URL of the keyword. */
  def getFinalUrl(): String
  
  /** Returns the final URL suffix of the keyword. */
  def getFinalUrlSuffix(): String
  
  /** Returns the mobile final URL of the keyword. */
  def getMobileFinalUrl(): String
  
  /** Returns the tracking template of the keyword. */
  def getTrackingTemplate(): String
  
  /** Sets the custom parameters of the keyword. */
  def setCustomParameters(customParameters: Record[String, String]): Unit
  
  /** Sets the final URL of the keyword. */
  def setFinalUrl(finalUrl: String): Unit
  
  /** Sets the final URL suffix of the keyword. */
  def setFinalUrlSuffix(suffix: String): Unit
  
  /** Sets the mobile final URL of the keyword. */
  def setMobileFinalUrl(mobileFinalUrl: String): Unit
  
  /** Sets the tracking template of the keyword. */
  def setTrackingTemplate(trackingTemplate: String): Unit
}
object KeywordUrls {
  
  inline def apply(
    clearFinalUrl: Callback,
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
  ): KeywordUrls = {
    val __obj = js.Dynamic.literal(clearFinalUrl = clearFinalUrl.toJsFn, clearFinalUrlSuffix = clearFinalUrlSuffix.toJsFn, clearMobileFinalUrl = clearMobileFinalUrl.toJsFn, clearTrackingTemplate = clearTrackingTemplate.toJsFn, getCustomParameters = getCustomParameters.toJsFn, getFinalUrl = getFinalUrl.toJsFn, getFinalUrlSuffix = getFinalUrlSuffix.toJsFn, getMobileFinalUrl = getMobileFinalUrl.toJsFn, getTrackingTemplate = getTrackingTemplate.toJsFn, setCustomParameters = js.Any.fromFunction1((t0: Record[String, String]) => setCustomParameters(t0).runNow()), setFinalUrl = js.Any.fromFunction1((t0: String) => setFinalUrl(t0).runNow()), setFinalUrlSuffix = js.Any.fromFunction1((t0: String) => setFinalUrlSuffix(t0).runNow()), setMobileFinalUrl = js.Any.fromFunction1((t0: String) => setMobileFinalUrl(t0).runNow()), setTrackingTemplate = js.Any.fromFunction1((t0: String) => setTrackingTemplate(t0).runNow()))
    __obj.asInstanceOf[KeywordUrls]
  }
  
  extension [Self <: KeywordUrls](x: Self) {
    
    inline def setClearFinalUrl(value: Callback): Self = StObject.set(x, "clearFinalUrl", value.toJsFn)
    
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
