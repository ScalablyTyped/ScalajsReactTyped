package typingsJapgolly.cassanknex.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cassandraDriver.mod.types.BigDecimal
import typingsJapgolly.cassandraDriver.mod.types.InetAddress
import typingsJapgolly.cassandraDriver.mod.types.LocalDate
import typingsJapgolly.cassandraDriver.mod.types.TimeUuid
import typingsJapgolly.cassandraDriver.mod.types.Uuid
import typingsJapgolly.long.mod.Long
import typingsJapgolly.node.Buffer
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldValueQueryBuilder[T] extends js.Object {
  def ascii[K /* <: String */](columnName: K): TypeMatchedValue[T, K, String, this.type]
  def bigint[K /* <: String */](columnName: K): TypeMatchedValue[T, K, Long, this.type]
  def blob[K /* <: String */](columnName: K): TypeMatchedValue[T, K, Buffer, this.type]
  def boolean[K /* <: String */](columnName: K): TypeMatchedValue[T, K, Boolean, this.type]
  def counter[K /* <: String */](columnName: K): TypeMatchedValue[T, K, Long, this.type]
  def date[K /* <: String */](columnName: K): TypeMatchedValue[T, K, LocalDate, this.type]
  def decimal[K /* <: String */](columnName: K): TypeMatchedValue[T, K, BigDecimal, this.type]
  def double[K /* <: String */](columnName: K): TypeMatchedValue[T, K, Long, this.type]
  def float[K /* <: String */](columnName: K): TypeMatchedValue[T, K, Double, this.type]
  def inet[K /* <: String */](columnName: K): TypeMatchedValue[T, K, InetAddress, this.type]
  def int[K /* <: String */](columnName: K): TypeMatchedValue[T, K, Double, this.type]
  def list[K /* <: String */](columnName: K, typeName: String): TypeMatchedValue[T, K, js.Array[_], this.type]
  def map[K /* <: String */, A /* <: String */, B](columnName: K, a: A, b: B): TypeMatchedValue[T, K, Map[A, B], this.type]
  def primary(primaryKey: String): this.type
  def set[K /* <: String */, A /* <: String */](columnName: K, a: A): TypeMatchedValue[
    T, 
    K, 
    Set[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ], 
    this.type
  ]
  def text[K /* <: String */](columnName: K): TypeMatchedValue[T, K, String, this.type]
  def timestamp[K /* <: String */](columnName: K): TypeMatchedValue[T, K, js.Date, this.type]
  def timeuuid[K /* <: String */](columnName: K): TypeMatchedValue[T, K, TimeUuid, this.type]
  def uuid[K /* <: String */](columnName: K): TypeMatchedValue[T, K, Uuid, this.type]
  def varchar[K /* <: String */](columnName: K): TypeMatchedValue[T, K, String, this.type]
}

