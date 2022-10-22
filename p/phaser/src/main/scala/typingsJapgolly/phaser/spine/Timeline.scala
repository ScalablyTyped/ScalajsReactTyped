package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timeline extends StObject {
  
  @JSName("apply")
  def apply(
    skeleton: Skeleton,
    lastTime: Double,
    time: Double,
    events: js.Array[Event],
    alpha: Double,
    blend: MixBlend,
    direction: MixDirection
  ): Unit
  
  def getPropertyId(): Double
}
object Timeline {
  
  inline def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Callback,
    getPropertyId: CallbackTo[Double]
  ): Timeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7((t0: Skeleton, t1: Double, t2: Double, t3: js.Array[Event], t4: Double, t5: MixBlend, t6: MixDirection) => (apply(t0, t1, t2, t3, t4, t5, t6)).runNow()), getPropertyId = getPropertyId.toJsFn)
    __obj.asInstanceOf[Timeline]
  }
  
  extension [Self <: Timeline](x: Self) {
    
    inline def setApply(value: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction7((t0: Skeleton, t1: Double, t2: Double, t3: js.Array[Event], t4: Double, t5: MixBlend, t6: MixDirection) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    
    inline def setGetPropertyId(value: CallbackTo[Double]): Self = StObject.set(x, "getPropertyId", value.toJsFn)
  }
}
