package typingsJapgolly.cassanknex.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cassandraDriver.libTypesMod.types.ResultSet
import typingsJapgolly.cassandraDriver.libTypesMod.types.Row
import typingsJapgolly.cassandraDriver.mod.ValueCallback
import typingsJapgolly.cassandraDriver.mod.types.BigDecimal
import typingsJapgolly.cassandraDriver.mod.types.InetAddress
import typingsJapgolly.cassandraDriver.mod.types.LocalDate
import typingsJapgolly.cassandraDriver.mod.types.TimeUuid
import typingsJapgolly.cassandraDriver.mod.types.Uuid
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTypeQueryBuilder[T]
  extends StObject
     with QueryBuilder
     with FieldValueQueryBuilder[T]
object CreateTypeQueryBuilder {
  
  inline def apply[T](
    ascii: Any => TypeMatchedValue[T, Any, String, CreateTypeQueryBuilder[T]],
    bigint: Any => TypeMatchedValue[T, Any, typingsJapgolly.long.mod.^, CreateTypeQueryBuilder[T]],
    bindings: CallbackTo[js.Array[Any]],
    blob: Any => TypeMatchedValue[T, Any, Buffer, CreateTypeQueryBuilder[T]],
    boolean: Any => TypeMatchedValue[T, Any, Boolean, CreateTypeQueryBuilder[T]],
    counter: Any => TypeMatchedValue[T, Any, typingsJapgolly.long.mod.^, CreateTypeQueryBuilder[T]],
    cql: CallbackTo[String],
    date: Any => TypeMatchedValue[T, Any, LocalDate, CreateTypeQueryBuilder[T]],
    decimal: Any => TypeMatchedValue[T, Any, BigDecimal, CreateTypeQueryBuilder[T]],
    double: Any => TypeMatchedValue[T, Any, typingsJapgolly.long.mod.^, CreateTypeQueryBuilder[T]],
    eachRow: (js.Function2[/* n */ Double, /* row */ Row, Any], js.Function1[/* err */ js.Error, Any]) => Callback,
    exec: ValueCallback[ResultSet] => Callback,
    float: Any => TypeMatchedValue[T, Any, Double, CreateTypeQueryBuilder[T]],
    inet: Any => TypeMatchedValue[T, Any, InetAddress, CreateTypeQueryBuilder[T]],
    int: Any => TypeMatchedValue[T, Any, Double, CreateTypeQueryBuilder[T]],
    list: (Any, String) => TypeMatchedValue[T, Any, js.Array[Any], CreateTypeQueryBuilder[T]],
    map: (Any, Any, Any) => TypeMatchedValue[T, Any, Map[Any, Any], CreateTypeQueryBuilder[T]],
    primary: /* repeated */ String | js.Array[String] => CreateTypeQueryBuilder[T],
    set: (Any, Any) => TypeMatchedValue[
      T, 
      Any, 
      Set[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ], 
      CreateTypeQueryBuilder[T]
    ],
    stream: StreamParams => Callback,
    text: Any => TypeMatchedValue[T, Any, String, CreateTypeQueryBuilder[T]],
    timestamp: Any => TypeMatchedValue[T, Any, js.Date, CreateTypeQueryBuilder[T]],
    timeuuid: Any => TypeMatchedValue[T, Any, TimeUuid, CreateTypeQueryBuilder[T]],
    uuid: Any => TypeMatchedValue[T, Any, Uuid, CreateTypeQueryBuilder[T]],
    varchar: Any => TypeMatchedValue[T, Any, String, CreateTypeQueryBuilder[T]]
  ): CreateTypeQueryBuilder[T] = {
    val __obj = js.Dynamic.literal(ascii = js.Any.fromFunction1(ascii), bigint = js.Any.fromFunction1(bigint), bindings = bindings.toJsFn, blob = js.Any.fromFunction1(blob), boolean = js.Any.fromFunction1(boolean), counter = js.Any.fromFunction1(counter), cql = cql.toJsFn, date = js.Any.fromFunction1(date), decimal = js.Any.fromFunction1(decimal), double = js.Any.fromFunction1(double), eachRow = js.Any.fromFunction2((t0: js.Function2[/* n */ Double, /* row */ Row, Any], t1: js.Function1[/* err */ js.Error, Any]) => (eachRow(t0, t1)).runNow()), exec = js.Any.fromFunction1((t0: ValueCallback[ResultSet]) => exec(t0).runNow()), float = js.Any.fromFunction1(float), inet = js.Any.fromFunction1(inet), int = js.Any.fromFunction1(int), list = js.Any.fromFunction2(list), map = js.Any.fromFunction3(map), primary = js.Any.fromFunction1(primary), set = js.Any.fromFunction2(set), stream = js.Any.fromFunction1((t0: StreamParams) => stream(t0).runNow()), text = js.Any.fromFunction1(text), timestamp = js.Any.fromFunction1(timestamp), timeuuid = js.Any.fromFunction1(timeuuid), uuid = js.Any.fromFunction1(uuid), varchar = js.Any.fromFunction1(varchar))
    __obj.asInstanceOf[CreateTypeQueryBuilder[T]]
  }
}
