package typingsJapgolly.beanstalkd.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicWriter extends Writer {
  def handle(protocol: BeanstalkdProtocol, connection: Socket, args: js.Any*): js.Promise[_]
}

object BasicWriter {
  @scala.inline
  def apply(
    command: String,
    handle: (BeanstalkdProtocol, Socket, /* repeated */ js.Any) => CallbackTo[js.Promise[js.Any]]
  ): BasicWriter = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.updateDynamic("handle")(js.Any.fromFunction3((t0: typingsJapgolly.beanstalkd.mod.BeanstalkdProtocol, t1: typingsJapgolly.node.netMod.Socket, t2: /* repeated */ js.Any) => handle(t0, t1, t2).runNow()))
    __obj.asInstanceOf[BasicWriter]
  }
}

