package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISetPropertiesParamsOfMultipleObjects extends StObject {
  
  def Add(Index: Double, SetPropertiesParams: ISetPropertiesParams): Unit
  
  def Clone(): ISetPropertiesParamsOfMultipleObjects
  
  val Count: Double
  
  def Item(Index: Double): ISetPropertiesParams
  
  def Remove(Index: Double): Unit
}
object ISetPropertiesParamsOfMultipleObjects {
  
  inline def apply(
    Add: (Double, ISetPropertiesParams) => Callback,
    Clone: CallbackTo[ISetPropertiesParamsOfMultipleObjects],
    Count: Double,
    Item: Double => ISetPropertiesParams,
    Remove: Double => Callback
  ): ISetPropertiesParamsOfMultipleObjects = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: ISetPropertiesParams) => (Add(t0, t1)).runNow()), Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[ISetPropertiesParamsOfMultipleObjects]
  }
  
  extension [Self <: ISetPropertiesParamsOfMultipleObjects](x: Self) {
    
    inline def setAdd(value: (Double, ISetPropertiesParams) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: ISetPropertiesParams) => (value(t0, t1)).runNow()))
    
    inline def setClone(value: CallbackTo[ISetPropertiesParamsOfMultipleObjects]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => ISetPropertiesParams): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
