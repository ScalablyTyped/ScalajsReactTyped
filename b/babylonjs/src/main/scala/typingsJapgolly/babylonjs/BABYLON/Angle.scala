package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Angle extends StObject {
  
  /* private */ var _radians: Any
  
  /**
    * Get value in degrees
    * @returns the Angle value in degrees (float)
    */
  def degrees(): Double
  
  /**
    * Get value in radians
    * @returns the Angle value in radians (float)
    */
  def radians(): Double
}
object Angle {
  
  inline def apply(_radians: Any, degrees: CallbackTo[Double], radians: CallbackTo[Double]): Angle = {
    val __obj = js.Dynamic.literal(_radians = _radians.asInstanceOf[js.Any], degrees = degrees.toJsFn, radians = radians.toJsFn)
    __obj.asInstanceOf[Angle]
  }
  
  extension [Self <: Angle](x: Self) {
    
    inline def setDegrees(value: CallbackTo[Double]): Self = StObject.set(x, "degrees", value.toJsFn)
    
    inline def setRadians(value: CallbackTo[Double]): Self = StObject.set(x, "radians", value.toJsFn)
    
    inline def set_radians(value: Any): Self = StObject.set(x, "_radians", value.asInstanceOf[js.Any])
  }
}
