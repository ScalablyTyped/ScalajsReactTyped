package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge extends js.Object {
  var URI: String
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def columns(callback: CbCallback): Unit
  def count(query: Query, callback: CbCallback): Unit
  def create(newEdge: js.Object, name: String, callback: CbCallback): Unit
  def deleteEdgeByName(name: String, callback: CbCallback): Unit
  def updateEdgeByName(name: String, `object`: js.Object, callback: CbCallback): Unit
}

object Edge {
  @scala.inline
  def apply(
    URI: String,
    columns: CbCallback => Callback,
    count: (Query, CbCallback) => Callback,
    create: (js.Object, String, CbCallback) => Callback,
    deleteEdgeByName: (String, CbCallback) => Callback,
    systemKey: String,
    systemSecret: String,
    updateEdgeByName: (String, js.Object, CbCallback) => Callback,
    user: APIUser
  ): Edge = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("columns")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => columns(t0).runNow()))
    __obj.updateDynamic("count")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsClient.CbClient.Query, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => count(t0, t1).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction3((t0: js.Object, t1: java.lang.String, t2: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => create(t0, t1, t2).runNow()))
    __obj.updateDynamic("deleteEdgeByName")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => deleteEdgeByName(t0, t1).runNow()))
    __obj.updateDynamic("updateEdgeByName")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Object, t2: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => updateEdgeByName(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Edge]
  }
}

