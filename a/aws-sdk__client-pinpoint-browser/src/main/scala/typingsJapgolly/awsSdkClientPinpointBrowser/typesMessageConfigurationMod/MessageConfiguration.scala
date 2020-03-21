package typingsJapgolly.awsSdkClientPinpointBrowser.typesMessageConfigurationMod

import typingsJapgolly.awsSdkClientPinpointBrowser.typesCampaignEmailMessageMod.CampaignEmailMessage
import typingsJapgolly.awsSdkClientPinpointBrowser.typesCampaignSmsMessageMod.CampaignSmsMessage
import typingsJapgolly.awsSdkClientPinpointBrowser.typesMessageMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageConfiguration extends js.Object {
  /**
    * The message that the campaign delivers to ADM channels. Overrides the default message.
    */
  var ADMMessage: js.UndefOr[Message] = js.undefined
  /**
    * The message that the campaign delivers to APNS channels. Overrides the default message.
    */
  var APNSMessage: js.UndefOr[Message] = js.undefined
  /**
    * The message that the campaign delivers to Baidu channels. Overrides the default message.
    */
  var BaiduMessage: js.UndefOr[Message] = js.undefined
  /**
    * The default message for all channels.
    */
  var DefaultMessage: js.UndefOr[Message] = js.undefined
  /**
    * The email message configuration.
    */
  var EmailMessage: js.UndefOr[CampaignEmailMessage] = js.undefined
  /**
    * The message that the campaign delivers to GCM channels. Overrides the default message.
    */
  var GCMMessage: js.UndefOr[Message] = js.undefined
  /**
    * The SMS message configuration.
    */
  var SMSMessage: js.UndefOr[CampaignSmsMessage] = js.undefined
}

object MessageConfiguration {
  @scala.inline
  def apply(
    ADMMessage: Message = null,
    APNSMessage: Message = null,
    BaiduMessage: Message = null,
    DefaultMessage: Message = null,
    EmailMessage: CampaignEmailMessage = null,
    GCMMessage: Message = null,
    SMSMessage: CampaignSmsMessage = null
  ): MessageConfiguration = {
    val __obj = js.Dynamic.literal()
    if (ADMMessage != null) __obj.updateDynamic("ADMMessage")(ADMMessage.asInstanceOf[js.Any])
    if (APNSMessage != null) __obj.updateDynamic("APNSMessage")(APNSMessage.asInstanceOf[js.Any])
    if (BaiduMessage != null) __obj.updateDynamic("BaiduMessage")(BaiduMessage.asInstanceOf[js.Any])
    if (DefaultMessage != null) __obj.updateDynamic("DefaultMessage")(DefaultMessage.asInstanceOf[js.Any])
    if (EmailMessage != null) __obj.updateDynamic("EmailMessage")(EmailMessage.asInstanceOf[js.Any])
    if (GCMMessage != null) __obj.updateDynamic("GCMMessage")(GCMMessage.asInstanceOf[js.Any])
    if (SMSMessage != null) __obj.updateDynamic("SMSMessage")(SMSMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageConfiguration]
  }
}

