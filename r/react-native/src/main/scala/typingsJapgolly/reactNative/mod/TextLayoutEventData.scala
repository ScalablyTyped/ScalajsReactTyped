package typingsJapgolly.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextLayoutEventData
  extends StObject
     with TargetedEvent {
  
  var lines: js.Array[TextLayoutLine]
}
object TextLayoutEventData {
  
  inline def apply(lines: js.Array[TextLayoutLine], target: Double): TextLayoutEventData = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextLayoutEventData]
  }
  
  extension [Self <: TextLayoutEventData](x: Self) {
    
    inline def setLines(value: js.Array[TextLayoutLine]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesVarargs(value: TextLayoutLine*): Self = StObject.set(x, "lines", js.Array(value*))
  }
}
