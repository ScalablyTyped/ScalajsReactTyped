package typingsJapgolly.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicEndpoint extends js.Object {
  /**
    * The unique identifier for the recipient, such as a device token, email address, or mobile phone number.
    */
  var Address: js.UndefOr[string] = js.native
  /**
    * One or more custom attributes that describe the endpoint by associating a name with an array of values. You can use these attributes as filter criteria when you create segments.
    */
  var Attributes: js.UndefOr[MapOfListOfString] = js.native
  /**
    * The channel that's used when sending messages or push notifications to the endpoint.
    */
  var ChannelType: js.UndefOr[typingsJapgolly.awsSdk.pinpointMod.ChannelType] = js.native
  /**
    * The demographic information for the endpoint, such as the time zone and platform.
    */
  var Demographic: js.UndefOr[EndpointDemographic] = js.native
  /**
    * The date and time, in ISO 8601 format, when the endpoint was last updated.
    */
  var EffectiveDate: js.UndefOr[string] = js.native
  /**
    * Specifies whether to send messages or push notifications to the endpoint. Valid values are: ACTIVE, messages are sent to the endpoint; and, INACTIVE, messages aren’t sent to the endpoint. Amazon Pinpoint automatically sets this value to ACTIVE when you create an endpoint or update an existing endpoint. Amazon Pinpoint automatically sets this value to INACTIVE if you update another endpoint that has the same address specified by the Address property.
    */
  var EndpointStatus: js.UndefOr[string] = js.native
  /**
    * The geographic information for the endpoint.
    */
  var Location: js.UndefOr[EndpointLocation] = js.native
  /**
    * One or more custom metrics that your app reports to Amazon Pinpoint for the endpoint.
    */
  var Metrics: js.UndefOr[MapOfDouble] = js.native
  /**
    * Specifies whether the user who's associated with the endpoint has opted out of receiving messages and push notifications from you. Possible values are: ALL, the user has opted out and doesn't want to receive any messages or push notifications; and, NONE, the user hasn't opted out and wants to receive all messages and push notifications.
    */
  var OptOut: js.UndefOr[string] = js.native
  /**
    * A unique identifier that's generated each time the endpoint is updated.
    */
  var RequestId: js.UndefOr[string] = js.native
  /**
    * One or more custom user attributes that your app reports to Amazon Pinpoint for the user who's associated with the endpoint.
    */
  var User: js.UndefOr[EndpointUser] = js.native
}

object PublicEndpoint {
  @scala.inline
  def apply(
    Address: string = null,
    Attributes: MapOfListOfString = null,
    ChannelType: ChannelType = null,
    Demographic: EndpointDemographic = null,
    EffectiveDate: string = null,
    EndpointStatus: string = null,
    Location: EndpointLocation = null,
    Metrics: MapOfDouble = null,
    OptOut: string = null,
    RequestId: string = null,
    User: EndpointUser = null
  ): PublicEndpoint = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (ChannelType != null) __obj.updateDynamic("ChannelType")(ChannelType.asInstanceOf[js.Any])
    if (Demographic != null) __obj.updateDynamic("Demographic")(Demographic.asInstanceOf[js.Any])
    if (EffectiveDate != null) __obj.updateDynamic("EffectiveDate")(EffectiveDate.asInstanceOf[js.Any])
    if (EndpointStatus != null) __obj.updateDynamic("EndpointStatus")(EndpointStatus.asInstanceOf[js.Any])
    if (Location != null) __obj.updateDynamic("Location")(Location.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    if (OptOut != null) __obj.updateDynamic("OptOut")(OptOut.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (User != null) __obj.updateDynamic("User")(User.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicEndpoint]
  }
}

