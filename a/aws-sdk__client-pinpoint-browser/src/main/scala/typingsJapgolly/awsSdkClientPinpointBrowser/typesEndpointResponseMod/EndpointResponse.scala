package typingsJapgolly.awsSdkClientPinpointBrowser.typesEndpointResponseMod

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

trait EndpointResponse extends js.Object {
  /**
    * The address of the endpoint as provided by your push provider. For example, the DeviceToken or RegistrationId.
    */
  var Address: js.UndefOr[String] = js.undefined
  /**
    * The ID of the application that is associated with the endpoint.
    */
  var ApplicationId: js.UndefOr[String] = js.undefined
  /**
    * Custom attributes that describe the endpoint by associating a name with an array of values. For example, an attribute named "interests" might have the following values: ["science", "politics", "travel"]. You can use these attributes as selection criteria when you create segments.
    *
    * The Amazon Pinpoint console can't display attribute names that include the following characters: hash/pound sign (#), colon (:), question mark (?), backslash (\), and forward slash (/). For this reason, you should avoid using these characters in the names of custom attributes.
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
    * A number from 0-99 that represents the cohort the endpoint is assigned to. Endpoints are grouped into cohorts randomly, and each cohort contains approximately 1 percent of the endpoints for an app. Amazon Pinpoint assigns cohorts to the holdout or treatment allocations for a campaign.
    */
  var CohortId: js.UndefOr[String] = js.undefined
  /**
    * The date and time when the endpoint was created, shown in ISO 8601 format.
    */
  var CreationDate: js.UndefOr[String] = js.undefined
  /**
    * The endpoint demographic attributes.
    */
  var Demographic: js.UndefOr[EndpointDemographic] = js.undefined
  /**
    * The date and time when the endpoint was last updated, shown in ISO 8601 format.
    */
  var EffectiveDate: js.UndefOr[String] = js.undefined
  /**
    * Unused.
    */
  var EndpointStatus: js.UndefOr[String] = js.undefined
  /**
    * The unique ID that you assigned to the endpoint. The ID should be a globally unique identifier (GUID) to ensure that it doesn't conflict with other endpoint IDs associated with the application.
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

object EndpointResponse {
  @scala.inline
  def apply(
    Address: String = null,
    ApplicationId: String = null,
    Attributes: (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]]) = null,
    ChannelType: GCM | APNS | APNS_SANDBOX | APNS_VOIP | APNS_VOIP_SANDBOX | ADM | SMS | EMAIL | BAIDU | CUSTOM | String = null,
    CohortId: String = null,
    CreationDate: String = null,
    Demographic: EndpointDemographic = null,
    EffectiveDate: String = null,
    EndpointStatus: String = null,
    Id: String = null,
    Location: EndpointLocation = null,
    Metrics: StringDictionary[Double] | (js.Iterable[js.Tuple2[String, Double]]) = null,
    OptOut: String = null,
    RequestId: String = null,
    User: EndpointUser = null
  ): EndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (ChannelType != null) __obj.updateDynamic("ChannelType")(ChannelType.asInstanceOf[js.Any])
    if (CohortId != null) __obj.updateDynamic("CohortId")(CohortId.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Demographic != null) __obj.updateDynamic("Demographic")(Demographic.asInstanceOf[js.Any])
    if (EffectiveDate != null) __obj.updateDynamic("EffectiveDate")(EffectiveDate.asInstanceOf[js.Any])
    if (EndpointStatus != null) __obj.updateDynamic("EndpointStatus")(EndpointStatus.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    if (OptOut != null) __obj.updateDynamic("OptOut")(OptOut.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (User != null) __obj.updateDynamic("User")(User.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointResponse]
  }
}

