package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIndirectPropertyID extends StObject {
  
  def Add(Index: Double, IndirectPropertyIDLevel: IIndirectPropertyIDLevel): Unit
  
  def Clone(): IIndirectPropertyID
  
  val Count: Double
  
  def EqualTo(IndirectPropertyID: IIndirectPropertyID): Boolean
  
  def Item(Index: Double): IIndirectPropertyIDLevel
  
  def Remove(Index: Double): Unit
  
  def ToJSON(): String
}
object IIndirectPropertyID {
  
  inline def apply(
    Add: (Double, IIndirectPropertyIDLevel) => Callback,
    Clone: CallbackTo[IIndirectPropertyID],
    Count: Double,
    EqualTo: IIndirectPropertyID => Boolean,
    Item: Double => IIndirectPropertyIDLevel,
    Remove: Double => Callback,
    ToJSON: CallbackTo[String]
  ): IIndirectPropertyID = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IIndirectPropertyIDLevel) => (Add(t0, t1)).runNow()), Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], EqualTo = js.Any.fromFunction1(EqualTo), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()), ToJSON = ToJSON.toJsFn)
    __obj.asInstanceOf[IIndirectPropertyID]
  }
  
  extension [Self <: IIndirectPropertyID](x: Self) {
    
    inline def setAdd(value: (Double, IIndirectPropertyIDLevel) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IIndirectPropertyIDLevel) => (value(t0, t1)).runNow()))
    
    inline def setClone(value: CallbackTo[IIndirectPropertyID]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setEqualTo(value: IIndirectPropertyID => Boolean): Self = StObject.set(x, "EqualTo", js.Any.fromFunction1(value))
    
    inline def setItem(value: Double => IIndirectPropertyIDLevel): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setToJSON(value: CallbackTo[String]): Self = StObject.set(x, "ToJSON", value.toJsFn)
  }
}
