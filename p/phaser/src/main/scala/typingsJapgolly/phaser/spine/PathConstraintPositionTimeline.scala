package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathConstraintPositionTimeline
  extends StObject
     with CurveTimeline {
  
  var frames: ArrayLike[Double]
  
  var pathConstraintIndex: Double
  
  def setFrame(frameIndex: Double, time: Double, value: Double): Unit
}
object PathConstraintPositionTimeline {
  
  inline def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Callback,
    curves: Any,
    frames: ArrayLike[Double],
    getCurvePercent: (Double, Double) => Double,
    getCurveType: Double => Double,
    getFrameCount: CallbackTo[Double],
    getPropertyId: CallbackTo[Double],
    pathConstraintIndex: Double,
    setCurve: (Double, Double, Double, Double, Double) => Callback,
    setFrame: (Double, Double, Double) => Callback,
    setLinear: Double => Callback,
    setStepped: Double => Callback
  ): PathConstraintPositionTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7((t0: Skeleton, t1: Double, t2: Double, t3: js.Array[Event], t4: Double, t5: MixBlend, t6: MixDirection) => (apply(t0, t1, t2, t3, t4, t5, t6)).runNow()), curves = curves.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], getCurvePercent = js.Any.fromFunction2(getCurvePercent), getCurveType = js.Any.fromFunction1(getCurveType), getFrameCount = getFrameCount.toJsFn, getPropertyId = getPropertyId.toJsFn, pathConstraintIndex = pathConstraintIndex.asInstanceOf[js.Any], setCurve = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setCurve(t0, t1, t2, t3, t4)).runNow()), setFrame = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (setFrame(t0, t1, t2)).runNow()), setLinear = js.Any.fromFunction1((t0: Double) => setLinear(t0).runNow()), setStepped = js.Any.fromFunction1((t0: Double) => setStepped(t0).runNow()))
    __obj.asInstanceOf[PathConstraintPositionTimeline]
  }
  
  extension [Self <: PathConstraintPositionTimeline](x: Self) {
    
    inline def setFrames(value: ArrayLike[Double]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
    
    inline def setPathConstraintIndex(value: Double): Self = StObject.set(x, "pathConstraintIndex", value.asInstanceOf[js.Any])
    
    inline def setSetFrame(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "setFrame", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
  }
}
