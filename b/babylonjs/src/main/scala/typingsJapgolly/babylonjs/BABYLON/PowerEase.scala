package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PowerEase
  extends StObject
     with EasingFunction {
  
  /** Defines the power of the function */
  var power: Double
}
object PowerEase {
  
  inline def apply(
    _easingMode: Any,
    ease: Double => Double,
    easeInCore: Double => Double,
    getEasingMode: CallbackTo[Double],
    power: Double,
    setEasingMode: Double => Callback
  ): PowerEase = {
    val __obj = js.Dynamic.literal(_easingMode = _easingMode.asInstanceOf[js.Any], ease = js.Any.fromFunction1(ease), easeInCore = js.Any.fromFunction1(easeInCore), getEasingMode = getEasingMode.toJsFn, power = power.asInstanceOf[js.Any], setEasingMode = js.Any.fromFunction1((t0: Double) => setEasingMode(t0).runNow()))
    __obj.asInstanceOf[PowerEase]
  }
  
  extension [Self <: PowerEase](x: Self) {
    
    inline def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
  }
}
