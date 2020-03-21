package typingsJapgolly.paypalRestSdk.mod

import typingsJapgolly.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "refund")
@js.native
object refund extends js.Object {
  def get(id: String, config: RequestOptions): Unit = js.native
  def get(id: String, config: RequestOptions, cb: CallbackFunction[RefundResource]): Unit = js.native
  def get(id: String, config: CallbackFunction[RefundResource]): Unit = js.native
  def get(id: String, config: CallbackFunction[RefundResource], cb: CallbackFunction[RefundResource]): Unit = js.native
}

