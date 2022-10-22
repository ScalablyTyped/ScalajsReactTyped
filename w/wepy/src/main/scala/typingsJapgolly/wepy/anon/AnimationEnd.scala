package typingsJapgolly.wepy.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.wepy.wxEnhancedMod.LagLng
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationEnd extends StObject {
  
  def animationEnd(): Unit
  
  var autoRotate: Boolean
  
  var destination: LagLng
  
  var duration: Double
  
  var markerId: Double
}
object AnimationEnd {
  
  inline def apply(
    animationEnd: Callback,
    autoRotate: Boolean,
    destination: LagLng,
    duration: Double,
    markerId: Double
  ): AnimationEnd = {
    val __obj = js.Dynamic.literal(animationEnd = animationEnd.toJsFn, autoRotate = autoRotate.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], markerId = markerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEnd]
  }
  
  extension [Self <: AnimationEnd](x: Self) {
    
    inline def setAnimationEnd(value: Callback): Self = StObject.set(x, "animationEnd", value.toJsFn)
    
    inline def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: LagLng): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setMarkerId(value: Double): Self = StObject.set(x, "markerId", value.asInstanceOf[js.Any])
  }
}
