package typingsJapgolly.winrtUwp.global.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a user authentication status changing event. */
/* note: abstract class */ @JSGlobal("Windows.System.UserAuthenticationStatusChangingEventArgs")
@js.native
open class UserAuthenticationStatusChangingEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.System.UserAuthenticationStatusChangingEventArgs {
  
  /** Gets the user's current authentication status. */
  /* CompleteClass */
  var currentStatus: typingsJapgolly.winrtUwp.Windows.System.UserAuthenticationStatus = js.native
  
  /**
    * Requests a delay before the user's authentication status changes.
    * @return The user authentication status change deferral.
    */
  /* CompleteClass */
  override def getDeferral(): typingsJapgolly.winrtUwp.Windows.System.UserAuthenticationStatusChangeDeferral = js.native
  
  /** Gets the user's new authentication status. */
  /* CompleteClass */
  var newStatus: typingsJapgolly.winrtUwp.Windows.System.UserAuthenticationStatus = js.native
  
  /** Gets the user. */
  /* CompleteClass */
  var user: typingsJapgolly.winrtUwp.Windows.System.User = js.native
}
