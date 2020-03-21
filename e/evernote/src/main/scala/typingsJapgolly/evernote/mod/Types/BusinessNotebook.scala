package typingsJapgolly.evernote.mod.Types

import typingsJapgolly.evernote.AnonNotebookDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Types.BusinessNotebook")
@js.native
class BusinessNotebook () extends js.Object {
  def this(args: AnonNotebookDescription) = this()
  var notebookDescription: js.UndefOr[String] = js.native
  var privilege: js.UndefOr[SharedNotebookPrivilegeLevel] = js.native
  var recommended: js.UndefOr[Boolean] = js.native
}

