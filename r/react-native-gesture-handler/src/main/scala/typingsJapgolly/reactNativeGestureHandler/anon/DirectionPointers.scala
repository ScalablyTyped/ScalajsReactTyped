package typingsJapgolly.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionPointers extends StObject {
  
  var direction: Double
  
  var pointers: js.UndefOr[Double] = js.undefined
}
object DirectionPointers {
  
  inline def apply(direction: Double): DirectionPointers = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionPointers]
  }
  
  extension [Self <: DirectionPointers](x: Self) {
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setPointers(value: Double): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
    
    inline def setPointersUndefined: Self = StObject.set(x, "pointers", js.undefined)
  }
}
