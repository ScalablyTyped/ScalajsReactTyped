package typingsJapgolly.reactSound.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactSound.mod.ReactSoundProps
import typingsJapgolly.reactSound.mod.default
import typingsJapgolly.reactSound.reactSoundStrings.PAUSED
import typingsJapgolly.reactSound.reactSoundStrings.PLAYING
import typingsJapgolly.reactSound.reactSoundStrings.STOPPED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSound {
  
  inline def apply(playStatus: PLAYING | STOPPED | PAUSED, url: String): Builder = {
    val __props = js.Dynamic.literal(playStatus = playStatus.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactSoundProps]))
  }
  
  @JSImport("react-sound", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def autoLoad(value: Boolean): this.type = set("autoLoad", value.asInstanceOf[js.Any])
    
    inline def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    inline def onBufferChange(value: Callback): this.type = set("onBufferChange", value.toJsFn)
    
    inline def onError(value: Callback): this.type = set("onError", value.toJsFn)
    
    inline def onFinishedPlaying(value: Callback): this.type = set("onFinishedPlaying", value.toJsFn)
    
    inline def onLoad(value: Callback): this.type = set("onLoad", value.toJsFn)
    
    inline def onLoading(value: Callback): this.type = set("onLoading", value.toJsFn)
    
    inline def onPause(value: Callback): this.type = set("onPause", value.toJsFn)
    
    inline def onPlaying(value: Callback): this.type = set("onPlaying", value.toJsFn)
    
    inline def onResume(value: Callback): this.type = set("onResume", value.toJsFn)
    
    inline def onStop(value: Callback): this.type = set("onStop", value.toJsFn)
    
    inline def playFromPosition(value: Double): this.type = set("playFromPosition", value.asInstanceOf[js.Any])
    
    inline def playbackRate(value: Double): this.type = set("playbackRate", value.asInstanceOf[js.Any])
    
    inline def position(value: Double): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def volume(value: Double): this.type = set("volume", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactSoundProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
