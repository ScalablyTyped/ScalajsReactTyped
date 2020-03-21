package typingsJapgolly.awsSdkClientPinpointBrowser.typesEndpointBatchItemMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ADM
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.APNS
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.APNS_SANDBOX
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.APNS_VOIP
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.APNS_VOIP_SANDBOX
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.BAIDU
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.CUSTOM
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.EMAIL
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.GCM
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.SMS
import typingsJapgolly.awsSdkClientPinpointBrowser.typesEndpointDemographicMod.EndpointDemographic
import typingsJapgolly.awsSdkClientPinpointBrowser.typesEndpointLocationMod.EndpointLocation
import typingsJapgolly.awsSdkClientPinpointBrowser.typesEndpointUserMod.EndpointUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointBatchItem extends js.Object {
  /**
    * The destination for messages that you send to this endpoint. The address varies by channel. For mobile push channels, use the token provided by the push notification service, such as the APNs device token or the FCM registration token. For the SMS channel, use a phone number in E.164 format, such as +12065550100. For the email channel, use an email address.
    */
  var Address: js.UndefOr[String] = js.undefined
  /**
    * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an attribute named "interests" might have the values ["science", "politics", "travel"]. You can use these attributes as selection criteria when you create a segment of users to engage with a messaging campaign.
    *
    * The following characters are not recommended in attribute names: # : ? \ /. The Amazon Pinpoint console does not display attributes that include these characters in the name. This limitation does not apply to attribute values.
    */
  var Attributes: js.UndefOr[
    (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]])
  ] = js.undefined
  /**
    * The channel type.
    *
    * Valid values: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU
    */
  var ChannelType: js.UndefOr[
    GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU | CUSTOM | String
  ] = js.undefined
  /**
    * The endpoint demographic attributes.
    */
  var Demographic: js.UndefOr[EndpointDemographic] = js.undefined
  /**
    * The last time the endpoint was updated. Provided in ISO 8601 format.
    */
  var EffectiveDate: js.UndefOr[String] = js.undefined
  /**
    * Unused.
    */
  var EndpointStatus: js.UndefOr[String] = js.undefined
  /**
    * The unique Id for the Endpoint in the batch.
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * The endpoint location attributes.
    */
  var Location: js.UndefOr[EndpointLocation] = js.undefined
  /**
    * Custom metrics that your app reports to Amazon Pinpoint.
    */
  var Metrics: js.UndefOr[StringDictionary[Double] | (js.Iterable[js.Tuple2[String, Double]])] = js.undefined
  /**
    * Indicates whether a user has opted out of receiving messages with one of the following values:
    *
    * ALL - User has opted out of all messages.
    *
    * NONE - Users has not opted out and receives all messages.
    */
  var OptOut: js.UndefOr[String] = js.undefined
  /**
    * The unique ID for the most recent request to update the endpoint.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  /**
    * Custom user-specific attributes that your app reports to Amazon Pinpoint.
    */
  var User: js.UndefOr[EndpointUser] = js.undefined
}

object EndpointBatchItem {
  @scala.inline
  def apply(
    Address: String = null,
    Attributes: (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]]) = null,
    ChannelType: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU | CUSTOM | String = null,
    Demographic: EndpointDemographic = null,
    EffectiveDate: String = null,
    EndpointStatus: String = null,
    Id: String = null,
    Location: EndpointLocation = null,
    Metrics: StringDictionary[Double] | (js.Iterable[js.Tuple2[String, Double]]) = null,
    OptOut: String = null,
    RequestId: String = null,
    User: EndpointUser = null
  ): EndpointBatchItem = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (ChannelType != null) __obj.updateDynamic("ChannelType")(ChannelType.asInstanceOf[js.Any])
    if (Demographic != null) __obj.updateDynamic("Demographic")(Demographic.asInstanceOf[js.Any])
    if (EffectiveDate != null) __obj.updateDynamic("EffectiveDate")(EffectiveDate.asInstanceOf[js.Any])
    if (EndpointStatus != null) __obj.updateDynamic("EndpointStatus")(EndpointStatus.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    if (OptOut != null) __obj.updateDynamic("OptOut")(OptOut.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (User != null) __obj.updateDynamic("User")(User.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointBatchItem]
  }
}

