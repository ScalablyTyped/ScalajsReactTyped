package typingsJapgolly.hexo.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Model[T] extends StObject {
  
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def count(): Double
  
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def filter(fn: js.Function2[/* v */ T, /* i */ Double, Boolean]): Model[T]
  
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def forEach(fn: js.Function2[/* v */ T, /* i */ Double, Unit]): Unit
  
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def map[U](fn: js.Function2[/* v */ T, /* i */ Double, U]): js.Array[U]
  
  /**
    * Warehouse method
    * https://hexojs.github.io/warehouse/
    */
  def toArray(): js.Array[T]
}
object Model {
  
  inline def apply[T](
    count: CallbackTo[Double],
    filter: js.Function2[/* v */ T, /* i */ Double, Boolean] => Model[T],
    forEach: js.Function2[/* v */ T, /* i */ Double, Unit] => Callback,
    map: js.Function2[/* v */ T, /* i */ Double, Any] => js.Array[Any],
    toArray: CallbackTo[js.Array[T]]
  ): Model[T] = {
    val __obj = js.Dynamic.literal(count = count.toJsFn, filter = js.Any.fromFunction1(filter), forEach = js.Any.fromFunction1((t0: js.Function2[/* v */ T, /* i */ Double, Unit]) => forEach(t0).runNow()), map = js.Any.fromFunction1(map), toArray = toArray.toJsFn)
    __obj.asInstanceOf[Model[T]]
  }
  
  extension [Self <: Model[?], T](x: Self & Model[T]) {
    
    inline def setCount(value: CallbackTo[Double]): Self = StObject.set(x, "count", value.toJsFn)
    
    inline def setFilter(value: js.Function2[/* v */ T, /* i */ Double, Boolean] => Model[T]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setForEach(value: js.Function2[/* v */ T, /* i */ Double, Unit] => Callback): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function2[/* v */ T, /* i */ Double, Unit]) => value(t0).runNow()))
    
    inline def setMap(value: js.Function2[/* v */ T, /* i */ Double, Any] => js.Array[Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    
    inline def setToArray(value: CallbackTo[js.Array[T]]): Self = StObject.set(x, "toArray", value.toJsFn)
  }
}
