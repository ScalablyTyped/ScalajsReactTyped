package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStateTransitions extends StObject {
  
  def Add(Index: Double, StateTransition: IStateTransition): Unit
  
  val Count: Double
  
  def Item(Index: Double): IStateTransition
  
  def Remove(Index: Double): Unit
}
object IStateTransitions {
  
  inline def apply(
    Add: (Double, IStateTransition) => Callback,
    Count: Double,
    Item: Double => IStateTransition,
    Remove: Double => Callback
  ): IStateTransitions = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IStateTransition) => (Add(t0, t1)).runNow()), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IStateTransitions]
  }
  
  extension [Self <: IStateTransitions](x: Self) {
    
    inline def setAdd(value: (Double, IStateTransition) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IStateTransition) => (value(t0, t1)).runNow()))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IStateTransition): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
