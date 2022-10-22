package typingsJapgolly.reactSketchapp.anon

import typingsJapgolly.reactSketchapp.reactSketchappStrings.none
import typingsJapgolly.reactSketchapp.reactSketchappStrings.slideFromBottom
import typingsJapgolly.reactSketchapp.reactSketchappStrings.slideFromLeft
import typingsJapgolly.reactSketchapp.reactSketchappStrings.slideFromRight
import typingsJapgolly.reactSketchapp.reactSketchappStrings.slideFromTop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  var animationType: js.UndefOr[none | slideFromRight | slideFromLeft | slideFromBottom | slideFromTop] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var targetId: js.UndefOr[String] = js.undefined
}
object Target {
  
  inline def apply(): Target = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Target]
  }
  
  extension [Self <: Target](x: Self) {
    
    inline def setAnimationType(value: none | slideFromRight | slideFromLeft | slideFromBottom | slideFromTop): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
    
    inline def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
