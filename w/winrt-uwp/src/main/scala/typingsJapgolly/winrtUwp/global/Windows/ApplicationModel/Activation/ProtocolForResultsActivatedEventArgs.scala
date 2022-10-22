package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Activation

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.ValueSet
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.System.ProtocolForResultsOperation
import typingsJapgolly.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Received by an application when it is launched by another application with the expectation that it will return results back to the caller. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Activation.ProtocolForResultsActivatedEventArgs")
@js.native
open class ProtocolForResultsActivatedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ProtocolForResultsActivatedEventArgs {
  
  /** Gets the package family name of the application that activated the current application. */
  /* CompleteClass */
  var callerPackageFamilyName: String = js.native
  
  /** Gets the identifier for the currently shown app view. */
  /* CompleteClass */
  var currentlyShownApplicationViewId: Double = js.native
  
  /** Data received from the application that activated the current application. */
  /* CompleteClass */
  var data: ValueSet = js.native
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  
  /** Gets the ProtocolForResultsOperation that you use to signal that your app is ready to return to the app that launched it for results. */
  /* CompleteClass */
  var protocolForResultsOperation: ProtocolForResultsOperation = js.native
  
  /** Gets a SplashScreen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  
  /** Gets the Uniform Resource Identifier (URI) used to activate the app. */
  /* CompleteClass */
  var uri: Uri = js.native
  
  /** Gets the view switcher object that allows you to set the view for the application. */
  /* CompleteClass */
  var viewSwitcher: ActivationViewSwitcher = js.native
}
