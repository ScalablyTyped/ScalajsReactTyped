package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolbarHelper extends StObject {
  
  def analyse(el: js.Object): Unit
}
object ToolbarHelper {
  
  inline def apply(analyse: js.Object => Callback): ToolbarHelper = {
    val __obj = js.Dynamic.literal(analyse = js.Any.fromFunction1((t0: js.Object) => analyse(t0).runNow()))
    __obj.asInstanceOf[ToolbarHelper]
  }
  
  extension [Self <: ToolbarHelper](x: Self) {
    
    inline def setAnalyse(value: js.Object => Callback): Self = StObject.set(x, "analyse", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
  }
}
