package typingsJapgolly.microsoftteams.global.microsoftTeams

import typingsJapgolly.microsoftteams.microsoftTeams.SdkError
import typingsJapgolly.microsoftteams.microsoftTeams.meetingRoom.MeetingRoomCapability
import typingsJapgolly.microsoftteams.microsoftTeams.meetingRoom.MeetingRoomInfo
import typingsJapgolly.microsoftteams.microsoftTeams.meetingRoom.MeetingRoomState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meetingRoom {
  
  @JSGlobal("microsoftTeams.meetingRoom")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Hide from docs
    *
    * Enum used to indicate meeting room capabilities.
    */
  @JSGlobal("microsoftTeams.meetingRoom.Capability")
  @js.native
  object Capability extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.microsoftteams.microsoftTeams.meetingRoom.Capability & String] = js.native
    
    /* "leaveMeeting" */ val leaveMeeting: typingsJapgolly.microsoftteams.microsoftTeams.meetingRoom.Capability.leaveMeeting & String = js.native
    
    /* "showContent" */ val showContent: typingsJapgolly.microsoftteams.microsoftTeams.meetingRoom.Capability.showContent & String = js.native
    
    /* "showLargeGallery" */ val showLargeGallery: typingsJapgolly.microsoftteams.microsoftTeams.meetingRoom.Capability.showLargeGallery & String = js.native
    
    /* "showTogether" */ val showTogether: typingsJapgolly.microsoftteams.microsoftTeams.meetingRoom.Capability.showTogether & String = js.native
    
    /* "showVideoGallery" */ val showVideoGallery: typingsJapgolly.microsoftteams.microsoftTeams.meetingRoom.Capability.showVideoGallery & String = js.native
    
    /* "showVideoGalleryAndContent" */ val showVideoGalleryAndContent: typingsJapgolly.microsoftteams.microsoftTeams.meetingRoom.Capability.showVideoGalleryAndContent & String = js.native
    
    /* "toggleCamera" */ val toggleCamera: typingsJapgolly.microsoftteams.microsoftTeams.meetingRoom.Capability.toggleCamera & String = js.native
    
    /* "toggleCaptions" */ val toggleCaptions: typingsJapgolly.microsoftteams.microsoftTeams.meetingRoom.Capability.toggleCaptions & String = js.native
    
    /* "toggleMute" */ val toggleMute: typingsJapgolly.microsoftteams.microsoftTeams.meetingRoom.Capability.toggleMute & String = js.native
    
    /* "volume" */ val volume: typingsJapgolly.microsoftteams.microsoftTeams.meetingRoom.Capability.volume & String = js.native
  }
  
  /**
    * Hide from docs
    *
    * Fetch the meeting room info that paired with current client.
    * @param callback Callback to invoke when the meeting room info is fetched.
    */
  inline def getPairedMeetingRoomInfo(callback: js.Function2[/* sdkError */ SdkError, /* meetingRoomInfo */ MeetingRoomInfo, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPairedMeetingRoomInfo")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Hide from docs
    *
    * Registers a handler for meeting room capabilities update.
    * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
    * @param handler The handler to invoke when the capabilities of meeting room update.
    */
  inline def registerMeetingRoomCapabilitiesUpdateHandler(handler: js.Function1[/* capabilities */ MeetingRoomCapability, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerMeetingRoomCapabilitiesUpdateHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Hide from docs
    * Registers a handler for meeting room states update.
    * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
    * @param handler The handler to invoke when the states of meeting room update.
    */
  inline def registerMeetingRoomStatesUpdateHandler(handler: js.Function1[/* states */ MeetingRoomState, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerMeetingRoomStatesUpdateHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Hide from docs
    *
    * Send a command to paired meeting room.
    * @param commandName The command name.
    * @param callback Callback to invoke when the command response returns.
    */
  inline def sendCommandToPairedMeetingRoom(commandName: String, callback: js.Function1[/* sdkError */ SdkError, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendCommandToPairedMeetingRoom")(commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
