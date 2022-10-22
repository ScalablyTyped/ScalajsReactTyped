package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackEase
  extends StObject
     with EasingFunction {
  
  /** Defines the amplitude of the function */
  var amplitude: Double
}
object BackEase {
  
  inline def apply(
    _easingMode: Any,
    amplitude: Double,
    ease: Double => Double,
    easeInCore: Double => Double,
    getEasingMode: CallbackTo[Double],
    setEasingMode: Double => Callback
  ): BackEase = {
    val __obj = js.Dynamic.literal(_easingMode = _easingMode.asInstanceOf[js.Any], amplitude = amplitude.asInstanceOf[js.Any], ease = js.Any.fromFunction1(ease), easeInCore = js.Any.fromFunction1(easeInCore), getEasingMode = getEasingMode.toJsFn, setEasingMode = js.Any.fromFunction1((t0: Double) => setEasingMode(t0).runNow()))
    __obj.asInstanceOf[BackEase]
  }
  
  extension [Self <: BackEase](x: Self) {
    
    inline def setAmplitude(value: Double): Self = StObject.set(x, "amplitude", value.asInstanceOf[js.Any])
  }
}
