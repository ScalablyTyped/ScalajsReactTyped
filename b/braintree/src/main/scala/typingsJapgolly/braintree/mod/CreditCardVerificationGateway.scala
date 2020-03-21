package typingsJapgolly.braintree.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditCardVerificationGateway extends js.Object {
  def search(searchFn: js.Any): Readable
}

object CreditCardVerificationGateway {
  @scala.inline
  def apply(search: js.Any => CallbackTo[Readable]): CreditCardVerificationGateway = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("search")(js.Any.fromFunction1((t0: js.Any) => search(t0).runNow()))
    __obj.asInstanceOf[CreditCardVerificationGateway]
  }
}

