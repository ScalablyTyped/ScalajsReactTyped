package typingsJapgolly.feathersjsSocketCommons.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  def filter(callback: js.Function1[/* connection */ Connection, Boolean]): Channel
  def join(connections: Connection*): this.type
  def leave(connections: Connection*): this.type
  def send(data: js.Any): this.type
}

object Channel {
  @scala.inline
  def apply(
    filter: js.Function1[/* connection */ Connection, Boolean] => CallbackTo[Channel],
    join: /* repeated */ Connection => CallbackTo[Channel],
    leave: /* repeated */ Connection => CallbackTo[Channel],
    send: js.Any => CallbackTo[Channel]
  ): Channel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: js.Function1[
  /* connection */ typingsJapgolly.feathersjsSocketCommons.mod.Connection, 
  scala.Boolean]) => filter(t0).runNow()))
    __obj.updateDynamic("join")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.feathersjsSocketCommons.mod.Connection) => join(t0).runNow()))
    __obj.updateDynamic("leave")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.feathersjsSocketCommons.mod.Connection) => leave(t0).runNow()))
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: js.Any) => send(t0).runNow()))
    __obj.asInstanceOf[Channel]
  }
}

