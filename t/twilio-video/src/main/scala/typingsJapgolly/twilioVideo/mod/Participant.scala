package typingsJapgolly.twilioVideo.mod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.std.Map
import typingsJapgolly.twilioVideo.mod.Participant.Identity
import typingsJapgolly.twilioVideo.mod.Track.SID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-video", "Participant")
@js.native
class Participant () extends EventEmitter {
  var audioTracks: Map[SID, AudioTrackPublication] = js.native
  var dataTracks: Map[SID, DataTrackPublication] = js.native
  var identity: Identity = js.native
  var networkQualityLevel: NetworkQualityLevel | Null = js.native
  var networkQualityStats: NetworkQualityStats | Null = js.native
  var sid: typingsJapgolly.twilioVideo.mod.Participant.SID = js.native
  var state: String = js.native
  var tracks: Map[SID, TrackPublication] = js.native
  var videoTracks: Map[SID, VideoTrackPublication] = js.native
}

@JSImport("twilio-video", "Participant")
@js.native
object Participant extends js.Object {
  type Identity = String
  type SID = String
}

