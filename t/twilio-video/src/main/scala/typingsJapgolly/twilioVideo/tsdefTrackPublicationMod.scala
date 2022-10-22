package typingsJapgolly.twilioVideo

import typingsJapgolly.events.mod.EventEmitter
import typingsJapgolly.twilioVideo.tsdefTrackMod.Track.Kind
import typingsJapgolly.twilioVideo.tsdefTrackMod.Track.SID
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackDisabled
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackEnabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefTrackPublicationMod {
  
  @JSImport("twilio-video/tsdef/TrackPublication", "TrackPublication")
  @js.native
  open class TrackPublication () extends EventEmitter {
    
    var isEnabled: Boolean = js.native
    
    var kind: Kind = js.native
    
    @JSName("on")
    def on_trackDisabled(event: trackDisabled, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_trackEnabled(event: trackEnabled, listener: js.Function0[Unit]): this.type = js.native
    
    var trackName: String = js.native
    
    var trackSid: SID = js.native
  }
}
