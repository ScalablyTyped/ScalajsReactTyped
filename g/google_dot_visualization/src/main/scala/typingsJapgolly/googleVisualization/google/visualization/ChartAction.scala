package typingsJapgolly.googleVisualization.google.visualization

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartAction extends StObject {
  
  def action(): Unit
  
  var id: String | Double
  
  var text: String
}
object ChartAction {
  
  inline def apply(action: Callback, id: String | Double, text: String): ChartAction = {
    val __obj = js.Dynamic.literal(action = action.toJsFn, id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAction]
  }
  
  extension [Self <: ChartAction](x: Self) {
    
    inline def setAction(value: Callback): Self = StObject.set(x, "action", value.toJsFn)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
