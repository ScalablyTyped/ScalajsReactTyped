package typingsJapgolly.yogaLayout.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigStatic extends StObject {
  
  def create(): YogaConfig
  
  def destroy(config: YogaConfig): Any
}
object ConfigStatic {
  
  inline def apply(create: CallbackTo[YogaConfig], destroy: YogaConfig => Any): ConfigStatic = {
    val __obj = js.Dynamic.literal(create = create.toJsFn, destroy = js.Any.fromFunction1(destroy))
    __obj.asInstanceOf[ConfigStatic]
  }
  
  extension [Self <: ConfigStatic](x: Self) {
    
    inline def setCreate(value: CallbackTo[YogaConfig]): Self = StObject.set(x, "create", value.toJsFn)
    
    inline def setDestroy(value: YogaConfig => Any): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
  }
}
