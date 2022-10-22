package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileAppUrls
  extends StObject
     with AdWordsUrls
     with hasGetFinalUrl
     with hasSetFinalUrl
     with hasSetTrackingTemplate {
  
  def clearMobileFinalUrl(): Unit
  
  def clearTrackingTemplate(): Unit
}
object MobileAppUrls {
  
  inline def apply(
    clearMobileFinalUrl: Callback,
    clearTrackingTemplate: Callback,
    getCustomParameters: CallbackTo[js.Object],
    getFinalUrl: CallbackTo[String],
    getMobileFinalUrl: CallbackTo[String],
    getTrackingTemplate: CallbackTo[String],
    setCustomParameters: js.Object => Callback,
    setFinalUrl: String => Callback,
    setMobileFinalUrl: String => Callback,
    setTrackingTemplate: String => Callback
  ): MobileAppUrls = {
    val __obj = js.Dynamic.literal(clearMobileFinalUrl = clearMobileFinalUrl.toJsFn, clearTrackingTemplate = clearTrackingTemplate.toJsFn, getCustomParameters = getCustomParameters.toJsFn, getFinalUrl = getFinalUrl.toJsFn, getMobileFinalUrl = getMobileFinalUrl.toJsFn, getTrackingTemplate = getTrackingTemplate.toJsFn, setCustomParameters = js.Any.fromFunction1((t0: js.Object) => setCustomParameters(t0).runNow()), setFinalUrl = js.Any.fromFunction1((t0: String) => setFinalUrl(t0).runNow()), setMobileFinalUrl = js.Any.fromFunction1((t0: String) => setMobileFinalUrl(t0).runNow()), setTrackingTemplate = js.Any.fromFunction1((t0: String) => setTrackingTemplate(t0).runNow()))
    __obj.asInstanceOf[MobileAppUrls]
  }
  
  extension [Self <: MobileAppUrls](x: Self) {
    
    inline def setClearMobileFinalUrl(value: Callback): Self = StObject.set(x, "clearMobileFinalUrl", value.toJsFn)
    
    inline def setClearTrackingTemplate(value: Callback): Self = StObject.set(x, "clearTrackingTemplate", value.toJsFn)
  }
}
