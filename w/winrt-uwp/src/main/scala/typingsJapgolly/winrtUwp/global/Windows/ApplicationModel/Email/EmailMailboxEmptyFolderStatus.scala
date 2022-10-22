package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates the result of a call to TryEmptyFolderAsync . */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus")
@js.native
object EmailMailboxEmptyFolderStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus & Double
  ] = js.native
  
  /* 5 */ val couldNotDeleteEverything: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.couldNotDeleteEverything & Double = js.native
  
  /* 1 */ val networkError: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.networkError & Double = js.native
  
  /* 2 */ val permissionsError: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.permissionsError & Double = js.native
  
  /* 3 */ val serverError: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.serverError & Double = js.native
  
  /* 0 */ val success: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.success & Double = js.native
  
  /* 4 */ val unknownFailure: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.unknownFailure & Double = js.native
}
