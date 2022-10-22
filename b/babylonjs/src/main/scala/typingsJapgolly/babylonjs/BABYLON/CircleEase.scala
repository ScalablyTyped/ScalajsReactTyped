package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircleEase
  extends StObject
     with EasingFunction
object CircleEase {
  
  inline def apply(
    _easingMode: Any,
    ease: Double => Double,
    easeInCore: Double => Double,
    getEasingMode: CallbackTo[Double],
    setEasingMode: Double => Callback
  ): CircleEase = {
    val __obj = js.Dynamic.literal(_easingMode = _easingMode.asInstanceOf[js.Any], ease = js.Any.fromFunction1(ease), easeInCore = js.Any.fromFunction1(easeInCore), getEasingMode = getEasingMode.toJsFn, setEasingMode = js.Any.fromFunction1((t0: Double) => setEasingMode(t0).runNow()))
    __obj.asInstanceOf[CircleEase]
  }
}
