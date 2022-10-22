package typingsJapgolly.reactAudioPlayer.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactAudioPlayer.mod.ReactAudioPlayerProps
import typingsJapgolly.reactAudioPlayer.mod.default
import typingsJapgolly.reactAudioPlayer.reactAudioPlayerStrings._empty
import typingsJapgolly.reactAudioPlayer.reactAudioPlayerStrings.auto
import typingsJapgolly.reactAudioPlayer.reactAudioPlayerStrings.metadata
import typingsJapgolly.reactAudioPlayer.reactAudioPlayerStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactAudioPlayer {
  
  inline def apply(volume: Double): Builder = {
    val __props = js.Dynamic.literal(volume = volume.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactAudioPlayerProps]))
  }
  
  @JSImport("react-audio-player", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def autoPlay(value: Boolean): this.type = set("autoPlay", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def controls(value: Boolean): this.type = set("controls", value.asInstanceOf[js.Any])
    
    inline def controlsList(value: String): this.type = set("controlsList", value.asInstanceOf[js.Any])
    
    inline def crossOrigin(value: String): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def listenInterval(value: Double): this.type = set("listenInterval", value.asInstanceOf[js.Any])
    
    inline def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    inline def muted(value: Boolean): this.type = set("muted", value.asInstanceOf[js.Any])
    
    inline def onAbort(value: /* e */ Event => Callback): this.type = set("onAbort", js.Any.fromFunction1((t0: /* e */ Event) => value(t0).runNow()))
    
    inline def onCanPlay(value: /* e */ Event => Callback): this.type = set("onCanPlay", js.Any.fromFunction1((t0: /* e */ Event) => value(t0).runNow()))
    
    inline def onCanPlayThrough(value: /* e */ Event => Callback): this.type = set("onCanPlayThrough", js.Any.fromFunction1((t0: /* e */ Event) => value(t0).runNow()))
    
    inline def onEnded(value: /* e */ Event => Callback): this.type = set("onEnded", js.Any.fromFunction1((t0: /* e */ Event) => value(t0).runNow()))
    
    inline def onError(value: /* e */ Event => Callback): this.type = set("onError", js.Any.fromFunction1((t0: /* e */ Event) => value(t0).runNow()))
    
    inline def onListen(value: /* time */ Double => Callback): this.type = set("onListen", js.Any.fromFunction1((t0: /* time */ Double) => value(t0).runNow()))
    
    inline def onLoadedMetadata(value: /* e */ Event => Callback): this.type = set("onLoadedMetadata", js.Any.fromFunction1((t0: /* e */ Event) => value(t0).runNow()))
    
    inline def onPause(value: /* e */ Event => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: /* e */ Event) => value(t0).runNow()))
    
    inline def onPlay(value: /* e */ Event => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: /* e */ Event) => value(t0).runNow()))
    
    inline def onSeeked(value: /* e */ Event => Callback): this.type = set("onSeeked", js.Any.fromFunction1((t0: /* e */ Event) => value(t0).runNow()))
    
    inline def onVolumeChanged(value: /* e */ Event => Callback): this.type = set("onVolumeChanged", js.Any.fromFunction1((t0: /* e */ Event) => value(t0).runNow()))
    
    inline def preload(value: _empty | none | metadata | auto): this.type = set("preload", value.asInstanceOf[js.Any])
    
    inline def src(value: String): this.type = set("src", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactAudioPlayerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
