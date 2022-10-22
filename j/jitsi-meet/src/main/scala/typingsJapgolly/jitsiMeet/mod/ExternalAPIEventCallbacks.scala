package typingsJapgolly.jitsiMeet.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalAPIEventCallbacks extends StObject {
  
  def audioAvailabilityChanged(e: AudioAvailabilityChangedEvent): Unit
  
  def audioMuteStatusChanged(e: AudioMuteStatusChangedEvent): Unit
  
  def avatarChanged(e: AvatarChangedEvent): Unit
  
  def cameraError(e: CameraErrorEvent): Unit
  
  def deviceListChanged(e: DeviceListChangedEvent): Unit
  
  def displayNameChange(e: DisplayNameChangeEvent): Unit
  
  def dominantSpeakerChanged(e: DominantSpeakerChangedEvent): Unit
  
  def emailChange(e: EmailChangeEvent): Unit
  
  def endpointTextMessageReceived(e: EndpointTextMessageReceivedEvent): Unit
  
  def feedbackSubmitted(e: FeedbackSubmittedEvent): Unit
  
  def filmstripDisplayChanged(e: FilmstripDisplayChangedEvent): Unit
  
  def incomingMessage(e: IncomingMessageEvent): Unit
  
  def largeVideoChanged(e: LargeVideoChangedEvent): Unit
  
  def log(e: LogEvent): Unit
  
  def micError(e: MicErrorEvent): Unit
  
  def outgoingMessage(e: OutgoingMessageEvent): Unit
  
  def participantJoined(e: ParticipantJoinedEvent): Unit
  
  def participantKickedOut(e: ParticipantKickedOutEvent): Unit
  
  def participantLeft(e: ParticipantLeftEvent): Unit
  
  def participantRoleChanged(e: ParticipantRoleChangedEvent): Unit
  
  def passwordRequired(): Unit
  
  def readyToClose(): Unit
  
  def screenSharingStatusChanged(e: ScreenSharingStatusChangedEvent): Unit
  
  def subjectChange(e: SubjectChangeEvent): Unit
  
  def suspendDetected(): Unit
  
  def tileViewChanged(e: TileViewChangedEvent): Unit
  
  def videoAvailabilityChanged(e: VideoAvailabilityChangedEvent): Unit
  
  def videoConferenceJoined(e: VideoConferenceJoinedEvent): Unit
  
  def videoConferenceLeft(e: VideoConferenceLeftEvent): Unit
  
  def videoMuteStatusChanged(e: VideoMuteStatusChangedEvent): Unit
  
  def videoQualityChanged(e: VideoQualityChangedEvent): Unit
}
object ExternalAPIEventCallbacks {
  
