package typingsJapgolly.reactHowler.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.howler.anon.Headers
import typingsJapgolly.reactHowler.mod.PropTypes
import typingsJapgolly.reactHowler.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactHowler {
  
  inline def apply(src: String | js.Array[String]): Builder = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropTypes]))
  }
  
  @JSImport("react-howler", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def format(value: String | js.Array[String]): this.type = set("format", value.asInstanceOf[js.Any])
    
    inline def formatVarargs(value: String*): this.type = set("format", js.Array(value*))
    
    inline def html5(value: Boolean): this.type = set("html5", value.asInstanceOf[js.Any])
    
    inline def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    inline def mute(value: Boolean): this.type = set("mute", value.asInstanceOf[js.Any])
    
    inline def onEnd(value: /* soundId */ Double => Callback): this.type = set("onEnd", js.Any.fromFunction1((t0: /* soundId */ Double) => value(t0).runNow()))
    
    inline def onLoad(value: /* soundId */ Double => Callback): this.type = set("onLoad", js.Any.fromFunction1((t0: /* soundId */ Double) => value(t0).runNow()))
    
    inline def onLoadError(value: (/* soundId */ Double, /* error */ Any) => Callback): this.type = set("onLoadError", js.Any.fromFunction2((t0: /* soundId */ Double, t1: /* error */ Any) => (value(t0, t1)).runNow()))
    
    inline def onPause(value: /* soundId */ Double => Callback): this.type = set("onPause", js.Any.fromFunction1((t0: /* soundId */ Double) => value(t0).runNow()))
    
    inline def onPlay(value: /* soundId */ Double => Callback): this.type = set("onPlay", js.Any.fromFunction1((t0: /* soundId */ Double) => value(t0).runNow()))
    
    inline def onPlayError(value: (/* soundId */ Double, /* error */ Any) => Callback): this.type = set("onPlayError", js.Any.fromFunction2((t0: /* soundId */ Double, t1: /* error */ Any) => (value(t0, t1)).runNow()))
    
    inline def onSeek(value: /* soundId */ Double => Callback): this.type = set("onSeek", js.Any.fromFunction1((t0: /* soundId */ Double) => value(t0).runNow()))
    
    inline def onStop(value: /* soundId */ Double => Callback): this.type = set("onStop", js.Any.fromFunction1((t0: /* soundId */ Double) => value(t0).runNow()))
    
    inline def onVolume(value: /* soundId */ Double => Callback): this.type = set("onVolume", js.Any.fromFunction1((t0: /* soundId */ Double) => value(t0).runNow()))
    
    inline def playing(value: Boolean): this.type = set("playing", value.asInstanceOf[js.Any])
    
    inline def preload(value: Boolean): this.type = set("preload", value.asInstanceOf[js.Any])
    
    inline def rate(value: Double): this.type = set("rate", value.asInstanceOf[js.Any])
    
    inline def volume(value: Double): this.type = set("volume", value.asInstanceOf[js.Any])
    
    inline def xhr(value: Headers): this.type = set("xhr", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropTypes): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
