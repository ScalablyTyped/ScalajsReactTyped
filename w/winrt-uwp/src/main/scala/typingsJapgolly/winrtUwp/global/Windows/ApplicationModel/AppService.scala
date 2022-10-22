package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceClosedStatus
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceResponseStatus
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.ValueSet
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains classes for using app services. */
object AppService {
  
  /** Enumerates the available app service providers on the device. */
  /* note: abstract class */ @JSGlobal("Windows.ApplicationModel.AppService.AppServiceCatalog")
  @js.native
  open class AppServiceCatalog ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceCatalog
  object AppServiceCatalog {
    
    @JSGlobal("Windows.ApplicationModel.AppService.AppServiceCatalog")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Windows.ApplicationModel.AppService.AppServiceCatalog.findAppServiceProvidersAsync")
    @js.native
    def findAppServiceProvidersAsync: Any = js.native
    inline def findAppServiceProvidersAsync_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findAppServiceProvidersAsync")(x.asInstanceOf[js.Any])
  }
  
  /** Provides data for the AppServiceConnection.ServiceClosed event that occurs when the other endpoint closes connection to the app service. */
  /* note: abstract class */ @JSGlobal("Windows.ApplicationModel.AppService.AppServiceClosedEventArgs")
  @js.native
  open class AppServiceClosedEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceClosedEventArgs {
    
    /** Gets the status that was set when the endpoint for the app service was closed. */
    /* CompleteClass */
    var status: AppServiceClosedStatus = js.native
  }
  
  /** Describes the status that was set when the endpoint for the app service was closed. */
  @JSGlobal("Windows.ApplicationModel.AppService.AppServiceClosedStatus")
  @js.native
  object AppServiceClosedStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceClosedStatus & Double
      ] = js.native
    
    /* 1 */ val canceled: typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceClosedStatus.canceled & Double = js.native
    
    /* 0 */ val completed: typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceClosedStatus.completed & Double = js.native
    
    /* 2 */ val resourceLimitsExceeded: typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceClosedStatus.resourceLimitsExceeded & Double = js.native
    
    /* 3 */ val unknown: typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceClosedStatus.unknown & Double = js.native
  }
  
  /** Represents a connection to the endpoint for an app service. */
  @JSGlobal("Windows.ApplicationModel.AppService.AppServiceConnection")
  @js.native
  /** Creates and initializes a new instance of the AppServiceConnection class. */
  open class AppServiceConnection ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceConnection
  
  /** Describes the status for the attempt that an app makes to open a connection to an app service by calling the AppServiceConnection.OpenAsync method. */
  @JSGlobal("Windows.ApplicationModel.AppService.AppServiceConnectionStatus")
  @js.native
  object AppServiceConnectionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceConnectionStatus & Double
      ] = js.native
    
    /* 1 */ val appNotInstalled: typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceConnectionStatus.appNotInstalled & Double = js.native
    
    /* 3 */ val appServiceUnavailable: typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceConnectionStatus.appServiceUnavailable & Double = js.native
    
    /* 2 */ val appUnavailable: typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceConnectionStatus.appUnavailable & Double = js.native
    
    /* 0 */ val success: typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceConnectionStatus.success & Double = js.native
    
    /* 4 */ val unknown: typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceConnectionStatus.unknown & Double = js.native
  }
  
  /** Enables the background task for an app service to get a deferral so that the app service can respond to subsequent requests. */
  /* note: abstract class */ @JSGlobal("Windows.ApplicationModel.AppService.AppServiceDeferral")
  @js.native
  open class AppServiceDeferral ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceDeferral {
    
    /** Indicates that the content for an asynchronous handler for the AppServiceConnection.RequestReceived event is ready, or that an error occurred. */
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  /** Represents a message that the endpoint for one app service sends to another app service. */
  /* note: abstract class */ @JSGlobal("Windows.ApplicationModel.AppService.AppServiceRequest")
  @js.native
  open class AppServiceRequest ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceRequest {
    
    /** Gets the message that request from the app service contains. */
    /* CompleteClass */
    var message: ValueSet = js.native
    
    /**
      * Sends a response to a received request.
      * @param message The message that you want to include in the response.
      * @return An asynchronous operation to send the response.
      */
    /* CompleteClass */
    override def sendResponseAsync(message: ValueSet): IPromiseWithIAsyncOperation[AppServiceResponseStatus] = js.native
  }
  
  /** Provides data for the AppServiceConnection.RequestReceived event that occurs when a message arrives from the other endpoint of the app service connection. */
  /* note: abstract class */ @JSGlobal("Windows.ApplicationModel.AppService.AppServiceRequestReceivedEventArgs")
  @js.native
  open class AppServiceRequestReceivedEventArgs ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceRequestReceivedEventArgs {
    
    /**
      * Informs the system that the event handler might continue to perform work after the event handler returns.
      * @return The deferral.
      */
    /* CompleteClass */
    override def getDeferral(): typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceDeferral = js.native
    
    /** Gets the request that was received from the app service. */
    /* CompleteClass */
    var request: typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceRequest = js.native
  }
  
  /** Represents the message that the app service sent in response to a request. */
  /* note: abstract class */ @JSGlobal("Windows.ApplicationModel.AppService.AppServiceResponse")
  @js.native
  open class AppServiceResponse ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceResponse {
    
    /** Gets the message that the response from the app service contains. */
    /* CompleteClass */
    var message: ValueSet = js.native
    
    /** Gets the status for the response from the app service. */
    /* CompleteClass */
    var status: AppServiceResponseStatus = js.native
  }
  
  /** Describes the status when an app tries to send a message to an app service by calling the AppServiceConnection.SendMessageAsync method. */
  @JSGlobal("Windows.ApplicationModel.AppService.AppServiceResponseStatus")
  @js.native
  object AppServiceResponseStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceResponseStatus & Double
      ] = js.native
    
    /* 1 */ val failure: typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceResponseStatus.failure & Double = js.native
    
    /* 2 */ val resourceLimitsExceeded: typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceResponseStatus.resourceLimitsExceeded & Double = js.native
    
    /* 0 */ val success: typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceResponseStatus.success & Double = js.native
    
    /* 3 */ val unknown: typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceResponseStatus.unknown & Double = js.native
  }
  
  /** Represents details associated with the background task for the app service. */
  /* note: abstract class */ @JSGlobal("Windows.ApplicationModel.AppService.AppServiceTriggerDetails")
  @js.native
  open class AppServiceTriggerDetails ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceTriggerDetails {
    
    /** Gets the connection to the endpoint of the other app service. */
    /* CompleteClass */
    var appServiceConnection: typingsJapgolly.winrtUwp.Windows.ApplicationModel.AppService.AppServiceConnection = js.native
    
    /** Gets the name of the package family for the client app that called the background task for the app service. */
    /* CompleteClass */
    var callerPackageFamilyName: String = js.native
    
    /** Gets the name of the app service. */
    /* CompleteClass */
    var name: String = js.native
  }
}
