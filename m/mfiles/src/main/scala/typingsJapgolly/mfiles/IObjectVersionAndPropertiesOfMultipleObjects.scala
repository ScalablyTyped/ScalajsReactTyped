package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectVersionAndPropertiesOfMultipleObjects extends StObject {
  
  def Add(Index: Double, ObjectVersionAndProperties: IObjectVersionAndProperties): Unit
  
  def Clone(): IObjectVersionAndPropertiesOfMultipleObjects
  
  val Count: Double
  
  def Item(Index: Double): IObjectVersionAndProperties
  
  def Remove(Index: Double): Unit
}
object IObjectVersionAndPropertiesOfMultipleObjects {
  
  inline def apply(
    Add: (Double, IObjectVersionAndProperties) => Callback,
    Clone: CallbackTo[IObjectVersionAndPropertiesOfMultipleObjects],
    Count: Double,
    Item: Double => IObjectVersionAndProperties,
    Remove: Double => Callback
  ): IObjectVersionAndPropertiesOfMultipleObjects = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IObjectVersionAndProperties) => (Add(t0, t1)).runNow()), Clone = Clone.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IObjectVersionAndPropertiesOfMultipleObjects]
  }
  
  extension [Self <: IObjectVersionAndPropertiesOfMultipleObjects](x: Self) {
    
    inline def setAdd(value: (Double, IObjectVersionAndProperties) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IObjectVersionAndProperties) => (value(t0, t1)).runNow()))
    
    inline def setClone(value: CallbackTo[IObjectVersionAndPropertiesOfMultipleObjects]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IObjectVersionAndProperties): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
