package typingsJapgolly.paypalRestSdk.mod.invoice

import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.paypalRestSdk.mod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "invoice.update")
@js.native
object update extends js.Object {
  def apply(id: String, data: Invoice, config: RequestOptions): Unit = js.native
  def apply(id: String, data: Invoice, config: RequestOptions, cb: CallbackFunction[InvoiceResponse]): Unit = js.native
  def apply(id: String, data: Invoice, config: CallbackFunction[InvoiceResponse]): Unit = js.native
  def apply(
    id: String,
    data: Invoice,
    config: CallbackFunction[InvoiceResponse],
    cb: CallbackFunction[InvoiceResponse]
  ): Unit = js.native
}

