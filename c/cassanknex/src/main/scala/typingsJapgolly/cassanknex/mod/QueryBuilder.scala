package typingsJapgolly.cassanknex.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cassandraDriver.mod.ValueCallback
import typingsJapgolly.cassandraDriver.typesMod.types.ResultSet
import typingsJapgolly.cassandraDriver.typesMod.types.Row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryBuilder extends js.Object {
  def bindings(): js.Array[_]
  def cql(): String
  def eachRow(
    onEachRow: js.Function2[/* n */ Double, /* row */ Row, _],
    onError: js.Function1[/* err */ js.Error, _]
  ): js.UndefOr[scala.Nothing]
  def exec(cb: ValueCallback[ResultSet]): js.UndefOr[scala.Nothing]
  def stream(params: StreamParams): js.UndefOr[scala.Nothing]
}

object QueryBuilder {
  @scala.inline
  def apply(
    bindings: CallbackTo[js.Array[js.Any]],
    cql: CallbackTo[String],
    eachRow: (js.Function2[/* n */ Double, /* row */ Row, js.Any], js.Function1[/* err */ js.Error, js.Any]) => CallbackTo[js.UndefOr[scala.Nothing]],
    exec: ValueCallback[ResultSet] => CallbackTo[js.UndefOr[scala.Nothing]],
    stream: StreamParams => CallbackTo[js.UndefOr[scala.Nothing]]
  ): QueryBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bindings")(bindings.toJsFn)
    __obj.updateDynamic("cql")(cql.toJsFn)
    __obj.updateDynamic("eachRow")(js.Any.fromFunction2((t0: js.Function2[
  /* n */ scala.Double, 
  /* row */ typingsJapgolly.cassandraDriver.typesMod.types.Row, 
  js.Any], t1: js.Function1[/* err */ js.Error, js.Any]) => eachRow(t0, t1).runNow()))
    __obj.updateDynamic("exec")(js.Any.fromFunction1((t0: typingsJapgolly.cassandraDriver.mod.ValueCallback[typingsJapgolly.cassandraDriver.typesMod.types.ResultSet]) => exec(t0).runNow()))
    __obj.updateDynamic("stream")(js.Any.fromFunction1((t0: typingsJapgolly.cassanknex.mod.StreamParams) => stream(t0).runNow()))
    __obj.asInstanceOf[QueryBuilder]
  }
}

