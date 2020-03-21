package typingsJapgolly.postmark

import typingsJapgolly.postmark.webhookMod.BounceWebhookTrigger
import typingsJapgolly.postmark.webhookMod.OpenWebhookTrigger
import typingsJapgolly.postmark.webhookMod.SpamWebhookTrigger
import typingsJapgolly.postmark.webhookMod.WebhookTrigger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBounce extends js.Object {
  var Bounce: BounceWebhookTrigger
  var Click: WebhookTrigger
  var Delivery: WebhookTrigger
  var Open: OpenWebhookTrigger
  var SpamComplaint: SpamWebhookTrigger
}

object AnonBounce {
  @scala.inline
  def apply(
    Bounce: BounceWebhookTrigger,
    Click: WebhookTrigger,
    Delivery: WebhookTrigger,
    Open: OpenWebhookTrigger,
    SpamComplaint: SpamWebhookTrigger
  ): AnonBounce = {
    val __obj = js.Dynamic.literal(Bounce = Bounce.asInstanceOf[js.Any], Click = Click.asInstanceOf[js.Any], Delivery = Delivery.asInstanceOf[js.Any], Open = Open.asInstanceOf[js.Any], SpamComplaint = SpamComplaint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBounce]
  }
}

