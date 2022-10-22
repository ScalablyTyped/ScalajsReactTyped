package typingsJapgolly.cassanknex.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cassandraDriver.libTypesMod.types.ResultSet
import typingsJapgolly.cassandraDriver.libTypesMod.types.Row
import typingsJapgolly.cassandraDriver.mod.ValueCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyspaceQueryBuilder
  extends StObject
     with QueryBuilder
     with KeyspaceableQueryBuilder
object KeyspaceQueryBuilder {
  
  inline def apply(
    bindings: CallbackTo[js.Array[Any]],
    cql: CallbackTo[String],
    eachRow: (js.Function2[/* n */ Double, /* row */ Row, Any], js.Function1[/* err */ js.Error, Any]) => Callback,
    exec: ValueCallback[ResultSet] => Callback,
    stream: StreamParams => Callback,
    withDurableWrites: Boolean => KeyspaceQueryBuilder,
    withNetworkTopologyStrategy: MappedDict[Double] => KeyspaceQueryBuilder,
    withSimpleStrategy: Double => KeyspaceQueryBuilder
  ): KeyspaceQueryBuilder = {
    val __obj = js.Dynamic.literal(bindings = bindings.toJsFn, cql = cql.toJsFn, eachRow = js.Any.fromFunction2((t0: js.Function2[/* n */ Double, /* row */ Row, Any], t1: js.Function1[/* err */ js.Error, Any]) => (eachRow(t0, t1)).runNow()), exec = js.Any.fromFunction1((t0: ValueCallback[ResultSet]) => exec(t0).runNow()), stream = js.Any.fromFunction1((t0: StreamParams) => stream(t0).runNow()), withDurableWrites = js.Any.fromFunction1(withDurableWrites), withNetworkTopologyStrategy = js.Any.fromFunction1(withNetworkTopologyStrategy), withSimpleStrategy = js.Any.fromFunction1(withSimpleStrategy))
    __obj.asInstanceOf[KeyspaceQueryBuilder]
  }
}
