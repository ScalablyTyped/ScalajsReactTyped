package typingsJapgolly.mapboxGl.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IControl extends StObject {
  
  var getDefaultPosition: js.UndefOr[js.Function0[String]] = js.undefined
  
  def onAdd(map: Map): HTMLElement
  
  def onRemove(map: Map): Unit
}
object IControl {
  
  inline def apply(onAdd: Map => HTMLElement, onRemove: Map => Callback): IControl = {
    val __obj = js.Dynamic.literal(onAdd = js.Any.fromFunction1(onAdd), onRemove = js.Any.fromFunction1((t0: Map) => onRemove(t0).runNow()))
    __obj.asInstanceOf[IControl]
  }
  
  extension [Self <: IControl](x: Self) {
    
    inline def setGetDefaultPosition(value: CallbackTo[String]): Self = StObject.set(x, "getDefaultPosition", value.toJsFn)
    
    inline def setGetDefaultPositionUndefined: Self = StObject.set(x, "getDefaultPosition", js.undefined)
    
    inline def setOnAdd(value: Map => HTMLElement): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    
    inline def setOnRemove(value: Map => Callback): Self = StObject.set(x, "onRemove", js.Any.fromFunction1((t0: Map) => value(t0).runNow()))
  }
}
