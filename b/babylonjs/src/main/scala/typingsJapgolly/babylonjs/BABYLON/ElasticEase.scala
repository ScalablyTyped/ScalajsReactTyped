package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticEase
  extends StObject
     with EasingFunction {
  
  /** Defines the number of oscillations*/
  var oscillations: Double
  
  /** Defines the amplitude of the oscillations*/
  var springiness: Double
}
object ElasticEase {
  
  inline def apply(
    _easingMode: Any,
    ease: Double => Double,
    easeInCore: Double => Double,
    getEasingMode: CallbackTo[Double],
    oscillations: Double,
    setEasingMode: Double => Callback,
    springiness: Double
  ): ElasticEase = {
    val __obj = js.Dynamic.literal(_easingMode = _easingMode.asInstanceOf[js.Any], ease = js.Any.fromFunction1(ease), easeInCore = js.Any.fromFunction1(easeInCore), getEasingMode = getEasingMode.toJsFn, oscillations = oscillations.asInstanceOf[js.Any], setEasingMode = js.Any.fromFunction1((t0: Double) => setEasingMode(t0).runNow()), springiness = springiness.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticEase]
  }
  
  extension [Self <: ElasticEase](x: Self) {
    
    inline def setOscillations(value: Double): Self = StObject.set(x, "oscillations", value.asInstanceOf[js.Any])
    
    inline def setSpringiness(value: Double): Self = StObject.set(x, "springiness", value.asInstanceOf[js.Any])
  }
}
