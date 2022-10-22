package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var duration: Any
  
  var loadingState: String
  
  var seek: Double
  
  def setSeek(pos: Any): Unit
}
object Duration {
  
  inline def apply(duration: Any, loadingState: String, seek: Double, setSeek: Any => Callback): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], loadingState = loadingState.asInstanceOf[js.Any], seek = seek.asInstanceOf[js.Any], setSeek = js.Any.fromFunction1((t0: Any) => setSeek(t0).runNow()))
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setDuration(value: Any): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setLoadingState(value: String): Self = StObject.set(x, "loadingState", value.asInstanceOf[js.Any])
    
    inline def setSeek(value: Double): Self = StObject.set(x, "seek", value.asInstanceOf[js.Any])
    
    inline def setSetSeek(value: Any => Callback): Self = StObject.set(x, "setSeek", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
