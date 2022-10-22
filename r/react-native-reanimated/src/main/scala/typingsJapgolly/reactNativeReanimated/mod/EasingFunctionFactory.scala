package typingsJapgolly.reactNativeReanimated.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNative.mod.EasingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EasingFunctionFactory extends StObject {
  
  def factory(): EasingFunction
}
object EasingFunctionFactory {
  
  inline def apply(factory: CallbackTo[EasingFunction]): EasingFunctionFactory = {
    val __obj = js.Dynamic.literal(factory = factory.toJsFn)
    __obj.asInstanceOf[EasingFunctionFactory]
  }
  
  extension [Self <: EasingFunctionFactory](x: Self) {
    
    inline def setFactory(value: CallbackTo[EasingFunction]): Self = StObject.set(x, "factory", value.toJsFn)
  }
}
