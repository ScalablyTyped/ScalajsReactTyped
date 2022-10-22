package typingsJapgolly.twilioVideo

import org.scalajs.dom.HTMLMediaElement
import org.scalajs.dom.HTMLVideoElement
import org.scalajs.dom.MediaStreamTrack
import typingsJapgolly.twilioVideo.tsdefTrackMod.Track
import typingsJapgolly.twilioVideo.tsdefVideoProcessorMod.VideoProcessor
import typingsJapgolly.twilioVideo.tsdefVideoTrackMod.VideoTrack.Dimensions
import typingsJapgolly.twilioVideo.twilioVideoStrings.disabled
import typingsJapgolly.twilioVideo.twilioVideoStrings.enabled
import typingsJapgolly.twilioVideo.twilioVideoStrings.started
import typingsJapgolly.twilioVideo.twilioVideoStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefVideoTrackMod {
  
  @JSImport("twilio-video/tsdef/VideoTrack", "VideoTrack")
  @js.native
  open class VideoTrack () extends Track {
    
    def addProcessor(processor: VideoProcessor): this.type = js.native
    
    def attach(): HTMLVideoElement = js.native
    def attach(element: String): HTMLVideoElement = js.native
    def attach(element: HTMLMediaElement): HTMLVideoElement = js.native
    
    def detach(): js.Array[HTMLVideoElement] = js.native
    def detach(element: String): js.Array[HTMLVideoElement] = js.native
    def detach(element: HTMLMediaElement): js.Array[HTMLVideoElement] = js.native
    
    var dimensions: Dimensions = js.native
    
    var isEnabled: Boolean = js.native
    
    var isStarted: Boolean = js.native
    
    @JSName("kind")
    var kind_VideoTrack: video = js.native
    
    var mediaStreamTrack: MediaStreamTrack = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_disabled(event: disabled, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_enabled(event: enabled, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_started(event: started, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    
    var processedTrack: MediaStreamTrack | Null = js.native
    
    var processor: VideoProcessor | Null = js.native
    
    def removeProcessor(processor: VideoProcessor): this.type = js.native
  }
  object VideoTrack {
    
    trait Dimensions extends StObject {
      
      var height: Double | Null
      
      var width: Double | Null
    }
    object Dimensions {
      
      inline def apply(): Dimensions = {
        val __obj = js.Dynamic.literal(height = null, width = null)
        __obj.asInstanceOf[Dimensions]
      }
      
      extension [Self <: Dimensions](x: Self) {
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightNull: Self = StObject.set(x, "height", null)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthNull: Self = StObject.set(x, "width", null)
      }
    }
  }
}
