package typingsJapgolly.arangodb.ArangoDB

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Statement[T] extends StObject {
  
  def bind(name: String, value: Any): Unit
  
  def execute(): Cursor[T]
  
  def getBatchSize(): Double
  
  def setBatchSize(size: Double): Unit
}
object Statement {
  
  inline def apply[T](
    bind: (String, Any) => Callback,
    execute: CallbackTo[Cursor[T]],
    getBatchSize: CallbackTo[Double],
    setBatchSize: Double => Callback
  ): Statement[T] = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction2((t0: String, t1: Any) => (bind(t0, t1)).runNow()), execute = execute.toJsFn, getBatchSize = getBatchSize.toJsFn, setBatchSize = js.Any.fromFunction1((t0: Double) => setBatchSize(t0).runNow()))
    __obj.asInstanceOf[Statement[T]]
  }
  
  extension [Self <: Statement[?], T](x: Self & Statement[T]) {
    
    inline def setBind(value: (String, Any) => Callback): Self = StObject.set(x, "bind", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setExecute(value: CallbackTo[Cursor[T]]): Self = StObject.set(x, "execute", value.toJsFn)
    
    inline def setGetBatchSize(value: CallbackTo[Double]): Self = StObject.set(x, "getBatchSize", value.toJsFn)
    
    inline def setSetBatchSize(value: Double => Callback): Self = StObject.set(x, "setBatchSize", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
