package typingsJapgolly.wxJsSdkBrowser.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnSearchBeaconsConfig
  extends StObject
     with WxBaseRequestConfig {
  
  @JSName("complete")
  def complete_MOnSearchBeaconsConfig(argv: Any): Unit
}
object OnSearchBeaconsConfig {
  
  inline def apply(complete: Any => Callback): OnSearchBeaconsConfig = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1((t0: Any) => complete(t0).runNow()))
    __obj.asInstanceOf[OnSearchBeaconsConfig]
  }
  
  extension [Self <: OnSearchBeaconsConfig](x: Self) {
    
    inline def setComplete(value: Any => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
