package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITypedValues extends StObject {
  
  def Add(Index: Double, TypedValue: ITypedValue): Unit
  
  val Count: Double
  
  def Item(Index: Double): ITypedValue
  
  def Remove(Index: Double): Unit
}
object ITypedValues {
  
  inline def apply(
    Add: (Double, ITypedValue) => Callback,
    Count: Double,
    Item: Double => ITypedValue,
    Remove: Double => Callback
  ): ITypedValues = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: ITypedValue) => (Add(t0, t1)).runNow()), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[ITypedValues]
  }
  
  extension [Self <: ITypedValues](x: Self) {
    
    inline def setAdd(value: (Double, ITypedValue) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: ITypedValue) => (value(t0, t1)).runNow()))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => ITypedValue): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
