package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStrings extends StObject {
  
  def Add(Index: Double, Item: String): Unit
  
  def Clone(): IStrings
  
  def CloneFrom(Strings: IStrings): Unit
  
  val Count: Double
  
  def Item(Index: Double): String
  
  def Join(Separator: String): String
  
  def Remove(Index: Double): Unit
}
object IStrings {
  
  inline def apply(
    Add: (Double, String) => Callback,
    Clone: CallbackTo[IStrings],
    CloneFrom: IStrings => Callback,
    Count: Double,
    Item: Double => String,
    Join: String => String,
    Remove: Double => Callback
  ): IStrings = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: String) => (Add(t0, t1)).runNow()), Clone = Clone.toJsFn, CloneFrom = js.Any.fromFunction1((t0: IStrings) => CloneFrom(t0).runNow()), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Join = js.Any.fromFunction1(Join), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IStrings]
  }
  
  extension [Self <: IStrings](x: Self) {
    
    inline def setAdd(value: (Double, String) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setClone(value: CallbackTo[IStrings]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCloneFrom(value: IStrings => Callback): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1((t0: IStrings) => value(t0).runNow()))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => String): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setJoin(value: String => String): Self = StObject.set(x, "Join", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
