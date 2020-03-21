package typingsJapgolly.awsSdkClientPinpointBrowser.typesSmsmessageMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PROMOTIONAL
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.TRANSACTIONAL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SMSMessage extends js.Object {
  /**
    * The body of the SMS message.
    */
  var Body: js.UndefOr[String] = js.undefined
  /**
    * The SMS program name that you provided to AWS Support when you requested your dedicated number.
    */
  var Keyword: js.UndefOr[String] = js.undefined
  /**
    * Is this a transaction priority message or lower priority.
    */
  var MessageType: js.UndefOr[TRANSACTIONAL | PROMOTIONAL | String] = js.undefined
  /**
    * The phone number that the SMS message originates from. Specify one of the dedicated long codes or short codes that you requested from AWS Support and that is assigned to your account. If this attribute is not specified, Amazon Pinpoint randomly assigns a long code.
    */
  var OriginationNumber: js.UndefOr[String] = js.undefined
  /**
    * The sender ID that is shown as the message sender on the recipient's device. Support for sender IDs varies by country or region.
    */
  var SenderId: js.UndefOr[String] = js.undefined
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  var Substitutions: js.UndefOr[
    (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]])
  ] = js.undefined
}

object SMSMessage {
  @scala.inline
  def apply(
    Body: String = null,
    Keyword: String = null,
    MessageType: TRANSACTIONAL | PROMOTIONAL | String = null,
    OriginationNumber: String = null,
    SenderId: String = null,
    Substitutions: (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]]) = null
  ): SMSMessage = {
    val __obj = js.Dynamic.literal()
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (Keyword != null) __obj.updateDynamic("Keyword")(Keyword.asInstanceOf[js.Any])
    if (MessageType != null) __obj.updateDynamic("MessageType")(MessageType.asInstanceOf[js.Any])
    if (OriginationNumber != null) __obj.updateDynamic("OriginationNumber")(OriginationNumber.asInstanceOf[js.Any])
    if (SenderId != null) __obj.updateDynamic("SenderId")(SenderId.asInstanceOf[js.Any])
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMSMessage]
  }
}

