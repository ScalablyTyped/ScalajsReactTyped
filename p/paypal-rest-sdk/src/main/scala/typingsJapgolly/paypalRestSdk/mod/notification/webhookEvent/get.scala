package typingsJapgolly.paypalRestSdk.mod.notification.webhookEvent

import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.paypalRestSdk.mod.CallbackFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paypal-rest-sdk", "notification.webhookEvent.get")
@js.native
object get extends js.Object {
  def apply(id: String, config: RequestOptions): Unit = js.native
  def apply(id: String, config: RequestOptions, cb: CallbackFunction[WebhookEvent]): Unit = js.native
  def apply(id: String, config: CallbackFunction[WebhookEvent]): Unit = js.native
  def apply(id: String, config: CallbackFunction[WebhookEvent], cb: CallbackFunction[WebhookEvent]): Unit = js.native
}