  inline def apply(
    audioAvailabilityChanged: AudioAvailabilityChangedEvent => Callback,
    audioMuteStatusChanged: AudioMuteStatusChangedEvent => Callback,
    avatarChanged: AvatarChangedEvent => Callback,
    cameraError: CameraErrorEvent => Callback,
    deviceListChanged: DeviceListChangedEvent => Callback,
    displayNameChange: DisplayNameChangeEvent => Callback,
    dominantSpeakerChanged: DominantSpeakerChangedEvent => Callback,
    emailChange: EmailChangeEvent => Callback,
    endpointTextMessageReceived: EndpointTextMessageReceivedEvent => Callback,
    feedbackSubmitted: FeedbackSubmittedEvent => Callback,
    filmstripDisplayChanged: FilmstripDisplayChangedEvent => Callback,
    incomingMessage: IncomingMessageEvent => Callback,
    largeVideoChanged: LargeVideoChangedEvent => Callback,
    log: LogEvent => Callback,
    micError: MicErrorEvent => Callback,
    outgoingMessage: OutgoingMessageEvent => Callback,
    participantJoined: ParticipantJoinedEvent => Callback,
    participantKickedOut: ParticipantKickedOutEvent => Callback,
    participantLeft: ParticipantLeftEvent => Callback,
    participantRoleChanged: ParticipantRoleChangedEvent => Callback,
    passwordRequired: Callback,
    readyToClose: Callback,
    screenSharingStatusChanged: ScreenSharingStatusChangedEvent => Callback,
    subjectChange: SubjectChangeEvent => Callback,
    suspendDetected: Callback,
    tileViewChanged: TileViewChangedEvent => Callback,
    videoAvailabilityChanged: VideoAvailabilityChangedEvent => Callback,
    videoConferenceJoined: VideoConferenceJoinedEvent => Callback,
    videoConferenceLeft: VideoConferenceLeftEvent => Callback,
    videoMuteStatusChanged: VideoMuteStatusChangedEvent => Callback,
    videoQualityChanged: VideoQualityChangedEvent => Callback
  ): ExternalAPIEventCallbacks = {
    val __obj = js.Dynamic.literal(audioAvailabilityChanged = js.Any.fromFunction1((t0: AudioAvailabilityChangedEvent) => audioAvailabilityChanged(t0).runNow()), audioMuteStatusChanged = js.Any.fromFunction1((t0: AudioMuteStatusChangedEvent) => audioMuteStatusChanged(t0).runNow()), avatarChanged = js.Any.fromFunction1((t0: AvatarChangedEvent) => avatarChanged(t0).runNow()), cameraError = js.Any.fromFunction1((t0: CameraErrorEvent) => cameraError(t0).runNow()), deviceListChanged = js.Any.fromFunction1((t0: DeviceListChangedEvent) => deviceListChanged(t0).runNow()), displayNameChange = js.Any.fromFunction1((t0: DisplayNameChangeEvent) => displayNameChange(t0).runNow()), dominantSpeakerChanged = js.Any.fromFunction1((t0: DominantSpeakerChangedEvent) => dominantSpeakerChanged(t0).runNow()), emailChange = js.Any.fromFunction1((t0: EmailChangeEvent) => emailChange(t0).runNow()), endpointTextMessageReceived = js.Any.fromFunction1((t0: EndpointTextMessageReceivedEvent) => endpointTextMessageReceived(t0).runNow()), feedbackSubmitted = js.Any.fromFunction1((t0: FeedbackSubmittedEvent) => feedbackSubmitted(t0).runNow()), filmstripDisplayChanged = js.Any.fromFunction1((t0: FilmstripDisplayChangedEvent) => filmstripDisplayChanged(t0).runNow()), incomingMessage = js.Any.fromFunction1((t0: IncomingMessageEvent) => incomingMessage(t0).runNow()), largeVideoChanged = js.Any.fromFunction1((t0: LargeVideoChangedEvent) => largeVideoChanged(t0).runNow()), log = js.Any.fromFunction1((t0: LogEvent) => log(t0).runNow()), micError = js.Any.fromFunction1((t0: MicErrorEvent) => micError(t0).runNow()), outgoingMessage = js.Any.fromFunction1((t0: OutgoingMessageEvent) => outgoingMessage(t0).runNow()), participantJoined = js.Any.fromFunction1((t0: ParticipantJoinedEvent) => participantJoined(t0).runNow()), participantKickedOut = js.Any.fromFunction1((t0: ParticipantKickedOutEvent) => participantKickedOut(t0).runNow()), participantLeft = js.Any.fromFunction1((t0: ParticipantLeftEvent) => participantLeft(t0).runNow()), participantRoleChanged = js.Any.fromFunction1((t0: ParticipantRoleChangedEvent) => participantRoleChanged(t0).runNow()), passwordRequired = passwordRequired.toJsFn, readyToClose = readyToClose.toJsFn, screenSharingStatusChanged = js.Any.fromFunction1((t0: ScreenSharingStatusChangedEvent) => screenSharingStatusChanged(t0).runNow()), subjectChange = js.Any.fromFunction1((t0: SubjectChangeEvent) => subjectChange(t0).runNow()), suspendDetected = suspendDetected.toJsFn, tileViewChanged = js.Any.fromFunction1((t0: TileViewChangedEvent) => tileViewChanged(t0).runNow()), videoAvailabilityChanged = js.Any.fromFunction1((t0: VideoAvailabilityChangedEvent) => videoAvailabilityChanged(t0).runNow()), videoConferenceJoined = js.Any.fromFunction1((t0: VideoConferenceJoinedEvent) => videoConferenceJoined(t0).runNow()), videoConferenceLeft = js.Any.fromFunction1((t0: VideoConferenceLeftEvent) => videoConferenceLeft(t0).runNow()), videoMuteStatusChanged = js.Any.fromFunction1((t0: VideoMuteStatusChangedEvent) => videoMuteStatusChanged(t0).runNow()), videoQualityChanged = js.Any.fromFunction1((t0: VideoQualityChangedEvent) => videoQualityChanged(t0).runNow()))
    __obj.asInstanceOf[ExternalAPIEventCallbacks]
  }
  
