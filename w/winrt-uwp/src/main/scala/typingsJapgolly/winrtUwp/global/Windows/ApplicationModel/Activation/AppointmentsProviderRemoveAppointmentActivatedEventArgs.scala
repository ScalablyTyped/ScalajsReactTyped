package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Activation

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.RemoveAppointmentOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when an app is activated to remove an appointment from the user’s calendar. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Activation.AppointmentsProviderRemoveAppointmentActivatedEventArgs")
@js.native
open class AppointmentsProviderRemoveAppointmentActivatedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.AppointmentsProviderRemoveAppointmentActivatedEventArgs {
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  
  /** Gets the appointment that is provided to the app when the user tries to remove it. */
  /* CompleteClass */
  var removeAppointmentOperation: RemoveAppointmentOperation = js.native
  
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  
  /** Gets the action to be performed by the appointments provider. */
  /* CompleteClass */
  var verb: String = js.native
}
