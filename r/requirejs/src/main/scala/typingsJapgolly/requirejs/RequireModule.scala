package typingsJapgolly.requirejs

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// todo: not sure what to do with this guy
trait RequireModule extends StObject {
  
  /**
    *
    **/
  def config(): js.Object
}
object RequireModule {
  
  inline def apply(config: CallbackTo[js.Object]): RequireModule = {
    val __obj = js.Dynamic.literal(config = config.toJsFn)
    __obj.asInstanceOf[RequireModule]
  }
  
  extension [Self <: RequireModule](x: Self) {
    
    inline def setConfig(value: CallbackTo[js.Object]): Self = StObject.set(x, "config", value.toJsFn)
  }
}
