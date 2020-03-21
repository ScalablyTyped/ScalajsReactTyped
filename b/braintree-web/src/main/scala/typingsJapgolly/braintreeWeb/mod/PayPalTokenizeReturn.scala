package typingsJapgolly.braintreeWeb.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property {Function} close A handle to close the PayPal checkout flow.
  */
trait PayPalTokenizeReturn extends js.Object {
  def close(): js.Any
}

object PayPalTokenizeReturn {
  @scala.inline
  def apply(close: CallbackTo[js.Any]): PayPalTokenizeReturn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.asInstanceOf[PayPalTokenizeReturn]
  }
}

