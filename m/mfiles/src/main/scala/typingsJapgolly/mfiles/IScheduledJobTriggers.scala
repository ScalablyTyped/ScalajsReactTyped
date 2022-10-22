package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScheduledJobTriggers extends StObject {
  
  def Add(Index: Double, ScheduledJobTrigger: IScheduledJobTrigger): Unit
  
  def Clone(): IScheduledJobTriggers
  
  val Count: Double
  
  def Item(Index: Double): IScheduledJobTrigger
  
  def Remove(Index: Double): Unit
}
object IScheduledJobTriggers {
  
  inline def apply(
    Add: (Double, IScheduledJobTrigger) => Callback,
    Clone: CallbackTo[IScheduledJobTriggers],
    Count: Double,
    Item: Double => IScheduledJobTrigger,
    Remove: Double => Callback
  ): IScheduledJobTriggers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IScheduledJobTrigger) => (Add(t0, t1)).runNow()), Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IScheduledJobTriggers]
  }
  
  extension [Self <: IScheduledJobTriggers](x: Self) {
    
    inline def setAdd(value: (Double, IScheduledJobTrigger) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IScheduledJobTrigger) => (value(t0, t1)).runNow()))
    
    inline def setClone(value: CallbackTo[IScheduledJobTriggers]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IScheduledJobTrigger): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
