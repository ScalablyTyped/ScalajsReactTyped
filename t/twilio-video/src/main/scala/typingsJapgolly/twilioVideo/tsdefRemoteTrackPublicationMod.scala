package typingsJapgolly.twilioVideo

import typingsJapgolly.twilioVideo.tsdefTrackMod.Track.Priority
import typingsJapgolly.twilioVideo.tsdefTrackPublicationMod.TrackPublication
import typingsJapgolly.twilioVideo.tsdefTwilioErrorMod.TwilioError
import typingsJapgolly.twilioVideo.tsdefTypesMod.RemoteTrack
import typingsJapgolly.twilioVideo.twilioVideoStrings.publishPriorityChanged
import typingsJapgolly.twilioVideo.twilioVideoStrings.subscribed
import typingsJapgolly.twilioVideo.twilioVideoStrings.subscriptionFailed
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackSwitchedOff
import typingsJapgolly.twilioVideo.twilioVideoStrings.trackSwitchedOn
import typingsJapgolly.twilioVideo.twilioVideoStrings.unsubscribed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefRemoteTrackPublicationMod {
  
  @JSImport("twilio-video/tsdef/RemoteTrackPublication", "RemoteTrackPublication")
  @js.native
  open class RemoteTrackPublication () extends TrackPublication {
    
    var isSubscribed: Boolean = js.native
    
    var isTrackEnabled: Boolean = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_publishPriorityChanged(event: publishPriorityChanged, listener: js.Function1[/* priority */ Priority, Unit]): this.type = js.native
    @JSName("on")
    def on_subscribed(event: subscribed, listener: js.Function1[/* track */ RemoteTrack, Unit]): this.type = js.native
    @JSName("on")
    def on_subscriptionFailed(event: subscriptionFailed, listener: js.Function1[/* error */ TwilioError, Unit]): this.type = js.native
    @JSName("on")
    def on_trackSwitchedOff(event: trackSwitchedOff, listener: js.Function1[/* track */ RemoteTrack, Unit]): this.type = js.native
    @JSName("on")
    def on_trackSwitchedOn(event: trackSwitchedOn, listener: js.Function1[/* track */ RemoteTrack, Unit]): this.type = js.native
    @JSName("on")
    def on_unsubscribed(event: unsubscribed, listener: js.Function1[/* track */ RemoteTrack, Unit]): this.type = js.native
    
    var publishPriority: Priority = js.native
    
    var track: RemoteTrack | Null = js.native
  }
}
