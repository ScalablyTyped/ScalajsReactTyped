package typingsJapgolly.snapchatLensStudio

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result object returned from ManipulateComponent.intersectManipulateFrame().
  * ```
  * // Returns an intersectManipulateFrame based on user touch position
  * //@input Component.ManipulateComponent manip
  *
  * function onTap(eventData)
  * {
  *     var touchPos = eventData.getTouchPosition();
  *     var intersectManipFrame = script.manip.intersectManipulateFrame(touchPos);
  *     if(intersectManipFrame && intersectManipFrame.isValid())
  *     {
  *         screenPoint = intersectManipFrame.getIntersectionPoint();
  *
  *         print(screenPoint.toString());
  *     }
  * }
  * var tapEvent = script.createEvent("TapEvent");
  * tapEvent.bind(onTap);
  * ```
  */
trait ManipulateFrameIntersectResult extends StObject {
  
  /** If there was a valid intersection, returns the intersection point in world space. */
  def getIntersectionPoint(): vec3
  
  /** Returns whether there was a valid intersection. */
  def isValid(): Boolean
}
object ManipulateFrameIntersectResult {
  
  inline def apply(getIntersectionPoint: CallbackTo[vec3], isValid: CallbackTo[Boolean]): ManipulateFrameIntersectResult = {
    val __obj = js.Dynamic.literal(getIntersectionPoint = getIntersectionPoint.toJsFn, isValid = isValid.toJsFn)
    __obj.asInstanceOf[ManipulateFrameIntersectResult]
  }
  
  extension [Self <: ManipulateFrameIntersectResult](x: Self) {
    
    inline def setGetIntersectionPoint(value: CallbackTo[vec3]): Self = StObject.set(x, "getIntersectionPoint", value.toJsFn)
    
    inline def setIsValid(value: CallbackTo[Boolean]): Self = StObject.set(x, "isValid", value.toJsFn)
  }
}
