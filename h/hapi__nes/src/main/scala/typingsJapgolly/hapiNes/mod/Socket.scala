package typingsJapgolly.hapiNes.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Socket extends js.Object {
  var app: js.Object
  var auth: SocketAuthObject
  var id: String
  def disconnect(): js.Promise[_]
  def publish(path: String, message: js.Any): js.Promise[_]
  def revoke(path: String, message: js.Any): js.Promise[_]
  def send(message: js.Any): js.Promise[_]
}

object Socket {
  @scala.inline
  def apply(
    app: js.Object,
    auth: SocketAuthObject,
    disconnect: CallbackTo[js.Promise[js.Any]],
    id: String,
    publish: (String, js.Any) => CallbackTo[js.Promise[js.Any]],
    revoke: (String, js.Any) => CallbackTo[js.Promise[js.Any]],
    send: js.Any => CallbackTo[js.Promise[js.Any]]
  ): Socket = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("disconnect")(disconnect.toJsFn)
    __obj.updateDynamic("publish")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => publish(t0, t1).runNow()))
    __obj.updateDynamic("revoke")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => revoke(t0, t1).runNow()))
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: js.Any) => send(t0).runNow()))
    __obj.asInstanceOf[Socket]
  }
}

