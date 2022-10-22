package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows controlling an animation.
  * @since OOo 3.4
  */
trait XAnimation extends StObject {
  
  /** determines whether the animation is currently running */
  def isAnimationRunning(): Boolean
  
  /** starts the animation */
  def startAnimation(): Unit
  
  /** stops the animation */
  def stopAnimation(): Unit
}
object XAnimation {
  
  inline def apply(isAnimationRunning: CallbackTo[Boolean], startAnimation: Callback, stopAnimation: Callback): XAnimation = {
    val __obj = js.Dynamic.literal(isAnimationRunning = isAnimationRunning.toJsFn, startAnimation = startAnimation.toJsFn, stopAnimation = stopAnimation.toJsFn)
    __obj.asInstanceOf[XAnimation]
  }
  
  extension [Self <: XAnimation](x: Self) {
    
    inline def setIsAnimationRunning(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAnimationRunning", value.toJsFn)
    
    inline def setStartAnimation(value: Callback): Self = StObject.set(x, "startAnimation", value.toJsFn)
    
    inline def setStopAnimation(value: Callback): Self = StObject.set(x, "stopAnimation", value.toJsFn)
  }
}
