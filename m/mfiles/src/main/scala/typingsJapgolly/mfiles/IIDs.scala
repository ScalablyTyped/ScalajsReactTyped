package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIDs extends StObject {
  
  def Add(Index: Double, ID: Double): Unit
  
  def Clone(): IIDs
  
  val Count: Double
  
  def IndexOf(ID: Double): Double
  
  def Item(Index: Double): Double
  
  def Remove(Index: Double): Unit
  
  def RemoveAll(ID: Double): Double
}
object IIDs {
  
  inline def apply(
    Add: (Double, Double) => Callback,
    Clone: CallbackTo[IIDs],
    Count: Double,
    IndexOf: Double => Double,
    Item: Double => Double,
    Remove: Double => Callback,
    RemoveAll: Double => Double
  ): IIDs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: Double) => (Add(t0, t1)).runNow()), Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], IndexOf = js.Any.fromFunction1(IndexOf), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()), RemoveAll = js.Any.fromFunction1(RemoveAll))
    __obj.asInstanceOf[IIDs]
  }
  
  extension [Self <: IIDs](x: Self) {
    
    inline def setAdd(value: (Double, Double) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setClone(value: CallbackTo[IIDs]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setIndexOf(value: Double => Double): Self = StObject.set(x, "IndexOf", js.Any.fromFunction1(value))
    
    inline def setItem(value: Double => Double): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setRemoveAll(value: Double => Double): Self = StObject.set(x, "RemoveAll", js.Any.fromFunction1(value))
  }
}
