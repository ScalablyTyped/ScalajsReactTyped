package typingsJapgolly.winrtUwp.global.Windows.UI.WebUI

import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.Contact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when an app is activated to message a contact. */
/* note: abstract class */ @JSGlobal("Windows.UI.WebUI.WebUIContactMessageActivatedEventArgs")
@js.native
open class WebUIContactMessageActivatedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.UI.WebUI.WebUIContactMessageActivatedEventArgs {
  
  /** Gets the app activated operation. */
  /* CompleteClass */
  var activatedOperation: typingsJapgolly.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  
  /** Gets the contact for the message. */
  /* CompleteClass */
  var contact: Contact = js.native
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: ApplicationExecutionState = js.native
  
  /** Gets the identifier of the service used for the message. */
  /* CompleteClass */
  var serviceId: String = js.native
  
  /** Gets the user identifier of the service used for the message. */
  /* CompleteClass */
  var serviceUserId: String = js.native
  
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: SplashScreen = js.native
  
  /** Gets the action to be performed. */
  /* CompleteClass */
  var verb: String = js.native
}
