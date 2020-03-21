package typingsJapgolly.clearbladejsNode.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var URI: String
  var URIPrefix: String
  var callTimeout: Double
  var systemKey: String
  var systemSecret: String
  var user: APIUser
  def execute(name: String, params: js.Object, callback: CbCallback): Unit
}

object Code {
  @scala.inline
  def apply(
    URI: String,
    URIPrefix: String,
    callTimeout: Double,
    execute: (String, js.Object, CbCallback) => Callback,
    systemKey: String,
    systemSecret: String,
    user: APIUser
  ): Code = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], URIPrefix = URIPrefix.asInstanceOf[js.Any], callTimeout = callTimeout.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("execute")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Object, t2: typingsJapgolly.clearbladejsNode.mod.CbCallback) => execute(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Code]
  }
}

