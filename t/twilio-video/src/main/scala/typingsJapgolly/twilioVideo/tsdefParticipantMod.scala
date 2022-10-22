package typingsJapgolly.twilioVideo

import typingsJapgolly.events.mod.EventEmitter
import typingsJapgolly.std.Map
import typingsJapgolly.twilioVideo.tsdefParticipantMod.Participant.Identity
import typingsJapgolly.twilioVideo.tsdefTrackMod.Track
import typingsJapgolly.twilioVideo.tsdefTrackMod.Track.SID
import typingsJapgolly.twilioVideo.tsdefTrackPublicationMod.TrackPublication
import typingsJapgolly.twilioVideo.tsdefTypesMod.AudioTrackPublication
import typingsJapgolly.twilioVideo.tsdefTypesMod.DataTrackPublication
import typingsJapgolly.twilioVideo.tsdefTypesMod.NetworkQualityLevel
import typingsJapgolly.twilioVideo.tsdefTypesMod.NetworkQualityStats
import typingsJapgolly.twilioVideo.tsdefTypesMod.VideoTrackPublication
import typingsJapgolly.twilioVideo.tsdefVideoTrackMod.VideoTrack
import typingsJapgolly.twilioVideo.twilioVideoStrings.disconnected
import typingsJapgolly.twilioVideo.twilioVideoStrings.networkQualityLevelChanged
import typingsJapgolly.twilioVideo.twilioVideoStrings.reconnected
import typingsJapgolly.twilioVideo.twilioVideoStrings.reconnecting
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackDimensionsChanged
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackStarted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefParticipantMod {
  
  @JSImport("twilio-video/tsdef/Participant", "Participant")
  @js.native
  open class Participant () extends EventEmitter {
    
    var audioTracks: Map[SID, AudioTrackPublication] = js.native
    
    var dataTracks: Map[SID, DataTrackPublication] = js.native
    
    var identity: Identity = js.native
    
    var networkQualityLevel: NetworkQualityLevel | Null = js.native
    
    var networkQualityStats: NetworkQualityStats | Null = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_disconnected(event: disconnected, listener: js.Function1[/* participant */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_networkQualityLevelChanged(
      event: networkQualityLevelChanged,
      listener: js.Function2[
          /* networkQualityLevel */ NetworkQualityLevel, 
          /* networkQualityStats */ NetworkQualityStats, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_reconnected(event: reconnected, listener: js.Function1[/* participant */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_reconnecting(event: reconnecting, listener: js.Function1[/* participant */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_trackDimensionsChanged(event: trackDimensionsChanged, listener: js.Function1[/* track */ VideoTrack, Unit]): this.type = js.native
    @JSName("on")
    def on_trackStarted(event: trackStarted, listener: js.Function1[/* track */ Track, Unit]): this.type = js.native
    
    var sid: typingsJapgolly.twilioVideo.tsdefParticipantMod.Participant.SID = js.native
    
    var state: String = js.native
    
    var tracks: Map[SID, TrackPublication] = js.native
    
    var videoTracks: Map[SID, VideoTrackPublication] = js.native
  }
  object Participant {
    
    type Identity = String
    
    type SID = String
  }
}
