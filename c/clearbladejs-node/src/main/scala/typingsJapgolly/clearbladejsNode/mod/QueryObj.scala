package typingsJapgolly.clearbladejsNode.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
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
  def ascending(field: String): Query
  def descending(field: String): Query
  def equalTo(field: String, value: QueryValue): Query
  def fetch(callback: CbCallback): Unit
  def greaterThan(field: String, value: QueryValue): Query
  def greaterThanEqualTo(field: String, value: QueryValue): Query
  def lessThan(field: String, value: QueryValue): Query
  def lessThanEqualTo(field: String, value: QueryValue): Query
  def matches(field: String, pattern: String): Query
  def notEqualTo(field: String, value: QueryValue): Query
  def or(query: QueryObj): Query
  def remove(callback: CbCallback): Unit
  def setPage(pageSize: Double, pageNum: Double): Query
  def update(changes: js.Object, callback: CbCallback): Unit
}

object QueryObj {
  @scala.inline
  def apply(
    OR: js.Array[Query],
    URI: String,
    ascending: String => CallbackTo[Query],
    descending: String => CallbackTo[Query],
    endpoint: String,
    equalTo: (String, QueryValue) => CallbackTo[Query],
    fetch: CbCallback => Callback,
    greaterThan: (String, QueryValue) => CallbackTo[Query],
    greaterThanEqualTo: (String, QueryValue) => CallbackTo[Query],
    lessThan: (String, QueryValue) => CallbackTo[Query],
    lessThanEqualTo: (String, QueryValue) => CallbackTo[Query],
    limit: Double,
    matches: (String, String) => CallbackTo[Query],
    notEqualTo: (String, QueryValue) => CallbackTo[Query],
    offset: Double,
    or: QueryObj => CallbackTo[Query],
    query: Query,
    remove: CbCallback => Callback,
    setPage: (Double, Double) => CallbackTo[Query],
    systemKey: String,
    systemSecret: String,
    update: (js.Object, CbCallback) => Callback,
    user: APIUser
  ): QueryObj = {
    val __obj = js.Dynamic.literal(OR = OR.asInstanceOf[js.Any], URI = URI.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("ascending")(js.Any.fromFunction1((t0: java.lang.String) => ascending(t0).runNow()))
    __obj.updateDynamic("descending")(js.Any.fromFunction1((t0: java.lang.String) => descending(t0).runNow()))
    __obj.updateDynamic("equalTo")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsNode.mod.QueryValue) => equalTo(t0, t1).runNow()))
    __obj.updateDynamic("fetch")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsNode.mod.CbCallback) => fetch(t0).runNow()))
    __obj.updateDynamic("greaterThan")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsNode.mod.QueryValue) => greaterThan(t0, t1).runNow()))
    __obj.updateDynamic("greaterThanEqualTo")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsNode.mod.QueryValue) => greaterThanEqualTo(t0, t1).runNow()))
    __obj.updateDynamic("lessThan")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsNode.mod.QueryValue) => lessThan(t0, t1).runNow()))
    __obj.updateDynamic("lessThanEqualTo")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsNode.mod.QueryValue) => lessThanEqualTo(t0, t1).runNow()))
    __obj.updateDynamic("matches")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => matches(t0, t1).runNow()))
    __obj.updateDynamic("notEqualTo")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsNode.mod.QueryValue) => notEqualTo(t0, t1).runNow()))
    __obj.updateDynamic("or")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsNode.mod.QueryObj) => or(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsNode.mod.CbCallback) => remove(t0).runNow()))
    __obj.updateDynamic("setPage")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => setPage(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: js.Object, t1: typingsJapgolly.clearbladejsNode.mod.CbCallback) => update(t0, t1).runNow()))
    __obj.asInstanceOf[QueryObj]
  }
}