  extension [Self <: ExternalAPIEventCallbacks](x: Self) {
    
    inline def setAudioAvailabilityChanged(value: AudioAvailabilityChangedEvent => Callback): Self = StObject.set(x, "audioAvailabilityChanged", js.Any.fromFunction1((t0: AudioAvailabilityChangedEvent) => value(t0).runNow()))
    
    inline def setAudioMuteStatusChanged(value: AudioMuteStatusChangedEvent => Callback): Self = StObject.set(x, "audioMuteStatusChanged", js.Any.fromFunction1((t0: AudioMuteStatusChangedEvent) => value(t0).runNow()))
    
    inline def setAvatarChanged(value: AvatarChangedEvent => Callback): Self = StObject.set(x, "avatarChanged", js.Any.fromFunction1((t0: AvatarChangedEvent) => value(t0).runNow()))
    
    inline def setCameraError(value: CameraErrorEvent => Callback): Self = StObject.set(x, "cameraError", js.Any.fromFunction1((t0: CameraErrorEvent) => value(t0).runNow()))
    
    inline def setDeviceListChanged(value: DeviceListChangedEvent => Callback): Self = StObject.set(x, "deviceListChanged", js.Any.fromFunction1((t0: DeviceListChangedEvent) => value(t0).runNow()))
    
    inline def setDisplayNameChange(value: DisplayNameChangeEvent => Callback): Self = StObject.set(x, "displayNameChange", js.Any.fromFunction1((t0: DisplayNameChangeEvent) => value(t0).runNow()))
    
    inline def setDominantSpeakerChanged(value: DominantSpeakerChangedEvent => Callback): Self = StObject.set(x, "dominantSpeakerChanged", js.Any.fromFunction1((t0: DominantSpeakerChangedEvent) => value(t0).runNow()))
    
    inline def setEmailChange(value: EmailChangeEvent => Callback): Self = StObject.set(x, "emailChange", js.Any.fromFunction1((t0: EmailChangeEvent) => value(t0).runNow()))
    
    inline def setEndpointTextMessageReceived(value: EndpointTextMessageReceivedEvent => Callback): Self = StObject.set(x, "endpointTextMessageReceived", js.Any.fromFunction1((t0: EndpointTextMessageReceivedEvent) => value(t0).runNow()))
    
    inline def setFeedbackSubmitted(value: FeedbackSubmittedEvent => Callback): Self = StObject.set(x, "feedbackSubmitted", js.Any.fromFunction1((t0: FeedbackSubmittedEvent) => value(t0).runNow()))
    
    inline def setFilmstripDisplayChanged(value: FilmstripDisplayChangedEvent => Callback): Self = StObject.set(x, "filmstripDisplayChanged", js.Any.fromFunction1((t0: FilmstripDisplayChangedEvent) => value(t0).runNow()))
    
    inline def setIncomingMessage(value: IncomingMessageEvent => Callback): Self = StObject.set(x, "incomingMessage", js.Any.fromFunction1((t0: IncomingMessageEvent) => value(t0).runNow()))
    
    inline def setLargeVideoChanged(value: LargeVideoChangedEvent => Callback): Self = StObject.set(x, "largeVideoChanged", js.Any.fromFunction1((t0: LargeVideoChangedEvent) => value(t0).runNow()))
    
