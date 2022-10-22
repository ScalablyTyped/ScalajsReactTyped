package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectClasses extends StObject {
  
  def Add(Index: Double, ObjectClass: IObjectClass): Unit
  
  def Clone(): IObjectClasses
  
  val Count: Double
  
  def Item(Index: Double): IObjectClass
  
  def Remove(Index: Double): Unit
}
object IObjectClasses {
  
  inline def apply(
    Add: (Double, IObjectClass) => Callback,
    Clone: CallbackTo[IObjectClasses],
    Count: Double,
    Item: Double => IObjectClass,
    Remove: Double => Callback
  ): IObjectClasses = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IObjectClass) => (Add(t0, t1)).runNow()), Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IObjectClasses]
  }
  
  extension [Self <: IObjectClasses](x: Self) {
    
    inline def setAdd(value: (Double, IObjectClass) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IObjectClass) => (value(t0, t1)).runNow()))
    
    inline def setClone(value: CallbackTo[IObjectClasses]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IObjectClass): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
