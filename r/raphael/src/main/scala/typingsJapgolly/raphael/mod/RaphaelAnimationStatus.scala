package typingsJapgolly.raphael.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaphaelAnimationStatus extends StObject {
  
  /** The animation to which the status applies. */
  var anim: RaphaelAnimation
  
  /** The current status of the animation, i.e. the normalized animation time, a value between `0` and `1`. */
  var status: Double
}
object RaphaelAnimationStatus {
  
  inline def apply(anim: RaphaelAnimation, status: Double): RaphaelAnimationStatus = {
    val __obj = js.Dynamic.literal(anim = anim.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelAnimationStatus]
  }
  
  extension [Self <: RaphaelAnimationStatus](x: Self) {
    
    inline def setAnim(value: RaphaelAnimation): Self = StObject.set(x, "anim", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
