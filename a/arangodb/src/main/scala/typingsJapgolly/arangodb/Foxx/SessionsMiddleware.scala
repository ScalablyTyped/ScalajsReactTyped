package typingsJapgolly.arangodb.Foxx

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionsMiddleware extends DelegateMiddleware {
  var storage: SessionStorage
  var transport: js.Array[SessionTransport]
}

object SessionsMiddleware {
  @scala.inline
  def apply(
    register: Endpoint => CallbackTo[SimpleMiddleware],
    storage: SessionStorage,
    transport: js.Array[SessionTransport]
  ): SessionsMiddleware = {
    val __obj = js.Dynamic.literal(storage = storage.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: typingsJapgolly.arangodb.Foxx.Endpoint) => register(t0).runNow()))
    __obj.asInstanceOf[SessionsMiddleware]
  }
}

