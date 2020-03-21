package typingsJapgolly.paypalRestSdk.mod.payment

import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.paypalRestSdk.mod.CallbackFunction
import typingsJapgolly.paypalRestSdk.mod.PaymentResponse
import typingsJapgolly.paypalRestSdk.mod.Payment_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "payment.create")
@js.native
object create extends js.Object {
  def apply(data: Payment_, config: RequestOptions): Unit = js.native
  def apply(data: Payment_, config: RequestOptions, cb: CallbackFunction[PaymentResponse]): Unit = js.native
  def apply(data: Payment_, config: CallbackFunction[PaymentResponse]): Unit = js.native
  def apply(data: Payment_, config: CallbackFunction[PaymentResponse], cb: CallbackFunction[PaymentResponse]): Unit = js.native
}

