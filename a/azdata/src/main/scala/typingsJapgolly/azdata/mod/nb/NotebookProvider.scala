package typingsJapgolly.azdata.mod.nb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import typingsJapgolly.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotebookProvider extends js.Object {
  val providerId: String
  val standardKernels: js.Array[IStandardKernel]
  def getNotebookManager(notebookUri: Uri): Thenable[NotebookManager]
  def handleNotebookClosed(notebookUri: Uri): Unit
}

object NotebookProvider {
  @scala.inline
  def apply(
    getNotebookManager: Uri => CallbackTo[Thenable[NotebookManager]],
    handleNotebookClosed: Uri => Callback,
    providerId: String,
    standardKernels: js.Array[IStandardKernel]
  ): NotebookProvider = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], standardKernels = standardKernels.asInstanceOf[js.Any])
    __obj.updateDynamic("getNotebookManager")(js.Any.fromFunction1((t0: typingsJapgolly.vscode.mod.Uri) => getNotebookManager(t0).runNow()))
    __obj.updateDynamic("handleNotebookClosed")(js.Any.fromFunction1((t0: typingsJapgolly.vscode.mod.Uri) => handleNotebookClosed(t0).runNow()))
    __obj.asInstanceOf[NotebookProvider]
  }
}

