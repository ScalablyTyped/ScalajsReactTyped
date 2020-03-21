package typingsJapgolly.clearbladejsServer.CbServer

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def execute(name: String, params: js.Object, loggingEnabled: Boolean, callback: CbCallback): Unit
  def getAllServices(callback: CbCallback): Unit
}

object Code {
  @scala.inline
  def apply(
    execute: (String, js.Object, Boolean, CbCallback) => Callback,
    getAllServices: CbCallback => Callback,
    systemKey: String,
    systemSecret: String,
    user: APIUser
  ): Code = {
    val __obj = js.Dynamic.literal(systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("execute")(js.Any.fromFunction4((t0: java.lang.String, t1: js.Object, t2: scala.Boolean, t3: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => execute(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("getAllServices")(js.Any.fromFunction1((t0: typingsJapgolly.clearbladejsServer.CbServer.CbCallback) => getAllServices(t0).runNow()))
    __obj.asInstanceOf[Code]
  }
}

