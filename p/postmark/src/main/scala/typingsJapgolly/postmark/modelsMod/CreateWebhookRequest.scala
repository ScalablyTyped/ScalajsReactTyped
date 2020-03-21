package typingsJapgolly.postmark.modelsMod

import typingsJapgolly.postmark.webhookMod.HttpAuth
import typingsJapgolly.postmark.webhookMod.WebhookRequestTriggers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models", "CreateWebhookRequest")
@js.native
class CreateWebhookRequest ()
  extends typingsJapgolly.postmark.webhookMod.CreateWebhookRequest {
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