    inline def setLog(value: LogEvent => Callback): Self = StObject.set(x, "log", js.Any.fromFunction1((t0: LogEvent) => value(t0).runNow()))
    
    inline def setMicError(value: MicErrorEvent => Callback): Self = StObject.set(x, "micError", js.Any.fromFunction1((t0: MicErrorEvent) => value(t0).runNow()))
    
    inline def setOutgoingMessage(value: OutgoingMessageEvent => Callback): Self = StObject.set(x, "outgoingMessage", js.Any.fromFunction1((t0: OutgoingMessageEvent) => value(t0).runNow()))
    
    inline def setParticipantJoined(value: ParticipantJoinedEvent => Callback): Self = StObject.set(x, "participantJoined", js.Any.fromFunction1((t0: ParticipantJoinedEvent) => value(t0).runNow()))
    
    inline def setParticipantKickedOut(value: ParticipantKickedOutEvent => Callback): Self = StObject.set(x, "participantKickedOut", js.Any.fromFunction1((t0: ParticipantKickedOutEvent) => value(t0).runNow()))
    
    inline def setParticipantLeft(value: ParticipantLeftEvent => Callback): Self = StObject.set(x, "participantLeft", js.Any.fromFunction1((t0: ParticipantLeftEvent) => value(t0).runNow()))
    
    inline def setParticipantRoleChanged(value: ParticipantRoleChangedEvent => Callback): Self = StObject.set(x, "participantRoleChanged", js.Any.fromFunction1((t0: ParticipantRoleChangedEvent) => value(t0).runNow()))
    
    inline def setPasswordRequired(value: Callback): Self = StObject.set(x, "passwordRequired", value.toJsFn)
    
    inline def setReadyToClose(value: Callback): Self = StObject.set(x, "readyToClose", value.toJsFn)
    
    inline def setScreenSharingStatusChanged(value: ScreenSharingStatusChangedEvent => Callback): Self = StObject.set(x, "screenSharingStatusChanged", js.Any.fromFunction1((t0: ScreenSharingStatusChangedEvent) => value(t0).runNow()))
    
    inline def setSubjectChange(value: SubjectChangeEvent => Callback): Self = StObject.set(x, "subjectChange", js.Any.fromFunction1((t0: SubjectChangeEvent) => value(t0).runNow()))
    
    inline def setSuspendDetected(value: Callback): Self = StObject.set(x, "suspendDetected", value.toJsFn)
    
    inline def setTileViewChanged(value: TileViewChangedEvent => Callback): Self = StObject.set(x, "tileViewChanged", js.Any.fromFunction1((t0: TileViewChangedEvent) => value(t0).runNow()))
    
    inline def setVideoAvailabilityChanged(value: VideoAvailabilityChangedEvent => Callback): Self = StObject.set(x, "videoAvailabilityChanged", js.Any.fromFunction1((t0: VideoAvailabilityChangedEvent) => value(t0).runNow()))
    
    inline def setVideoConferenceJoined(value: VideoConferenceJoinedEvent => Callback): Self = StObject.set(x, "videoConferenceJoined", js.Any.fromFunction1((t0: VideoConferenceJoinedEvent) => value(t0).runNow()))
    
    inline def setVideoConferenceLeft(value: VideoConferenceLeftEvent => Callback): Self = StObject.set(x, "videoConferenceLeft", js.Any.fromFunction1((t0: VideoConferenceLeftEvent) => value(t0).runNow()))
    
    inline def setVideoMuteStatusChanged(value: VideoMuteStatusChangedEvent => Callback): Self = StObject.set(x, "videoMuteStatusChanged", js.Any.fromFunction1((t0: VideoMuteStatusChangedEvent) => value(t0).runNow()))
    
    inline def setVideoQualityChanged(value: VideoQualityChangedEvent => Callback): Self = StObject.set(x, "videoQualityChanged", js.Any.fromFunction1((t0: VideoQualityChangedEvent) => value(t0).runNow()))
  }
}
