package typingsJapgolly.twilioVideo

import typingsJapgolly.events.mod.EventEmitter
import typingsJapgolly.std.Map
import typingsJapgolly.twilioVideo.tsdefLocalParticipantMod.LocalParticipant
import typingsJapgolly.twilioVideo.tsdefLocalTrackPublicationMod.LocalTrackPublication
import typingsJapgolly.twilioVideo.tsdefParticipantMod.Participant.SID
import typingsJapgolly.twilioVideo.tsdefRemoteDataTrackMod.RemoteDataTrack
import typingsJapgolly.twilioVideo.tsdefRemoteParticipantMod.RemoteParticipant
import typingsJapgolly.twilioVideo.tsdefRemoteTrackPublicationMod.RemoteTrackPublication
import typingsJapgolly.twilioVideo.tsdefRemoteVideoTrackMod.RemoteVideoTrack
import typingsJapgolly.twilioVideo.tsdefTrackMod.Track.Priority
import typingsJapgolly.twilioVideo.tsdefTwilioErrorMod.TwilioError
import typingsJapgolly.twilioVideo.tsdefTypesMod.RemoteTrack
import typingsJapgolly.twilioVideo.tsdefTypesMod.StatsReport
import typingsJapgolly.twilioVideo.twilioVideoStrings.disconnected
import typingsJapgolly.twilioVideo.twilioVideoStrings.dominantSpeakerChanged
import typingsJapgolly.twilioVideo.twilioVideoStrings.participantConnected
import typingsJapgolly.twilioVideo.twilioVideoStrings.participantDisconnected
import typingsJapgolly.twilioVideo.twilioVideoStrings.participantReconnected
import typingsJapgolly.twilioVideo.twilioVideoStrings.participantReconnecting
import typingsJapgolly.twilioVideo.twilioVideoStrings.reconnected
import typingsJapgolly.twilioVideo.twilioVideoStrings.reconnecting
import typingsJapgolly.twilioVideo.twilioVideoStrings.recordingStarted
import typingsJapgolly.twilioVideo.twilioVideoStrings.recordingStopped
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackDimensionsChanged
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackDisabled
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackEnabled
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackMessage
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackPublishPriorityChanged
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackPublished
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackStarted
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackSubscribed
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackSubscriptionFailed
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackSwitchedOff
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackSwitchedOn
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackUnpublished
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackUnsubscribed
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackWarning
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackWarningsCleared
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefRoomMod {
  
  @JSImport("twilio-video/tsdef/Room", "Room")
  @js.native
  open class Room () extends EventEmitter {
    
    def disconnect(): Room = js.native
    
    var dominantSpeaker: RemoteParticipant | Null = js.native
    
    def getStats(): js.Promise[js.Array[StatsReport]] = js.native
    
    var isRecording: Boolean = js.native
    
    var localParticipant: LocalParticipant = js.native
    
    var mediaRegion: String = js.native
    
    var name: String = js.native
    
    @JSName("on")
    def on_disconnected(event: disconnected, listener: js.Function2[/* room */ this.type, /* error */ TwilioError, Unit]): this.type = js.native
    @JSName("on")
    def on_dominantSpeakerChanged(
      event: dominantSpeakerChanged,
      listener: js.Function1[/* dominantSpeaker */ RemoteParticipant, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_participantConnected(event: participantConnected, listener: js.Function1[/* participant */ RemoteParticipant, Unit]): this.type = js.native
    @JSName("on")
    def on_participantDisconnected(event: participantDisconnected, listener: js.Function1[/* participant */ RemoteParticipant, Unit]): this.type = js.native
    @JSName("on")
    def on_participantReconnected(event: participantReconnected, listener: js.Function1[/* participant */ RemoteParticipant, Unit]): this.type = js.native
    @JSName("on")
    def on_participantReconnecting(event: participantReconnecting, listener: js.Function1[/* participant */ RemoteParticipant, Unit]): this.type = js.native
    @JSName("on")
    def on_reconnected(event: reconnected, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_reconnecting(event: reconnecting, listener: js.Function1[/* error */ TwilioError, Unit]): this.type = js.native
    @JSName("on")
    def on_recordingStarted(event: recordingStarted, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_recordingStopped(event: recordingStopped, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_trackDimensionsChanged(
      event: trackDimensionsChanged,
      listener: js.Function2[/* track */ RemoteVideoTrack, /* participant */ RemoteParticipant, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackDisabled(
      event: trackDisabled,
      listener: js.Function2[/* publication */ RemoteTrackPublication, /* participant */ RemoteParticipant, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackEnabled(
      event: trackEnabled,
      listener: js.Function2[/* publication */ RemoteTrackPublication, /* participant */ RemoteParticipant, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackMessage(
      event: trackMessage,
      listener: js.Function3[
          /* data */ String | js.typedarray.ArrayBuffer, 
          /* track */ RemoteDataTrack, 
          /* participant */ RemoteParticipant, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_trackPublishPriorityChanged(
      event: trackPublishPriorityChanged,
      listener: js.Function3[
          /* priority */ Priority, 
          /* publication */ RemoteTrackPublication, 
          /* participant */ RemoteParticipant, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_trackPublished(
      event: trackPublished,
      listener: js.Function2[/* publication */ RemoteTrackPublication, /* participant */ RemoteParticipant, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackStarted(
      event: trackStarted,
      listener: js.Function2[/* track */ RemoteTrack, /* participant */ RemoteParticipant, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackSubscribed(
      event: trackSubscribed,
      listener: js.Function3[
          /* track */ RemoteTrack, 
          /* publication */ RemoteTrackPublication, 
          /* participant */ RemoteParticipant, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_trackSubscriptionFailed(
      event: trackSubscriptionFailed,
      listener: js.Function3[
          /* error */ TwilioError, 
          /* publication */ RemoteTrackPublication, 
          /* participant */ RemoteParticipant, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_trackSwitchedOff(
      event: trackSwitchedOff,
      listener: js.Function3[
          /* track */ RemoteTrack, 
          /* publication */ RemoteTrackPublication, 
          /* participant */ RemoteParticipant, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_trackSwitchedOn(
      event: trackSwitchedOn,
      listener: js.Function3[
          /* track */ RemoteTrack, 
          /* publication */ RemoteTrackPublication, 
          /* participant */ RemoteParticipant, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_trackUnpublished(
      event: trackUnpublished,
      listener: js.Function2[/* publication */ RemoteTrackPublication, /* participant */ RemoteParticipant, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackUnsubscribed(
      event: trackUnsubscribed,
      listener: js.Function3[
          /* track */ RemoteTrack, 
          /* publication */ RemoteTrackPublication, 
          /* participant */ RemoteParticipant, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_trackWarning(
      event: trackWarning,
      listener: js.Function3[
          /* name */ String, 
          /* publication */ LocalTrackPublication, 
          /* participant */ LocalParticipant, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_trackWarningsCleared(
      event: trackWarningsCleared,
      listener: js.Function2[/* publication */ LocalTrackPublication, /* participant */ LocalParticipant, Unit]
    ): this.type = js.native
    
    var participants: Map[SID, RemoteParticipant] = js.native
    
    var sid: typingsJapgolly.twilioVideo.tsdefRoomMod.Room.SID = js.native
    
    var state: String = js.native
  }
  object Room {
    
    type SID = String
  }
}
