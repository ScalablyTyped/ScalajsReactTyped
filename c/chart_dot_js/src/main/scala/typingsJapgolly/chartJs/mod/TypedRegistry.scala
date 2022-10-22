package typingsJapgolly.chartJs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypedRegistry[T] extends StObject {
  
  def get(id: String): js.UndefOr[T]
  
  /**
    * @param {ChartComponent} item
    * @returns {string} The scope where items defaults were registered to.
    */
  def register(item: ChartComponent): String
  
  def unregister(item: ChartComponent): Unit
}
object TypedRegistry {
  
  inline def apply[T](
    get: String => js.UndefOr[T],
    register: ChartComponent => String,
    unregister: ChartComponent => Callback
  ): TypedRegistry[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), register = js.Any.fromFunction1(register), unregister = js.Any.fromFunction1((t0: ChartComponent) => unregister(t0).runNow()))
    __obj.asInstanceOf[TypedRegistry[T]]
  }
  
  extension [Self <: TypedRegistry[?], T](x: Self & TypedRegistry[T]) {
    
    inline def setGet(value: String => js.UndefOr[T]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setRegister(value: ChartComponent => String): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    
    inline def setUnregister(value: ChartComponent => Callback): Self = StObject.set(x, "unregister", js.Any.fromFunction1((t0: ChartComponent) => value(t0).runNow()))
  }
}
