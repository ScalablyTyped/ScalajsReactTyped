package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Restore webview panels that have been persisted when vscode shuts down.
	 *
	 * There are two types of webview persistence:
	 *
	 * - Persistence within a session.
	 * - Persistence across sessions (across restarts of VS Code).
	 *
	 * A `WebviewPanelSerializer` is only required for the second case: persisting a webview across sessions.
	 *
	 * Persistence within a session allows a webview to save its state when it becomes hidden
	 * and restore its content from this state when it becomes visible again. It is powered entirely
	 * by the webview content itself. To save off a persisted state, call `acquireVsCodeApi().setState()` with
	 * any json serializable object. To restore the state again, call `getState()`
	 *
	 * ```js
	 * // Within the webview
	 * const vscode = acquireVsCodeApi();
	 *
	 * // Get existing state
	 * const oldState = vscode.getState() || { value: 0 };
	 *
	 * // Update state
	 * setState({ value: oldState.value + 1 })
	 * ```
	 *
	 * A `WebviewPanelSerializer` extends this persistence across restarts of VS Code. When the editor is shutdown,
	 * VS Code will save off the state from `setState` of all webviews that have a serializer. When the
	 * webview first becomes visible after the restart, this state is passed to `deserializeWebviewPanel`.
	 * The extension can then restore the old `WebviewPanel` from this state.
	 */
trait WebviewPanelSerializer extends js.Object {
  /**
  		 * Restore a webview panel from its serialized `state`.
  		 *
  		 * Called when a serialized webview first becomes visible.
  		 *
  		 * @param webviewPanel Webview panel to restore. The serializer should take ownership of this panel. The
  		 * serializer must restore the webview's `.html` and hook up all webview events.
  		 * @param state Persisted state from the webview content.
  		 *
  		 * @return Thenable indicating that the webview has been fully restored.
  		 */
  def deserializeWebviewPanel(webviewPanel: WebviewPanel, state: js.Any): Thenable[Unit]
}

object WebviewPanelSerializer {
  @scala.inline
  def apply(deserializeWebviewPanel: (WebviewPanel, js.Any) => CallbackTo[Thenable[Unit]]): WebviewPanelSerializer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deserializeWebviewPanel")(js.Any.fromFunction2((t0: typingsJapgolly.vscode.mod.WebviewPanel, t1: js.Any) => deserializeWebviewPanel(t0, t1).runNow()))
    __obj.asInstanceOf[WebviewPanelSerializer]
  }
}

