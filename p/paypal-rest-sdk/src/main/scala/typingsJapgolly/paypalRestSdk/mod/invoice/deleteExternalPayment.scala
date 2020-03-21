package typingsJapgolly.paypalRestSdk.mod.invoice

import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.paypalRestSdk.mod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "invoice.deleteExternalPayment")
@js.native
object deleteExternalPayment extends js.Object {
  def apply(id: String, trxid: String, config: RequestOptions): Unit = js.native
  def apply(id: String, trxid: String, config: RequestOptions, cb: CallbackFunction[Null]): Unit = js.native
  def apply(id: String, trxid: String, config: CallbackFunction[Null]): Unit = js.native
  def apply(id: String, trxid: String, config: CallbackFunction[Null], cb: CallbackFunction[Null]): Unit = js.native
}

