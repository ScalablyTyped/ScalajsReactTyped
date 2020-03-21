package typingsJapgolly.azdata.mod.nb

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import typingsJapgolly.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotebookDocument extends js.Object {
  /**
  			 * All cells.
  			 */
  val cells: js.Array[NotebookCell]
  /**
  			 * The file system path of the associated resource. Shorthand
  			 * notation for [TextDocument.uri.fsPath](#TextDocument.uri). Independent of the uri scheme.
  			 */
  val fileName: String
  /**
  			 * `true` if the document have been closed. A closed document isn't synchronized anymore
  			 * and won't be re-used when the same resource is opened again.
  			 */
  val isClosed: Boolean
  /**
  			 * `true` if there are unpersisted changes.
  			 */
  val isDirty: Boolean
  /**
  			 * Is this document representing an untitled file which has never been saved yet. *Note* that
  			 * this does not mean the document will be saved to disk, use [`uri.scheme`](#Uri.scheme)
  			 * to figure out where a document will be [saved](#FileSystemProvider), e.g. `file`, `ftp` etc.
  			 */
  val isUntitled: Boolean
  /**
  			 * The spec for current kernel, if applicable. This will be undefined
  			 * until a kernel has been started
  			 */
  val kernelSpec: IKernelSpec
  /**
  			 * The identifier of the Notebook provider associated with this document.
  			 */
  val providerId: String
  /**
  			 * The associated uri for this notebook document.
  			 *
  			 * *Note* that most documents use the `file`-scheme, which means they are files on disk. However, **not** all documents are
  			 * saved on disk and therefore the `scheme` must be checked before trying to access the underlying file or siblings on disk.
  			 *
  			 */
  val uri: Uri
  /**
  			 * Save the underlying file.
  			 *
  			 * @return A promise that will resolve to true when the file
  			 * has been saved. If the file was not dirty or the save failed,
  			 * will return false.
  			 */
  def save(): Thenable[Boolean]
  /**
  			 * Ensure a cell range is completely contained in this document.
  			 *
  			 * @param range A cell range.
  			 * @return The given range or a new, adjusted range.
  			 */
  def validateCellRange(range: CellRange): CellRange
}

object NotebookDocument {
  @scala.inline
  def apply(
    cells: js.Array[NotebookCell],
    fileName: String,
    isClosed: Boolean,
    isDirty: Boolean,
    isUntitled: Boolean,
    kernelSpec: IKernelSpec,
    providerId: String,
    save: CallbackTo[Thenable[Boolean]],
    uri: Uri,
    validateCellRange: CellRange => CallbackTo[CellRange]
  ): NotebookDocument = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], isClosed = isClosed.asInstanceOf[js.Any], isDirty = isDirty.asInstanceOf[js.Any], isUntitled = isUntitled.asInstanceOf[js.Any], kernelSpec = kernelSpec.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("save")(save.toJsFn)
    __obj.updateDynamic("validateCellRange")(js.Any.fromFunction1((t0: typingsJapgolly.azdata.mod.nb.CellRange) => validateCellRange(t0).runNow()))
    __obj.asInstanceOf[NotebookDocument]
  }
}

