package typingsJapgolly.postmark.mod.Models

import typingsJapgolly.postmark.webhookMod.HttpAuth
import typingsJapgolly.postmark.webhookMod.WebhookRequestTriggers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.CreateWebhookRequest")
@js.native
class CreateWebhookRequest ()
  extends typingsJapgolly.postmark.modelsMod.CreateWebhookRequest {
  def this(url: String) = this()
  def this(url: String, triggers: WebhookRequestTriggers) = this()
  def this(url: String, triggers: WebhookRequestTriggers, httpAuth: HttpAuth) = this()
  def this(
    url: String,
    triggers: WebhookRequestTriggers,
    httpAuth: HttpAuth,
    httpHeaders: js.Array[typingsJapgolly.postmark.messageSupportingTypesMod.Header]
  ) = this()
}

