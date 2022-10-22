package typingsJapgolly.twilioVideo

import org.scalajs.dom.MediaStreamTrack
import org.scalajs.dom.MediaTrackConstraints
import typingsJapgolly.twilioVideo.tsdefAudioTrackMod.AudioTrack
import typingsJapgolly.twilioVideo.tsdefLocalTrackOptionsMod.LocalTrackOptions
import typingsJapgolly.twilioVideo.tsdefTrackMod.Track.ID
import typingsJapgolly.twilioVideo.tsdefTypesMod.LocalTrack
import typingsJapgolly.twilioVideo.tsdefTypesMod.NoiseCancellation
import typingsJapgolly.twilioVideo.twilioVideoStrings.stopped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefLocalAudioTrackMod {
  
  @JSImport("twilio-video/tsdef/LocalAudioTrack", "LocalAudioTrack")
  @js.native
  open class LocalAudioTrack protected ()
    extends AudioTrack
       with LocalTrack {
    def this(mediaStreamTrack: MediaStreamTrack) = this()
    def this(mediaStreamTrack: MediaStreamTrack, options: LocalTrackOptions) = this()
    
    def disable(): this.type = js.native
    
    def enable(): this.type = js.native
    def enable(enabled: Boolean): this.type = js.native
    
    var id: ID = js.native
    
    var isStopped: Boolean = js.native
    
    var noiseCancellation: js.UndefOr[NoiseCancellation] = js.native
    
    @JSName("on")
    def on_stopped(event: stopped, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    
    def restart(): js.Promise[Unit] = js.native
    def restart(constraints: MediaTrackConstraints): js.Promise[Unit] = js.native
    
    def stop(): this.type = js.native
  }
}
