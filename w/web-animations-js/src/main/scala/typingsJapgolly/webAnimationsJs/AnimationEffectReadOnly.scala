package typingsJapgolly.webAnimationsJs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationEffectReadOnly extends StObject {
  
  def getComputedTiming(): ComputedTimingProperties
  
  val timing: Double
}
object AnimationEffectReadOnly {
  
  inline def apply(getComputedTiming: CallbackTo[ComputedTimingProperties], timing: Double): AnimationEffectReadOnly = {
    val __obj = js.Dynamic.literal(getComputedTiming = getComputedTiming.toJsFn, timing = timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEffectReadOnly]
  }
  
  extension [Self <: AnimationEffectReadOnly](x: Self) {
    
    inline def setGetComputedTiming(value: CallbackTo[ComputedTimingProperties]): Self = StObject.set(x, "getComputedTiming", value.toJsFn)
    
    inline def setTiming(value: Double): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
  }
}
