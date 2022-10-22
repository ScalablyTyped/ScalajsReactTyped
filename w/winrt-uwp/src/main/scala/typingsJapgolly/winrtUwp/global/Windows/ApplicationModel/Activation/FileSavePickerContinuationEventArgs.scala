package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Activation

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.ValueSet
import typingsJapgolly.winrtUwp.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an activated event that fires after the app was suspended for a file save picker operation. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Activation.FileSavePickerContinuationEventArgs")
@js.native
open class FileSavePickerContinuationEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.FileSavePickerContinuationEventArgs {
  
  /** Gets a set of values populated by the app before a FileSavePicker operation that deactivates the app in order to provide context when the app is activated. */
  /* CompleteClass */
  var continuationData: ValueSet = js.native
  
  /** Gets the file selected by the user during the file save picker operation. */
  /* CompleteClass */
  var file: StorageFile = js.native
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  
  /** Gets a SplashScreen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
}
