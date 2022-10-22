package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteJourneyRequest extends StObject {
  
  /**
    * A map that contains a set of Activity objects, one object for each activity in the journey. For each Activity object, the key is the unique identifier (string) for an activity and the value is the settings for the activity. An activity identifier can contain a maximum of 100 characters. The characters must be alphanumeric characters.
    */
  var Activities: js.UndefOr[MapOfActivity] = js.undefined
  
  /**
    * The time when journey will stop sending messages. QuietTime should be configured first and SendingSchedule should be set to true.
    */
  var ClosedDays: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointMod.ClosedDays] = js.undefined
  
  /**
    * The date, in ISO 8601 format, when the journey was created.
    */
  var CreationDate: js.UndefOr[string] = js.undefined
  
  /**
    * The channel-specific configurations for the journey.
    */
  var JourneyChannelSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointMod.JourneyChannelSettings] = js.undefined
  
  /**
    * The date, in ISO 8601 format, when the journey was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.undefined
  
  /**
    * The messaging and entry limits for the journey.
    */
  var Limits: js.UndefOr[JourneyLimits] = js.undefined
  
  /**
    * Specifies whether the journey's scheduled start and end times use each participant's local time. To base the schedule on each participant's local time, set this value to true.
    */
  var LocalTime: js.UndefOr[boolean] = js.undefined
  
  /**
    * The name of the journey. A journey name can contain a maximum of 150 characters. The characters can be alphanumeric characters or symbols, such as underscores (_) or hyphens (-). A journey name can't contain any spaces.
    */
  var Name: string
  
  /**
    * The time when journey allow to send messages. QuietTime should be configured first and SendingSchedule should be set to true.
    */
  var OpenHours: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointMod.OpenHours] = js.undefined
  
  /**
    * The quiet time settings for the journey. Quiet time is a specific time range when a journey doesn't send messages to participants, if all the following conditions are met: The EndpointDemographic.Timezone property of the endpoint for the participant is set to a valid value. The current time in the participant's time zone is later than or equal to the time specified by the QuietTime.Start property for the journey. The current time in the participant's time zone is earlier than or equal to the time specified by the QuietTime.End property for the journey. If any of the preceding conditions isn't met, the participant will receive messages from the journey, even if quiet time is enabled.
    */
  var QuietTime: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointMod.QuietTime] = js.undefined
  
  /**
    * The frequency with which Amazon Pinpoint evaluates segment and event data for the journey, as a duration in ISO 8601 format.
    */
  var RefreshFrequency: js.UndefOr[string] = js.undefined
  
  /**
    * Specifies whether a journey should be refreshed on segment update.
    */
  var RefreshOnSegmentUpdate: js.UndefOr[boolean] = js.undefined
  
  /**
    * The schedule settings for the journey.
    */
  var Schedule: js.UndefOr[JourneySchedule] = js.undefined
  
  /**
    * Indicates if journey have Advance Quiet Time (OpenHours and ClosedDays). This flag should be set to true in order to allow (OpenHours and ClosedDays)
    */
  var SendingSchedule: js.UndefOr[boolean] = js.undefined
  
  /**
    * The unique identifier for the first activity in the journey. The identifier for this activity can contain a maximum of 128 characters. The characters must be alphanumeric characters.
    */
  var StartActivity: js.UndefOr[string] = js.undefined
  
  /**
    * The segment that defines which users are participants in the journey.
    */
  var StartCondition: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointMod.StartCondition] = js.undefined
  
  /**
    * The status of the journey. Valid values are: DRAFT - Saves the journey and doesn't publish it. ACTIVE - Saves and publishes the journey. Depending on the journey's schedule, the journey starts running immediately or at the scheduled start time. If a journey's status is ACTIVE, you can't add, change, or remove activities from it. PAUSED, CANCELLED, COMPLETED, and CLOSED states are not supported in requests to create or update a journey. To cancel, pause, or resume a journey, use the Journey State resource.
    */
  var State: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointMod.State] = js.undefined
  
  /**
    * Specifies whether endpoints in quiet hours should enter a wait till the end of their quiet hours.
    */
  var WaitForQuietTime: js.UndefOr[boolean] = js.undefined
}
object WriteJourneyRequest {
  
