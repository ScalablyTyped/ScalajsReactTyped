package typingsJapgolly.cadesplugin.CAdESCOM

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CPAuthenticatedAttributes2 extends StObject {
  
  def Add(attribute: CPAttribute): Unit
  
  def Clear(): Unit
  
  val Count: Double
  
  def Item(index: Double): CPAttribute
  
  def Remove(index: Double): Unit
}
object CPAuthenticatedAttributes2 {
  
  inline def apply(
    Add: CPAttribute => Callback,
    Clear: Callback,
    Count: Double,
    Item: Double => CPAttribute,
    Remove: Double => Callback
  ): CPAuthenticatedAttributes2 = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1((t0: CPAttribute) => Add(t0).runNow()), Clear = Clear.toJsFn, Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1((t0: Double) => Remove(t0).runNow()))
    __obj.asInstanceOf[CPAuthenticatedAttributes2]
  }
  
  extension [Self <: CPAuthenticatedAttributes2](x: Self) {
    
    inline def setAdd(value: CPAttribute => Callback): Self = StObject.set(x, "Add", js.Any.fromFunction1((t0: CPAttribute) => value(t0).runNow()))
    
    inline def setClear(value: Callback): Self = StObject.set(x, "Clear", value.toJsFn)
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => CPAttribute): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Callback): Self = StObject.set(x, "Remove", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
