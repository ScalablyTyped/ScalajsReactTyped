package typingsJapgolly.twilioVideo

import org.scalajs.dom.MediaStreamTrack
import typingsJapgolly.twilioVideo.tsdefLocalDataTrackOptionsMod.LocalDataTrackOptions
import typingsJapgolly.twilioVideo.tsdefLocalTrackOptionsMod.LocalTrackOptions
import typingsJapgolly.twilioVideo.tsdefLoglevelMod.Log.RootLogger
import typingsJapgolly.twilioVideo.tsdefPreflightTypesMod.PreflightOptions
import typingsJapgolly.twilioVideo.tsdefTypesMod.CancelablePromise
import typingsJapgolly.twilioVideo.tsdefTypesMod.ConnectOptions
import typingsJapgolly.twilioVideo.tsdefTypesMod.CreateLocalAudioTrackOptions
import typingsJapgolly.twilioVideo.tsdefTypesMod.CreateLocalTrackOptions
import typingsJapgolly.twilioVideo.tsdefTypesMod.CreateLocalTracksOptions
import typingsJapgolly.twilioVideo.tsdefTypesMod.LocalTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("twilio-video", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("twilio-video", "AudioTrack")
  @js.native
  open class AudioTrack ()
    extends typingsJapgolly.twilioVideo.tsdefAudioTrackMod.AudioTrack
  
  @JSImport("twilio-video", "LocalAudioTrack")
  @js.native
  open class LocalAudioTrack protected ()
    extends typingsJapgolly.twilioVideo.tsdefLocalAudioTrackMod.LocalAudioTrack {
    def this(mediaStreamTrack: MediaStreamTrack) = this()
    def this(mediaStreamTrack: MediaStreamTrack, options: LocalTrackOptions) = this()
  }
  
  @JSImport("twilio-video", "LocalAudioTrackPublication")
  @js.native
  open class LocalAudioTrackPublication ()
    extends typingsJapgolly.twilioVideo.tsdefLocalAudioTrackPublicationMod.LocalAudioTrackPublication
  
  @JSImport("twilio-video", "LocalAudioTrackStats")
  @js.native
  open class LocalAudioTrackStats ()
    extends typingsJapgolly.twilioVideo.tsdefTypesMod.LocalAudioTrackStats
  
  @JSImport("twilio-video", "LocalDataTrack")
  @js.native
  open class LocalDataTrack ()
    extends typingsJapgolly.twilioVideo.tsdefLocalDataTrackMod.LocalDataTrack {
    def this(options: LocalDataTrackOptions) = this()
  }
  
  @JSImport("twilio-video", "LocalDataTrackPublication")
  @js.native
  open class LocalDataTrackPublication ()
    extends typingsJapgolly.twilioVideo.tsdefLocalDataTrackPublicationMod.LocalDataTrackPublication
  
  @JSImport("twilio-video", "LocalParticipant")
  @js.native
  open class LocalParticipant ()
    extends typingsJapgolly.twilioVideo.tsdefLocalParticipantMod.LocalParticipant
  
  @JSImport("twilio-video", "LocalTrackPublication")
  @js.native
  open class LocalTrackPublication ()
    extends typingsJapgolly.twilioVideo.tsdefLocalTrackPublicationMod.LocalTrackPublication
  
  @JSImport("twilio-video", "LocalTrackStats")
  @js.native
  open class LocalTrackStats ()
    extends typingsJapgolly.twilioVideo.tsdefTypesMod.LocalTrackStats
  
  @JSImport("twilio-video", "LocalVideoTrack")
  @js.native
  open class LocalVideoTrack protected ()
    extends typingsJapgolly.twilioVideo.tsdefLocalVideoTrackMod.LocalVideoTrack {
    def this(mediaStreamTrack: MediaStreamTrack) = this()
    def this(mediaStreamTrack: MediaStreamTrack, options: LocalTrackOptions) = this()
  }
  
  @JSImport("twilio-video", "LocalVideoTrackPublication")
  @js.native
  open class LocalVideoTrackPublication ()
    extends typingsJapgolly.twilioVideo.tsdefLocalVideoTrackPublicationMod.LocalVideoTrackPublication
  
  @JSImport("twilio-video", "LocalVideoTrackStats")
  @js.native
  open class LocalVideoTrackStats ()
    extends typingsJapgolly.twilioVideo.tsdefTypesMod.LocalVideoTrackStats
  
  @JSImport("twilio-video", "Logger")
  @js.native
  val Logger: RootLogger = js.native
  
  @JSImport("twilio-video", "NetworkQualityBandwidthStats")
  @js.native
  open class NetworkQualityBandwidthStats ()
    extends typingsJapgolly.twilioVideo.tsdefTypesMod.NetworkQualityBandwidthStats
  
  @JSImport("twilio-video", "NetworkQualityFractionLostStats")
  @js.native
  open class NetworkQualityFractionLostStats ()
    extends typingsJapgolly.twilioVideo.tsdefTypesMod.NetworkQualityFractionLostStats
  
  @JSImport("twilio-video", "NetworkQualityLatencyStats")
  @js.native
  open class NetworkQualityLatencyStats ()
    extends typingsJapgolly.twilioVideo.tsdefTypesMod.NetworkQualityLatencyStats
  
  @JSImport("twilio-video", "NetworkQualityMediaStats")
  @js.native
  open class NetworkQualityMediaStats ()
    extends typingsJapgolly.twilioVideo.tsdefTypesMod.NetworkQualityMediaStats
  
  @JSImport("twilio-video", "NetworkQualitySendOrRecvStats")
  @js.native
  open class NetworkQualitySendOrRecvStats ()
    extends typingsJapgolly.twilioVideo.tsdefTypesMod.NetworkQualitySendOrRecvStats
  
  @JSImport("twilio-video", "NetworkQualityStats")
  @js.native
  open class NetworkQualityStats ()
    extends typingsJapgolly.twilioVideo.tsdefTypesMod.NetworkQualityStats
  
  @JSImport("twilio-video", "Participant")
  @js.native
  open class Participant ()
    extends typingsJapgolly.twilioVideo.tsdefParticipantMod.Participant
  
  @JSImport("twilio-video", "PreflightTest")
  @js.native
  open class PreflightTest ()
    extends typingsJapgolly.twilioVideo.tsdefPreflighttestMod.PreflightTest
  
  @JSImport("twilio-video", "RemoteAudioTrack")
  @js.native
  open class RemoteAudioTrack ()
    extends typingsJapgolly.twilioVideo.tsdefRemoteAudioTrackMod.RemoteAudioTrack
  
  @JSImport("twilio-video", "RemoteAudioTrackPublication")
  @js.native
  open class RemoteAudioTrackPublication ()
    extends typingsJapgolly.twilioVideo.tsdefRemoteAudioTrackPublicationMod.RemoteAudioTrackPublication
  
  @JSImport("twilio-video", "RemoteAudioTrackStats")
  @js.native
  open class RemoteAudioTrackStats ()
    extends typingsJapgolly.twilioVideo.tsdefTypesMod.RemoteAudioTrackStats
  
  @JSImport("twilio-video", "RemoteDataTrack")
  @js.native
  open class RemoteDataTrack ()
    extends typingsJapgolly.twilioVideo.tsdefRemoteDataTrackMod.RemoteDataTrack
  
  @JSImport("twilio-video", "RemoteDataTrackPublication")
  @js.native
  open class RemoteDataTrackPublication ()
    extends typingsJapgolly.twilioVideo.tsdefRemoteDataTrackPublicationMod.RemoteDataTrackPublication
  
  @JSImport("twilio-video", "RemoteParticipant")
  @js.native
  open class RemoteParticipant ()
    extends typingsJapgolly.twilioVideo.tsdefRemoteParticipantMod.RemoteParticipant
  
  @JSImport("twilio-video", "RemoteTrackPublication")
  @js.native
  open class RemoteTrackPublication ()
    extends typingsJapgolly.twilioVideo.tsdefRemoteTrackPublicationMod.RemoteTrackPublication
  
  @JSImport("twilio-video", "RemoteTrackStats")
  @js.native
  open class RemoteTrackStats ()
    extends typingsJapgolly.twilioVideo.tsdefTypesMod.RemoteTrackStats
  
  @JSImport("twilio-video", "RemoteVideoTrack")
  @js.native
  open class RemoteVideoTrack ()
    extends typingsJapgolly.twilioVideo.tsdefRemoteVideoTrackMod.RemoteVideoTrack
  
  @JSImport("twilio-video", "RemoteVideoTrackPublication")
  @js.native
  open class RemoteVideoTrackPublication ()
    extends typingsJapgolly.twilioVideo.tsdefRemoteVideoTrackPublicationMod.RemoteVideoTrackPublication
  
  @JSImport("twilio-video", "RemoteVideoTrackStats")
  @js.native
  open class RemoteVideoTrackStats ()
    extends typingsJapgolly.twilioVideo.tsdefTypesMod.RemoteVideoTrackStats
  
  @JSImport("twilio-video", "Room")
  @js.native
  open class Room ()
    extends typingsJapgolly.twilioVideo.tsdefRoomMod.Room
  
  @JSImport("twilio-video", "StatsReport")
  @js.native
  open class StatsReport ()
    extends typingsJapgolly.twilioVideo.tsdefTypesMod.StatsReport
  
  @JSImport("twilio-video", "Track")
  @js.native
  open class Track ()
    extends typingsJapgolly.twilioVideo.tsdefTrackMod.Track
  
  @JSImport("twilio-video", "TrackPublication")
  @js.native
  open class TrackPublication ()
    extends typingsJapgolly.twilioVideo.tsdefTrackPublicationMod.TrackPublication
  
  @JSImport("twilio-video", "TrackStats")
  @js.native
  open class TrackStats ()
    extends typingsJapgolly.twilioVideo.tsdefTypesMod.TrackStats
  
  @JSImport("twilio-video", "TwilioError")
  @js.native
  open class TwilioError ()
    extends typingsJapgolly.twilioVideo.tsdefTwilioErrorMod.TwilioError
  
  @JSImport("twilio-video", "VideoProcessor")
  @js.native
  open class VideoProcessor ()
    extends typingsJapgolly.twilioVideo.tsdefVideoProcessorMod.VideoProcessor
  
  @JSImport("twilio-video", "VideoTrack")
  @js.native
  open class VideoTrack ()
    extends typingsJapgolly.twilioVideo.tsdefVideoTrackMod.VideoTrack
  
  inline def connect(token: String): CancelablePromise[typingsJapgolly.twilioVideo.tsdefRoomMod.Room] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(token.asInstanceOf[js.Any]).asInstanceOf[CancelablePromise[typingsJapgolly.twilioVideo.tsdefRoomMod.Room]]
  inline def connect(token: String, options: ConnectOptions): CancelablePromise[typingsJapgolly.twilioVideo.tsdefRoomMod.Room] = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelablePromise[typingsJapgolly.twilioVideo.tsdefRoomMod.Room]]
  
  inline def createLocalAudioTrack(): js.Promise[typingsJapgolly.twilioVideo.tsdefLocalAudioTrackMod.LocalAudioTrack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalAudioTrack")().asInstanceOf[js.Promise[typingsJapgolly.twilioVideo.tsdefLocalAudioTrackMod.LocalAudioTrack]]
  inline def createLocalAudioTrack(options: CreateLocalAudioTrackOptions): js.Promise[typingsJapgolly.twilioVideo.tsdefLocalAudioTrackMod.LocalAudioTrack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalAudioTrack")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.twilioVideo.tsdefLocalAudioTrackMod.LocalAudioTrack]]
  inline def createLocalAudioTrack(options: CreateLocalTracksOptions): js.Promise[typingsJapgolly.twilioVideo.tsdefLocalAudioTrackMod.LocalAudioTrack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalAudioTrack")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.twilioVideo.tsdefLocalAudioTrackMod.LocalAudioTrack]]
  
  inline def createLocalTracks(): js.Promise[js.Array[LocalTrack]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalTracks")().asInstanceOf[js.Promise[js.Array[LocalTrack]]]
  inline def createLocalTracks(options: CreateLocalTracksOptions): js.Promise[js.Array[LocalTrack]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalTracks")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[LocalTrack]]]
  
  inline def createLocalVideoTrack(): js.Promise[typingsJapgolly.twilioVideo.tsdefLocalVideoTrackMod.LocalVideoTrack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalVideoTrack")().asInstanceOf[js.Promise[typingsJapgolly.twilioVideo.tsdefLocalVideoTrackMod.LocalVideoTrack]]
  inline def createLocalVideoTrack(options: CreateLocalTrackOptions): js.Promise[typingsJapgolly.twilioVideo.tsdefLocalVideoTrackMod.LocalVideoTrack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalVideoTrack")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.twilioVideo.tsdefLocalVideoTrackMod.LocalVideoTrack]]
  
  @JSImport("twilio-video", "isSupported")
  @js.native
  val isSupported: Boolean = js.native
  
  inline def runPreflight(token: String): typingsJapgolly.twilioVideo.tsdefPreflighttestMod.PreflightTest = ^.asInstanceOf[js.Dynamic].applyDynamic("runPreflight")(token.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.twilioVideo.tsdefPreflighttestMod.PreflightTest]
  inline def runPreflight(token: String, options: PreflightOptions): typingsJapgolly.twilioVideo.tsdefPreflighttestMod.PreflightTest = (^.asInstanceOf[js.Dynamic].applyDynamic("runPreflight")(token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.twilioVideo.tsdefPreflighttestMod.PreflightTest]
  
  @JSImport("twilio-video", "version")
  @js.native
  val version: String = js.native
}
