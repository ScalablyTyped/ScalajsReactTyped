package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStatesAdmin extends StObject {
  
  def Add(Index: Double, StateAdmin: IStateAdmin): Unit
  
  val Count: Double
  
  def Item(Index: Double): IStateAdmin
  
  def Remove(Index: Double): Unit
}
object IStatesAdmin {
  
  inline def apply(
    Add: (Double, IStateAdmin) => Callback,
    Count: Double,
    Item: Double => IStateAdmin,
    Remove: Double => Callback
  ): IStatesAdmin = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IStateAdmin) => (Add(t0, t1)).runNow()), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IStatesAdmin]
  }
  
  extension [Self <: IStatesAdmin](x: Self) {
    
    inline def setAdd(value: (Double, IStateAdmin) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IStateAdmin) => (value(t0, t1)).runNow()))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IStateAdmin): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
