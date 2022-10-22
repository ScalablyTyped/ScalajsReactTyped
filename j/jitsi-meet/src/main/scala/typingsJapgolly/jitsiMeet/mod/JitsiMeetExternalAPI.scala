package typingsJapgolly.jitsiMeet.mod

import org.scalajs.dom.HTMLIFrameElement
import typingsJapgolly.jitsiMeet.anon.RecordExternalAPICommands
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.audioAvailabilityChanged
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.audioMuteStatusChanged
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.avatarChanged
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.cameraError
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.deviceListChanged
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.displayNameChange
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.dominantSpeakerChanged
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.emailChange
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.endpointTextMessageReceived
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.feedbackSubmitted
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.filmstripDisplayChanged
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.incomingMessage
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.largeVideoChanged
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.log
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.micError
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.outgoingMessage
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.participantJoined
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.participantKickedOut
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.participantLeft
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.participantRoleChanged
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.passwordRequired
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.readyToClose
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.screenSharingStatusChanged
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.subjectChange
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.suspendDetected
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.tileViewChanged
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.videoAvailabilityChanged
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.videoConferenceJoined
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.videoConferenceLeft
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.videoMuteStatusChanged
import typingsJapgolly.jitsiMeet.jitsiMeetStrings.videoQualityChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JitsiMeetExternalAPI
  extends StObject
     with TypedEventEmitter[
      ExternalAPIEventCallbacks, 
      /* keyof jitsi-meet.jitsi-meet.ExternalAPIEventCallbacks */ cameraError | avatarChanged | audioAvailabilityChanged | audioMuteStatusChanged | endpointTextMessageReceived | largeVideoChanged | log | micError | screenSharingStatusChanged | dominantSpeakerChanged | tileViewChanged | incomingMessage | outgoingMessage | displayNameChange | deviceListChanged | emailChange | feedbackSubmitted | filmstripDisplayChanged | participantJoined | participantKickedOut | participantLeft | participantRoleChanged | passwordRequired | videoConferenceJoined | videoConferenceLeft | videoAvailabilityChanged | videoMuteStatusChanged | videoQualityChanged | readyToClose | subjectChange | suspendDetected
    ] {
  
  // tslint gets unhappy about a constructor on an interface, but this is what is passed to it
  // constructor(domain: string, options?: ExternalAPIOptions): this;
  def captureLargeVideoScreenshot(): js.Promise[String] = js.native
  
  def dispose(): Unit = js.native
  
  def executeCommand(
    command: ExternalAPICommands,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param arguments because its type any is not an array type */ arguments: Any
  ): Unit = js.native
  
  def executeCommands(commands: js.Array[RecordExternalAPICommands]): Unit = js.native
  
  def getAvailableDevices(): js.Promise[DeviceMap] = js.native
  
  def getAvatarURL(participantId: String): String = js.native
  
  def getCurrentDevices(): js.Promise[DeviceMap] = js.native
  
  def getDisplayName(participantId: String): String = js.native
  
  def getEmail(participantId: String): String = js.native
  
  def getIFrame(): HTMLIFrameElement = js.native
  
  def getNumberOfParticipants(): Double = js.native
  
  def getParticipantsInfo(): Any = js.native
  
  def getVideoQuality(): Any = js.native
  
  def invite(invitees: js.Array[Any]): js.Promise[Null] = js.native
  
  def isAudioAvailable(): js.Promise[Boolean] = js.native
  
  def isAudioMuted(): js.Promise[Boolean] = js.native
  
  def isDeviceListAvailable(): js.Promise[Boolean] = js.native
  
  def isMultipleAudioInputSupported(): js.Promise[Boolean] = js.native
  
  def isVideoAvailable(): js.Promise[Boolean] = js.native
  
  def isVideoMuted(): js.Promise[Boolean] = js.native
  
  def pinParticipant(participantId: String): Unit = js.native
  
  def resizeLargeVideo(width: Double, height: Double): Unit = js.native
  
  def setAudioInputDevice(deviceLabel: String, deviceId: String): Unit = js.native
  
  def setAudioOutputDevice(deviceLabel: String, deviceId: String): Unit = js.native
  
  def setLargeVideoParticipant(participantId: String): Unit = js.native
  
  def setVideoInputDevice(deviceLabel: String, deviceId: String): Unit = js.native
  
  def startRecording(options: RecordingOptions): Unit = js.native
  
  def stopRecording(mode: RecordingMode): Unit = js.native
}
