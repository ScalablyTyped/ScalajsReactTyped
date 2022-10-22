package typingsJapgolly.tizenCommonWeb.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerDisplayModeInfo extends StObject {
  
  /**
    * Adds the listener for changes of a media controller display mode of a media controller server.
    *
    * @param listener Display mode change listener to add.
    *
    * @returns The identifier used to clear the watch subscription.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def addModeChangeListener(listener: MediaControllerDisplayModeChangeCallback): Double
  
  /**
    * Removes the listener, so stop receiving notifications about media controller server display mode changes.
    *
    * Calling this function has no effect if there is no listener with given id.
    *
    * @param watchId Watcher identifier.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  def removeModeChangeListener(watchId: Double): Unit
  
  /**
    * Allows to send change requests for display mode to media controller server.
    *
    * @remark See [addChangeRequestListener()](#MediaControllerDisplayMode::addChangeRequestListener) method to check how to receive
    * and respond to commands.
    *
    * @param type Type of display mode, which is requested by a media controller client.
    * @param replyCallback The method to invoke when server responded to change request.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type NotSupportedError, if related ability is not supported by the media controller server.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def sendRequest(`type`: MediaControllerDisplayModeType, replyCallback: MediaControllerSendCommandSuccessCallback): Unit
  
  /**
    * Type of display mode on the server represented by this object.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val `type`: MediaControllerDisplayModeType
}
object MediaControllerDisplayModeInfo {
  
  inline def apply(
    addModeChangeListener: MediaControllerDisplayModeChangeCallback => Double,
    removeModeChangeListener: Double => Callback,
    sendRequest: (MediaControllerDisplayModeType, MediaControllerSendCommandSuccessCallback) => Callback,
    `type`: MediaControllerDisplayModeType
  ): MediaControllerDisplayModeInfo = {
    val __obj = js.Dynamic.literal(addModeChangeListener = js.Any.fromFunction1(addModeChangeListener), removeModeChangeListener = js.Any.fromFunction1((t0: Double) => removeModeChangeListener(t0).runNow()), sendRequest = js.Any.fromFunction2((t0: MediaControllerDisplayModeType, t1: MediaControllerSendCommandSuccessCallback) => (sendRequest(t0, t1)).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaControllerDisplayModeInfo]
  }
  
  extension [Self <: MediaControllerDisplayModeInfo](x: Self) {
    
    inline def setAddModeChangeListener(value: MediaControllerDisplayModeChangeCallback => Double): Self = StObject.set(x, "addModeChangeListener", js.Any.fromFunction1(value))
    
    inline def setRemoveModeChangeListener(value: Double => Callback): Self = StObject.set(x, "removeModeChangeListener", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSendRequest(value: (MediaControllerDisplayModeType, MediaControllerSendCommandSuccessCallback) => Callback): Self = StObject.set(x, "sendRequest", js.Any.fromFunction2((t0: MediaControllerDisplayModeType, t1: MediaControllerSendCommandSuccessCallback) => (value(t0, t1)).runNow()))
    
    inline def setType(value: MediaControllerDisplayModeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
