package typingsJapgolly.twilioVideo

import org.scalajs.dom.HTMLMediaElement
import org.scalajs.dom.MediaStreamTrack
import typingsJapgolly.twilioVideo.tsdefTrackMod.Track
import typingsJapgolly.twilioVideo.twilioVideoStrings.audio
import typingsJapgolly.twilioVideo.twilioVideoStrings.disabled
import typingsJapgolly.twilioVideo.twilioVideoStrings.enabled
import typingsJapgolly.twilioVideo.twilioVideoStrings.started
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefAudioTrackMod {
  
  @JSImport("twilio-video/tsdef/AudioTrack", "AudioTrack")
  @js.native
  open class AudioTrack () extends Track {
    
    def attach(): HTMLMediaElement = js.native
    def attach(element: String): HTMLMediaElement = js.native
    def attach(element: HTMLMediaElement): HTMLMediaElement = js.native
    
    def detach(): js.Array[HTMLMediaElement] = js.native
    def detach(element: String): js.Array[HTMLMediaElement] = js.native
    def detach(element: HTMLMediaElement): js.Array[HTMLMediaElement] = js.native
    
    var isEnabled: Boolean = js.native
    
    var isStarted: Boolean = js.native
    
    @JSName("kind")
    var kind_AudioTrack: audio = js.native
    
    var mediaStreamTrack: MediaStreamTrack = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_disabled(event: disabled, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_enabled(event: enabled, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_started(event: started, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
  }
}
