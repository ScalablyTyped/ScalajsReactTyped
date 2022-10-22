package typingsJapgolly.blessed.mod.Widgets

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDestroyable extends StObject {
  
  def destroy(): Unit
}
object IDestroyable {
  
  inline def apply(destroy: Callback): IDestroyable = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn)
    __obj.asInstanceOf[IDestroyable]
  }
  
  extension [Self <: IDestroyable](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
  }
}
