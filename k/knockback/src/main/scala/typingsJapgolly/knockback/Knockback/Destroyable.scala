package typingsJapgolly.knockback.Knockback

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destroyable extends StObject {
  
  def destroy(): Any
}
object Destroyable {
  
  inline def apply(destroy: CallbackTo[Any]): Destroyable = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn)
    __obj.asInstanceOf[Destroyable]
  }
  
  extension [Self <: Destroyable](x: Self) {
    
    inline def setDestroy(value: CallbackTo[Any]): Self = StObject.set(x, "destroy", value.toJsFn)
  }
}
