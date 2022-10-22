package typingsJapgolly.playerframework.PlayerFramework

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.MediaSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginBase extends StObject {
  
  var currentMediaSource: MediaSource
  
  var isActive: Boolean
  
  var isEnabled: Boolean
  
  var isLoaded: Boolean
  
  def load(): Unit
  
  var mediaPlayer: MediaPlayer
  
  def unload(): Unit
  
  def update(mediaSource: MediaSource): Unit
}
object PluginBase {
  
  inline def apply(
    currentMediaSource: MediaSource,
    isActive: Boolean,
    isEnabled: Boolean,
    isLoaded: Boolean,
    load: Callback,
    mediaPlayer: MediaPlayer,
    unload: Callback,
    update: MediaSource => Callback
  ): PluginBase = {
    val __obj = js.Dynamic.literal(currentMediaSource = currentMediaSource.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], load = load.toJsFn, mediaPlayer = mediaPlayer.asInstanceOf[js.Any], unload = unload.toJsFn, update = js.Any.fromFunction1((t0: MediaSource) => update(t0).runNow()))
    __obj.asInstanceOf[PluginBase]
  }
  
  extension [Self <: PluginBase](x: Self) {
    
    inline def setCurrentMediaSource(value: MediaSource): Self = StObject.set(x, "currentMediaSource", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsLoaded(value: Boolean): Self = StObject.set(x, "isLoaded", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: Callback): Self = StObject.set(x, "load", value.toJsFn)
    
    inline def setMediaPlayer(value: MediaPlayer): Self = StObject.set(x, "mediaPlayer", value.asInstanceOf[js.Any])
    
    inline def setUnload(value: Callback): Self = StObject.set(x, "unload", value.toJsFn)
    
    inline def setUpdate(value: MediaSource => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: MediaSource) => value(t0).runNow()))
  }
}
