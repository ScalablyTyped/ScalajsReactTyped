package typingsJapgolly.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfigurationSetResponse extends js.Object {
  /**
    * The name of the configuration set.
    */
  var ConfigurationSetName: js.UndefOr[typingsJapgolly.awsSdk.sesv2Mod.ConfigurationSetName] = js.native
  /**
    * An object that defines the dedicated IP pool that is used to send emails that you send using the configuration set.
    */
  var DeliveryOptions: js.UndefOr[typingsJapgolly.awsSdk.sesv2Mod.DeliveryOptions] = js.native
  /**
    * An object that defines whether or not Amazon SES collects reputation metrics for the emails that you send that use the configuration set.
    */
  var ReputationOptions: js.UndefOr[typingsJapgolly.awsSdk.sesv2Mod.ReputationOptions] = js.native
  /**
    * An object that defines whether or not Amazon SES can send email that you send using the configuration set.
    */
  var SendingOptions: js.UndefOr[typingsJapgolly.awsSdk.sesv2Mod.SendingOptions] = js.native
  /**
    * An object that contains information about the suppression list preferences for your account.
    */
  var SuppressionOptions: js.UndefOr[typingsJapgolly.awsSdk.sesv2Mod.SuppressionOptions] = js.native
  /**
    * An array of objects that define the tags (keys and values) that are associated with the configuration set.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * An object that defines the open and click tracking options for emails that you send using the configuration set.
    */
  var TrackingOptions: js.UndefOr[typingsJapgolly.awsSdk.sesv2Mod.TrackingOptions] = js.native
}

object GetConfigurationSetResponse {
  @scala.inline
  def apply(
    ConfigurationSetName: ConfigurationSetName = null,
    DeliveryOptions: DeliveryOptions = null,
    ReputationOptions: ReputationOptions = null,
    SendingOptions: SendingOptions = null,
    SuppressionOptions: SuppressionOptions = null,
    Tags: TagList = null,
    TrackingOptions: TrackingOptions = null
  ): GetConfigurationSetResponse = {
    val __obj = js.Dynamic.literal()
    if (ConfigurationSetName != null) __obj.updateDynamic("ConfigurationSetName")(ConfigurationSetName.asInstanceOf[js.Any])
    if (DeliveryOptions != null) __obj.updateDynamic("DeliveryOptions")(DeliveryOptions.asInstanceOf[js.Any])
    if (ReputationOptions != null) __obj.updateDynamic("ReputationOptions")(ReputationOptions.asInstanceOf[js.Any])
    if (SendingOptions != null) __obj.updateDynamic("SendingOptions")(SendingOptions.asInstanceOf[js.Any])
    if (SuppressionOptions != null) __obj.updateDynamic("SuppressionOptions")(SuppressionOptions.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TrackingOptions != null) __obj.updateDynamic("TrackingOptions")(TrackingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigurationSetResponse]
  }
}

