package typingsJapgolly.paypalRestSdk.mod.payment

import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.paypalRestSdk.mod.CallbackFunction
import typingsJapgolly.paypalRestSdk.mod.PaymentResponse
import typingsJapgolly.paypalRestSdk.mod.UpdateRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "payment.update")
@js.native
object update extends js.Object {
  def apply(id: String, data: js.Array[UpdateRequest]): Unit = js.native
  def apply(id: String, data: js.Array[UpdateRequest], config: RequestOptions): Unit = js.native
  def apply(
    id: String,
    data: js.Array[UpdateRequest],
    config: RequestOptions,
    cb: CallbackFunction[PaymentResponse]
  ): Unit = js.native
  def apply(id: String, data: js.Array[UpdateRequest], config: CallbackFunction[PaymentResponse]): Unit = js.native
  def apply(
    id: String,
    data: js.Array[UpdateRequest],
    config: CallbackFunction[PaymentResponse],
    cb: CallbackFunction[PaymentResponse]
  ): Unit = js.native
}

