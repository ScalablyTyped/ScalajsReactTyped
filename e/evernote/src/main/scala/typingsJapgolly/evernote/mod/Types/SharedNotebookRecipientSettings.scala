package typingsJapgolly.evernote.mod.Types

import typingsJapgolly.evernote.anon.ReminderNotifyEmail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("evernote", "Types.SharedNotebookRecipientSettings")
@js.native
open class SharedNotebookRecipientSettings () extends StObject {
  def this(args: ReminderNotifyEmail) = this()
  
  var reminderNotifyEmail: js.UndefOr[Boolean] = js.native
  
  var reminderNotifyInApp: js.UndefOr[Boolean] = js.native
}
