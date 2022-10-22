package typingsJapgolly.plottable.anon

import typingsJapgolly.plottable.plottableStrings.animationFrame
import typingsJapgolly.plottable.plottableStrings.immediate
import typingsJapgolly.plottable.plottableStrings.timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationFrame extends StObject {
  
  var animationFrame: typingsJapgolly.plottable.plottableStrings.animationFrame
  
  var immediate: typingsJapgolly.plottable.plottableStrings.immediate
  
  var timeout: typingsJapgolly.plottable.plottableStrings.timeout
}
object AnimationFrame {
  
  inline def apply(): AnimationFrame = {
    val __obj = js.Dynamic.literal(animationFrame = "animationFrame", immediate = "immediate", timeout = "timeout")
    __obj.asInstanceOf[AnimationFrame]
  }
  
  extension [Self <: AnimationFrame](x: Self) {
    
    inline def setAnimationFrame(value: animationFrame): Self = StObject.set(x, "animationFrame", value.asInstanceOf[js.Any])
    
    inline def setImmediate(value: immediate): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: timeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
