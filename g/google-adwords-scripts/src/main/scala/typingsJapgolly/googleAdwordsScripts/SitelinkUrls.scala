package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SitelinkUrls
  extends StObject
     with AdWordsUrls
     with hasSetTrackingTemplate
     with hasGetFinalUrl
     with hasSetFinalUrl {
  
  def clearMobileFinalUrl(): Unit
}
object SitelinkUrls {
  
  inline def apply(
    clearMobileFinalUrl: Callback,
    getCustomParameters: CallbackTo[js.Object],
    getFinalUrl: CallbackTo[String],
    getMobileFinalUrl: CallbackTo[String],
    getTrackingTemplate: CallbackTo[String],
    setCustomParameters: js.Object => Callback,
    setFinalUrl: String => Callback,
    setMobileFinalUrl: String => Callback,
    setTrackingTemplate: String => Callback
  ): SitelinkUrls = {
    val __obj = js.Dynamic.literal(clearMobileFinalUrl = clearMobileFinalUrl.toJsFn, getCustomParameters = getCustomParameters.toJsFn, getFinalUrl = getFinalUrl.toJsFn, getMobileFinalUrl = getMobileFinalUrl.toJsFn, getTrackingTemplate = getTrackingTemplate.toJsFn, setCustomParameters = js.Any.fromFunction1((t0: js.Object) => setCustomParameters(t0).runNow()), setFinalUrl = js.Any.fromFunction1((t0: String) => setFinalUrl(t0).runNow()), setMobileFinalUrl = js.Any.fromFunction1((t0: String) => setMobileFinalUrl(t0).runNow()), setTrackingTemplate = js.Any.fromFunction1((t0: String) => setTrackingTemplate(t0).runNow()))
    __obj.asInstanceOf[SitelinkUrls]
  }
  
  extension [Self <: SitelinkUrls](x: Self) {
    
    inline def setClearMobileFinalUrl(value: Callback): Self = StObject.set(x, "clearMobileFinalUrl", value.toJsFn)
  }
}
