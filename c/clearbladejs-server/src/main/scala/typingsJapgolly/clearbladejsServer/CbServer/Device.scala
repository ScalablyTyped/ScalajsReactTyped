package typingsJapgolly.clearbladejsServer.CbServer

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var URI: String
  var systemKey: String
  var systemSecret: String
  def create(newDevice: js.Object, callback: CbCallback): Unit
  def delete(query: Query, callback: CbCallback): Unit
  def fetch(query: Query, callback: CbCallback): Unit
  def update(query: Query, changes: js.Object, callback: CbCallback): Unit
}

object Device {
  @scala.inline
  def apply(
    URI: String,
    create: (js.Object, CbCallback) => Callback,
    delete: (Query, CbCallback) => Callback,
    fetch: (Query, CbCallback) => Callback,
    systemKey: String,
    systemSecret: String,
    update: (Query, js.Object, CbCallback) => Callback
  ): Device = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: js.Object, t1: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => create(t0, t1).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsServer.CbServer.Query, t1: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => delete(t0, t1).runNow()))
    __obj.updateDynamic("fetch")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsServer.CbServer.Query, t1: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => fetch(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction3((t0: typingsJapgolly.clearbladejsServer.CbServer.Query, t1: js.Object, t2: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => update(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Device]
  }
}

