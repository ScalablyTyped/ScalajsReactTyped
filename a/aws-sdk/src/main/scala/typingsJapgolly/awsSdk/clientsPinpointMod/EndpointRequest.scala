package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointRequest extends StObject {
  
  /**
    * The destination address for messages or push notifications that you send to the endpoint. The address varies by channel. For a push-notification channel, use the token provided by the push notification service, such as an Apple Push Notification service (APNs) device token or a Firebase Cloud Messaging (FCM) registration token. For the SMS channel, use a phone number in E.164 format, such as +12065550100. For the email channel, use an email address.
    */
  var Address: js.UndefOr[string] = js.undefined
  
  /**
    * One or more custom attributes that describe the endpoint by associating a name with an array of values. For example, the value of a custom attribute named Interests might be: ["Science", "Music", "Travel"]. You can use these attributes as filter criteria when you create segments. Attribute names are case sensitive. An attribute name can contain up to 50 characters. An attribute value can contain up to 100 characters. When you define the name of a custom attribute, avoid using the following characters: number sign (#), colon (:), question mark (?), backslash (\), and slash (/). The Amazon Pinpoint console can't display attribute names that contain these characters. This restriction doesn't apply to attribute values.
    */
  var Attributes: js.UndefOr[MapOfListOfString] = js.undefined
  
  /**
    * The channel to use when sending messages or push notifications to the endpoint.
    */
  var ChannelType: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointMod.ChannelType] = js.undefined
  
  /**
    * The demographic information for the endpoint, such as the time zone and platform.
    */
  var Demographic: js.UndefOr[EndpointDemographic] = js.undefined
  
  /**
    * The date and time, in ISO 8601 format, when the endpoint is updated.
    */
  var EffectiveDate: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies whether to send messages or push notifications to the endpoint. Valid values are: ACTIVE, messages are sent to the endpoint; and, INACTIVE, messages aren’t sent to the endpoint. Amazon Pinpoint automatically sets this value to ACTIVE when you create an endpoint or update an existing endpoint. Amazon Pinpoint automatically sets this value to INACTIVE if you update another endpoint that has the same address specified by the Address property.
    */
  var EndpointStatus: js.UndefOr[string] = js.undefined
  
  /**
    * The geographic information for the endpoint.
    */
  var Location: js.UndefOr[EndpointLocation] = js.undefined
  
  /**
    * One or more custom metrics that your app reports to Amazon Pinpoint for the endpoint.
    */
  var Metrics: js.UndefOr[MapOfDouble] = js.undefined
  
  /**
    * Specifies whether the user who's associated with the endpoint has opted out of receiving messages and push notifications from you. Possible values are: ALL, the user has opted out and doesn't want to receive any messages or push notifications; and, NONE, the user hasn't opted out and wants to receive all messages and push notifications.
    */
  var OptOut: js.UndefOr[string] = js.undefined
  
  /**
    * The unique identifier for the most recent request to update the endpoint.
    */
  var RequestId: js.UndefOr[string] = js.undefined
  
  /**
    * One or more custom attributes that describe the user who's associated with the endpoint.
    */
  var User: js.UndefOr[EndpointUser] = js.undefined
}
object EndpointRequest {
  
  inline def apply(): EndpointRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointRequest]
  }
  
  extension [Self <: EndpointRequest](x: Self) {
    
    inline def setAddress(value: string): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setAttributes(value: MapOfListOfString): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setChannelType(value: ChannelType): Self = StObject.set(x, "ChannelType", value.asInstanceOf[js.Any])
    
    inline def setChannelTypeUndefined: Self = StObject.set(x, "ChannelType", js.undefined)
    
    inline def setDemographic(value: EndpointDemographic): Self = StObject.set(x, "Demographic", value.asInstanceOf[js.Any])
    
    inline def setDemographicUndefined: Self = StObject.set(x, "Demographic", js.undefined)
    
    inline def setEffectiveDate(value: string): Self = StObject.set(x, "EffectiveDate", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDateUndefined: Self = StObject.set(x, "EffectiveDate", js.undefined)
    
    inline def setEndpointStatus(value: string): Self = StObject.set(x, "EndpointStatus", value.asInstanceOf[js.Any])
    
    inline def setEndpointStatusUndefined: Self = StObject.set(x, "EndpointStatus", js.undefined)
    
    inline def setLocation(value: EndpointLocation): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setMetrics(value: MapOfDouble): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    inline def setOptOut(value: string): Self = StObject.set(x, "OptOut", value.asInstanceOf[js.Any])
    
    inline def setOptOutUndefined: Self = StObject.set(x, "OptOut", js.undefined)
    
    inline def setRequestId(value: string): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setUser(value: EndpointUser): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
