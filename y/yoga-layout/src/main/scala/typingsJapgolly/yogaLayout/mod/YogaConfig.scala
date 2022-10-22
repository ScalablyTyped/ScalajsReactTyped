package typingsJapgolly.yogaLayout.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YogaConfig extends StObject {
  
  def isExperimentalFeatureEnabled(feature: YogaExperimentalFeature): Boolean
  
  def setExperimentalFeatureEnabled(feature: YogaExperimentalFeature, enabled: Boolean): Unit
  
  def setPointScaleFactor(factor: Double): Unit
}
object YogaConfig {
  
  inline def apply(
    isExperimentalFeatureEnabled: YogaExperimentalFeature => Boolean,
    setExperimentalFeatureEnabled: (YogaExperimentalFeature, Boolean) => Callback,
    setPointScaleFactor: Double => Callback
  ): YogaConfig = {
    val __obj = js.Dynamic.literal(isExperimentalFeatureEnabled = js.Any.fromFunction1(isExperimentalFeatureEnabled), setExperimentalFeatureEnabled = js.Any.fromFunction2((t0: YogaExperimentalFeature, t1: Boolean) => (setExperimentalFeatureEnabled(t0, t1)).runNow()), setPointScaleFactor = js.Any.fromFunction1((t0: Double) => setPointScaleFactor(t0).runNow()))
    __obj.asInstanceOf[YogaConfig]
  }
  
  extension [Self <: YogaConfig](x: Self) {
    
    inline def setIsExperimentalFeatureEnabled(value: YogaExperimentalFeature => Boolean): Self = StObject.set(x, "isExperimentalFeatureEnabled", js.Any.fromFunction1(value))
    
    inline def setSetExperimentalFeatureEnabled(value: (YogaExperimentalFeature, Boolean) => Callback): Self = StObject.set(x, "setExperimentalFeatureEnabled", js.Any.fromFunction2((t0: YogaExperimentalFeature, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setSetPointScaleFactor(value: Double => Callback): Self = StObject.set(x, "setPointScaleFactor", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
