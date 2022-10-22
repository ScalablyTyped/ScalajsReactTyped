package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Activation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the Activated event when it occurs after a picker returns. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Activation.PickerReturnedActivatedEventArgs")
@js.native
open class PickerReturnedActivatedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.PickerReturnedActivatedEventArgs {
  
  /** Gets the reason that this app is being activated. */
  /* CompleteClass */
  var kind: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  
  /** Gets an identifier indicating the picker operation that was performed prior to the activation. */
  /* CompleteClass */
  var pickerOperationId: String = js.native
  
  /** Gets the execution state of the app before this activation. */
  /* CompleteClass */
  var previousExecutionState: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
}
