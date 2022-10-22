package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOCRZones extends StObject {
  
  def Add(Index: Double, OCRZone: IOCRZone): Unit
  
  def Clone(): IOCRZones
  
  val Count: Double
  
  def Item(Index: Double): IOCRZone
  
  def Remove(Index: Double): Unit
}
object IOCRZones {
  
  inline def apply(
    Add: (Double, IOCRZone) => Callback,
    Clone: CallbackTo[IOCRZones],
    Count: Double,
    Item: Double => IOCRZone,
    Remove: Double => Callback
  ): IOCRZones = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IOCRZone) => (Add(t0, t1)).runNow()), Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IOCRZones]
  }
  
  extension [Self <: IOCRZones](x: Self) {
    
    inline def setAdd(value: (Double, IOCRZone) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IOCRZone) => (value(t0, t1)).runNow()))
    
    inline def setClone(value: CallbackTo[IOCRZones]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IOCRZone): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
