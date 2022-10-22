package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a change to a Contact . */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Contacts.ContactChange")
@js.native
open class ContactChange ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.ContactChange {
  
  /** Gets a value that indicates the type of change that occurred. */
  /* CompleteClass */
  var changeType: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.ContactChangeType = js.native
  
  /** Gets the Contact object that changed. */
  /* CompleteClass */
  var contact: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.Contact = js.native
}
