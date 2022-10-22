package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectClassesAdmin extends StObject {
  
  def Add(Index: Double, ObjectClassAdmin: IObjectClassAdmin): Unit
  
  val Count: Double
  
  def Item(Index: Double): IObjectClassAdmin
  
  def Remove(Index: Double): Unit
}
object IObjectClassesAdmin {
  
  inline def apply(
    Add: (Double, IObjectClassAdmin) => Callback,
    Count: Double,
    Item: Double => IObjectClassAdmin,
    Remove: Double => Callback
  ): IObjectClassesAdmin = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IObjectClassAdmin) => (Add(t0, t1)).runNow()), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IObjectClassesAdmin]
  }
  
  extension [Self <: IObjectClassesAdmin](x: Self) {
    
    inline def setAdd(value: (Double, IObjectClassAdmin) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IObjectClassAdmin) => (value(t0, t1)).runNow()))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IObjectClassAdmin): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
