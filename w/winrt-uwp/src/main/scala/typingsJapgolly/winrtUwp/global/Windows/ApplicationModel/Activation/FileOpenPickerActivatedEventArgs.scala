package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Activation

import typingsJapgolly.winrtUwp.Windows.Storage.Pickers.Provider.FileOpenPickerUI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an activated event that fires when the user tries to pick files or folders that are provided by the app. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Activation.FileOpenPickerActivatedEventArgs")
@js.native
open class FileOpenPickerActivatedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.FileOpenPickerActivatedEventArgs {
  
  /** The package family name of the app that launched your app. */
  /* CompleteClass */
  var callerPackageFamilyName: String = js.native
  
  /** Gets the letterbox UI of the file picker that is displayed when the user wants to pick files or folders that are provided by the app. */
  /* CompleteClass */
  var fileOpenPickerUI: FileOpenPickerUI = js.native
  
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
