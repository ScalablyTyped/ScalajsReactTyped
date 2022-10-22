package typingsJapgolly.twilioVideo

import typingsJapgolly.twilioVideo.tsdefLocalDataTrackMod.LocalDataTrack
import typingsJapgolly.twilioVideo.tsdefLocalTrackPublicationMod.LocalTrackPublication
import typingsJapgolly.twilioVideo.tsdefTypesMod.DataTrackPublication
import typingsJapgolly.twilioVideo.twilioVideoStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefLocalDataTrackPublicationMod {
  
  @JSImport("twilio-video/tsdef/LocalDataTrackPublication", "LocalDataTrackPublication")
  @js.native
  open class LocalDataTrackPublication ()
    extends LocalTrackPublication
       with DataTrackPublication {
    
    @JSName("kind")
    var kind_LocalDataTrackPublication: data = js.native
    
    @JSName("track")
    var track_LocalDataTrackPublication: LocalDataTrack = js.native
  }
}
