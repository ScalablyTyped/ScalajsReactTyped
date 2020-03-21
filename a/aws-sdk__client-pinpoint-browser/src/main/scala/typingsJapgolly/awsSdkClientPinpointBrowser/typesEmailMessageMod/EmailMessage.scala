package typingsJapgolly.awsSdkClientPinpointBrowser.typesEmailMessageMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkClientPinpointBrowser.typesRawEmailMod.RawEmail
import typingsJapgolly.awsSdkClientPinpointBrowser.typesSimpleEmailMod.SimpleEmail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailMessage extends js.Object {
  /**
    * The body of the email message.
    */
  var Body: js.UndefOr[String] = js.undefined
  /**
    * The email address that bounces and complaints will be forwarded to when feedback forwarding is enabled.
    */
  var FeedbackForwardingAddress: js.UndefOr[String] = js.undefined
  /**
    * The email address used to send the email from. Defaults to use FromAddress specified in the Email Channel.
    */
  var FromAddress: js.UndefOr[String] = js.undefined
  /**
    * An email represented as a raw MIME message.
    */
  var RawEmail: js.UndefOr[typingsJapgolly.awsSdkClientPinpointBrowser.typesRawEmailMod.RawEmail] = js.undefined
  /**
    * The reply-to email address(es) for the email. If the recipient replies to the email, each reply-to address will receive the reply.
    */
  var ReplyToAddresses: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.undefined
  /**
    * An email composed of a subject, a text part and a html part.
    */
  var SimpleEmail: js.UndefOr[typingsJapgolly.awsSdkClientPinpointBrowser.typesSimpleEmailMod.SimpleEmail] = js.undefined
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  var Substitutions: js.UndefOr[
    (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]])
  ] = js.undefined
}

object EmailMessage {
  @scala.inline
  def apply(
    Body: String = null,
    FeedbackForwardingAddress: String = null,
    FromAddress: String = null,
    RawEmail: RawEmail = null,
    ReplyToAddresses: js.Array[String] | js.Iterable[String] = null,
    SimpleEmail: SimpleEmail = null,
    Substitutions: (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]]) = null
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

