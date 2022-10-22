package typingsJapgolly.openseadragon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationTime extends StObject {
  
  var animationTime: Double
  
  var exponential: js.UndefOr[Boolean] = js.undefined
  
  var initial: js.UndefOr[Double] = js.undefined
  
  var springStiffness: Double
}
object AnimationTime {
  
  inline def apply(animationTime: Double, springStiffness: Double): AnimationTime = {
    val __obj = js.Dynamic.literal(animationTime = animationTime.asInstanceOf[js.Any], springStiffness = springStiffness.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTime]
  }
  
  extension [Self <: AnimationTime](x: Self) {
    
    inline def setAnimationTime(value: Double): Self = StObject.set(x, "animationTime", value.asInstanceOf[js.Any])
    
    inline def setExponential(value: Boolean): Self = StObject.set(x, "exponential", value.asInstanceOf[js.Any])
    
    inline def setExponentialUndefined: Self = StObject.set(x, "exponential", js.undefined)
    
    inline def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    inline def setSpringStiffness(value: Double): Self = StObject.set(x, "springStiffness", value.asInstanceOf[js.Any])
  }
}
