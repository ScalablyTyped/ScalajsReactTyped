package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdGroupUrls
  extends StObject
     with AdWordsUrls
     with hasSetTrackingTemplate {
  
  def clearTrackingTemplate(): Unit
}
object AdGroupUrls {
  
  inline def apply(
    clearTrackingTemplate: Callback,
    getCustomParameters: CallbackTo[js.Object],
    getTrackingTemplate: CallbackTo[String],
    setCustomParameters: js.Object => Callback,
    setTrackingTemplate: String => Callback
  ): AdGroupUrls = {
    val __obj = js.Dynamic.literal(clearTrackingTemplate = clearTrackingTemplate.toJsFn, getCustomParameters = getCustomParameters.toJsFn, getTrackingTemplate = getTrackingTemplate.toJsFn, setCustomParameters = js.Any.fromFunction1((t0: js.Object) => setCustomParameters(t0).runNow()), setTrackingTemplate = js.Any.fromFunction1((t0: String) => setTrackingTemplate(t0).runNow()))
    __obj.asInstanceOf[AdGroupUrls]
  }
  
  extension [Self <: AdGroupUrls](x: Self) {
    
    inline def setClearTrackingTemplate(value: Callback): Self = StObject.set(x, "clearTrackingTemplate", value.toJsFn)
  }
}
