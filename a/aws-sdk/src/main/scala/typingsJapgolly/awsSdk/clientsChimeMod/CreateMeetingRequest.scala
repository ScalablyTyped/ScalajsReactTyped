package typingsJapgolly.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMeetingRequest extends StObject {
  
  /**
    * The unique identifier for the client request. Use a different token for different meetings.
    */
  var ClientRequestToken: typingsJapgolly.awsSdk.clientsChimeMod.ClientRequestToken
  
  /**
    * The external meeting ID.
    */
  var ExternalMeetingId: js.UndefOr[ExternalMeetingIdType] = js.undefined
  
  /**
    *  The Region in which to create the meeting. Default: us-east-1.   Available values: af-south-1 , ap-northeast-1 , ap-northeast-2 , ap-south-1 , ap-southeast-1 , ap-southeast-2 , ca-central-1 , eu-central-1 , eu-north-1 , eu-south-1 , eu-west-1 , eu-west-2 , eu-west-3 , sa-east-1 , us-east-1 , us-east-2 , us-west-1 , us-west-2 . 
    */
  var MediaRegion: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved.
    */
  var MeetingHostId: js.UndefOr[ExternalUserIdType] = js.undefined
  
  /**
    * The configuration for resource targets to receive notifications when meeting and attendee events occur.
    */
  var NotificationsConfiguration: js.UndefOr[MeetingNotificationConfiguration] = js.undefined
  
  /**
    * The tag key-value pairs.
    */
  var Tags: js.UndefOr[MeetingTagList] = js.undefined
}
object CreateMeetingRequest {
  
  inline def apply(ClientRequestToken: ClientRequestToken): CreateMeetingRequest = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMeetingRequest]
  }
  
  extension [Self <: CreateMeetingRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setExternalMeetingId(value: ExternalMeetingIdType): Self = StObject.set(x, "ExternalMeetingId", value.asInstanceOf[js.Any])
    
    inline def setExternalMeetingIdUndefined: Self = StObject.set(x, "ExternalMeetingId", js.undefined)
    
    inline def setMediaRegion(value: String): Self = StObject.set(x, "MediaRegion", value.asInstanceOf[js.Any])
    
    inline def setMediaRegionUndefined: Self = StObject.set(x, "MediaRegion", js.undefined)
    
    inline def setMeetingHostId(value: ExternalUserIdType): Self = StObject.set(x, "MeetingHostId", value.asInstanceOf[js.Any])
    
    inline def setMeetingHostIdUndefined: Self = StObject.set(x, "MeetingHostId", js.undefined)
    
    inline def setNotificationsConfiguration(value: MeetingNotificationConfiguration): Self = StObject.set(x, "NotificationsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNotificationsConfigurationUndefined: Self = StObject.set(x, "NotificationsConfiguration", js.undefined)
    
    inline def setTags(value: MeetingTagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
