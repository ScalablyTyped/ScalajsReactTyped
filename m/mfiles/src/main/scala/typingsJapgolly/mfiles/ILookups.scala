package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILookups extends StObject {
  
  def Add(Index: Double, Lookup: ILookup): Unit
  
  def Clone(): ILookups
  
  def CloneFrom(Lookups: ILookups): Unit
  
  val Count: Double
  
  def GetLookupByItem(Item: Double): ILookup
  
  def GetLookupIndexByItem(Item: Double): Double
  
  def Item(Index: Double): ILookup
  
  def Remove(Index: Double): Unit
}
object ILookups {
  
  inline def apply(
    Add: (Double, ILookup) => Callback,
    Clone: CallbackTo[ILookups],
    CloneFrom: ILookups => Callback,
    Count: Double,
    GetLookupByItem: Double => ILookup,
    GetLookupIndexByItem: Double => Double,
    Item: Double => ILookup,
    Remove: Double => Callback
  ): ILookups = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: ILookup) => (Add(t0, t1)).runNow()), Clone = Clone.toJsFn, CloneFrom = js.Any.fromFunction1((t0: ILookups) => CloneFrom(t0).runNow()), Count = Count.asInstanceOf[js.Any], GetLookupByItem = js.Any.fromFunction1(GetLookupByItem), GetLookupIndexByItem = js.Any.fromFunction1(GetLookupIndexByItem), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[ILookups]
  }
  
  extension [Self <: ILookups](x: Self) {
    
    inline def setAdd(value: (Double, ILookup) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: ILookup) => (value(t0, t1)).runNow()))
    
    inline def setClone(value: CallbackTo[ILookups]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCloneFrom(value: ILookups => Callback): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1((t0: ILookups) => value(t0).runNow()))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setGetLookupByItem(value: Double => ILookup): Self = StObject.set(x, "GetLookupByItem", js.Any.fromFunction1(value))
    
    inline def setGetLookupIndexByItem(value: Double => Double): Self = StObject.set(x, "GetLookupIndexByItem", js.Any.fromFunction1(value))
    
    inline def setItem(value: Double => ILookup): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
