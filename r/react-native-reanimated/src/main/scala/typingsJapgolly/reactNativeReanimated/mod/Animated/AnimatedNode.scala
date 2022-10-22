package typingsJapgolly.reactNativeReanimated.mod.Animated

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedNode[T] extends StObject {
  
  /**
    * ' __value' is not available at runtime on AnimatedNode<T>. It is
    * necessary to have some discriminating property on a type to know that
    * an AnimatedNode<number> and AnimatedNode<string> are not compatible types.
    */
  @JSName(" __value")
  var Space__value: T
  
  def isNativelyInitialized(): Boolean
}
object AnimatedNode {
  
  inline def apply[T](Space__value: T, isNativelyInitialized: CallbackTo[Boolean]): AnimatedNode[T] = {
    val __obj = js.Dynamic.literal(isNativelyInitialized = isNativelyInitialized.toJsFn)
    __obj.updateDynamic(" __value")(Space__value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedNode[T]]
  }
  
  extension [Self <: AnimatedNode[?], T](x: Self & AnimatedNode[T]) {
    
    inline def setIsNativelyInitialized(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNativelyInitialized", value.toJsFn)
    
    inline def setSpace__value(value: T): Self = StObject.set(x, " __value", value.asInstanceOf[js.Any])
  }
}
