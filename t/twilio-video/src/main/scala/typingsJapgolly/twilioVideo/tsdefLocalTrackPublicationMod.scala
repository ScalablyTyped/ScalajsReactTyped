package typingsJapgolly.twilioVideo

import typingsJapgolly.twilioVideo.tsdefTrackMod.Track.Priority
import typingsJapgolly.twilioVideo.tsdefTrackPublicationMod.TrackPublication
import typingsJapgolly.twilioVideo.tsdefTypesMod.LocalTrack
import typingsJapgolly.twilioVideo.twilioVideoStrings.warning
import typingsJapgolly.twilioVideo.twilioVideoStrings.warningsCleared
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefLocalTrackPublicationMod {
  
  @JSImport("twilio-video/tsdef/LocalTrackPublication", "LocalTrackPublication")
  @js.native
  open class LocalTrackPublication () extends TrackPublication {
    
    var isTrackEnabled: Boolean = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_warning(event: warning, listener: js.Function1[/* name */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_warningsCleared(event: warningsCleared, listener: js.Function0[Unit]): this.type = js.native
    
    var priority: Priority = js.native
    
    def setPriority(priority: Priority): this.type = js.native
    
    var track: LocalTrack = js.native
    
    def unpublish(): this.type = js.native
  }
}