object FieldValueQueryBuilder {
  @scala.inline
  def apply[T](
    ascii: js.Any => CallbackTo[TypeMatchedValue[T, js.Any, String, FieldValueQueryBuilder[T]]],
    bigint: js.Any => CallbackTo[TypeMatchedValue[T, js.Any, Long, FieldValueQueryBuilder[T]]],
    blob: js.Any => CallbackTo[TypeMatchedValue[T, js.Any, Buffer, FieldValueQueryBuilder[T]]],
    boolean: js.Any => CallbackTo[TypeMatchedValue[T, js.Any, Boolean, FieldValueQueryBuilder[T]]],
    counter: js.Any => CallbackTo[TypeMatchedValue[T, js.Any, Long, FieldValueQueryBuilder[T]]],
    date: js.Any => CallbackTo[TypeMatchedValue[T, js.Any, LocalDate, FieldValueQueryBuilder[T]]],
    decimal: js.Any => CallbackTo[TypeMatchedValue[T, js.Any, BigDecimal, FieldValueQueryBuilder[T]]],
    double: js.Any => CallbackTo[TypeMatchedValue[T, js.Any, Long, FieldValueQueryBuilder[T]]],
    float: js.Any => CallbackTo[TypeMatchedValue[T, js.Any, Double, FieldValueQueryBuilder[T]]],
    inet: js.Any => CallbackTo[TypeMatchedValue[T, js.Any, InetAddress, FieldValueQueryBuilder[T]]],
    int: js.Any => CallbackTo[TypeMatchedValue[T, js.Any, Double, FieldValueQueryBuilder[T]]],
    list: (js.Any, String) => CallbackTo[TypeMatchedValue[T, js.Any, js.Array[js.Any], FieldValueQueryBuilder[T]]],
    map: (js.Any, js.Any, js.Any) => CallbackTo[TypeMatchedValue[T, js.Any, Map[js.Any, js.Any], FieldValueQueryBuilder[T]]],
    primary: String => CallbackTo[FieldValueQueryBuilder[T]],
    set: (js.Any, js.Any) => CallbackTo[
      TypeMatchedValue[
        T, 
        js.Any, 
        Set[
          /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
        ], 
        FieldValueQueryBuilder[T]
      ]
    ],
    text: js.Any => CallbackTo[TypeMatchedValue[T, js.Any, String, FieldValueQueryBuilder[T]]],
    timestamp: js.Any => CallbackTo[TypeMatchedValue[T, js.Any, js.Date, FieldValueQueryBuilder[T]]],
    timeuuid: js.Any => CallbackTo[TypeMatchedValue[T, js.Any, TimeUuid, FieldValueQueryBuilder[T]]],
    uuid: js.Any => CallbackTo[TypeMatchedValue[T, js.Any, Uuid, FieldValueQueryBuilder[T]]],
    varchar: js.Any => CallbackTo[TypeMatchedValue[T, js.Any, String, FieldValueQueryBuilder[T]]]
  ): FieldValueQueryBuilder[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ascii")(js.Any.fromFunction1((t0: js.Any) => ascii(t0).runNow()))
    __obj.updateDynamic("bigint")(js.Any.fromFunction1((t0: js.Any) => bigint(t0).runNow()))
    __obj.updateDynamic("blob")(js.Any.fromFunction1((t0: js.Any) => blob(t0).runNow()))
    __obj.updateDynamic("boolean")(js.Any.fromFunction1((t0: js.Any) => boolean(t0).runNow()))
    __obj.updateDynamic("counter")(js.Any.fromFunction1((t0: js.Any) => counter(t0).runNow()))
    __obj.updateDynamic("date")(js.Any.fromFunction1((t0: js.Any) => date(t0).runNow()))
    __obj.updateDynamic("decimal")(js.Any.fromFunction1((t0: js.Any) => decimal(t0).runNow()))
    __obj.updateDynamic("double")(js.Any.fromFunction1((t0: js.Any) => double(t0).runNow()))
    __obj.updateDynamic("float")(js.Any.fromFunction1((t0: js.Any) => float(t0).runNow()))
    __obj.updateDynamic("inet")(js.Any.fromFunction1((t0: js.Any) => inet(t0).runNow()))
    __obj.updateDynamic("int")(js.Any.fromFunction1((t0: js.Any) => int(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => list(t0, t1).runNow()))
    __obj.updateDynamic("map")(js.Any.fromFunction3((t0: js.Any, t1: js.Any, t2: js.Any) => map(t0, t1, t2).runNow()))
    __obj.updateDynamic("primary")(js.Any.fromFunction1((t0: java.lang.String) => primary(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => set(t0, t1).runNow()))
    __obj.updateDynamic("text")(js.Any.fromFunction1((t0: js.Any) => text(t0).runNow()))
    __obj.updateDynamic("timestamp")(js.Any.fromFunction1((t0: js.Any) => timestamp(t0).runNow()))
    __obj.updateDynamic("timeuuid")(js.Any.fromFunction1((t0: js.Any) => timeuuid(t0).runNow()))
    __obj.updateDynamic("uuid")(js.Any.fromFunction1((t0: js.Any) => uuid(t0).runNow()))
    __obj.updateDynamic("varchar")(js.Any.fromFunction1((t0: js.Any) => varchar(t0).runNow()))
    __obj.asInstanceOf[FieldValueQueryBuilder[T]]
  }
}

