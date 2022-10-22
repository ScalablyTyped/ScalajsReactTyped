package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAssociatedPropertyDefs extends StObject {
  
  def Add(Index: Double, AssociatedPropertyDef: IAssociatedPropertyDef): Unit
  
  def Clone(): IAssociatedPropertyDefs
  
  val Count: Double
  
  def Item(Index: Double): IAssociatedPropertyDef
  
  def Remove(Index: Double): Unit
}
object IAssociatedPropertyDefs {
  
  inline def apply(
    Add: (Double, IAssociatedPropertyDef) => Callback,
    Clone: CallbackTo[IAssociatedPropertyDefs],
    Count: Double,
    Item: Double => IAssociatedPropertyDef,
    Remove: Double => Callback
  ): IAssociatedPropertyDefs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IAssociatedPropertyDef) => (Add(t0, t1)).runNow()), Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IAssociatedPropertyDefs]
  }
  
  extension [Self <: IAssociatedPropertyDefs](x: Self) {
    
    inline def setAdd(value: (Double, IAssociatedPropertyDef) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IAssociatedPropertyDef) => (value(t0, t1)).runNow()))
    
    inline def setClone(value: CallbackTo[IAssociatedPropertyDefs]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IAssociatedPropertyDef): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
