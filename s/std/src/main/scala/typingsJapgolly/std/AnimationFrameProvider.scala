package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationFrameProvider extends StObject {
  
  /* standard dom */
  def cancelAnimationFrame(handle: Double): Unit
  
  /* standard dom */
  def requestAnimationFrame(callback: FrameRequestCallback): Double
}
object AnimationFrameProvider {
  
  inline def apply(cancelAnimationFrame: Double => Callback, requestAnimationFrame: FrameRequestCallback => Double): AnimationFrameProvider = {
    val __obj = js.Dynamic.literal(cancelAnimationFrame = js.Any.fromFunction1((t0: Double) => cancelAnimationFrame(t0).runNow()), requestAnimationFrame = js.Any.fromFunction1(requestAnimationFrame))
    __obj.asInstanceOf[AnimationFrameProvider]
  }
  
  extension [Self <: AnimationFrameProvider](x: Self) {
    
    inline def setCancelAnimationFrame(value: Double => Callback): Self = StObject.set(x, "cancelAnimationFrame", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setRequestAnimationFrame(value: FrameRequestCallback => Double): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction1(value))
  }
}
