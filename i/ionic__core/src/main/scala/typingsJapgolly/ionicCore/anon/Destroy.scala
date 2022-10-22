package typingsJapgolly.ionicCore.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destroy extends StObject {
  
  def destroy(): Unit
  
  def setFocus(elements: js.Array[Element]): Unit
}
object Destroy {
  
  inline def apply(destroy: Callback, setFocus: js.Array[Element] => Callback): Destroy = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, setFocus = js.Any.fromFunction1((t0: js.Array[Element]) => setFocus(t0).runNow()))
    __obj.asInstanceOf[Destroy]
  }
  
  extension [Self <: Destroy](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setSetFocus(value: js.Array[Element] => Callback): Self = StObject.set(x, "setFocus", js.Any.fromFunction1((t0: js.Array[Element]) => value(t0).runNow()))
  }
}
