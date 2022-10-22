package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileClasses extends StObject {
  
  def Add(Index: Double, FileClass: IFileClass): Unit
  
  def Clone(): IFileClasses
  
  val Count: Double
  
  def Item(Index: Double): IFileClass
  
  def Remove(Index: Double): Unit
}
object IFileClasses {
  
  inline def apply(
    Add: (Double, IFileClass) => Callback,
    Clone: CallbackTo[IFileClasses],
    Count: Double,
    Item: Double => IFileClass,
    Remove: Double => Callback
  ): IFileClasses = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IFileClass) => (Add(t0, t1)).runNow()), Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IFileClasses]
  }
  
  extension [Self <: IFileClasses](x: Self) {
    
    inline def setAdd(value: (Double, IFileClass) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IFileClass) => (value(t0, t1)).runNow()))
    
    inline def setClone(value: CallbackTo[IFileClasses]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IFileClass): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
