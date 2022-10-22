package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOCRPages extends StObject {
  
  def Add(Index: Double, OCRPage: IOCRPage): Unit
  
  def Clone(): IOCRPages
  
  val Count: Double
  
  def Item(Index: Double): IOCRPage
  
  def Remove(Index: Double): Unit
}
object IOCRPages {
  
  inline def apply(
    Add: (Double, IOCRPage) => Callback,
    Clone: CallbackTo[IOCRPages],
    Count: Double,
    Item: Double => IOCRPage,
    Remove: Double => Callback
  ): IOCRPages = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IOCRPage) => (Add(t0, t1)).runNow()), Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IOCRPages]
  }
  
  extension [Self <: IOCRPages](x: Self) {
    
    inline def setAdd(value: (Double, IOCRPage) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IOCRPage) => (value(t0, t1)).runNow()))
    
    inline def setClone(value: CallbackTo[IOCRPages]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IOCRPage): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
