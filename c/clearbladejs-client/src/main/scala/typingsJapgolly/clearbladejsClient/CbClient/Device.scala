package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var URI: String
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def columns(callback: CbCallback): Unit
  def count(query: Query, callback: CbCallback): Unit
  def create(newDevice: js.Object, callback: CbCallback): Unit
  def delete(query: Query, callback: CbCallback): Unit
  def deleteDeviceByName(name: String, callback: CbCallback): Unit
  def fetch(query: Query, callback: CbCallback): Unit
  def getDeviceByName(name: String, callback: CbCallback): Unit
  def update(query: Query, `object`: js.Object, trigger: Boolean, callback: CbCallback): Unit
  def updateDeviceByName(name: String, `object`: js.Object, trigger: Boolean, callback: CbCallback): Unit
}

object Device {
  @scala.inline
  def apply(
    URI: String,
    columns: CbCallback => Callback,
    count: (Query, CbCallback) => Callback,
    create: (js.Object, CbCallback) => Callback,
    delete: (Query, CbCallback) => Callback,
    deleteDeviceByName: (String, CbCallback) => Callback,
    fetch: (Query, CbCallback) => Callback,
    getDeviceByName: (String, CbCallback) => Callback,
    systemKey: String,
    systemSecret: String,
    update: (Query, js.Object, Boolean, CbCallback) => Callback,
    updateDeviceByName: (String, js.Object, Boolean, CbCallback) => Callback,
    user: APIUser
  ): Device = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("columns")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => columns(t0).runNow()))
    __obj.updateDynamic("count")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsClient.CbClient.Query, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => count(t0, t1).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: js.Object, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => create(t0, t1).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsClient.CbClient.Query, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => delete(t0, t1).runNow()))
    __obj.updateDynamic("deleteDeviceByName")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => deleteDeviceByName(t0, t1).runNow()))
    __obj.updateDynamic("fetch")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsClient.CbClient.Query, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => fetch(t0, t1).runNow()))
    __obj.updateDynamic("getDeviceByName")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => getDeviceByName(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction4((t0: typingsJapgolly.clearbladejsClient.CbClient.Query, t1: js.Object, t2: scala.Boolean, t3: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => update(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("updateDeviceByName")(js.Any.fromFunction4((t0: java.lang.String, t1: js.Object, t2: scala.Boolean, t3: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => updateDeviceByName(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Device]
  }
}

