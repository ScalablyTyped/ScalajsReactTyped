package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectTypeTargetsForBrowsing extends StObject {
  
  def Add(Index: Double, ObjectTypeTargetForBrowsing: IObjectTypeTargetForBrowsing): Unit
  
  def Clone(): IObjectTypeTargetsForBrowsing
  
  val Count: Double
  
  def Item(Index: Double): IObjectTypeTargetForBrowsing
  
  def Remove(Index: Double): Unit
}
object IObjectTypeTargetsForBrowsing {
  
  inline def apply(
    Add: (Double, IObjectTypeTargetForBrowsing) => Callback,
    Clone: CallbackTo[IObjectTypeTargetsForBrowsing],
    Count: Double,
    Item: Double => IObjectTypeTargetForBrowsing,
    Remove: Double => Callback
  ): IObjectTypeTargetsForBrowsing = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IObjectTypeTargetForBrowsing) => (Add(t0, t1)).runNow()), Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IObjectTypeTargetsForBrowsing]
  }
  
  extension [Self <: IObjectTypeTargetsForBrowsing](x: Self) {
    
    inline def setAdd(value: (Double, IObjectTypeTargetForBrowsing) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IObjectTypeTargetForBrowsing) => (value(t0, t1)).runNow()))
    
    inline def setClone(value: CallbackTo[IObjectTypeTargetsForBrowsing]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IObjectTypeTargetForBrowsing): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
