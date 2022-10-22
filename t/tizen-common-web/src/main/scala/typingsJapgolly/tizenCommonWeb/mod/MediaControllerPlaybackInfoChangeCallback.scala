package typingsJapgolly.tizenCommonWeb.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerPlaybackInfoChangeCallback extends StObject {
  
  /**
    * Called when playback metadata is changed.
    *
    * @param metadata Current playback metadata.
    */
  def onmetadatachanged(metadata: MediaControllerMetadata): Unit
  
  /**
    * Called when playback state or position is changed.
    *
    * @param state Current playback state.
    * @param position Current playback position.
    */
  def onplaybackchanged(state: MediaControllerPlaybackState, position: Double): Unit
  
  /**
    * Called when repeat mode is changed.
    *
    * @note _deprecated_ 5.5 Deprecated since 5.5. Instead, use [onrepeatstatechanged](#MediaControllerPlaybackInfoChangeCallback::onrepeatstatechanged).
    *
    * @param mode Current repeat mode.
    *
    * @remark The [onrepeatmodechanged](#MediaControllerPlaybackInfoChangeCallback::onrepeatmodechanged) callback
    * will not be invoked, if the [repeatState](#MediaControllerPlaybackInfo::repeatState) is changed to REPEAT\_ONE.
    */
  def onrepeatmodechanged(mode: Boolean): Unit
  
  /**
    * Called when repeat state is changed.
    *
    * It is guaranteed that the [onrepeatstatechanged](#MediaControllerPlaybackInfoChangeCallback::onrepeatstatechanged) callback
    * will be invoked after the [onrepeatmodechanged](#MediaControllerPlaybackInfoChangeCallback::onrepeatmodechanged).
    *
    * @since 5.5
    *
    * @param state Current repeat state.
    */
  def onrepeatstatechanged(state: MediaControllerRepeatState): Unit
  
  /**
    * Called when shuffle mode is changed.
    *
    * @param mode Current shuffle mode.
    */
  def onshufflemodechanged(mode: Boolean): Unit
}
object MediaControllerPlaybackInfoChangeCallback {
  
  inline def apply(
    onmetadatachanged: MediaControllerMetadata => Callback,
    onplaybackchanged: (MediaControllerPlaybackState, Double) => Callback,
    onrepeatmodechanged: Boolean => Callback,
    onrepeatstatechanged: MediaControllerRepeatState => Callback,
    onshufflemodechanged: Boolean => Callback
  ): MediaControllerPlaybackInfoChangeCallback = {
    val __obj = js.Dynamic.literal(onmetadatachanged = js.Any.fromFunction1((t0: MediaControllerMetadata) => onmetadatachanged(t0).runNow()), onplaybackchanged = js.Any.fromFunction2((t0: MediaControllerPlaybackState, t1: Double) => (onplaybackchanged(t0, t1)).runNow()), onrepeatmodechanged = js.Any.fromFunction1((t0: Boolean) => onrepeatmodechanged(t0).runNow()), onrepeatstatechanged = js.Any.fromFunction1((t0: MediaControllerRepeatState) => onrepeatstatechanged(t0).runNow()), onshufflemodechanged = js.Any.fromFunction1((t0: Boolean) => onshufflemodechanged(t0).runNow()))
    __obj.asInstanceOf[MediaControllerPlaybackInfoChangeCallback]
  }
  
  extension [Self <: MediaControllerPlaybackInfoChangeCallback](x: Self) {
    
    inline def setOnmetadatachanged(value: MediaControllerMetadata => Callback): Self = StObject.set(x, "onmetadatachanged", js.Any.fromFunction1((t0: MediaControllerMetadata) => value(t0).runNow()))
    
    inline def setOnplaybackchanged(value: (MediaControllerPlaybackState, Double) => Callback): Self = StObject.set(x, "onplaybackchanged", js.Any.fromFunction2((t0: MediaControllerPlaybackState, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setOnrepeatmodechanged(value: Boolean => Callback): Self = StObject.set(x, "onrepeatmodechanged", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setOnrepeatstatechanged(value: MediaControllerRepeatState => Callback): Self = StObject.set(x, "onrepeatstatechanged", js.Any.fromFunction1((t0: MediaControllerRepeatState) => value(t0).runNow()))
    
    inline def setOnshufflemodechanged(value: Boolean => Callback): Self = StObject.set(x, "onshufflemodechanged", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
