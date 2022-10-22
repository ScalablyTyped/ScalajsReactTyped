package typingsJapgolly.reactNativeReanimated.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Factory extends StObject {
  
  def factory(): js.Function1[/* x */ Double, Double]
}
object Factory {
  
  inline def apply(factory: CallbackTo[js.Function1[/* x */ Double, Double]]): Factory = {
    val __obj = js.Dynamic.literal(factory = factory.toJsFn)
    __obj.asInstanceOf[Factory]
  }
  
  extension [Self <: Factory](x: Self) {
    
    inline def setFactory(value: CallbackTo[js.Function1[/* x */ Double, Double]]): Self = StObject.set(x, "factory", value.toJsFn)
  }
}
