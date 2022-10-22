package typingsJapgolly.forgeViewer.Autodesk.Viewing.Private

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressBar extends StObject {
  
  var lastValue: Double
  
  def setPercent(pct: Double): Unit
}
object ProgressBar {
  
  inline def apply(lastValue: Double, setPercent: Double => Callback): ProgressBar = {
    val __obj = js.Dynamic.literal(lastValue = lastValue.asInstanceOf[js.Any], setPercent = js.Any.fromFunction1((t0: Double) => setPercent(t0).runNow()))
    __obj.asInstanceOf[ProgressBar]
  }
  
  extension [Self <: ProgressBar](x: Self) {
    
    inline def setLastValue(value: Double): Self = StObject.set(x, "lastValue", value.asInstanceOf[js.Any])
    
    inline def setSetPercent(value: Double => Callback): Self = StObject.set(x, "setPercent", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
