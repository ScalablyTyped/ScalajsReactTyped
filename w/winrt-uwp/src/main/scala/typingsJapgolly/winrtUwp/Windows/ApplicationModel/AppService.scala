package typingsJapgolly.winrtUwp.Windows.ApplicationModel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.ValueSet
import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.requestreceived
import typingsJapgolly.winrtUwp.winrtUwpStrings.serviceclosed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes for using app services. */
object AppService {
  
  @js.native
  sealed trait AppServiceClosedStatus extends StObject
  /** Describes the status that was set when the endpoint for the app service was closed. */
  @JSGlobal("Windows.ApplicationModel.AppService.AppServiceClosedStatus")
  @js.native
  object AppServiceClosedStatus extends StObject {
    
    /** The endpoint for the app service was closed by the client or the system */
    @js.native
    sealed trait canceled
      extends StObject
         with AppServiceClosedStatus
    
    /** The endpoint for the app service closed gracefully. */
    @js.native
    sealed trait completed
      extends StObject
         with AppServiceClosedStatus
    
    /** The endpoint for the app service was closed because the endpoint ran out of resources. */
    @js.native
    sealed trait resourceLimitsExceeded
      extends StObject
         with AppServiceClosedStatus
    
    /** An unknown error occurred. */
    @js.native
    sealed trait unknown
      extends StObject
         with AppServiceClosedStatus
  }
  
  @js.native
  sealed trait AppServiceConnectionStatus extends StObject
  /** Describes the status for the attempt that an app makes to open a connection to an app service by calling the AppServiceConnection.OpenAsync method. */
  @JSGlobal("Windows.ApplicationModel.AppService.AppServiceConnectionStatus")
  @js.native
  object AppServiceConnectionStatus extends StObject {
    
    /** The package for the app service to which a connection was attempted is not installed on the device. Check that the package is installed before trying to open a connection to the app service. */
    @js.native
    sealed trait appNotInstalled
      extends StObject
         with AppServiceConnectionStatus
    
    /** The app with the specified package family name is installed and available, but the app does not declare support for the specified app service. Check that the name of the app service and the version of the app are correct. */
    @js.native
    sealed trait appServiceUnavailable
      extends StObject
         with AppServiceConnectionStatus
    
    /** The package for the app service to which a connection was attempted is temporarily unavailable. Try to connect again later. */
    @js.native
    sealed trait appUnavailable
      extends StObject
         with AppServiceConnectionStatus
    
    /** The connection to the app service was opened successfully. */
    @js.native
    sealed trait success
      extends StObject
         with AppServiceConnectionStatus
    
    /** An unknown error occurred. */
    @js.native
    sealed trait unknown
      extends StObject
         with AppServiceConnectionStatus
  }
  
  @js.native
  sealed trait AppServiceResponseStatus extends StObject
  /** Describes the status when an app tries to send a message to an app service by calling the AppServiceConnection.SendMessageAsync method. */
  @JSGlobal("Windows.ApplicationModel.AppService.AppServiceResponseStatus")
  @js.native
  object AppServiceResponseStatus extends StObject {
    
    /** The app service failed to receive and process the message. */
    @js.native
    sealed trait failure
      extends StObject
         with AppServiceResponseStatus
    
    /** The app service exited because not enough resources were available. */
    @js.native
    sealed trait resourceLimitsExceeded
      extends StObject
         with AppServiceResponseStatus
    
    /** The app service successfully received and processed the message. */
    @js.native
    sealed trait success
      extends StObject
         with AppServiceResponseStatus
    
    /** An unknown error occurred. */
    @js.native
    sealed trait unknown
      extends StObject
         with AppServiceResponseStatus
  }
  
  /** Enumerates the available app service providers on the device. */
  trait AppServiceCatalog extends StObject
  
  /** Provides data for the AppServiceConnection.ServiceClosed event that occurs when the other endpoint closes connection to the app service. */
  trait AppServiceClosedEventArgs extends StObject {
    
    /** Gets the status that was set when the endpoint for the app service was closed. */
    var status: AppServiceClosedStatus
  }
  object AppServiceClosedEventArgs {
    
