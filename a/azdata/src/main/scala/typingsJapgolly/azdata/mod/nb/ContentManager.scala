package typingsJapgolly.azdata.mod.nb

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import typingsJapgolly.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentManager extends js.Object {
  /* Reads contents from a Uri representing a local or remote notebook and returns a
  			 * JSON object containing the cells and metadata about the notebook
  			 */
  def getNotebookContents(notebookUri: Uri): Thenable[INotebookContents]
  /**
  			 * Save a file.
  			 *
  			 * @param notebookUri - The desired file path.
  			 *
  			 * @param notebook - notebook to be saved.
  			 *
  			 * @returns A thenable which resolves with the file content model when the
  			 *   file is saved.
  			 */
  def save(notebookUri: Uri, notebook: INotebookContents): Thenable[INotebookContents]
}

object ContentManager {
  @scala.inline
  def apply(
    getNotebookContents: Uri => CallbackTo[Thenable[INotebookContents]],
    save: (Uri, INotebookContents) => CallbackTo[Thenable[INotebookContents]]
  ): ContentManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getNotebookContents")(js.Any.fromFunction1((t0: typingsJapgolly.vscode.mod.Uri) => getNotebookContents(t0).runNow()))
    __obj.updateDynamic("save")(js.Any.fromFunction2((t0: typingsJapgolly.vscode.mod.Uri, t1: typingsJapgolly.azdata.mod.nb.INotebookContents) => save(t0, t1).runNow()))
    __obj.asInstanceOf[ContentManager]
  }
}

