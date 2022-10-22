package typingsJapgolly.ionicCore.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dur extends StObject {
  
  var circles: Double
  
  var dur: Double
  
  var elmDuration: Boolean
  
  def fn(): Cx
}
object Dur {
  
  inline def apply(circles: Double, dur: Double, elmDuration: Boolean, fn: CallbackTo[Cx]): Dur = {
    val __obj = js.Dynamic.literal(circles = circles.asInstanceOf[js.Any], dur = dur.asInstanceOf[js.Any], elmDuration = elmDuration.asInstanceOf[js.Any], fn = fn.toJsFn)
    __obj.asInstanceOf[Dur]
  }
  
  extension [Self <: Dur](x: Self) {
    
    inline def setCircles(value: Double): Self = StObject.set(x, "circles", value.asInstanceOf[js.Any])
    
    inline def setDur(value: Double): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
    
    inline def setElmDuration(value: Boolean): Self = StObject.set(x, "elmDuration", value.asInstanceOf[js.Any])
    
    inline def setFn(value: CallbackTo[Cx]): Self = StObject.set(x, "fn", value.toJsFn)
  }
}
