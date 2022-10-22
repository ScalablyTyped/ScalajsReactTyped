package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies parameters to use in a text search of Contact objects. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Contacts.ContactQueryTextSearch")
@js.native
open class ContactQueryTextSearch ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.ContactQueryTextSearch {
  
  /** Gets or sets which contact fields to search for a text match. */
  /* CompleteClass */
  var fields: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.ContactQuerySearchFields = js.native
  
  /** Gets or sets a value that specifies either a local or server search. */
  /* CompleteClass */
  var searchScope: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.ContactQuerySearchScope = js.native
  
  /** Gets or sets the text for which to search. */
  /* CompleteClass */
  var text: String = js.native
}
