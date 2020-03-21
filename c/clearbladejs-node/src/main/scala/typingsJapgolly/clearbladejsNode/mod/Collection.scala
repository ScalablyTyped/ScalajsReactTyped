package typingsJapgolly.clearbladejsNode.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Collection extends js.Object {
  var URI: String
  var endpoint: String
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def create(newItem: Item, callback: CbCallback): Unit
  def fetch(query: QueryObj, callback: CbCallback): Unit
  def remove(query: Query, callback: CbCallback): Unit
  def update(query: Query, changes: js.Object, callback: CbCallback): Unit
}

object Collection {
  @scala.inline
  def apply(
    URI: String,
    create: (Item, CbCallback) => Callback,
    endpoint: String,
    fetch: (QueryObj, CbCallback) => Callback,
    remove: (Query, CbCallback) => Callback,
    systemKey: String,
    systemSecret: String,
    update: (Query, js.Object, CbCallback) => Callback,
    user: APIUser
  ): Collection = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsNode.mod.Item, t1: typingsJapgolly.clearbladejsNode.mod.CbCallback) => create(t0, t1).runNow()))
    __obj.updateDynamic("fetch")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsNode.mod.QueryObj, t1: typingsJapgolly.clearbladejsNode.mod.CbCallback) => fetch(t0, t1).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsNode.mod.Query, t1: typingsJapgolly.clearbladejsNode.mod.CbCallback) => remove(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction3((t0: typingsJapgolly.clearbladejsNode.mod.Query, t1: js.Object, t2: typingsJapgolly.clearbladejsNode.mod.CbCallback) => update(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Collection]
  }
}

