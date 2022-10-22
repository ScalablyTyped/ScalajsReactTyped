package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetedAnimation extends StObject {
  
  /**
    * Animation to perform
    */
  var animation: Animation
  
  /**
    * Returns the string "TargetedAnimation"
    * @returns "TargetedAnimation"
    */
  def getClassName(): String
  
  /**
    * Serialize the object
    * @returns the JSON object representing the current entity
    */
  def serialize(): Any
  
  /**
    * Target to animate
    */
  var target: Any
}
object TargetedAnimation {
  
  inline def apply(animation: Animation, getClassName: CallbackTo[String], serialize: CallbackTo[Any], target: Any): TargetedAnimation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], getClassName = getClassName.toJsFn, serialize = serialize.toJsFn, target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetedAnimation]
  }
  
  extension [Self <: TargetedAnimation](x: Self) {
    
    inline def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setGetClassName(value: CallbackTo[String]): Self = StObject.set(x, "getClassName", value.toJsFn)
    
    inline def setSerialize(value: CallbackTo[Any]): Self = StObject.set(x, "serialize", value.toJsFn)
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
