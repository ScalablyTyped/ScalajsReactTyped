package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotateTimeline
  extends StObject
     with CurveTimeline {
  
  var boneIndex: Double
  
  var frames: ArrayLike[Double]
  
  def setFrame(frameIndex: Double, time: Double, degrees: Double): Unit
}
object RotateTimeline {
  
  inline def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Callback,
    boneIndex: Double,
    curves: Any,
    frames: ArrayLike[Double],
    getCurvePercent: (Double, Double) => Double,
    getCurveType: Double => Double,
    getFrameCount: CallbackTo[Double],
    getPropertyId: CallbackTo[Double],
    setCurve: (Double, Double, Double, Double, Double) => Callback,
    setFrame: (Double, Double, Double) => Callback,
    setLinear: Double => Callback,
    setStepped: Double => Callback
  ): RotateTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7((t0: Skeleton, t1: Double, t2: Double, t3: js.Array[Event], t4: Double, t5: MixBlend, t6: MixDirection) => (apply(t0, t1, t2, t3, t4, t5, t6)).runNow()), boneIndex = boneIndex.asInstanceOf[js.Any], curves = curves.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getCurvePercent = js.Any.fromFunction2(getCurvePercent), getCurveType = js.Any.fromFunction1(getCurveType), getFrameCount = getFrameCount.toJsFn, getPropertyId = getPropertyId.toJsFn, setCurve = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setCurve(t0, t1, t2, t3, t4)).runNow()), setFrame = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (setFrame(t0, t1, t2)).runNow()), setLinear = js.Any.fromFunction1((t0: Double) => setLinear(t0).runNow()), setStepped = js.Any.fromFunction1((t0: Double) => setStepped(t0).runNow()))
    __obj.asInstanceOf[RotateTimeline]
  }
  
  extension [Self <: RotateTimeline](x: Self) {
    
    inline def setBoneIndex(value: Double): Self = StObject.set(x, "boneIndex", value.asInstanceOf[js.Any])
    
    inline def setFrames(value: ArrayLike[Double]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setSetFrame(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "setFrame", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
  }
}
