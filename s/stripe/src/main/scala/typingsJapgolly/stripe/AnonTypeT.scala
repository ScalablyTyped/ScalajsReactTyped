package typingsJapgolly.stripe

import typingsJapgolly.stripe.mod.paymentMethods.IPaymentMethodType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypeT[T /* <: IPaymentMethodType */] extends js.Object {
  var `type`: T
}

object AnonTypeT {
  @scala.inline
  def apply[T /* <: IPaymentMethodType */](`type`: T): AnonTypeT[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeT[T]]
  }
}