    inline def apply(status: AppServiceClosedStatus): AppServiceClosedEventArgs = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppServiceClosedEventArgs]
    }
    
    extension [Self <: AppServiceClosedEventArgs](x: Self) {
      
      inline def setStatus(value: AppServiceClosedStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents a connection to the endpoint for an app service. */
  @js.native
  trait AppServiceConnection extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_requestreceived(
      `type`: requestreceived,
      listener: TypedEventHandler[AppServiceConnection, AppServiceRequestReceivedEventArgs]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_serviceclosed(
      `type`: serviceclosed,
      listener: TypedEventHandler[AppServiceConnection, AppServiceClosedEventArgs]
    ): Unit = js.native
    
    /** Gets or sets the name of the app service to which you want to connect. */
    var appServiceName: String = js.native
    
    /** Closes the connection to the app service. */
    def close(): Unit = js.native
    
    /** Occurs when a message arrives from the other endpoint of the app service connection. */
    def onrequestreceived(ev: AppServiceRequestReceivedEventArgs & WinRTEvent[AppServiceConnection]): Unit = js.native
    /** Occurs when a message arrives from the other endpoint of the app service connection. */
    @JSName("onrequestreceived")
    var onrequestreceived_Original: TypedEventHandler[AppServiceConnection, AppServiceRequestReceivedEventArgs] = js.native
    
    /** Occurs when the other endpoint closes the connection to the app service. */
    def onserviceclosed(ev: AppServiceClosedEventArgs & WinRTEvent[AppServiceConnection]): Unit = js.native
    /** Occurs when the other endpoint closes the connection to the app service. */
    @JSName("onserviceclosed")
    var onserviceclosed_Original: TypedEventHandler[AppServiceConnection, AppServiceClosedEventArgs] = js.native
    
    /**
      * Opens a connection to the endpoint for the app service.
      * @return An asynchronous operation to open a connection to the endpoint for the app service.
      */
    def openAsync(): IPromiseWithIAsyncOperation[AppServiceConnectionStatus] = js.native
    
    /** Gets or sets the package family name for the package that contains the endpoint for the app service. */
    var packageFamilyName: String = js.native
    
    def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_requestreceived(
      `type`: requestreceived,
      listener: TypedEventHandler[AppServiceConnection, AppServiceRequestReceivedEventArgs]
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_serviceclosed(
      `type`: serviceclosed,
      listener: TypedEventHandler[AppServiceConnection, AppServiceClosedEventArgs]
    ): Unit = js.native
    
    /**
      * Sends a message to the other endpoint of the app service connection.
      * @param message The message that you want to send.
      * @return An asynchronous operation to send the message that optionally returns a response message when complete.
      */
    def sendMessageAsync(message: ValueSet): IPromiseWithIAsyncOperation[AppServiceResponse] = js.native
  }
  
  /** Enables the background task for an app service to get a deferral so that the app service can respond to subsequent requests. */
  trait AppServiceDeferral extends StObject {
    
    /** Indicates that the content for an asynchronous handler for the AppServiceConnection.RequestReceived event is ready, or that an error occurred. */
    def complete(): Unit
  }
  object AppServiceDeferral {
    
    inline def apply(complete: Callback): AppServiceDeferral = {
      val __obj = js.Dynamic.literal(complete = complete.toJsFn)
      __obj.asInstanceOf[AppServiceDeferral]
    }
    
    extension [Self <: AppServiceDeferral](x: Self) {
      
      inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
    }
  }
  
  /** Represents a message that the endpoint for one app service sends to another app service. */
  trait AppServiceRequest extends StObject {
    
    /** Gets the message that request from the app service contains. */
    var message: ValueSet
    
    /**
      * Sends a response to a received request.
      * @param message The message that you want to include in the response.
      * @return An asynchronous operation to send the response.
      */
    def sendResponseAsync(message: ValueSet): IPromiseWithIAsyncOperation[AppServiceResponseStatus]
  }
  object AppServiceRequest {
    
    inline def apply(
      message: ValueSet,
      sendResponseAsync: ValueSet => IPromiseWithIAsyncOperation[AppServiceResponseStatus]
    ): AppServiceRequest = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sendResponseAsync = js.Any.fromFunction1(sendResponseAsync))
      __obj.asInstanceOf[AppServiceRequest]
    }
    
    extension [Self <: AppServiceRequest](x: Self) {
      
      inline def setMessage(value: ValueSet): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSendResponseAsync(value: ValueSet => IPromiseWithIAsyncOperation[AppServiceResponseStatus]): Self = StObject.set(x, "sendResponseAsync", js.Any.fromFunction1(value))
    }
  }
  
  /** Provides data for the AppServiceConnection.RequestReceived event that occurs when a message arrives from the other endpoint of the app service connection. */
  trait AppServiceRequestReceivedEventArgs extends StObject {
    
    /**
      * Informs the system that the event handler might continue to perform work after the event handler returns.
      * @return The deferral.
      */
    def getDeferral(): AppServiceDeferral
    
    /** Gets the request that was received from the app service. */
    var request: AppServiceRequest
  }
  object AppServiceRequestReceivedEventArgs {
    
    inline def apply(getDeferral: CallbackTo[AppServiceDeferral], request: AppServiceRequest): AppServiceRequestReceivedEventArgs = {
      val __obj = js.Dynamic.literal(getDeferral = getDeferral.toJsFn, request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppServiceRequestReceivedEventArgs]
    }
    
    extension [Self <: AppServiceRequestReceivedEventArgs](x: Self) {
      
      inline def setGetDeferral(value: CallbackTo[AppServiceDeferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
      
      inline def setRequest(value: AppServiceRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents the message that the app service sent in response to a request. */
  trait AppServiceResponse extends StObject {
    
    /** Gets the message that the response from the app service contains. */
    var message: ValueSet
    
    /** Gets the status for the response from the app service. */
    var status: AppServiceResponseStatus
  }
  object AppServiceResponse {
    
    inline def apply(message: ValueSet, status: AppServiceResponseStatus): AppServiceResponse = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppServiceResponse]
    }
    
    extension [Self <: AppServiceResponse](x: Self) {
      
      inline def setMessage(value: ValueSet): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: AppServiceResponseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents details associated with the background task for the app service. */
  trait AppServiceTriggerDetails extends StObject {
    
    /** Gets the connection to the endpoint of the other app service. */
    var appServiceConnection: AppServiceConnection
    
    /** Gets the name of the package family for the client app that called the background task for the app service. */
    var callerPackageFamilyName: String
    
    /** Gets the name of the app service. */
    var name: String
  }
  object AppServiceTriggerDetails {
    
    inline def apply(appServiceConnection: AppServiceConnection, callerPackageFamilyName: String, name: String): AppServiceTriggerDetails = {
      val __obj = js.Dynamic.literal(appServiceConnection = appServiceConnection.asInstanceOf[js.Any], callerPackageFamilyName = callerPackageFamilyName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppServiceTriggerDetails]
    }
    
    extension [Self <: AppServiceTriggerDetails](x: Self) {
      
      inline def setAppServiceConnection(value: AppServiceConnection): Self = StObject.set(x, "appServiceConnection", value.asInstanceOf[js.Any])
      
      inline def setCallerPackageFamilyName(value: String): Self = StObject.set(x, "callerPackageFamilyName", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
