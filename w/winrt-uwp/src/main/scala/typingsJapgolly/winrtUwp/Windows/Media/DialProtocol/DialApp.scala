package typingsJapgolly.winrtUwp.Windows.Media.DialProtocol

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DIAL application running on a remote device. */
trait DialApp extends StObject {
  
  /** Gets the applications registered DIAL name. */
  var appName: String
  
  /**
    * Gets the current status of the application on the remote device.
    * @return The app status, a value from DialAppStateDetails .
    */
  def getAppStateAsync(): IPromiseWithIAsyncOperation[DialAppStateDetails]
  
  /**
    * Initiates the launching of the app on the remote device. When this method is called, the DialDevice is paired if necessary, the user is prompted to allow access to the device, connection is established, app existence is validated on the device, and finally the application is launched with the provided argument.
    * @param appArgument Optional.
    * @return Indicates the result of attempting to launch the app.
    */
  def requestLaunchAsync(appArgument: String): IPromiseWithIAsyncOperation[DialAppLaunchResult]
  
  /**
    * Stops the app on the remote device, if the remote device supports this functionality.
    * @return The result of sending the request to stop the app.
    */
  def stopAsync(): IPromiseWithIAsyncOperation[DialAppStopResult]
}
object DialApp {
  
  inline def apply(
    appName: String,
    getAppStateAsync: CallbackTo[IPromiseWithIAsyncOperation[DialAppStateDetails]],
    requestLaunchAsync: String => IPromiseWithIAsyncOperation[DialAppLaunchResult],
    stopAsync: CallbackTo[IPromiseWithIAsyncOperation[DialAppStopResult]]
  ): DialApp = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], getAppStateAsync = getAppStateAsync.toJsFn, requestLaunchAsync = js.Any.fromFunction1(requestLaunchAsync), stopAsync = stopAsync.toJsFn)
    __obj.asInstanceOf[DialApp]
  }
  
  extension [Self <: DialApp](x: Self) {
    
    inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setGetAppStateAsync(value: CallbackTo[IPromiseWithIAsyncOperation[DialAppStateDetails]]): Self = StObject.set(x, "getAppStateAsync", value.toJsFn)
    
    inline def setRequestLaunchAsync(value: String => IPromiseWithIAsyncOperation[DialAppLaunchResult]): Self = StObject.set(x, "requestLaunchAsync", js.Any.fromFunction1(value))
    
    inline def setStopAsync(value: CallbackTo[IPromiseWithIAsyncOperation[DialAppStopResult]]): Self = StObject.set(x, "stopAsync", value.toJsFn)
  }
}
