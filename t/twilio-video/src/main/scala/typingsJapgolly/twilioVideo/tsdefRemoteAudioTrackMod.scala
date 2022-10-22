package typingsJapgolly.twilioVideo

import typingsJapgolly.twilioVideo.tsdefAudioTrackMod.AudioTrack
import typingsJapgolly.twilioVideo.tsdefTrackMod.Track.Priority
import typingsJapgolly.twilioVideo.tsdefTrackMod.Track.SID
import typingsJapgolly.twilioVideo.tsdefTypesMod.RemoteTrack
import typingsJapgolly.twilioVideo.twilioVideoStrings.switchedOff
import typingsJapgolly.twilioVideo.twilioVideoStrings.switchedOn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefRemoteAudioTrackMod {
  
  @JSImport("twilio-video/tsdef/RemoteAudioTrack", "RemoteAudioTrack")
  @js.native
  open class RemoteAudioTrack ()
    extends AudioTrack
       with RemoteTrack {
    
    var isSwitchedOff: Boolean = js.native
    
    @JSName("on")
    def on_switchedOff(event: switchedOff, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_switchedOn(event: switchedOn, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    
    var priority: Priority | Null = js.native
    
    def setPriority(): this.type = js.native
    def setPriority(priority: Priority): this.type = js.native
    
    var sid: SID = js.native
  }
}
