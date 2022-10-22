package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies if the last batch access operation was successful or if there was a server error. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactBatchStatus")
@js.native
object ContactBatchStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.ContactBatchStatus & Double
  ] = js.native
  
  /* 1 */ val serverSearchSyncManagerError: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.ContactBatchStatus.serverSearchSyncManagerError & Double = js.native
  
  /* 2 */ val serverSearchUnknownError: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.ContactBatchStatus.serverSearchUnknownError & Double = js.native
  
  /* 0 */ val success: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.ContactBatchStatus.success & Double = js.native
}
