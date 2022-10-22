package typingsJapgolly.winrtUwp.Windows.UI.WebUI

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typingsJapgolly.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information for a device that invokes pairing. */
trait WebUIDevicePairingActivatedEventArgs extends StObject {
  
  /** Gets the app activated operation. */
  var activatedOperation: ActivatedOperation
  
  /** Gets info about the device that triggered the operation. */
  var deviceInformation: DeviceInformation
  
  /** Gets the activation type. */
  var kind: ActivationKind
  
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
}
object WebUIDevicePairingActivatedEventArgs {
  
  inline def apply(
    activatedOperation: ActivatedOperation,
    deviceInformation: DeviceInformation,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): WebUIDevicePairingActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], deviceInformation = deviceInformation.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIDevicePairingActivatedEventArgs]
  }
  
  extension [Self <: WebUIDevicePairingActivatedEventArgs](x: Self) {
    
    inline def setActivatedOperation(value: ActivatedOperation): Self = StObject.set(x, "activatedOperation", value.asInstanceOf[js.Any])
    
    inline def setDeviceInformation(value: DeviceInformation): Self = StObject.set(x, "deviceInformation", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ActivationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPreviousExecutionState(value: ApplicationExecutionState): Self = StObject.set(x, "previousExecutionState", value.asInstanceOf[js.Any])
    
    inline def setSplashScreen(value: SplashScreen): Self = StObject.set(x, "splashScreen", value.asInstanceOf[js.Any])
  }
}
