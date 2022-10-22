package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLVideoElement
import org.scalajs.dom.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.anon.Duration
import typingsJapgolly.gestalt.anon.Event
import typingsJapgolly.gestalt.anon.Fullscreen
import typingsJapgolly.gestalt.anon.Loaded
import typingsJapgolly.gestalt.anon.Src
import typingsJapgolly.gestalt.anon.Time
import typingsJapgolly.gestalt.anon.Volume
import typingsJapgolly.gestalt.gestaltStrings.`scale-down`
import typingsJapgolly.gestalt.gestaltStrings.`use-credentials`
import typingsJapgolly.gestalt.gestaltStrings.anonymous
import typingsJapgolly.gestalt.gestaltStrings.auto
import typingsJapgolly.gestalt.gestaltStrings.black
import typingsJapgolly.gestalt.gestaltStrings.contain
import typingsJapgolly.gestalt.gestaltStrings.cover
import typingsJapgolly.gestalt.gestaltStrings.fill
import typingsJapgolly.gestalt.gestaltStrings.metadata
import typingsJapgolly.gestalt.gestaltStrings.none
import typingsJapgolly.gestalt.gestaltStrings.transparent
import typingsJapgolly.gestalt.mod.VideoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Video {
  
  inline def apply(aspectRatio: Double, captions: String, src: String | js.Array[Src]): Builder = {
    val __props = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], captions = captions.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[VideoProps]))
  }
  
  @JSImport("gestalt", "Video")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def accessibilityMaximizeLabel(value: String): this.type = set("accessibilityMaximizeLabel", value.asInstanceOf[js.Any])
    
    inline def accessibilityMinimizeLabel(value: String): this.type = set("accessibilityMinimizeLabel", value.asInstanceOf[js.Any])
    
    inline def accessibilityMuteLabel(value: String): this.type = set("accessibilityMuteLabel", value.asInstanceOf[js.Any])
    
    inline def accessibilityPauseLabel(value: String): this.type = set("accessibilityPauseLabel", value.asInstanceOf[js.Any])
    
    inline def accessibilityPlayLabel(value: String): this.type = set("accessibilityPlayLabel", value.asInstanceOf[js.Any])
    
    inline def accessibilityUnmuteLabel(value: String): this.type = set("accessibilityUnmuteLabel", value.asInstanceOf[js.Any])
    
    inline def backgroundColor(value: black | transparent): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def children(value: Node): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def controls(value: Boolean): this.type = set("controls", value.asInstanceOf[js.Any])
    
    inline def crossOrigin(value: anonymous | `use-credentials`): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
    
    inline def disableRemotePlayback(value: Boolean): this.type = set("disableRemotePlayback", value.asInstanceOf[js.Any])
    
    inline def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    inline def objectFit(value: fill | contain | cover | none | `scale-down`): this.type = set("objectFit", value.asInstanceOf[js.Any])
    
    inline def onDurationChange(value: /* args */ Duration => Callback): this.type = set("onDurationChange", js.Any.fromFunction1((t0: /* args */ Duration) => value(t0).runNow()))
    
    inline def onEnded(value: /* arg */ js.Object & Event[ReactEventFrom[HTMLVideoElement]] => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: /* arg */ js.Object & Event[ReactEventFrom[HTMLVideoElement]]) => value(t0).runNow()))
    
    inline def onError(value: /* arg */ js.Object & Event[ReactEventFrom[HTMLVideoElement]] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: /* arg */ js.Object & Event[ReactEventFrom[HTMLVideoElement]]) => value(t0).runNow()))
    
    inline def onFullscreenChange(value: /* arg */ Fullscreen & Event[ReactEventFrom[HTMLVideoElement]] => Callback): this.type = set("onFullscreenChange", js.Any.fromFunction1((t0: /* arg */ Fullscreen & Event[ReactEventFrom[HTMLVideoElement]]) => value(t0).runNow()))
    
    inline def onLoadStart(value: /* arg */ js.Object & Event[ReactEventFrom[HTMLVideoElement]] => Callback): this.type = set("onLoadStart", js.Any.fromFunction1((t0: /* arg */ js.Object & Event[ReactEventFrom[HTMLVideoElement]]) => value(t0).runNow()))
    
    inline def onLoadedChange(value: /* arg */ Loaded & Event[ReactEventFrom[HTMLVideoElement]] => Callback): this.type = set("onLoadedChange", js.Any.fromFunction1((t0: /* arg */ Loaded & Event[ReactEventFrom[HTMLVideoElement]]) => value(t0).runNow()))
    
    inline def onPause(value: /* arg */ js.Object & Event[ReactEventFrom[HTMLDivElement]] => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: /* arg */ js.Object & Event[ReactEventFrom[HTMLDivElement]]) => value(t0).runNow()))
    
    inline def onPlay(value: /* arg */ js.Object & Event[ReactEventFrom[HTMLDivElement]] => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: /* arg */ js.Object & Event[ReactEventFrom[HTMLDivElement]]) => value(t0).runNow()))
    
    inline def onPlayheadDown(value: /* arg */ js.Object & Event[ReactMouseEventFrom[HTMLDivElement]] => Callback): this.type = set("onPlayheadDown", js.Any.fromFunction1((t0: /* arg */ js.Object & Event[ReactMouseEventFrom[HTMLDivElement]]) => value(t0).runNow()))
    
    inline def onPlayheadUp(value: /* arg */ js.Object & Event[ReactMouseEventFrom[HTMLDivElement]] => Callback): this.type = set("onPlayheadUp", js.Any.fromFunction1((t0: /* arg */ js.Object & Event[ReactMouseEventFrom[HTMLDivElement]]) => value(t0).runNow()))
    
    inline def onPlaying(value: /* arg */ js.Object & Event[ReactEventFrom[HTMLVideoElement]] => Callback): this.type = set("onPlaying", js.Any.fromFunction1((t0: /* arg */ js.Object & Event[ReactEventFrom[HTMLVideoElement]]) => value(t0).runNow()))
    
    inline def onReady(value: /* arg */ js.Object & Event[ReactEventFrom[HTMLVideoElement]] => Callback): this.type = set("onReady", js.Any.fromFunction1((t0: /* arg */ js.Object & Event[ReactEventFrom[HTMLVideoElement]]) => value(t0).runNow()))
    
    inline def onSeek(value: /* arg */ js.Object & Event[ReactEventFrom[HTMLVideoElement]] => Callback): this.type = set("onSeek", js.Any.fromFunction1((t0: /* arg */ js.Object & Event[ReactEventFrom[HTMLVideoElement]]) => value(t0).runNow()))
    
    inline def onSeeking(value: /* arg */ js.Object & Event[ReactEventFrom[HTMLVideoElement]] => Callback): this.type = set("onSeeking", js.Any.fromFunction1((t0: /* arg */ js.Object & Event[ReactEventFrom[HTMLVideoElement]]) => value(t0).runNow()))
    
    inline def onStalled(value: /* arg */ js.Object & Event[ReactEventFrom[HTMLVideoElement]] => Callback): this.type = set("onStalled", js.Any.fromFunction1((t0: /* arg */ js.Object & Event[ReactEventFrom[HTMLVideoElement]]) => value(t0).runNow()))
    
    inline def onTimeChange(value: /* arg */ Time & Event[ReactEventFrom[HTMLVideoElement]] => Callback): this.type = set("onTimeChange", js.Any.fromFunction1((t0: /* arg */ Time & Event[ReactEventFrom[HTMLVideoElement]]) => value(t0).runNow()))
    
    inline def onVolumeChange(value: /* arg */ Volume & Event[ReactEventFrom[HTMLDivElement]] => Callback): this.type = set("onVolumeChange", js.Any.fromFunction1((t0: /* arg */ Volume & Event[ReactEventFrom[HTMLDivElement]]) => value(t0).runNow()))
    
    inline def onWaiting(value: /* arg */ js.Object & Event[ReactEventFrom[HTMLVideoElement]] => Callback): this.type = set("onWaiting", js.Any.fromFunction1((t0: /* arg */ js.Object & Event[ReactEventFrom[HTMLVideoElement]]) => value(t0).runNow()))
    
    inline def playbackRate(value: Double): this.type = set("playbackRate", value.asInstanceOf[js.Any])
    
    inline def playing(value: Boolean): this.type = set("playing", value.asInstanceOf[js.Any])
    
    inline def playsInline(value: Boolean): this.type = set("playsInline", value.asInstanceOf[js.Any])
    
    inline def poster(value: String): this.type = set("poster", value.asInstanceOf[js.Any])
    
    inline def preload(value: auto | metadata | none): this.type = set("preload", value.asInstanceOf[js.Any])
    
    inline def startTime(value: Double): this.type = set("startTime", value.asInstanceOf[js.Any])
    
    inline def volume(value: Double): this.type = set("volume", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: VideoProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
