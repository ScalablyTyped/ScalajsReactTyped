package typingsJapgolly.tizenCommonWeb.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerDisplayRotationInfo extends StObject {
  
  /**
    * Adds the listener for changes of a display rotation of a media controller server.
    *
    * @param listener Display rotation change listener to add.
    *
    * @returns The identifier used to clear the watch subscription.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def addDisplayRotationChangeListener(listener: MediaControllerDisplayRotationChangeCallback): Double
  
  /**
    * State of display rotation on the server represented by this object.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  val displayRotation: MediaControllerDisplayRotationType
  
  /**
    * Removes the listener, so stop receiving notifications about media controller server display rotation changes.
    *
    * Calling this function has no effect if there is no listener with given id.
    *
    * @param watchId Watcher identifier.
    *
    * @throw WebAPIException with error type UnknownError, if any error occurs.
    */
  def removeDisplayRotationChangeListener(watchId: Double): Unit
  
  /**
    * Allows to send change requests for display rotation change to a media controller server.
    *
    * @remark See [addChangeRequestListener()](#MediaControllerDisplayRotation::addChangeRequestListener) method to check how to receive
    * and respond to commands.
    *
    * @param displayRotation Display rotation, which is requested by client.
    * @param replyCallback The method to invoke when server responded to change request.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type NotSupportedError, if related ability is not supported by server.
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def sendRequest(
    displayRotation: MediaControllerDisplayRotationType,
    replyCallback: MediaControllerSendCommandSuccessCallback
  ): Unit
}
object MediaControllerDisplayRotationInfo {
  
  inline def apply(
    addDisplayRotationChangeListener: MediaControllerDisplayRotationChangeCallback => Double,
    displayRotation: MediaControllerDisplayRotationType,
    removeDisplayRotationChangeListener: Double => Callback,
    sendRequest: (MediaControllerDisplayRotationType, MediaControllerSendCommandSuccessCallback) => Callback
  ): MediaControllerDisplayRotationInfo = {
    val __obj = js.Dynamic.literal(addDisplayRotationChangeListener = js.Any.fromFunction1(addDisplayRotationChangeListener), displayRotation = displayRotation.asInstanceOf[js.Any], removeDisplayRotationChangeListener = js.Any.fromFunction1((t0: Double) => removeDisplayRotationChangeListener(t0).runNow()), sendRequest = js.Any.fromFunction2((t0: MediaControllerDisplayRotationType, t1: MediaControllerSendCommandSuccessCallback) => (sendRequest(t0, t1)).runNow()))
    __obj.asInstanceOf[MediaControllerDisplayRotationInfo]
  }
  
  extension [Self <: MediaControllerDisplayRotationInfo](x: Self) {
    
    inline def setAddDisplayRotationChangeListener(value: MediaControllerDisplayRotationChangeCallback => Double): Self = StObject.set(x, "addDisplayRotationChangeListener", js.Any.fromFunction1(value))
    
    inline def setDisplayRotation(value: MediaControllerDisplayRotationType): Self = StObject.set(x, "displayRotation", value.asInstanceOf[js.Any])
    
    inline def setRemoveDisplayRotationChangeListener(value: Double => Callback): Self = StObject.set(x, "removeDisplayRotationChangeListener", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSendRequest(value: (MediaControllerDisplayRotationType, MediaControllerSendCommandSuccessCallback) => Callback): Self = StObject.set(x, "sendRequest", js.Any.fromFunction2((t0: MediaControllerDisplayRotationType, t1: MediaControllerSendCommandSuccessCallback) => (value(t0, t1)).runNow()))
  }
}
