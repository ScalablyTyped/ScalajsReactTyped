package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectTypeColumnMappings extends StObject {
  
  def Add(Index: Double, ObjectTypeColumnMapping: IObjectTypeColumnMapping): Unit
  
  def Clone(): IObjectTypeColumnMappings
  
  val Count: Double
  
  def Item(Index: Double): IObjectTypeColumnMapping
  
  def Remove(Index: Double): Unit
}
object IObjectTypeColumnMappings {
  
  inline def apply(
    Add: (Double, IObjectTypeColumnMapping) => Callback,
    Clone: CallbackTo[IObjectTypeColumnMappings],
    Count: Double,
    Item: Double => IObjectTypeColumnMapping,
    Remove: Double => Callback
  ): IObjectTypeColumnMappings = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IObjectTypeColumnMapping) => (Add(t0, t1)).runNow()), Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IObjectTypeColumnMappings]
  }
  
  extension [Self <: IObjectTypeColumnMappings](x: Self) {
    
    inline def setAdd(value: (Double, IObjectTypeColumnMapping) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IObjectTypeColumnMapping) => (value(t0, t1)).runNow()))
    
    inline def setClone(value: CallbackTo[IObjectTypeColumnMappings]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IObjectTypeColumnMapping): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
