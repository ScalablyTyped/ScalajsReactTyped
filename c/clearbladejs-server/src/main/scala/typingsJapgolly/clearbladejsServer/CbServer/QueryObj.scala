package typingsJapgolly.clearbladejsServer.CbServer

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryObj extends js.Object {
  var OR: js.Array[Query]
  var URI: String
  var id: String
  var limit: Double
  var offset: Double
  var query: Query
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def ascending(field: String): Unit
  def columns(columnsArray: js.Array[String]): Unit
  def descending(field: String): Unit
  def equalTo(field: String, value: QueryValue): Unit
  def fetch(callback: CbCallback): Unit
  def greaterThan(field: String, value: QueryValue): Unit
  def greaterThanEqualTo(field: String, value: QueryValue): Unit
  def lessThan(field: String, value: QueryValue): Unit
  def lessThanEqualTo(field: String, value: QueryValue): Unit
  def matches(field: String, pattern: QueryValue): Unit
  def notEqualTo(field: String, value: QueryValue): Unit
  def or(query: QueryObj): Unit
  def remove(callback: CbCallback): Unit
  def setPage(pageSize: Double, pageNum: Double): Unit
  def update(changes: js.Object, callback: CbCallback): Unit
}

object QueryObj {
  @scala.inline
  def apply(
    OR: js.Array[Query],
    URI: String,
    ascending: String => Callback,
    columns: js.Array[String] => Callback,
    descending: String => Callback,
    equalTo: (String, QueryValue) => Callback,
    fetch: CbCallback => Callback,
    greaterThan: (String, QueryValue) => Callback,
    greaterThanEqualTo: (String, QueryValue) => Callback,
    id: String,
    lessThan: (String, QueryValue) => Callback,
    lessThanEqualTo: (String, QueryValue) => Callback,
    limit: Double,
    matches: (String, QueryValue) => Callback,
    notEqualTo: (String, QueryValue) => Callback,
    offset: Double,
    or: QueryObj => Callback,
    query: Query,
    remove: CbCallback => Callback,
    setPage: (Double, Double) => Callback,
    systemKey: String,
    systemSecret: String,
    update: (js.Object, CbCallback) => Callback,
    user: APIUser
  ): QueryObj = {
    val __obj = js.Dynamic.literal(OR = OR.asInstanceOf[js.Any], URI = URI.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("ascending")(js.Any.fromFunction1((t0: java.lang.String) => ascending(t0).runNow()))
    __obj.updateDynamic("columns")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => columns(t0).runNow()))
    __obj.updateDynamic("descending")(js.Any.fromFunction1((t0: java.lang.String) => descending(t0).runNow()))
    __obj.updateDynamic("equalTo")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsServer.CbServer.QueryValue) => equalTo(t0, t1).runNow()))
    __obj.updateDynamic("fetch")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => fetch(t0).runNow()))
    __obj.updateDynamic("greaterThan")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsServer.CbServer.QueryValue) => greaterThan(t0, t1).runNow()))
    __obj.updateDynamic("greaterThanEqualTo")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsServer.CbServer.QueryValue) => greaterThanEqualTo(t0, t1).runNow()))
    __obj.updateDynamic("lessThan")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsServer.CbServer.QueryValue) => lessThan(t0, t1).runNow()))
    __obj.updateDynamic("lessThanEqualTo")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsServer.CbServer.QueryValue) => lessThanEqualTo(t0, t1).runNow()))
    __obj.updateDynamic("matches")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsServer.CbServer.QueryValue) => matches(t0, t1).runNow()))
    __obj.updateDynamic("notEqualTo")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsServer.CbServer.QueryValue) => notEqualTo(t0, t1).runNow()))
    __obj.updateDynamic("or")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsServer.CbServer.QueryObj) => or(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => remove(t0).runNow()))
    __obj.updateDynamic("setPage")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => setPage(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: js.Object, t1: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => update(t0, t1).runNow()))
    __obj.asInstanceOf[QueryObj]
  }
}

