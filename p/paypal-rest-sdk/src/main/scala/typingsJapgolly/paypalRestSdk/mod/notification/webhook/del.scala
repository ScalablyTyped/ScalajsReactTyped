package typingsJapgolly.paypalRestSdk.mod.notification.webhook

import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.paypalRestSdk.mod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "notification.webhook.del")
@js.native
object del extends js.Object {
  def apply(id: String, config: RequestOptions): Unit = js.native
  def apply(id: String, config: RequestOptions, cb: CallbackFunction[Webhook]): Unit = js.native
  def apply(id: String, config: CallbackFunction[Webhook]): Unit = js.native
  def apply(id: String, config: CallbackFunction[Webhook], cb: CallbackFunction[Webhook]): Unit = js.native
}

