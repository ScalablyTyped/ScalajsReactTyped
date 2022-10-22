package typingsJapgolly.twilioVideo

import typingsJapgolly.std.Map
import typingsJapgolly.twilioVideo.tsdefParticipantMod.Participant
import typingsJapgolly.twilioVideo.tsdefRemoteAudioTrackPublicationMod.RemoteAudioTrackPublication
import typingsJapgolly.twilioVideo.tsdefRemoteDataTrackMod.RemoteDataTrack
import typingsJapgolly.twilioVideo.tsdefRemoteDataTrackPublicationMod.RemoteDataTrackPublication
import typingsJapgolly.twilioVideo.tsdefRemoteTrackPublicationMod.RemoteTrackPublication
import typingsJapgolly.twilioVideo.tsdefRemoteVideoTrackPublicationMod.RemoteVideoTrackPublication
import typingsJapgolly.twilioVideo.tsdefTrackMod.Track.Priority
import typingsJapgolly.twilioVideo.tsdefTrackMod.Track.SID
import typingsJapgolly.twilioVideo.tsdefTwilioErrorMod.TwilioError
import typingsJapgolly.twilioVideo.tsdefTypesMod.RemoteTrack
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackDisabled
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackEnabled
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackMessage
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackPublishPriorityChanged
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackPublished
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackSubscribed
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackSubscriptionFailed
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackSwitchedOff
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackSwitchedOn
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackUnpublished
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackUnsubscribed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefRemoteParticipantMod {
  
  @JSImport("twilio-video/tsdef/RemoteParticipant", "RemoteParticipant")
  @js.native
  open class RemoteParticipant () extends Participant {
    
    @JSName("audioTracks")
    var audioTracks_RemoteParticipant: Map[SID, RemoteAudioTrackPublication] = js.native
    
    @JSName("dataTracks")
    var dataTracks_RemoteParticipant: Map[SID, RemoteDataTrackPublication] = js.native
    
    @JSName("on")
    def on_trackDisabled(event: trackDisabled, listener: js.Function1[/* track */ RemoteTrackPublication, Unit]): this.type = js.native
    @JSName("on")
    def on_trackEnabled(event: trackEnabled, listener: js.Function1[/* track */ RemoteTrackPublication, Unit]): this.type = js.native
    @JSName("on")
    def on_trackMessage(
      event: trackMessage,
      listener: js.Function2[/* data */ String | js.typedarray.ArrayBuffer, /* track */ RemoteDataTrack, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackPublishPriorityChanged(
      event: trackPublishPriorityChanged,
      listener: js.Function2[/* priority */ Priority, /* publication */ RemoteTrackPublication, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackPublished(event: trackPublished, listener: js.Function1[/* publication */ RemoteTrackPublication, Unit]): this.type = js.native
    @JSName("on")
    def on_trackSubscribed(
      event: trackSubscribed,
      listener: js.Function2[/* track */ RemoteTrack, /* publication */ RemoteTrackPublication, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackSubscriptionFailed(
      event: trackSubscriptionFailed,
      listener: js.Function2[/* error */ TwilioError, /* publication */ RemoteTrackPublication, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackSwitchedOff(
      event: trackSwitchedOff,
      listener: js.Function2[/* track */ RemoteTrack, /* publication */ RemoteTrackPublication, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackSwitchedOn(
      event: trackSwitchedOn,
      listener: js.Function2[/* track */ RemoteTrack, /* publication */ RemoteTrackPublication, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_trackUnpublished(event: trackUnpublished, listener: js.Function1[/* publication */ RemoteTrackPublication, Unit]): this.type = js.native
    @JSName("on")
    def on_trackUnsubscribed(
      event: trackUnsubscribed,
      listener: js.Function2[/* track */ RemoteTrack, /* publication */ RemoteTrackPublication, Unit]
    ): this.type = js.native
    
    @JSName("tracks")
    var tracks_RemoteParticipant: Map[SID, RemoteTrackPublication] = js.native
    
    @JSName("videoTracks")
    var videoTracks_RemoteParticipant: Map[SID, RemoteVideoTrackPublication] = js.native
  }
}
