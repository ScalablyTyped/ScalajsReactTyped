package typingsJapgolly.paypalRestSdk.mod.invoice

import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.paypalRestSdk.mod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "invoice.qrCode")
@js.native
object qrCode extends js.Object {
  def apply(id: String, height: Double, width: Double, config: RequestOptions): Unit = js.native
  def apply(
    id: String,
    height: Double,
    width: Double,
    config: RequestOptions,
    cb: CallbackFunction[QrResponse]
  ): Unit = js.native
  def apply(id: String, height: Double, width: Double, config: CallbackFunction[QrResponse]): Unit = js.native
  def apply(
    id: String,
    height: Double,
    width: Double,
    config: CallbackFunction[QrResponse],
    cb: CallbackFunction[QrResponse]
  ): Unit = js.native
}

