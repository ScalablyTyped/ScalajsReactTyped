package typingsJapgolly.pixiCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISystem extends StObject {
  
  /** Generic destroy methods to be overridden by the subclass */
  def destroy(): Unit
}
object ISystem {
  
  inline def apply(destroy: Callback): ISystem = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn)
    __obj.asInstanceOf[ISystem]
  }
  
  extension [Self <: ISystem](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
  }
}
