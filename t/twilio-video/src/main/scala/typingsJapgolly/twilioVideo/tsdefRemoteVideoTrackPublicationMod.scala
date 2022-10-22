package typingsJapgolly.twilioVideo

import typingsJapgolly.twilioVideo.tsdefRemoteTrackPublicationMod.RemoteTrackPublication
import typingsJapgolly.twilioVideo.tsdefRemoteVideoTrackMod.RemoteVideoTrack
import typingsJapgolly.twilioVideo.tsdefTypesMod.VideoTrackPublication
import typingsJapgolly.twilioVideo.twilioVideoStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefRemoteVideoTrackPublicationMod {
  
  @JSImport("twilio-video/tsdef/RemoteVideoTrackPublication", "RemoteVideoTrackPublication")
  @js.native
  open class RemoteVideoTrackPublication ()
    extends RemoteTrackPublication
       with VideoTrackPublication {
    
    @JSName("kind")
    var kind_RemoteVideoTrackPublication: video = js.native
    
    @JSName("track")
    var track_RemoteVideoTrackPublication: RemoteVideoTrack | Null = js.native
  }
}
