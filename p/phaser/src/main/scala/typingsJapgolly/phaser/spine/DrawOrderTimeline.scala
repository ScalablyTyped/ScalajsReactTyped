package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawOrderTimeline
  extends StObject
     with Timeline {
  
  var drawOrders: js.Array[js.Array[Double]]
  
  var frames: ArrayLike[Double]
  
  def getFrameCount(): Double
  
  def setFrame(frameIndex: Double, time: Double, drawOrder: js.Array[Double]): Unit
}
object DrawOrderTimeline {
  
  inline def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Callback,
    drawOrders: js.Array[js.Array[Double]],
    frames: ArrayLike[Double],
    getFrameCount: CallbackTo[Double],
    getPropertyId: CallbackTo[Double],
    setFrame: (Double, Double, js.Array[Double]) => Callback
  ): DrawOrderTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7((t0: Skeleton, t1: Double, t2: Double, t3: js.Array[Event], t4: Double, t5: MixBlend, t6: MixDirection) => (apply(t0, t1, t2, t3, t4, t5, t6)).runNow()), drawOrders = drawOrders.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getFrameCount = getFrameCount.toJsFn, getPropertyId = getPropertyId.toJsFn, setFrame = js.Any.fromFunction3((t0: Double, t1: Double, t2: js.Array[Double]) => (setFrame(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[DrawOrderTimeline]
  }
  
  extension [Self <: DrawOrderTimeline](x: Self) {
    
    inline def setDrawOrders(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "drawOrders", value.asInstanceOf[js.Any])
    
    inline def setDrawOrdersVarargs(value: js.Array[Double]*): Self = StObject.set(x, "drawOrders", js.Array(value*))
    
    inline def setFrames(value: ArrayLike[Double]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setGetFrameCount(value: CallbackTo[Double]): Self = StObject.set(x, "getFrameCount", value.toJsFn)
    
    inline def setSetFrame(value: (Double, Double, js.Array[Double]) => Callback): Self = StObject.set(x, "setFrame", js.Any.fromFunction3((t0: Double, t1: Double, t2: js.Array[Double]) => (value(t0, t1, t2)).runNow()))
  }
}
