package typingsJapgolly.webix.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupMethods extends StObject {
  
  def any(property: String, data: Any): Unit
  
  def count(property: String, data: Any): Unit
  
  def max(property: String, data: Any): Unit
  
  def min(property: String, data: Any): Unit
  
  def string(property: String, data: Any): Unit
  
  def sum(property: String, data: Any): Unit
}
object GroupMethods {
  
  @JSImport("webix", "GroupMethods")
  @js.native
  val ^ : GroupMethods = js.native
  
  extension [Self <: GroupMethods](x: Self) {
    
    inline def setAny(value: (String, Any) => Callback): Self = StObject.set(x, "any", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setCount(value: (String, Any) => Callback): Self = StObject.set(x, "count", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setMax(value: (String, Any) => Callback): Self = StObject.set(x, "max", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setMin(value: (String, Any) => Callback): Self = StObject.set(x, "min", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setString(value: (String, Any) => Callback): Self = StObject.set(x, "string", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setSum(value: (String, Any) => Callback): Self = StObject.set(x, "sum", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
  }
}
