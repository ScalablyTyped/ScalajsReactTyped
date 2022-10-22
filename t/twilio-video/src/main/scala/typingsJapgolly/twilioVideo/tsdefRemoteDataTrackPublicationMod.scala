package typingsJapgolly.twilioVideo

import typingsJapgolly.twilioVideo.tsdefRemoteDataTrackMod.RemoteDataTrack
import typingsJapgolly.twilioVideo.tsdefRemoteTrackPublicationMod.RemoteTrackPublication
import typingsJapgolly.twilioVideo.tsdefTypesMod.DataTrackPublication
import typingsJapgolly.twilioVideo.twilioVideoStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefRemoteDataTrackPublicationMod {
  
  @JSImport("twilio-video/tsdef/RemoteDataTrackPublication", "RemoteDataTrackPublication")
  @js.native
  open class RemoteDataTrackPublication ()
    extends RemoteTrackPublication
       with DataTrackPublication {
    
    @JSName("kind")
    var kind_RemoteDataTrackPublication: data = js.native
    
    @JSName("track")
    var track_RemoteDataTrackPublication: RemoteDataTrack | Null = js.native
  }
}
