package typingsJapgolly.clearbladejsServer.CbServer

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deployment extends js.Object {
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def create(name: String, description: String, options: DeploymentOptions, callback: CbCallback): Unit
  def delete(name: String, callback: CbCallback): Unit
  def read(name: String, callback: CbCallback): Unit
  def readAll(query: QueryObj, callback: CbCallback): Unit
  def update(name: String, options: DeploymentOptions, callback: CbCallback): Unit
}

object Deployment {
  @scala.inline
  def apply(
    create: (String, String, DeploymentOptions, CbCallback) => Callback,
    delete: (String, CbCallback) => Callback,
    read: (String, CbCallback) => Callback,
    readAll: (QueryObj, CbCallback) => Callback,
    systemKey: String,
    systemSecret: String,
    update: (String, DeploymentOptions, CbCallback) => Callback,
    user: APIUser
  ): Deployment = {
    val __obj = js.Dynamic.literal(systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.clearbladejsServer.CbServer.DeploymentOptions, t3: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => create(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => delete(t0, t1).runNow()))
    __obj.updateDynamic("read")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => read(t0, t1).runNow()))
    __obj.updateDynamic("readAll")(js.Any.fromFunction2((t0: typingsJapgolly.clearbladejsServer.CbServer.QueryObj, t1: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => readAll(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.clearbladejsServer.CbServer.DeploymentOptions, t2: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => update(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Deployment]
  }
}

