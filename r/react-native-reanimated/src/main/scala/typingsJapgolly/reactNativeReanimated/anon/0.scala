package typingsJapgolly.reactNativeReanimated.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNativeReanimated.mod.Animated.EasingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def factory(): EasingFunction
}
object `0` {
  
  inline def apply(factory: CallbackTo[EasingFunction]): `0` = {
    val __obj = js.Dynamic.literal(factory = factory.toJsFn)
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setFactory(value: CallbackTo[EasingFunction]): Self = StObject.set(x, "factory", value.toJsFn)
  }
}
