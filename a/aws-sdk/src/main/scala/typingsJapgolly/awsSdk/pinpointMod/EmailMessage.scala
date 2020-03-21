package typingsJapgolly.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailMessage extends js.Object {
  /**
    * The body of the email message.
    */
  var Body: js.UndefOr[string] = js.native
  /**
    * The email address to forward bounces and complaints to, if feedback forwarding is enabled.
    */
  var FeedbackForwardingAddress: js.UndefOr[string] = js.native
  /**
    * The verified email address to send the email message from. The default value is the FromAddress specified for the email channel.
    */
  var FromAddress: js.UndefOr[string] = js.native
  /**
    * The email message, represented as a raw MIME message.
    */
  var RawEmail: js.UndefOr[typingsJapgolly.awsSdk.pinpointMod.RawEmail] = js.native
  /**
    * The reply-to email address(es) for the email message. If a recipient replies to the email, each reply-to address receives the reply.
    */
  var ReplyToAddresses: js.UndefOr[ListOfString] = js.native
  /**
    * The email message, composed of a subject, a text part, and an HTML part.
    */
  var SimpleEmail: js.UndefOr[typingsJapgolly.awsSdk.pinpointMod.SimpleEmail] = js.native
  /**
    * The default message variables to use in the email message. You can override the default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOfString] = js.native
}

object EmailMessage {
  @scala.inline
  def apply(
    Body: string = null,
    FeedbackForwardingAddress: string = null,
    FromAddress: string = null,
    RawEmail: RawEmail = null,
    ReplyToAddresses: ListOfString = null,
    SimpleEmail: SimpleEmail = null,
    Substitutions: MapOfListOfString = null
  ): EmailMessage = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (FeedbackForwardingAddress != null) __obj.updateDynamic("FeedbackForwardingAddress")(FeedbackForwardingAddress.asInstanceOf[js.Any])
    if (FromAddress != null) __obj.updateDynamic("FromAddress")(FromAddress.asInstanceOf[js.Any])
    if (RawEmail != null) __obj.updateDynamic("RawEmail")(RawEmail.asInstanceOf[js.Any])
    if (ReplyToAddresses != null) __obj.updateDynamic("ReplyToAddresses")(ReplyToAddresses.asInstanceOf[js.Any])
    if (SimpleEmail != null) __obj.updateDynamic("SimpleEmail")(SimpleEmail.asInstanceOf[js.Any])
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMessage]
  }
}

