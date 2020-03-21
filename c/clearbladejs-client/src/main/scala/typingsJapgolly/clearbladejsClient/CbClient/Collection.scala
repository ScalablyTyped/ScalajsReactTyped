package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection extends js.Object {
  var URI: String
  var endpoint: String
  var isUsingCollectionName: Boolean
  var name: String
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def columns(callback: CbCallback): Unit
  def count(query: Query, callback: CbCallback): Unit
  def create(newItem: Item, callback: CbCallback): Unit
  def fetch(query: Query, callback: CbCallback): Unit
  def remove(query: Query, callback: CbCallback): Unit
  def update(query: Query, changes: js.Object, callback: CbCallback): Unit
}

object Collection {
  @scala.inline
  def apply(
    URI: String,
    columns: CbCallback => Callback,
    count: (Query, CbCallback) => Callback,
    create: (Item, CbCallback) => Callback,
    endpoint: String,
    fetch: (Query, CbCallback) => Callback,
    isUsingCollectionName: Boolean,
    name: String,
    remove: (Query, CbCallback) => Callback,
    systemKey: String,
    systemSecret: String,
    update: (Query, js.Object, CbCallback) => Callback,
    user: APIUser
  ): Collection = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], isUsingCollectionName = isUsingCollectionName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("columns")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => columns(t0).runNow()))
    __obj.updateDynamic("count")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsClient.CbClient.Query, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => count(t0, t1).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsClient.CbClient.Item, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => create(t0, t1).runNow()))
    __obj.updateDynamic("fetch")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsClient.CbClient.Query, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => fetch(t0, t1).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsClient.CbClient.Query, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => remove(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction3((t0: typingsJapgolly.clearbladejsClient.CbClient.Query, t1: js.Object, t2: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => update(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Collection]
  }
}

