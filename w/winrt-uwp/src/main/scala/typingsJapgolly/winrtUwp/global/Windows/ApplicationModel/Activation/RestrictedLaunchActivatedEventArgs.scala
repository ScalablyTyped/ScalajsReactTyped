package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Activation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides event information when a restricted app is launched. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Activation.RestrictedLaunchActivatedEventArgs")
@js.native
open class RestrictedLaunchActivatedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.RestrictedLaunchActivatedEventArgs {
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  
  /** Gets information about a shared context for the restricted launch. */
  /* CompleteClass */
  var sharedContext: Any = js.native
  
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
}
