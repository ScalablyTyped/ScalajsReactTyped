package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates the result of a call to TryDeleteFolderAsync . */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxDeleteFolderStatus")
@js.native
object EmailMailboxDeleteFolderStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxDeleteFolderStatus & Double
  ] = js.native
  
  /* 5 */ val couldNotDeleteEverything: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxDeleteFolderStatus.couldNotDeleteEverything & Double = js.native
  
  /* 1 */ val networkError: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxDeleteFolderStatus.networkError & Double = js.native
  
  /* 2 */ val permissionsError: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxDeleteFolderStatus.permissionsError & Double = js.native
  
  /* 3 */ val serverError: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxDeleteFolderStatus.serverError & Double = js.native
  
  /* 0 */ val success: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxDeleteFolderStatus.success & Double = js.native
  
  /* 4 */ val unknownFailure: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxDeleteFolderStatus.unknownFailure & Double = js.native
}
