package typingsJapgolly.winrtUwp.global.Windows.UI.WebUI

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information for a device that invokes AutoPlay. */
/* note: abstract class */ @JSGlobal("Windows.UI.WebUI.WebUIDeviceActivatedEventArgs")
@js.native
open class WebUIDeviceActivatedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.UI.WebUI.WebUIDeviceActivatedEventArgs {
  
  /** Gets the app activated operation. */
  /* CompleteClass */
  var activatedOperation: typingsJapgolly.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  
  /** Gets the identifier for the currently shown app view. */
  /* CompleteClass */
  var currentlyShownApplicationViewId: Double = js.native
  
  /** Gets the device identifier for the device that invoked AutoPlay. */
  /* CompleteClass */
  var deviceInformationId: String = js.native
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: ApplicationExecutionState = js.native
  
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: SplashScreen = js.native
  
  /** Gets the action associated with the activated device. */
  /* CompleteClass */
  var verb: String = js.native
}
