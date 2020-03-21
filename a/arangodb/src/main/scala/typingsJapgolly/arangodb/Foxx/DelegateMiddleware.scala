package typingsJapgolly.arangodb.Foxx

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelegateMiddleware extends js.Object {
  def register(endpoint: Endpoint): SimpleMiddleware
}

object DelegateMiddleware {
  @scala.inline
  def apply(register: Endpoint => CallbackTo[SimpleMiddleware]): DelegateMiddleware = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("register")(js.Any.fromFunction1((t0: typingsJapgolly.arangodb.Foxx.Endpoint) => register(t0).runNow()))
    __obj.asInstanceOf[DelegateMiddleware]
  }
}

