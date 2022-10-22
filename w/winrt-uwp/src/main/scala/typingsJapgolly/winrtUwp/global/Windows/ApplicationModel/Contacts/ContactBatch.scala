package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Contacts

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a group of Contact objects and server search status. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Contacts.ContactBatch")
@js.native
open class ContactBatch ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.ContactBatch {
  
  /** Gets the list of Contact objects returned by a search operation. */
  /* CompleteClass */
  var contacts: IVectorView[typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.Contact] = js.native
  
  /** Gets a ContactBatchStatus value that indicates if a search was successful or if there was a server error. */
  /* CompleteClass */
  var status: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.ContactBatchStatus = js.native
}
