package typingsJapgolly.twilioVideo

import typingsJapgolly.twilioVideo.tsdefLocalTrackPublicationMod.LocalTrackPublication
import typingsJapgolly.twilioVideo.tsdefLocalVideoTrackMod.LocalVideoTrack
import typingsJapgolly.twilioVideo.tsdefTypesMod.VideoTrackPublication
import typingsJapgolly.twilioVideo.twilioVideoStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefLocalVideoTrackPublicationMod {
  
  @JSImport("twilio-video/tsdef/LocalVideoTrackPublication", "LocalVideoTrackPublication")
  @js.native
  open class LocalVideoTrackPublication ()
    extends LocalTrackPublication
       with VideoTrackPublication {
    
    @JSName("kind")
    var kind_LocalVideoTrackPublication: video = js.native
    
    @JSName("track")
    var track_LocalVideoTrackPublication: LocalVideoTrack = js.native
  }
}
