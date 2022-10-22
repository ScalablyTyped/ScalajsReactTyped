package typingsJapgolly.reactPlyr.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactPlyr.anon.Active
import typingsJapgolly.reactPlyr.anon.Controls
import typingsJapgolly.reactPlyr.anon.Default
import typingsJapgolly.reactPlyr.anon.Enabled
import typingsJapgolly.reactPlyr.anon.Focused
import typingsJapgolly.reactPlyr.anon.Key
import typingsJapgolly.reactPlyr.anon.Kind
import typingsJapgolly.reactPlyr.anon.Options
import typingsJapgolly.reactPlyr.anon.Size
import typingsJapgolly.reactPlyr.mod.OnVolumeChangeParam
import typingsJapgolly.reactPlyr.mod.Props
import typingsJapgolly.reactPlyr.mod.default
import typingsJapgolly.reactPlyr.reactPlyrStrings.audio
import typingsJapgolly.reactPlyr.reactPlyrStrings.video
import typingsJapgolly.reactPlyr.reactPlyrStrings.vimeo
import typingsJapgolly.reactPlyr.reactPlyrStrings.youtube
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactPlyr {
  
  @JSImport("react-plyr", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def autopause(value: Boolean): this.type = set("autopause", value.asInstanceOf[js.Any])
    
    inline def autoplay(value: Boolean): this.type = set("autoplay", value.asInstanceOf[js.Any])
    
    inline def blankVideo(value: String): this.type = set("blankVideo", value.asInstanceOf[js.Any])
    
    inline def captions(value: js.Array[Kind]): this.type = set("captions", value.asInstanceOf[js.Any])
    
    inline def captionsVarargs(value: Kind*): this.type = set("captions", js.Array(value*))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def clickToPlay(value: Boolean): this.type = set("clickToPlay", value.asInstanceOf[js.Any])
    
    inline def controls(value: js.Array[String]): this.type = set("controls", value.asInstanceOf[js.Any])
    
    inline def controlsVarargs(value: String*): this.type = set("controls", js.Array(value*))
    
    inline def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
    
    inline def disableContextMenu(value: Boolean): this.type = set("disableContextMenu", value.asInstanceOf[js.Any])
    
    inline def displayDuration(value: Boolean): this.type = set("displayDuration", value.asInstanceOf[js.Any])
    
    inline def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    inline def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    
    inline def fullscreen(value: Enabled): this.type = set("fullscreen", value.asInstanceOf[js.Any])
    
    inline def hideControls(value: Boolean): this.type = set("hideControls", value.asInstanceOf[js.Any])
    
    inline def iconPrefix(value: String): this.type = set("iconPrefix", value.asInstanceOf[js.Any])
    
    inline def iconUrl(value: String): this.type = set("iconUrl", value.asInstanceOf[js.Any])
    
    inline def invertTime(value: Boolean): this.type = set("invertTime", value.asInstanceOf[js.Any])
    
    inline def keyboard(value: Focused): this.type = set("keyboard", value.asInstanceOf[js.Any])
    
    inline def loadSprite(value: Boolean): this.type = set("loadSprite", value.asInstanceOf[js.Any])
    
    inline def loop(value: Active): this.type = set("loop", value.asInstanceOf[js.Any])
    
    inline def muted(value: Boolean): this.type = set("muted", value.asInstanceOf[js.Any])
    
    inline def onCaptionsDisabled(value: Callback): this.type = set("onCaptionsDisabled", value.toJsFn)
    
    inline def onCaptionsEnabled(value: Callback): this.type = set("onCaptionsEnabled", value.toJsFn)
    
    inline def onEnd(value: Callback): this.type = set("onEnd", value.toJsFn)
    
    inline def onEnterFullscreen(value: Callback): this.type = set("onEnterFullscreen", value.toJsFn)
    
    inline def onExitFullscreen(value: Callback): this.type = set("onExitFullscreen", value.toJsFn)
    
    inline def onLoadedData(value: Callback): this.type = set("onLoadedData", value.toJsFn)
    
    inline def onPause(value: Callback): this.type = set("onPause", value.toJsFn)
    
    inline def onPlay(value: Callback): this.type = set("onPlay", value.toJsFn)
    
    inline def onReady(value: /* player */ js.UndefOr[Any] => Callback): this.type = set("onReady", js.Any.fromFunction1((t0: /* player */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def onSeeked(value: /* time */ js.UndefOr[Double] => Callback): this.type = set("onSeeked", js.Any.fromFunction1((t0: /* time */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def onTimeUpdate(value: /* time */ js.UndefOr[Double] => Callback): this.type = set("onTimeUpdate", js.Any.fromFunction1((t0: /* time */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def onVolumeChange(value: /* params */ OnVolumeChangeParam => Callback): this.type = set("onVolumeChange", js.Any.fromFunction1((t0: /* params */ OnVolumeChangeParam) => value(t0).runNow()))
    
    inline def poster(value: String): this.type = set("poster", value.asInstanceOf[js.Any])
    
    inline def quality(value: Default): this.type = set("quality", value.asInstanceOf[js.Any])
    
    inline def ratio(value: String): this.type = set("ratio", value.asInstanceOf[js.Any])
    
    inline def resetOnEnd(value: Boolean): this.type = set("resetOnEnd", value.asInstanceOf[js.Any])
    
    inline def seekTime(value: Double): this.type = set("seekTime", value.asInstanceOf[js.Any])
    
    inline def settings(value: js.Array[String]): this.type = set("settings", value.asInstanceOf[js.Any])
    
    inline def settingsVarargs(value: String*): this.type = set("settings", js.Array(value*))
    
    inline def sources(value: js.Array[Size]): this.type = set("sources", value.asInstanceOf[js.Any])
    
    inline def sourcesVarargs(value: Size*): this.type = set("sources", js.Array(value*))
    
    inline def speed(value: Options): this.type = set("speed", value.asInstanceOf[js.Any])
    
    inline def storage(value: Key): this.type = set("storage", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def toggleInvert(value: Boolean): this.type = set("toggleInvert", value.asInstanceOf[js.Any])
    
    inline def tooltips(value: Controls): this.type = set("tooltips", value.asInstanceOf[js.Any])
    
    inline def `type`(value: youtube | vimeo | video | audio): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def url(value: String): this.type = set("url", value.asInstanceOf[js.Any])
    
    inline def videoId(value: String): this.type = set("videoId", value.asInstanceOf[js.Any])
    
    inline def volume(value: Double): this.type = set("volume", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactPlyr.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
