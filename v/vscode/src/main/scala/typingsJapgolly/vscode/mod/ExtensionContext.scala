package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.AnonDispose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionContext extends js.Object {
  /**
  		 * The absolute file path of the directory containing the extension.
  		 */
  val extensionPath: String
  /**
  		 * A memento object that stores state independent
  		 * of the current opened [workspace](#workspace.workspaceFolders).
  		 */
  val globalState: Memento
  /**
  		 * An absolute file path in which the extension can store global state.
  		 * The directory might not exist on disk and creation is
  		 * up to the extension. However, the parent directory is guaranteed to be existent.
  		 *
  		 * Use [`globalState`](#ExtensionContext.globalState) to store key value data.
  		 */
  val globalStoragePath: String
  /**
  		 * An absolute file path of a directory in which the extension can create log files.
  		 * The directory might not exist on disk and creation is up to the extension. However,
  		 * the parent directory is guaranteed to be existent.
  		 */
  val logPath: String
  /**
  		 * An absolute file path of a workspace specific directory in which the extension
  		 * can store private state. The directory might not exist on disk and creation is
  		 * up to the extension. However, the parent directory is guaranteed to be existent.
  		 *
  		 * Use [`workspaceState`](#ExtensionContext.workspaceState) or
  		 * [`globalState`](#ExtensionContext.globalState) to store key value data.
  		 */
  val storagePath: js.UndefOr[String] = js.undefined
  /**
  		 * An array to which disposables can be added. When this
  		 * extension is deactivated the disposables will be disposed.
  		 */
  val subscriptions: js.Array[AnonDispose]
  /**
  		 * A memento object that stores state in the context
  		 * of the currently opened [workspace](#workspace.workspaceFolders).
  		 */
  val workspaceState: Memento
  /**
  		 * Get the absolute path of a resource contained in the extension.
  		 *
  		 * @param relativePath A relative path to a resource contained in the extension.
  		 * @return The absolute path of the resource.
  		 */
  def asAbsolutePath(relativePath: String): String
}

object ExtensionContext {
  @scala.inline
  def apply(
    asAbsolutePath: String => CallbackTo[String],
    extensionPath: String,
    globalState: Memento,
    globalStoragePath: String,
    logPath: String,
    subscriptions: js.Array[AnonDispose],
    workspaceState: Memento,
    storagePath: String = null
  ): ExtensionContext = {
    val __obj = js.Dynamic.literal(extensionPath = extensionPath.asInstanceOf[js.Any], globalState = globalState.asInstanceOf[js.Any], globalStoragePath = globalStoragePath.asInstanceOf[js.Any], logPath = logPath.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], workspaceState = workspaceState.asInstanceOf[js.Any])
    __obj.updateDynamic("asAbsolutePath")(js.Any.fromFunction1((t0: java.lang.String) => asAbsolutePath(t0).runNow()))
    if (storagePath != null) __obj.updateDynamic("storagePath")(storagePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionContext]
  }
}

