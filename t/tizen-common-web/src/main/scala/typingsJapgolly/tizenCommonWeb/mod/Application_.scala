package typingsJapgolly.tizenCommonWeb.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Application_ extends StObject {
  
  /**
    * Adds a listener which will invoke a callback function when an event occurs.
    *
    * System events do not require an application identifier to be specified. Therefore, the appId attribute of the [EventInfo](#EventInfo) dictionary should not be specified when listening for system events. If it is specified, the event to listen for will be interpreted as an user event.
    *
    * @since 2.4
    *
    * @param event Event which will invoke the callback.
    * @param callback Callback function to be invoked when the event occurs.
    *
    * @returns Listener identifier.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type.
    * @throw WebAPIException with error type UnknownError in any other error case.
    */
  def addEventListener(event: EventInfo, callback: EventCallback): Double
  
  /**
    * An attribute to store the application information for the current application.
    */
  val appInfo: ApplicationInformation
  
  /**
    * Broadcasts a user defined event to all the listeners which are listening for this event.
    *
    * An application can listen to events from other applications. However, it can only broadcast its own events. Therefore, the appId attribute of the [EventInfo](#EventInfo) dictionary must be the identifier of the application which calls this method.
    *
    * @since 2.4
    *
    * @param event Event to broadcast.
    * @param data User defined event data to broadcast.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError in any other error case.
    */
  def broadcastEvent(event: EventInfo, data: UserEventData): Unit
  
  /**
    * Broadcasts a user defined event to all the trusted listeners which are listening for this event. Applications which have the same certificate as the sending application can receive the event.
    *
    * An application can listen to events from other applications. However, it can only broadcast its own events. Therefore, the appId attribute of the [EventInfo](#EventInfo) dictionary must be the identifier of the application which calls this method.
    *
    * @since 2.4
    *
    * @param event Trusted event to broadcast.
    * @param data User defined trusted event data to broadcast.
    *
    * @throw WebAPIException with error type TypeMismatchError, if any input parameter is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError in any other error case.
    */
  def broadcastTrustedEvent(event: EventInfo, data: UserEventData): Unit
  
  /**
    * An attribute to store the ID of a running application.
    */
  val contextId: ApplicationContextId
  
  /**
    * Exits the current application.
    *
    * @remark This method is not supported by Web Widget.
    *
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def exit(): Unit
  
  /**
    * Gets the requested application control passed to the current application.
    *
    * Gets the requested application control that contains the application control
    * passed by the _launchAppControl()_ method from the calling application.
    * The requested application control contains the reason the application
    * is launched and what it has to perform. For example, an application
    * might be launched to display an image on a page by another
    * application's request. In all of these cases, the application is
    * responsible for checking the contents of the application control and responding
    * appropriately when it is launched.
    *
    * @remark This method is not supported by Web Widget.
    *
    * @returns The details of a requested application control.
    *
    * @throw WebAPIException with error type UnknownError, if the application control cannot be retrieved because of an unknown error.
    */
  def getRequestedAppControl(): RequestedApplicationControl
  
  /**
    * Hides the current application.
    *
    * @remark This method is not supported by Web Widget.
    *
    * @throw WebAPIException with error type UnknownError, if any other error occurs.
    */
  def hide(): Unit
  
  /**
    * Removes an event listener with a specified listener identifier.
    *
    * Calling this function has no effect if there is no listener with given id.
    *
    * @since 2.4
    *
    * @param watchId Listener identifier.
    *
    * @throw WebAPIException with error type UnknownError in any other error case.
    */
  def removeEventListener(watchId: Double): Unit
}
object Application_ {
  
  inline def apply(
    addEventListener: (EventInfo, EventCallback) => Double,
    appInfo: ApplicationInformation,
    broadcastEvent: (EventInfo, UserEventData) => Callback,
    broadcastTrustedEvent: (EventInfo, UserEventData) => Callback,
    contextId: ApplicationContextId,
    exit: Callback,
    getRequestedAppControl: CallbackTo[RequestedApplicationControl],
    hide: Callback,
    removeEventListener: Double => Callback
  ): Application_ = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), appInfo = appInfo.asInstanceOf[js.Any], broadcastEvent = js.Any.fromFunction2((t0: EventInfo, t1: UserEventData) => (broadcastEvent(t0, t1)).runNow()), broadcastTrustedEvent = js.Any.fromFunction2((t0: EventInfo, t1: UserEventData) => (broadcastTrustedEvent(t0, t1)).runNow()), contextId = contextId.asInstanceOf[js.Any], exit = exit.toJsFn, getRequestedAppControl = getRequestedAppControl.toJsFn, hide = hide.toJsFn, removeEventListener = js.Any.fromFunction1((t0: Double) => removeEventListener(t0).runNow()))
    __obj.asInstanceOf[Application_]
  }
  
  extension [Self <: Application_](x: Self) {
    
    inline def setAddEventListener(value: (EventInfo, EventCallback) => Double): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setAppInfo(value: ApplicationInformation): Self = StObject.set(x, "appInfo", value.asInstanceOf[js.Any])
    
    inline def setBroadcastEvent(value: (EventInfo, UserEventData) => Callback): Self = StObject.set(x, "broadcastEvent", js.Any.fromFunction2((t0: EventInfo, t1: UserEventData) => (value(t0, t1)).runNow()))
    
    inline def setBroadcastTrustedEvent(value: (EventInfo, UserEventData) => Callback): Self = StObject.set(x, "broadcastTrustedEvent", js.Any.fromFunction2((t0: EventInfo, t1: UserEventData) => (value(t0, t1)).runNow()))
    
    inline def setContextId(value: ApplicationContextId): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
    
    inline def setExit(value: Callback): Self = StObject.set(x, "exit", value.toJsFn)
    
    inline def setGetRequestedAppControl(value: CallbackTo[RequestedApplicationControl]): Self = StObject.set(x, "getRequestedAppControl", value.toJsFn)
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setRemoveEventListener(value: Double => Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
