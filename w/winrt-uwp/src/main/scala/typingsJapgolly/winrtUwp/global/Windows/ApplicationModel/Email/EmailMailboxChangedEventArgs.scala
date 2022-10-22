package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the deferral process. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Email.EmailMailboxChangedEventArgs")
@js.native
open class EmailMailboxChangedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxChangedEventArgs {
  
  /**
    * Gets the deferral object.
    * @return The deferral object.
    */
  /* CompleteClass */
  override def getDeferral(): typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxChangedDeferral = js.native
}
