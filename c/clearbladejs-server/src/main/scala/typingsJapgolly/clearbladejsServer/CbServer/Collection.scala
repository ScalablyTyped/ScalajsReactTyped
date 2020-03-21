package typingsJapgolly.clearbladejsServer.CbServer

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection extends js.Object {
  var URI: String
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def addColumn(options: js.Object, callback: CbCallback): Unit
  def columns(callback: CbCallback): Unit
  def count(query: Query, callback: CbCallback): Unit
  def create(newItem: Item, callback: CbCallback): Unit
  def deleteCollection(callback: CbCallback): Unit
  def dropColumn(name: String, callback: CbCallback): Unit
  def fetch(query: Query, callback: CbCallback): Unit
  def remove(query: Query, callback: CbCallback): Unit
  def update(query: Query, changes: js.Object, callback: CbCallback): Unit
}

object Collection {
  @scala.inline
  def apply(
    URI: String,
    addColumn: (js.Object, CbCallback) => Callback,
    columns: CbCallback => Callback,
    count: (Query, CbCallback) => Callback,
    create: (Item, CbCallback) => Callback,
    deleteCollection: CbCallback => Callback,
    dropColumn: (String, CbCallback) => Callback,
    fetch: (Query, CbCallback) => Callback,
    remove: (Query, CbCallback) => Callback,
    systemKey: String,
    systemSecret: String,
    update: (Query, js.Object, CbCallback) => Callback,
    user: APIUser
  ): Collection = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("addColumn")(js.Any.fromFunction2((t0: js.Object, t1: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => addColumn(t0, t1).runNow()))
    __obj.updateDynamic("columns")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => columns(t0).runNow()))
    __obj.updateDynamic("count")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsServer.CbServer.Query, t1: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => count(t0, t1).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsServer.CbServer.Item, t1: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => create(t0, t1).runNow()))
    __obj.updateDynamic("deleteCollection")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => deleteCollection(t0).runNow()))
    __obj.updateDynamic("dropColumn")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => dropColumn(t0, t1).runNow()))
    __obj.updateDynamic("fetch")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsServer.CbServer.Query, t1: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => fetch(t0, t1).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsServer.CbServer.Query, t1: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => remove(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction3((t0: typingsJapgolly.clearbladejsServer.CbServer.Query, t1: js.Object, t2: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => update(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Collection]
  }
}

