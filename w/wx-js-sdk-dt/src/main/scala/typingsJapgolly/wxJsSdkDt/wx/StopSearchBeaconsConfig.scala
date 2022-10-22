package typingsJapgolly.wxJsSdkDt.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopSearchBeaconsConfig
  extends StObject
     with WxBaseRequestConfig {
  
  @JSName("complete")
  def complete_MStopSearchBeaconsConfig(res: Any): Unit
}
object StopSearchBeaconsConfig {
  
  inline def apply(complete: Any => Callback): StopSearchBeaconsConfig = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1((t0: Any) => complete(t0).runNow()))
    __obj.asInstanceOf[StopSearchBeaconsConfig]
  }
  
  extension [Self <: StopSearchBeaconsConfig](x: Self) {
    
    inline def setComplete(value: Any => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
