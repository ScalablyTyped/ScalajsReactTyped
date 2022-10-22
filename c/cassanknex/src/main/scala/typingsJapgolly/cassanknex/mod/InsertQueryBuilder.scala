package typingsJapgolly.cassanknex.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cassandraDriver.libTypesMod.types.ResultSet
import typingsJapgolly.cassandraDriver.libTypesMod.types.Row
import typingsJapgolly.cassandraDriver.mod.ValueCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertQueryBuilder
  extends StObject
     with QueryBuilder
     with InsertableQueryBuilder
     with TtlableQueryBuilder
object InsertQueryBuilder {
  
  inline def apply(
    bindings: CallbackTo[js.Array[Any]],
    cql: CallbackTo[String],
    eachRow: (js.Function2[/* n */ Double, /* row */ Row, Any], js.Function1[/* err */ js.Error, Any]) => Callback,
    exec: ValueCallback[ResultSet] => Callback,
    ifNotExists: CallbackTo[InsertQueryBuilder],
    into: String => InsertQueryBuilder,
    stream: StreamParams => Callback,
    usingTTL: Double => InsertQueryBuilder,
    usingTimestamp: Double => InsertQueryBuilder
  ): InsertQueryBuilder = {
    val __obj = js.Dynamic.literal(bindings = bindings.toJsFn, cql = cql.toJsFn, eachRow = js.Any.fromFunction2((t0: js.Function2[/* n */ Double, /* row */ Row, Any], t1: js.Function1[/* err */ js.Error, Any]) => (eachRow(t0, t1)).runNow()), exec = js.Any.fromFunction1((t0: ValueCallback[ResultSet]) => exec(t0).runNow()), ifNotExists = ifNotExists.toJsFn, into = js.Any.fromFunction1(into), stream = js.Any.fromFunction1((t0: StreamParams) => stream(t0).runNow()), usingTTL = js.Any.fromFunction1(usingTTL), usingTimestamp = js.Any.fromFunction1(usingTimestamp))
    __obj.asInstanceOf[InsertQueryBuilder]
  }
}
