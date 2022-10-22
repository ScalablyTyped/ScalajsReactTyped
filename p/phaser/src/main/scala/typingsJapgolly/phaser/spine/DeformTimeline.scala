package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeformTimeline
  extends StObject
     with CurveTimeline {
  
  var attachment: VertexAttachment
  
  var frameVertices: js.Array[ArrayLike[Double]]
  
  var frames: ArrayLike[Double]
  
  def setFrame(frameIndex: Double, time: Double, vertices: ArrayLike[Double]): Unit
  
  var slotIndex: Double
}
object DeformTimeline {
  
  inline def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Callback,
    attachment: VertexAttachment,
    curves: Any,
    frameVertices: js.Array[ArrayLike[Double]],
    frames: ArrayLike[Double],
    getCurvePercent: (Double, Double) => Double,
    getCurveType: Double => Double,
    getFrameCount: CallbackTo[Double],
    getPropertyId: CallbackTo[Double],
    setCurve: (Double, Double, Double, Double, Double) => Callback,
    setFrame: (Double, Double, ArrayLike[Double]) => Callback,
    setLinear: Double => Callback,
    setStepped: Double => Callback,
    slotIndex: Double
  ): DeformTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7((t0: Skeleton, t1: Double, t2: Double, t3: js.Array[Event], t4: Double, t5: MixBlend, t6: MixDirection) => (apply(t0, t1, t2, t3, t4, t5, t6)).runNow()), attachment = attachment.asInstanceOf[js.Any], curves = curves.asInstanceOf[js.Any], frameVertices = frameVertices.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getCurvePercent = js.Any.fromFunction2(getCurvePercent), getCurveType = js.Any.fromFunction1(getCurveType), getFrameCount = getFrameCount.toJsFn, getPropertyId = getPropertyId.toJsFn, setCurve = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setCurve(t0, t1, t2, t3, t4)).runNow()), setFrame = js.Any.fromFunction3((t0: Double, t1: Double, t2: ArrayLike[Double]) => (setFrame(t0, t1, t2)).runNow()), setLinear = js.Any.fromFunction1((t0: Double) => setLinear(t0).runNow()), setStepped = js.Any.fromFunction1((t0: Double) => setStepped(t0).runNow()), slotIndex = slotIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeformTimeline]
  }
  
  extension [Self <: DeformTimeline](x: Self) {
    
    inline def setAttachment(value: VertexAttachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setFrameVertices(value: js.Array[ArrayLike[Double]]): Self = StObject.set(x, "frameVertices", value.asInstanceOf[js.Any])
    
    inline def setFrameVerticesVarargs(value: ArrayLike[Double]*): Self = StObject.set(x, "frameVertices", js.Array(value*))
    
    inline def setFrames(value: ArrayLike[Double]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setSetFrame(value: (Double, Double, ArrayLike[Double]) => Callback): Self = StObject.set(x, "setFrame", js.Any.fromFunction3((t0: Double, t1: Double, t2: ArrayLike[Double]) => (value(t0, t1, t2)).runNow()))
    
    inline def setSlotIndex(value: Double): Self = StObject.set(x, "slotIndex", value.asInstanceOf[js.Any])
  }
}
