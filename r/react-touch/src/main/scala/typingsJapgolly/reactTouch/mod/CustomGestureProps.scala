package typingsJapgolly.reactTouch.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomGestureProps extends StObject {
  
  var config: js.Array[moves]
  
  def onGesture(): Unit
}
object CustomGestureProps {
  
  inline def apply(config: js.Array[moves], onGesture: Callback): CustomGestureProps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], onGesture = onGesture.toJsFn)
    __obj.asInstanceOf[CustomGestureProps]
  }
  
  extension [Self <: CustomGestureProps](x: Self) {
    
    inline def setConfig(value: js.Array[moves]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigVarargs(value: moves*): Self = StObject.set(x, "config", js.Array(value*))
    
    inline def setOnGesture(value: Callback): Self = StObject.set(x, "onGesture", value.toJsFn)
  }
}
