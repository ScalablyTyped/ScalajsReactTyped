package typingsJapgolly.tizenCommonWeb.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerChangeRequestPlaybackInfoCallback extends StObject {
  
  /**
    * Called when client request change of playback item.
    *
    * @since 5.5
    *
    * @param playlistName Name of playlist.
    * @param index Index of the item to be changed.
    * @param state Playback state.
    * @param position Playback position.
    * @param clientName Id of client application, which sent a command.
    */
  def onplaybackitemrequest(
    playlistName: String,
    index: String,
    state: MediaControllerPlaybackState,
    position: Double,
    clientName: ApplicationId
  ): Unit
  
  /**
    * Called when client requested playback position changes.
    *
    * @param position Requested playback position.
    * @param clientName Id of client application, which sent a command.
    *
    * @remark Parameter _clientName_ is passed since Tizen 5.5.
    */
  def onplaybackpositionrequest(position: Double, clientName: ApplicationId): Unit
  
  /**
    * Called when client requested playback state changes.
    *
    * @param state Requested playback state.
    * @param clientName Id of client application, which sent a command.
    *
    * @remark Parameter _clientName_ is passed since Tizen 5.5.
    */
  def onplaybackstaterequest(state: MediaControllerPlaybackState, clientName: ApplicationId): Unit
  
  /**
    * Called when client requested repeat mode changes.
    *
    * @note _deprecated_ 5.5 Deprecated since 5.5. Instead, use [onrepeatstaterequest](#MediaControllerChangeRequestPlaybackInfoCallback::onrepeatstaterequest).
    *
    * @remark The [onrepeatmoderequest](#MediaControllerChangeRequestPlaybackInfoCallback::onrepeatmoderequest) callback
    * will not be invoked, if the [repeatState](#MediaControllerPlaybackInfo::repeatState) is requested to be changed to REPEAT\_ONE.
    *
    * @param mode Requested repeat mode.
    * @param clientName Client application id which sent command.
    *
    * @remark Parameter _clientName_ is passed since Tizen 5.5.
    */
  def onrepeatmoderequest(mode: Boolean, clientName: ApplicationId): Unit
  
  /**
    * Called when client requested change of repeat state.
    *
    * @since 5.5
    *
    * @param state Requested repeat state.
    * @param clientName Id of client application, which sent a command.
    *
    * It is guaranteed that the [onrepeatstaterequest](#MediaControllerChangeRequestPlaybackInfoCallback::onrepeatstaterequest) callback
    * will be invoked after the [onrepeatmoderequest](#MediaControllerChangeRequestPlaybackInfoCallback::onrepeatmoderequest).
    */
  def onrepeatstaterequest(state: MediaControllerRepeatState, clientName: ApplicationId): Unit
  
  /**
    * Called when client requested shuffle mode changes.
    *
    * @param mode Requested shuffle mode.
    * @param clientName Id of client application, which sent a command.
    *
    * @remark Parameter _clientName_ is passed since Tizen 5.5.
    */
  def onshufflemoderequest(mode: Boolean, clientName: ApplicationId): Unit
}
object MediaControllerChangeRequestPlaybackInfoCallback {
  
  inline def apply(
    onplaybackitemrequest: (String, String, MediaControllerPlaybackState, Double, ApplicationId) => Callback,
    onplaybackpositionrequest: (Double, ApplicationId) => Callback,
    onplaybackstaterequest: (MediaControllerPlaybackState, ApplicationId) => Callback,
    onrepeatmoderequest: (Boolean, ApplicationId) => Callback,
    onrepeatstaterequest: (MediaControllerRepeatState, ApplicationId) => Callback,
    onshufflemoderequest: (Boolean, ApplicationId) => Callback
  ): MediaControllerChangeRequestPlaybackInfoCallback = {
    val __obj = js.Dynamic.literal(onplaybackitemrequest = js.Any.fromFunction5((t0: String, t1: String, t2: MediaControllerPlaybackState, t3: Double, t4: ApplicationId) => (onplaybackitemrequest(t0, t1, t2, t3, t4)).runNow()), onplaybackpositionrequest = js.Any.fromFunction2((t0: Double, t1: ApplicationId) => (onplaybackpositionrequest(t0, t1)).runNow()), onplaybackstaterequest = js.Any.fromFunction2((t0: MediaControllerPlaybackState, t1: ApplicationId) => (onplaybackstaterequest(t0, t1)).runNow()), onrepeatmoderequest = js.Any.fromFunction2((t0: Boolean, t1: ApplicationId) => (onrepeatmoderequest(t0, t1)).runNow()), onrepeatstaterequest = js.Any.fromFunction2((t0: MediaControllerRepeatState, t1: ApplicationId) => (onrepeatstaterequest(t0, t1)).runNow()), onshufflemoderequest = js.Any.fromFunction2((t0: Boolean, t1: ApplicationId) => (onshufflemoderequest(t0, t1)).runNow()))
    __obj.asInstanceOf[MediaControllerChangeRequestPlaybackInfoCallback]
  }
  
  extension [Self <: MediaControllerChangeRequestPlaybackInfoCallback](x: Self) {
    
    inline def setOnplaybackitemrequest(value: (String, String, MediaControllerPlaybackState, Double, ApplicationId) => Callback): Self = StObject.set(x, "onplaybackitemrequest", js.Any.fromFunction5((t0: String, t1: String, t2: MediaControllerPlaybackState, t3: Double, t4: ApplicationId) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setOnplaybackpositionrequest(value: (Double, ApplicationId) => Callback): Self = StObject.set(x, "onplaybackpositionrequest", js.Any.fromFunction2((t0: Double, t1: ApplicationId) => (value(t0, t1)).runNow()))
    
    inline def setOnplaybackstaterequest(value: (MediaControllerPlaybackState, ApplicationId) => Callback): Self = StObject.set(x, "onplaybackstaterequest", js.Any.fromFunction2((t0: MediaControllerPlaybackState, t1: ApplicationId) => (value(t0, t1)).runNow()))
    
    inline def setOnrepeatmoderequest(value: (Boolean, ApplicationId) => Callback): Self = StObject.set(x, "onrepeatmoderequest", js.Any.fromFunction2((t0: Boolean, t1: ApplicationId) => (value(t0, t1)).runNow()))
    
    inline def setOnrepeatstaterequest(value: (MediaControllerRepeatState, ApplicationId) => Callback): Self = StObject.set(x, "onrepeatstaterequest", js.Any.fromFunction2((t0: MediaControllerRepeatState, t1: ApplicationId) => (value(t0, t1)).runNow()))
    
    inline def setOnshufflemoderequest(value: (Boolean, ApplicationId) => Callback): Self = StObject.set(x, "onshufflemoderequest", js.Any.fromFunction2((t0: Boolean, t1: ApplicationId) => (value(t0, t1)).runNow()))
  }
}
