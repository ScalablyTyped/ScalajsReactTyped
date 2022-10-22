package typingsJapgolly.pixiCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRendererPlugin extends StObject {
  
  def destroy(): Unit
}
object IRendererPlugin {
  
  inline def apply(destroy: Callback): IRendererPlugin = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn)
    __obj.asInstanceOf[IRendererPlugin]
  }
  
  extension [Self <: IRendererPlugin](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
  }
}
