package typingsJapgolly.braintree.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientTokenGateway extends js.Object {
  def generate(request: ClientTokenRequest): js.Promise[ValidatedResponse[ClientToken]]
}

object ClientTokenGateway {
  @scala.inline
  def apply(generate: ClientTokenRequest => CallbackTo[js.Promise[ValidatedResponse[ClientToken]]]): ClientTokenGateway = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("generate")(js.Any.fromFunction1((t0: typingsJapgolly.braintree.mod.ClientTokenRequest) => generate(t0).runNow()))
    __obj.asInstanceOf[ClientTokenGateway]
  }
}

