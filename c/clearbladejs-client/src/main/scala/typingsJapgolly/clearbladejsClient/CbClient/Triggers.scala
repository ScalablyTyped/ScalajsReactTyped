package typingsJapgolly.clearbladejsClient.CbClient

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Triggers extends js.Object {
  var URI: String
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def create(name: String, data: js.Object, callback: CbCallback): Unit
  def delete(name: String, callback: CbCallback): Unit
  def fetchDefinitions(callback: CbCallback): Unit
  def update(name: String, data: js.Object, callback: CbCallback): Unit
}

object Triggers {
  @scala.inline
  def apply(
    URI: String,
    create: (String, js.Object, CbCallback) => Callback,
    delete: (String, CbCallback) => Callback,
    fetchDefinitions: CbCallback => Callback,
    systemKey: String,
    systemSecret: String,
    update: (String, js.Object, CbCallback) => Callback,
    user: APIUser
  ): Triggers = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Object, t2: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => create(t0, t1, t2).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => delete(t0, t1).runNow()))
    __obj.updateDynamic("fetchDefinitions")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => fetchDefinitions(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Object, t2: typingsJapgolly.clearbladejsClient.CbClient.CbCallback) => update(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Triggers]
  }
}

