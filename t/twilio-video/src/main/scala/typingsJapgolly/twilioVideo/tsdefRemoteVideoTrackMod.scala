package typingsJapgolly.twilioVideo

import typingsJapgolly.twilioVideo.tsdefTrackMod.Track.Priority
import typingsJapgolly.twilioVideo.tsdefTrackMod.Track.SID
import typingsJapgolly.twilioVideo.tsdefTypesMod.RemoteTrack
import typingsJapgolly.twilioVideo.tsdefVideoTrackMod.VideoTrack
import typingsJapgolly.twilioVideo.tsdefVideoTrackMod.VideoTrack.Dimensions
import typingsJapgolly.twilioVideo.twilioVideoStrings.dimensionsChanged
import typingsJapgolly.twilioVideo.twilioVideoStrings.stopped
import typingsJapgolly.twilioVideo.twilioVideoStrings.switchedOff
import typingsJapgolly.twilioVideo.twilioVideoStrings.switchedOn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefRemoteVideoTrackMod {
  
  @JSImport("twilio-video/tsdef/RemoteVideoTrack", "RemoteVideoTrack")
  @js.native
  open class RemoteVideoTrack ()
    extends VideoTrack
       with RemoteTrack {
    
    var isSwitchedOff: Boolean = js.native
    
    @JSName("on")
    def on_dimensionsChanged(event: dimensionsChanged, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_stopped(event: stopped, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_switchedOff(event: switchedOff, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    @JSName("on")
    def on_switchedOn(event: switchedOn, listener: js.Function1[/* track */ this.type, Unit]): this.type = js.native
    
    var priority: Priority | Null = js.native
    
    def setContentPreferences(content: VideoContentPreferences): this.type = js.native
    
    def setPriority(): this.type = js.native
    def setPriority(priority: Priority): this.type = js.native
    
    var sid: SID = js.native
    
    def switchOff(): this.type = js.native
    
    def switchOn(): this.type = js.native
  }
  
  trait VideoContentPreferences extends StObject {
    
    var renderDimensions: js.UndefOr[Dimensions] = js.undefined
  }
  object VideoContentPreferences {
    
    inline def apply(): VideoContentPreferences = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VideoContentPreferences]
    }
    
    extension [Self <: VideoContentPreferences](x: Self) {
      
      inline def setRenderDimensions(value: Dimensions): Self = StObject.set(x, "renderDimensions", value.asInstanceOf[js.Any])
      
      inline def setRenderDimensionsUndefined: Self = StObject.set(x, "renderDimensions", js.undefined)
    }
  }
}
