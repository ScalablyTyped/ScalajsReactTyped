package typingsJapgolly.stripeCheckout

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeCheckoutStatic extends js.Object {
  def configure(options: StripeCheckoutOptions): StripeCheckoutHandler
}

object StripeCheckoutStatic {
  @scala.inline
  def apply(configure: StripeCheckoutOptions => CallbackTo[StripeCheckoutHandler]): StripeCheckoutStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("configure")(js.Any.fromFunction1((t0: typingsJapgolly.stripeCheckout.StripeCheckoutOptions) => configure(t0).runNow()))
    __obj.asInstanceOf[StripeCheckoutStatic]
  }
}

