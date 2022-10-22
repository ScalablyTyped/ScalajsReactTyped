package typingsJapgolly.cornerstoneCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait vec2 extends StObject {
  
  /** The x distance */
  var x: Double
  
  /** The y distance */
  var y: Double
}
object vec2 {
  
  inline def apply(x: Double, y: Double): vec2 = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[vec2]
  }
  
  extension [Self <: vec2](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
