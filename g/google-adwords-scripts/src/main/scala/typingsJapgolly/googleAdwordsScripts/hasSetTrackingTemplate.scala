package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait hasSetTrackingTemplate extends StObject {
  
  def setCustomParameters(customParameters: js.Object): Unit
  
  def setTrackingTemplate(trackingTemplate: String): Unit
}
object hasSetTrackingTemplate {
  
  inline def apply(setCustomParameters: js.Object => Callback, setTrackingTemplate: String => Callback): hasSetTrackingTemplate = {
    val __obj = js.Dynamic.literal(setCustomParameters = js.Any.fromFunction1((t0: js.Object) => setCustomParameters(t0).runNow()), setTrackingTemplate = js.Any.fromFunction1((t0: String) => setTrackingTemplate(t0).runNow()))
    __obj.asInstanceOf[hasSetTrackingTemplate]
  }
  
  extension [Self <: hasSetTrackingTemplate](x: Self) {
    
    inline def setSetCustomParameters(value: js.Object => Callback): Self = StObject.set(x, "setCustomParameters", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setSetTrackingTemplate(value: String => Callback): Self = StObject.set(x, "setTrackingTemplate", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
