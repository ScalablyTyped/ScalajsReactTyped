package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.wixStyleReact.distTypesAudioPlayerMod.AudioPlayerImperativeActions
import typingsJapgolly.wixStyleReact.distTypesAudioPlayerMod.AudioPlayerProps
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.auto
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.metadata
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AudioPlayer {
  
  inline def apply(src: String): Builder = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AudioPlayerProps & RefAttributes[AudioPlayerImperativeActions]]))
  }
  
  @JSImport("wix-style-react", "AudioPlayer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[AudioPlayerImperativeActions] {
    
    inline def autoplay(value: Boolean): this.type = set("autoplay", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
    
    inline def onEnd(value: Callback): this.type = set("onEnd", value.toJsFn)
    
    inline def onLoad(value: Callback): this.type = set("onLoad", value.toJsFn)
    
    inline def onLoadError(value: /* errorMsg */ String => Callback): this.type = set("onLoadError", js.Any.fromFunction1((t0: /* errorMsg */ String) => value(t0).runNow()))
    
    inline def onPause(value: Callback): this.type = set("onPause", value.toJsFn)
    
    inline def onPlay(value: Callback): this.type = set("onPlay", value.toJsFn)
    
    inline def onSeek(value: Callback): this.type = set("onSeek", value.toJsFn)
    
    inline def preload(value: metadata | auto | none_): this.type = set("preload", value.asInstanceOf[js.Any])
    
    inline def webAudioAPI(value: Boolean): this.type = set("webAudioAPI", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AudioPlayerProps & RefAttributes[AudioPlayerImperativeActions]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
