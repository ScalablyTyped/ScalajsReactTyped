package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Activation

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Calls.LockScreenCallUI
import typingsJapgolly.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides event information when communication to and from the lock screen is required. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Activation.LockScreenCallActivatedEventArgs")
@js.native
open class LockScreenCallActivatedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.LockScreenCallActivatedEventArgs {
  
  /** Gets the arguments that are passed to the app to launch it. */
  /* CompleteClass */
  var arguments: String = js.native
  
  /** Gets the UI that handles communication to and from the lock screen. */
  /* CompleteClass */
  var callUI: LockScreenCallUI = js.native
  
  /** Gets the identifier for the currently shown app view. */
  /* CompleteClass */
  var currentlyShownApplicationViewId: Double = js.native
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  
  /** Gets the identifier of the source that launched the app. */
  /* CompleteClass */
  var tileId: String = js.native
  
  /** Gets the view switcher object that allows you to set the view for the application. */
  /* CompleteClass */
  var viewSwitcher: ActivationViewSwitcher = js.native
}
