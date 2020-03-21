package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var URI: String
  var callTimeout: Double
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def create(name: String, body: String, callback: CbCallback): Unit
  def delete(name: String, callback: CbCallback): Unit
  def execute(name: String, params: js.Object, callback: CbCallback): Unit
  def getAllServices(callback: CbCallback): Unit
  def getCompletedServices(callback: CbCallback): Unit
  def getFailedServices(callback: CbCallback): Unit
  def update(name: String, body: String, callback: CbCallback): Unit
}

object Code {
  @scala.inline
  def apply(
    URI: String,
    callTimeout: Double,
    create: (String, String, CbCallback) => Callback,
    delete: (String, CbCallback) => Callback,
    execute: (String, js.Object, CbCallback) => Callback,
    getAllServices: CbCallback => Callback,
    getCompletedServices: CbCallback => Callback,
    getFailedServices: CbCallback => Callback,
    systemKey: String,
    systemSecret: String,
    update: (String, String, CbCallback) => Callback,
    user: APIUser
  ): Code = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], callTimeout = callTimeout.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => create(t0, t1, t2).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => delete(t0, t1).runNow()))
    __obj.updateDynamic("execute")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Object, t2: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => execute(t0, t1, t2).runNow()))
    __obj.updateDynamic("getAllServices")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => getAllServices(t0).runNow()))
    __obj.updateDynamic("getCompletedServices")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => getCompletedServices(t0).runNow()))
    __obj.updateDynamic("getFailedServices")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => getFailedServices(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => update(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Code]
  }
}

