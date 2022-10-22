package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the type of access the app has to the ContactStore . */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactStoreAccessType")
@js.native
object ContactStoreAccessType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.ContactStoreAccessType & Double
  ] = js.native
  
  /* 1 */ val allContactsReadOnly: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.ContactStoreAccessType.allContactsReadOnly & Double = js.native
  
  /* 2 */ val allContactsReadWrite: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.ContactStoreAccessType.allContactsReadWrite & Double = js.native
  
  /* 0 */ val appContactsReadWrite: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.ContactStoreAccessType.appContactsReadWrite & Double = js.native
}
