package typingsJapgolly.playcanvas.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Version_ extends StObject {
  
  def copy(other: Any): Unit
  
  var globalId: Double
  
  def reset(): Unit
  
  var revision: Double
}
object Version_ {
  
  inline def apply(copy: Any => Callback, globalId: Double, reset: Callback, revision: Double): Version_ = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction1((t0: Any) => copy(t0).runNow()), globalId = globalId.asInstanceOf[js.Any], reset = reset.toJsFn, revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version_]
  }
  
  extension [Self <: Version_](x: Self) {
    
    inline def setCopy(value: Any => Callback): Self = StObject.set(x, "copy", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setGlobalId(value: Double): Self = StObject.set(x, "globalId", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}
