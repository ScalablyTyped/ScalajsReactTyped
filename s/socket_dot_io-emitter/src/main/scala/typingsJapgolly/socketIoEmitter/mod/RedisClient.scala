package typingsJapgolly.socketIoEmitter.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Redis client passed to `socket.io-emitter` only requires the `publish`
  * method, so accept any client that implements this.
  */
trait RedisClient extends js.Object {
  def publish(channel: String, message: String): js.Promise[_]
}

object RedisClient {
  @scala.inline
  def apply(publish: (String, String) => CallbackTo[js.Promise[js.Any]]): RedisClient = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("publish")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => publish(t0, t1).runNow()))
    __obj.asInstanceOf[RedisClient]
  }
}

