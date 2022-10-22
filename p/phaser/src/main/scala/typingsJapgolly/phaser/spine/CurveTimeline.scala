package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurveTimeline
  extends StObject
     with Timeline {
  
  /* private */ var curves: Any
  
  def getCurvePercent(frameIndex: Double, percent: Double): Double
  
  def getCurveType(frameIndex: Double): Double
  
  def getFrameCount(): Double
  
  def setCurve(frameIndex: Double, cx1: Double, cy1: Double, cx2: Double, cy2: Double): Unit
  
  def setLinear(frameIndex: Double): Unit
  
  def setStepped(frameIndex: Double): Unit
}
object CurveTimeline {
  
  inline def apply(
    apply: (Skeleton, Double, Double, js.Array[Event], Double, MixBlend, MixDirection) => Callback,
    curves: Any,
    getCurvePercent: (Double, Double) => Double,
    getCurveType: Double => Double,
    getFrameCount: CallbackTo[Double],
    getPropertyId: CallbackTo[Double],
    setCurve: (Double, Double, Double, Double, Double) => Callback,
    setLinear: Double => Callback,
    setStepped: Double => Callback
  ): CurveTimeline = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction7((t0: Skeleton, t1: Double, t2: Double, t3: js.Array[Event], t4: Double, t5: MixBlend, t6: MixDirection) => (apply(t0, t1, t2, t3, t4, t5, t6)).runNow()), curves = curves.asInstanceOf[js.Any], getCurvePercent = js.Any.fromFunction2(getCurvePercent), getCurveType = js.Any.fromFunction1(getCurveType), getFrameCount = getFrameCount.toJsFn, getPropertyId = getPropertyId.toJsFn, setCurve = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (setCurve(t0, t1, t2, t3, t4)).runNow()), setLinear = js.Any.fromFunction1((t0: Double) => setLinear(t0).runNow()), setStepped = js.Any.fromFunction1((t0: Double) => setStepped(t0).runNow()))
    __obj.asInstanceOf[CurveTimeline]
  }
  
  extension [Self <: CurveTimeline](x: Self) {
    
    inline def setCurves(value: Any): Self = StObject.set(x, "curves", value.asInstanceOf[js.Any])
    
    inline def setGetCurvePercent(value: (Double, Double) => Double): Self = StObject.set(x, "getCurvePercent", js.Any.fromFunction2(value))
    
    inline def setGetCurveType(value: Double => Double): Self = StObject.set(x, "getCurveType", js.Any.fromFunction1(value))
    
    inline def setGetFrameCount(value: CallbackTo[Double]): Self = StObject.set(x, "getFrameCount", value.toJsFn)
    
    inline def setSetCurve(value: (Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "setCurve", js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setSetLinear(value: Double => Callback): Self = StObject.set(x, "setLinear", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetStepped(value: Double => Callback): Self = StObject.set(x, "setStepped", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
