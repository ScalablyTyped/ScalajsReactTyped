package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseWrapperMethods extends StObject {
  
  def destroy(): Unit
}
object MouseWrapperMethods {
  
  inline def apply(destroy: Callback): MouseWrapperMethods = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn)
    __obj.asInstanceOf[MouseWrapperMethods]
  }
  
  extension [Self <: MouseWrapperMethods](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
  }
}
