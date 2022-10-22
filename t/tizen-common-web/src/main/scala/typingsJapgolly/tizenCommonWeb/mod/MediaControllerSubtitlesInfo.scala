package typingsJapgolly.tizenCommonWeb.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerSubtitlesInfo extends StObject {
  
  /**
    * Adds the listener for changes of a media controller subtitles mode of a media controller server.
    *
    * @param listener Subtitles mode change listener to add.
    *
    * @returns The identifier used to clear the watch subscription.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def addModeChangeListener(listener: MediaControllerEnabledChangeCallback): Double
  
  /**
    * State of subtitles mode on the server represented by this object.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val enabled: Boolean
  
  /**
    * Removes the listener, so stop receiving notifications about media controller server subtitles mode changes.
    *
    * Calling this function has no effect if there is no listener with given id.
    *
    * @param watchId Watcher identifier.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  def removeModeChangeListener(watchId: Double): Unit
  
  /**
    * Allows to send change requests for subtitles mode to media controller server.
    *
    * @remark See [addChangeRequestListener()](#MediaControllerSubtitles::addChangeRequestListener) method to check how to receive
    * and respond to commands.
    *
    * @param enabled State which is requested by a media controller client.
    * @param replyCallback The method to invoke when server responded to change request.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type NotSupportedError, if related ability is not supported by the media controller server.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def sendRequest(enabled: Boolean, replyCallback: MediaControllerSendCommandSuccessCallback): Unit
}
object MediaControllerSubtitlesInfo {
  
  inline def apply(
    addModeChangeListener: MediaControllerEnabledChangeCallback => Double,
    enabled: Boolean,
    removeModeChangeListener: Double => Callback,
    sendRequest: (Boolean, MediaControllerSendCommandSuccessCallback) => Callback
  ): MediaControllerSubtitlesInfo = {
    val __obj = js.Dynamic.literal(addModeChangeListener = js.Any.fromFunction1(addModeChangeListener), enabled = enabled.asInstanceOf[js.Any], removeModeChangeListener = js.Any.fromFunction1((t0: Double) => removeModeChangeListener(t0).runNow()), sendRequest = js.Any.fromFunction2((t0: Boolean, t1: MediaControllerSendCommandSuccessCallback) => (sendRequest(t0, t1)).runNow()))
    __obj.asInstanceOf[MediaControllerSubtitlesInfo]
  }
  
  extension [Self <: MediaControllerSubtitlesInfo](x: Self) {
    
    inline def setAddModeChangeListener(value: MediaControllerEnabledChangeCallback => Double): Self = StObject.set(x, "addModeChangeListener", js.Any.fromFunction1(value))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setRemoveModeChangeListener(value: Double => Callback): Self = StObject.set(x, "removeModeChangeListener", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSendRequest(value: (Boolean, MediaControllerSendCommandSuccessCallback) => Callback): Self = StObject.set(x, "sendRequest", js.Any.fromFunction2((t0: Boolean, t1: MediaControllerSendCommandSuccessCallback) => (value(t0, t1)).runNow()))
  }
}
