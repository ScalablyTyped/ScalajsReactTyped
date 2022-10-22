package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDefaultProperties extends StObject {
  
  def Add(Index: Double, DefaultProperty: IDefaultProperty): Unit
  
  val Count: Double
  
  def Item(Index: Double): IDefaultProperty
  
  def Remove(Index: Double): Unit
}
object IDefaultProperties {
  
  inline def apply(
    Add: (Double, IDefaultProperty) => Callback,
    Count: Double,
    Item: Double => IDefaultProperty,
    Remove: Double => Callback
  ): IDefaultProperties = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2((t0: Double, t1: IDefaultProperty) => (Add(t0, t1)).runNow()), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[IDefaultProperties]
  }
  
  extension [Self <: IDefaultProperties](x: Self) {
    
    inline def setAdd(value: (Double, IDefaultProperty) => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction2((t0: Double, t1: IDefaultProperty) => (value(t0, t1)).runNow()))
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => IDefaultProperty): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
