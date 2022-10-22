package typingsJapgolly.microsoftteams.global.microsoftTeams

import typingsJapgolly.microsoftteams.microsoftTeams.SdkError
import typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.ControlCommand
import typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.DeviceState
import typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.ErrorReason
import typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.Participant
import typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.SessionStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteCamera {
  
  @JSGlobal("microsoftTeams.remoteCamera")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Hide from docs
    *
    * Enum used to indicate possible camera control commands.
    */
  @JSGlobal("microsoftTeams.remoteCamera.ControlCommand")
  @js.native
  object ControlCommand extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.ControlCommand & String
      ] = js.native
    
    /* "PanLeft" */ val PanLeft: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.ControlCommand.PanLeft & String = js.native
    
    /* "PanRight" */ val PanRight: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.ControlCommand.PanRight & String = js.native
    
    /* "Reset" */ val Reset: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.ControlCommand.Reset & String = js.native
    
    /* "TiltDown" */ val TiltDown: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.ControlCommand.TiltDown & String = js.native
    
    /* "TiltUp" */ val TiltUp: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.ControlCommand.TiltUp & String = js.native
    
    /* "ZoomIn" */ val ZoomIn: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.ControlCommand.ZoomIn & String = js.native
    
    /* "ZoomOut" */ val ZoomOut: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.ControlCommand.ZoomOut & String = js.native
  }
  
  /**
    * Hide from docs
    *
    * Enum used to indicate the reason for the error.
    */
  @JSGlobal("microsoftTeams.remoteCamera.ErrorReason")
  @js.native
  object ErrorReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.ErrorReason & Double] = js.native
    
    /* 3 */ val CommandPanLeftError: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.ErrorReason.CommandPanLeftError & Double = js.native
    
    /* 4 */ val CommandPanRightError: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.ErrorReason.CommandPanRightError & Double = js.native
    
    /* 0 */ val CommandResetError: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.ErrorReason.CommandResetError & Double = js.native
    
    /* 6 */ val CommandTiltDownError: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.ErrorReason.CommandTiltDownError & Double = js.native
    
    /* 5 */ val CommandTiltUpError: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.ErrorReason.CommandTiltUpError & Double = js.native
    
    /* 1 */ val CommandZoomInError: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.ErrorReason.CommandZoomInError & Double = js.native
    
    /* 2 */ val CommandZoomOutError: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.ErrorReason.CommandZoomOutError & Double = js.native
    
    /* 7 */ val SendDataError: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.ErrorReason.SendDataError & Double = js.native
  }
  
  /**
    * Hide from docs
    *
    * Enum used to indicate the reason the session was terminated.
    */
  @JSGlobal("microsoftTeams.remoteCamera.SessionTerminatedReason")
  @js.native
  object SessionTerminatedReason extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.SessionTerminatedReason & Double
      ] = js.native
    
    /* 4 */ val AckTimeout: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.SessionTerminatedReason.AckTimeout & Double = js.native
    
    /* 3 */ val ControlBusy: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.SessionTerminatedReason.ControlBusy & Double = js.native
    
    /* 1 */ val ControlDenied: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.SessionTerminatedReason.ControlDenied & Double = js.native
    
    /* 9 */ val ControlDisabled: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.SessionTerminatedReason.ControlDisabled & Double = js.native
    
    /* 2 */ val ControlNoResponse: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.SessionTerminatedReason.ControlNoResponse & Double = js.native
    
    /* 5 */ val ControlTerminated: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.SessionTerminatedReason.ControlTerminated & Double = js.native
    
    /* 10 */ val ControlTerminatedToAllowOtherController: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.SessionTerminatedReason.ControlTerminatedToAllowOtherController & Double = js.native
    
    /* 8 */ val ControllerCancelled: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.SessionTerminatedReason.ControllerCancelled & Double = js.native
    
    /* 6 */ val ControllerTerminated: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.SessionTerminatedReason.ControllerTerminated & Double = js.native
    
    /* 7 */ val DataChannelError: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.SessionTerminatedReason.DataChannelError & Double = js.native
    
    /* 0 */ val None: typingsJapgolly.microsoftteams.microsoftTeams.remoteCamera.SessionTerminatedReason.None & Double = js.native
  }
  
  /**
    * Hide from docs
    *
    * Fetch a list of the participants with controllable-cameras in a meeting.
    * @param callback Callback contains 2 parameters, error and participants.
    * error can either contain an error of type SdkError, incase of an error, or null when fetch is successful
    * participants can either contain an array of Participant objects, incase of a successful fetch or null when it fails
    * participants: object that contains an array of participants with controllable-cameras
    */
  inline def getCapableParticipants(
    callback: js.Function2[/* error */ SdkError | Null, /* participants */ js.Array[Participant] | Null, Unit]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getCapableParticipants")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Registers a handler for change in participants with controllable-cameras.
    * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
    * @param handler The handler to invoke when the list of participants with controllable-cameras changes.
    */
  inline def registerOnCapableParticipantsChangeHandler(handler: js.Function1[/* participantChange */ js.Array[Participant], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerOnCapableParticipantsChangeHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Registers a handler for device state change.
    * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
    * @param handler The handler to invoke when the controlled device changes state.
    */
  inline def registerOnDeviceStateChangeHandler(handler: js.Function1[/* deviceStateChange */ DeviceState, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerOnDeviceStateChangeHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Registers a handler for error.
    * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
    * @param handler The handler to invoke when there is an error from the camera handler.
    */
  inline def registerOnErrorHandler(handler: js.Function1[/* error */ ErrorReason, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerOnErrorHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Registers a handler for session status change.
    * Only one handler can be registered at a time. A subsequent registration replaces an existing registration.
    * @param handler The handler to invoke when the current session status changes.
    */
  inline def registerOnSessionStatusChangeHandler(handler: js.Function1[/* sessionStatusChange */ SessionStatus, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerOnSessionStatusChangeHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Hide from docs
    *
    * Request control of a participant's camera.
    * @param participant Participant specifies the participant to send the request for camera control.
    * @param callback Callback contains 2 parameters, error and requestResponse.
    * error can either contain an error of type SdkError, incase of an error, or null when fetch is successful
    * requestResponse can either contain the true/false value, incase of a successful request or null when it fails
    * requestResponse: True means request was accepted and false means request was denied
    */
  inline def requestControl(
    participant: Participant,
    callback: js.Function2[/* error */ SdkError | Null, /* requestResponse */ Boolean | Null, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("requestControl")(participant.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Hide from docs
    *
    * Send control command to the participant's camera.
    * @param ControlCommand ControlCommand specifies the command for controling the camera.
    * @param callback Callback to invoke when the command response returns.
    */
  inline def sendControlCommand(ControlCommand: ControlCommand, callback: js.Function1[/* error */ SdkError | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendControlCommand")(ControlCommand.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Hide from docs
    *
    * Terminate the remote  session
    * @param callback Callback to invoke when the command response returns.
    */
  inline def terminateSession(callback: js.Function1[/* error */ SdkError | Null, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("terminateSession")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
