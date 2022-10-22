package typingsJapgolly.cassanknex.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cassandraDriver.libTypesMod.types.ResultSet
import typingsJapgolly.cassandraDriver.libTypesMod.types.Row
import typingsJapgolly.cassandraDriver.mod.ValueCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryBuilder extends StObject {
  
  def bindings(): js.Array[Any]
  
  def cql(): String
  
  def eachRow(
    onEachRow: js.Function2[/* n */ Double, /* row */ Row, Any],
    onError: js.Function1[/* err */ js.Error, Any]
  ): Unit
  
  def exec(cb: ValueCallback[ResultSet]): Unit
  
  def stream(params: StreamParams): Unit
}
object QueryBuilder {
  
  inline def apply(
    bindings: CallbackTo[js.Array[Any]],
    cql: CallbackTo[String],
    eachRow: (js.Function2[/* n */ Double, /* row */ Row, Any], js.Function1[/* err */ js.Error, Any]) => Callback,
    exec: ValueCallback[ResultSet] => Callback,
    stream: StreamParams => Callback
  ): QueryBuilder = {
    val __obj = js.Dynamic.literal(bindings = bindings.toJsFn, cql = cql.toJsFn, eachRow = js.Any.fromFunction2((t0: js.Function2[/* n */ Double, /* row */ Row, Any], t1: js.Function1[/* err */ js.Error, Any]) => (eachRow(t0, t1)).runNow()), exec = js.Any.fromFunction1((t0: ValueCallback[ResultSet]) => exec(t0).runNow()), stream = js.Any.fromFunction1((t0: StreamParams) => stream(t0).runNow()))
    __obj.asInstanceOf[QueryBuilder]
  }
  
  extension [Self <: QueryBuilder](x: Self) {
    
    inline def setBindings(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "bindings", value.toJsFn)
    
    inline def setCql(value: CallbackTo[String]): Self = StObject.set(x, "cql", value.toJsFn)
    
    inline def setEachRow(
      value: (js.Function2[/* n */ Double, /* row */ Row, Any], js.Function1[/* err */ js.Error, Any]) => Callback
    ): Self = StObject.set(x, "eachRow", js.Any.fromFunction2((t0: js.Function2[/* n */ Double, /* row */ Row, Any], t1: js.Function1[/* err */ js.Error, Any]) => (value(t0, t1)).runNow()))
    
    inline def setExec(value: ValueCallback[ResultSet] => Callback): Self = StObject.set(x, "exec", js.Any.fromFunction1((t0: ValueCallback[ResultSet]) => value(t0).runNow()))
    
    inline def setStream(value: StreamParams => Callback): Self = StObject.set(x, "stream", js.Any.fromFunction1((t0: StreamParams) => value(t0).runNow()))
  }
}
