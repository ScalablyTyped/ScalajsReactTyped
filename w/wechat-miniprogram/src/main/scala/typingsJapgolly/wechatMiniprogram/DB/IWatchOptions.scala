package typingsJapgolly.wechatMiniprogram.DB

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWatchOptions extends StObject {
  
  // server realtime data init & change event
  def onChange(snapshot: ISnapshot): Unit
  
  // error while connecting / listening
  def onError(error: Any): Unit
}
object IWatchOptions {
  
  inline def apply(onChange: ISnapshot => Callback, onError: Any => Callback): IWatchOptions = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: ISnapshot) => onChange(t0).runNow()), onError = js.Any.fromFunction1((t0: Any) => onError(t0).runNow()))
    __obj.asInstanceOf[IWatchOptions]
  }
  
  extension [Self <: IWatchOptions](x: Self) {
    
    inline def setOnChange(value: ISnapshot => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ISnapshot) => value(t0).runNow()))
    
    inline def setOnError(value: Any => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
