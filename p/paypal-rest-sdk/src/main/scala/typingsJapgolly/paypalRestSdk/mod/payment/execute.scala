package typingsJapgolly.paypalRestSdk.mod.payment

import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.paypalRestSdk.mod.CallbackFunction
import typingsJapgolly.paypalRestSdk.mod.PaymentResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "payment.execute")
@js.native
object execute extends js.Object {
  def apply(id: String, data: ExecuteRequest, config: RequestOptions): Unit = js.native
  def apply(id: String, data: ExecuteRequest, config: RequestOptions, cb: CallbackFunction[PaymentResponse]): Unit = js.native
  def apply(id: String, data: ExecuteRequest, config: CallbackFunction[PaymentResponse]): Unit = js.native
  def apply(
    id: String,
    data: ExecuteRequest,
    config: CallbackFunction[PaymentResponse],
    cb: CallbackFunction[PaymentResponse]
  ): Unit = js.native
}

