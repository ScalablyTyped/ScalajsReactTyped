package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Activation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about an event that occurs when the app is activated as the lock screen. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Activation.LockScreenActivatedEventArgs")
@js.native
open class LockScreenActivatedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.LockScreenActivatedEventArgs {
  
  /** Gets an object that allows an app that is activated as the lock screen to get the same data that the default lock screen can access, and to register for updates to that data. */
  /* CompleteClass */
  var info: Any = js.native
  
  /** Gets the reason for the activation of the app for this event. */
  /* CompleteClass */
  var kind: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  
  /** Gets the execution state of the app before the app was activated as the lock screen. */
  /* CompleteClass */
  var previousExecutionState: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
}
