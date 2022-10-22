package typingsJapgolly.awsSdk.clientsChimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMeetingWithAttendeesRequest extends StObject {
  
  /**
    * The attendee information, including attendees' IDs and join tokens.
    */
  var Attendees: CreateMeetingWithAttendeesRequestItemList
  
  /**
    * The unique identifier for the client request. Use a different token for different meetings.
    */
  var ClientRequestToken: typingsJapgolly.awsSdk.clientsChimesdkmeetingsMod.ClientRequestToken
  
  /**
    * The external meeting ID.
    */
  var ExternalMeetingId: typingsJapgolly.awsSdk.clientsChimesdkmeetingsMod.ExternalMeetingId
  
  /**
    * The Region in which to create the meeting.  Available values: af-south-1, ap-northeast-1, ap-northeast-2, ap-south-1, ap-southeast-1, ap-southeast-2, ca-central-1, eu-central-1, eu-north-1, eu-south-1, eu-west-1, eu-west-2, eu-west-3, sa-east-1, us-east-1, us-east-2, us-west-1, us-west-2.  Available values in AWS GovCloud (US) Regions: us-gov-east-1, us-gov-west-1.
    */
  var MediaRegion: typingsJapgolly.awsSdk.clientsChimesdkmeetingsMod.MediaRegion
  
  /**
    * Lists the audio and video features enabled for a meeting, such as echo reduction.
    */
  var MeetingFeatures: js.UndefOr[MeetingFeaturesConfiguration] = js.undefined
  
  /**
    * Reserved.
    */
  var MeetingHostId: js.UndefOr[ExternalUserId] = js.undefined
  
  /**
    * The configuration for resource targets to receive notifications when meeting and attendee events occur.
    */
  var NotificationsConfiguration: js.UndefOr[typingsJapgolly.awsSdk.clientsChimesdkmeetingsMod.NotificationsConfiguration] = js.undefined
  
  /**
    * When specified, replicates the media from the primary meeting to the new meeting.
    */
  var PrimaryMeetingId: js.UndefOr[typingsJapgolly.awsSdk.clientsChimesdkmeetingsMod.PrimaryMeetingId] = js.undefined
  
  /**
    * The tags in the request.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A consistent and opaque identifier, created and maintained by the builder to represent a segment of their users.
    */
  var TenantIds: js.UndefOr[TenantIdList] = js.undefined
}
object CreateMeetingWithAttendeesRequest {
  
  inline def apply(
    Attendees: CreateMeetingWithAttendeesRequestItemList,
    ClientRequestToken: ClientRequestToken,
    ExternalMeetingId: ExternalMeetingId,
    MediaRegion: MediaRegion
  ): CreateMeetingWithAttendeesRequest = {
    val __obj = js.Dynamic.literal(Attendees = Attendees.asInstanceOf[js.Any], ClientRequestToken = ClientRequestToken.asInstanceOf[js.Any], ExternalMeetingId = ExternalMeetingId.asInstanceOf[js.Any], MediaRegion = MediaRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMeetingWithAttendeesRequest]
  }
  
  extension [Self <: CreateMeetingWithAttendeesRequest](x: Self) {
    
    inline def setAttendees(value: CreateMeetingWithAttendeesRequestItemList): Self = StObject.set(x, "Attendees", value.asInstanceOf[js.Any])
    
    inline def setAttendeesVarargs(value: CreateAttendeeRequestItem*): Self = StObject.set(x, "Attendees", js.Array(value*))
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setExternalMeetingId(value: ExternalMeetingId): Self = StObject.set(x, "ExternalMeetingId", value.asInstanceOf[js.Any])
    
    inline def setMediaRegion(value: MediaRegion): Self = StObject.set(x, "MediaRegion", value.asInstanceOf[js.Any])
    
    inline def setMeetingFeatures(value: MeetingFeaturesConfiguration): Self = StObject.set(x, "MeetingFeatures", value.asInstanceOf[js.Any])
    
    inline def setMeetingFeaturesUndefined: Self = StObject.set(x, "MeetingFeatures", js.undefined)
    
    inline def setMeetingHostId(value: ExternalUserId): Self = StObject.set(x, "MeetingHostId", value.asInstanceOf[js.Any])
    
    inline def setMeetingHostIdUndefined: Self = StObject.set(x, "MeetingHostId", js.undefined)
    
    inline def setNotificationsConfiguration(value: NotificationsConfiguration): Self = StObject.set(x, "NotificationsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNotificationsConfigurationUndefined: Self = StObject.set(x, "NotificationsConfiguration", js.undefined)
    
    inline def setPrimaryMeetingId(value: PrimaryMeetingId): Self = StObject.set(x, "PrimaryMeetingId", value.asInstanceOf[js.Any])
    
    inline def setPrimaryMeetingIdUndefined: Self = StObject.set(x, "PrimaryMeetingId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTenantIds(value: TenantIdList): Self = StObject.set(x, "TenantIds", value.asInstanceOf[js.Any])
    
    inline def setTenantIdsUndefined: Self = StObject.set(x, "TenantIds", js.undefined)
    
    inline def setTenantIdsVarargs(value: TenantId*): Self = StObject.set(x, "TenantIds", js.Array(value*))
  }
}
