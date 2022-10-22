package typingsJapgolly.hlsJs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentAPI extends StObject {
  
  def destroy(): Unit
}
object ComponentAPI {
  
  inline def apply(destroy: Callback): ComponentAPI = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn)
    __obj.asInstanceOf[ComponentAPI]
  }
  
  extension [Self <: ComponentAPI](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
  }
}
