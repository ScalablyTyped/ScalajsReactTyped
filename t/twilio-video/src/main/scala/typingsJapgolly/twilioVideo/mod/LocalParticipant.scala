package typingsJapgolly.twilioVideo.mod

import typingsJapgolly.std.Map
import typingsJapgolly.std.MediaStreamTrack
import typingsJapgolly.twilioVideo.mod.Track.SID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "LocalParticipant")
@js.native
class LocalParticipant () extends Participant {
  @JSName("audioTracks")
  var audioTracks_LocalParticipant: Map[SID, LocalAudioTrackPublication] = js.native
  @JSName("dataTracks")
  var dataTracks_LocalParticipant: Map[SID, LocalDataTrackPublication] = js.native
  @JSName("tracks")
  var tracks_LocalParticipant: Map[SID, LocalTrackPublication] = js.native
  @JSName("videoTracks")
  var videoTracks_LocalParticipant: Map[SID, LocalVideoTrackPublication] = js.native
  def publishTrack(mediaStreamTrack: MediaStreamTrack): js.Promise[LocalTrackPublication] = js.native
  def publishTrack(mediaStreamTrack: MediaStreamTrack, options: LocalTrackOptions): js.Promise[LocalTrackPublication] = js.native
  def publishTrack(track: LocalTrack): js.Promise[LocalTrackPublication] = js.native
  def publishTracks(tracks: js.Array[LocalTrack | org.scalajs.dom.experimental.mediastream.MediaStreamTrack]): js.Promise[js.Array[LocalTrackPublication]] = js.native
  def setParameters(): LocalParticipant = js.native
  def setParameters(encodingParameters: EncodingParameters): LocalParticipant = js.native
  def unpublishTrack(track: MediaStreamTrack): LocalTrackPublication = js.native
  def unpublishTrack(track: LocalTrack): LocalTrackPublication = js.native
  def unpublishTracks(tracks: js.Array[LocalTrack | org.scalajs.dom.experimental.mediastream.MediaStreamTrack]): js.Array[LocalTrackPublication] = js.native
}

