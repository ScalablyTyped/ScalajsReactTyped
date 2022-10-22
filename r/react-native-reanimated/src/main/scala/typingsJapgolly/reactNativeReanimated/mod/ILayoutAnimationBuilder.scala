package typingsJapgolly.reactNativeReanimated.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILayoutAnimationBuilder extends StObject {
  
  def build(): LayoutAnimationFunction
}
object ILayoutAnimationBuilder {
  
  inline def apply(build: CallbackTo[LayoutAnimationFunction]): ILayoutAnimationBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn)
    __obj.asInstanceOf[ILayoutAnimationBuilder]
  }
  
  extension [Self <: ILayoutAnimationBuilder](x: Self) {
    
    inline def setBuild(value: CallbackTo[LayoutAnimationFunction]): Self = StObject.set(x, "build", value.toJsFn)
  }
}
