package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a TryCreateFolderAsync operation. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxCreateFolderResult")
@js.native
abstract class EmailMailboxCreateFolderResult () extends js.Object {
  /** Get the newly created folder after a TryCreateFolderAsync operation. */
  var folder: EmailFolder = js.native
  /** Gets the status of a TryCreateFolderAsync operation. */
  var status: EmailMailboxCreateFolderStatus = js.native
}

