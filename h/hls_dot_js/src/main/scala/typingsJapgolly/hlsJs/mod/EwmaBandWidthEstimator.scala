package typingsJapgolly.hlsJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EwmaBandWidthEstimator extends StObject {
  
  def canEstimate(): Boolean
  
  /* private */ var defaultEstimate_ : Any
  
  def destroy(): Unit
  
  /* private */ var fast_ : Any
  
  def getEstimate(): Double
  
  /* private */ var minDelayMs_ : Any
  
  /* private */ var minWeight_ : Any
  
  def sample(durationMs: Double, numBytes: Double): Unit
  
  /* private */ var slow_ : Any
  
  def update(slow: Double, fast: Double): Unit
}
object EwmaBandWidthEstimator {
  
  inline def apply(
    canEstimate: CallbackTo[Boolean],
    defaultEstimate_ : Any,
    destroy: Callback,
    fast_ : Any,
    getEstimate: CallbackTo[Double],
    minDelayMs_ : Any,
    minWeight_ : Any,
    sample: (Double, Double) => Callback,
    slow_ : Any,
    update: (Double, Double) => Callback
  ): EwmaBandWidthEstimator = {
    val __obj = js.Dynamic.literal(canEstimate = canEstimate.toJsFn, defaultEstimate_ = defaultEstimate_.asInstanceOf[js.Any], destroy = destroy.toJsFn, fast_ = fast_.asInstanceOf[js.Any], getEstimate = getEstimate.toJsFn, minDelayMs_ = minDelayMs_.asInstanceOf[js.Any], minWeight_ = minWeight_.asInstanceOf[js.Any], sample = js.Any.fromFunction2((t0: Double, t1: Double) => (sample(t0, t1)).runNow()), slow_ = slow_.asInstanceOf[js.Any], update = js.Any.fromFunction2((t0: Double, t1: Double) => (update(t0, t1)).runNow()))
    __obj.asInstanceOf[EwmaBandWidthEstimator]
  }
  
  extension [Self <: EwmaBandWidthEstimator](x: Self) {
    
    inline def setCanEstimate(value: CallbackTo[Boolean]): Self = StObject.set(x, "canEstimate", value.toJsFn)
    
    inline def setDefaultEstimate_(value: Any): Self = StObject.set(x, "defaultEstimate_", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setFast_(value: Any): Self = StObject.set(x, "fast_", value.asInstanceOf[js.Any])
    
    inline def setGetEstimate(value: CallbackTo[Double]): Self = StObject.set(x, "getEstimate", value.toJsFn)
    
    inline def setMinDelayMs_(value: Any): Self = StObject.set(x, "minDelayMs_", value.asInstanceOf[js.Any])
    
    inline def setMinWeight_(value: Any): Self = StObject.set(x, "minWeight_", value.asInstanceOf[js.Any])
    
    inline def setSample(value: (Double, Double) => Callback): Self = StObject.set(x, "sample", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSlow_(value: Any): Self = StObject.set(x, "slow_", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: (Double, Double) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
  }
}
