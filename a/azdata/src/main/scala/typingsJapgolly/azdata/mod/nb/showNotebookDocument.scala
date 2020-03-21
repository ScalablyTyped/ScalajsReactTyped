package typingsJapgolly.azdata.mod.nb

import typingsJapgolly.vscode.Thenable
import typingsJapgolly.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "nb.showNotebookDocument")
@js.native
object showNotebookDocument extends js.Object {
  def apply(uri: Uri): Thenable[NotebookEditor] = js.native
  def apply(uri: Uri, showOptions: NotebookShowOptions): Thenable[NotebookEditor] = js.native
}