  inline def apply(Name: string): WriteJourneyRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteJourneyRequest]
  }
  
  extension [Self <: WriteJourneyRequest](x: Self) {
    
    inline def setActivities(value: MapOfActivity): Self = StObject.set(x, "Activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesUndefined: Self = StObject.set(x, "Activities", js.undefined)
    
    inline def setClosedDays(value: ClosedDays): Self = StObject.set(x, "ClosedDays", value.asInstanceOf[js.Any])
    
    inline def setClosedDaysUndefined: Self = StObject.set(x, "ClosedDays", js.undefined)
    
    inline def setCreationDate(value: string): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setJourneyChannelSettings(value: JourneyChannelSettings): Self = StObject.set(x, "JourneyChannelSettings", value.asInstanceOf[js.Any])
    
    inline def setJourneyChannelSettingsUndefined: Self = StObject.set(x, "JourneyChannelSettings", js.undefined)
    
    inline def setLastModifiedDate(value: string): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    inline def setLimits(value: JourneyLimits): Self = StObject.set(x, "Limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsUndefined: Self = StObject.set(x, "Limits", js.undefined)
    
    inline def setLocalTime(value: boolean): Self = StObject.set(x, "LocalTime", value.asInstanceOf[js.Any])
    
    inline def setLocalTimeUndefined: Self = StObject.set(x, "LocalTime", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOpenHours(value: OpenHours): Self = StObject.set(x, "OpenHours", value.asInstanceOf[js.Any])
    
    inline def setOpenHoursUndefined: Self = StObject.set(x, "OpenHours", js.undefined)
    
    inline def setQuietTime(value: QuietTime): Self = StObject.set(x, "QuietTime", value.asInstanceOf[js.Any])
    
    inline def setQuietTimeUndefined: Self = StObject.set(x, "QuietTime", js.undefined)
    
    inline def setRefreshFrequency(value: string): Self = StObject.set(x, "RefreshFrequency", value.asInstanceOf[js.Any])
    
    inline def setRefreshFrequencyUndefined: Self = StObject.set(x, "RefreshFrequency", js.undefined)
    
    inline def setRefreshOnSegmentUpdate(value: boolean): Self = StObject.set(x, "RefreshOnSegmentUpdate", value.asInstanceOf[js.Any])
    
    inline def setRefreshOnSegmentUpdateUndefined: Self = StObject.set(x, "RefreshOnSegmentUpdate", js.undefined)
    
    inline def setSchedule(value: JourneySchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    inline def setSendingSchedule(value: boolean): Self = StObject.set(x, "SendingSchedule", value.asInstanceOf[js.Any])
    
    inline def setSendingScheduleUndefined: Self = StObject.set(x, "SendingSchedule", js.undefined)
    
    inline def setStartActivity(value: string): Self = StObject.set(x, "StartActivity", value.asInstanceOf[js.Any])
    
    inline def setStartActivityUndefined: Self = StObject.set(x, "StartActivity", js.undefined)
    
    inline def setStartCondition(value: StartCondition): Self = StObject.set(x, "StartCondition", value.asInstanceOf[js.Any])
    
    inline def setStartConditionUndefined: Self = StObject.set(x, "StartCondition", js.undefined)
    
    inline def setState(value: State): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setWaitForQuietTime(value: boolean): Self = StObject.set(x, "WaitForQuietTime", value.asInstanceOf[js.Any])
    
    inline def setWaitForQuietTimeUndefined: Self = StObject.set(x, "WaitForQuietTime", js.undefined)
  }
}
