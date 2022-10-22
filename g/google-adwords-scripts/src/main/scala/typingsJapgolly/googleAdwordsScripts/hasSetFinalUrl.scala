package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait hasSetFinalUrl extends StObject {
  
  def setFinalUrl(url: String): Unit
  
  def setMobileFinalUrl(url: String): Unit
}
object hasSetFinalUrl {
  
  inline def apply(setFinalUrl: String => Callback, setMobileFinalUrl: String => Callback): hasSetFinalUrl = {
    val __obj = js.Dynamic.literal(setFinalUrl = js.Any.fromFunction1((t0: String) => setFinalUrl(t0).runNow()), setMobileFinalUrl = js.Any.fromFunction1((t0: String) => setMobileFinalUrl(t0).runNow()))
    __obj.asInstanceOf[hasSetFinalUrl]
  }
  
  extension [Self <: hasSetFinalUrl](x: Self) {
    
    inline def setSetFinalUrl(value: String => Callback): Self = StObject.set(x, "setFinalUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetMobileFinalUrl(value: String => Callback): Self = StObject.set(x, "setMobileFinalUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
