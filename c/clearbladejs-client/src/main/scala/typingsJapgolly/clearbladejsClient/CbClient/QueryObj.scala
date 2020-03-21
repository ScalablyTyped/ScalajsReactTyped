package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryObj extends js.Object {
  var OR: js.Array[Query]
  var URI: String
  var endpoint: String
  var limit: Double
  var offset: Double
  var query: Query
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def addFilterToQuery(query: QueryObj, condition: QueryConditions, key: String, value: QueryValue): Unit
  def addSortToQuery(query: QueryObj, direction: QuerySortDirections, column: String): Unit
  def ascending(field: String): Unit
  def columns(columnsArray: js.Array[String]): Unit
  def descending(field: String): Unit
  def equalTo(field: String, value: QueryValue): Unit
  def fetch(callback: CbCallback): Unit
  def greaterThan(field: String, value: QueryValue): Unit
  def greaterThanEqualTo(field: String, value: QueryValue): Unit
  def lessThan(field: String, value: QueryValue): Unit
  def lessThanEqualTo(field: String, value: QueryValue): Unit
  def matches(field: String, pattern: js.RegExp): Unit
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
    addFilterToQuery: (QueryObj, QueryConditions, String, QueryValue) => Callback,
    addSortToQuery: (QueryObj, QuerySortDirections, String) => Callback,
    ascending: String => Callback,
    columns: js.Array[String] => Callback,
    descending: String => Callback,
    endpoint: String,
    equalTo: (String, QueryValue) => Callback,
    fetch: CbCallback => Callback,
    greaterThan: (String, QueryValue) => Callback,
    greaterThanEqualTo: (String, QueryValue) => Callback,
    lessThan: (String, QueryValue) => Callback,
    lessThanEqualTo: (String, QueryValue) => Callback,
    limit: Double,
    matches: (String, js.RegExp) => Callback,
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
    val __obj = js.Dynamic.literal(OR = OR.asInstanceOf[js.Any], URI = URI.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("addFilterToQuery")(js.Any.fromFunction4((t0: typingsJapgolly.clearbladejsClient.CbClient.QueryObj, t1: typingsJapgolly.clearbladejsClient.CbClient.QueryConditions, t2: java.lang.String, t3: typingsJapgolly.clearbladejsClient.CbClient.QueryValue) => addFilterToQuery(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("addSortToQuery")(js.Any.fromFunction3((t0: typingsJapgolly.clearbladejsClient.CbClient.QueryObj, t1: typingsJapgolly.clearbladejsClient.CbClient.QuerySortDirections, t2: java.lang.String) => addSortToQuery(t0, t1, t2).runNow()))
    __obj.updateDynamic("ascending")(js.Any.fromFunction1((t0: java.lang.String) => ascending(t0).runNow()))
    __obj.updateDynamic("columns")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => columns(t0).runNow()))
    __obj.updateDynamic("descending")(js.Any.fromFunction1((t0: java.lang.String) => descending(t0).runNow()))
    __obj.updateDynamic("equalTo")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsClient.CbClient.QueryValue) => equalTo(t0, t1).runNow()))
    __obj.updateDynamic("fetch")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => fetch(t0).runNow()))
    __obj.updateDynamic("greaterThan")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsClient.CbClient.QueryValue) => greaterThan(t0, t1).runNow()))
    __obj.updateDynamic("greaterThanEqualTo")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsClient.CbClient.QueryValue) => greaterThanEqualTo(t0, t1).runNow()))
    __obj.updateDynamic("lessThan")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsClient.CbClient.QueryValue) => lessThan(t0, t1).runNow()))
    __obj.updateDynamic("lessThanEqualTo")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsClient.CbClient.QueryValue) => lessThanEqualTo(t0, t1).runNow()))
    __obj.updateDynamic("matches")(js.Any.fromFunction2((t0: java.lang.String, t1: js.RegExp) => matches(t0, t1).runNow()))
    __obj.updateDynamic("notEqualTo")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsClient.CbClient.QueryValue) => notEqualTo(t0, t1).runNow()))
    __obj.updateDynamic("or")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsClient.CbClient.QueryObj) => or(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => remove(t0).runNow()))
    __obj.updateDynamic("setPage")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => setPage(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: js.Object, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => update(t0, t1).runNow()))
    __obj.asInstanceOf[QueryObj]
  }
}

