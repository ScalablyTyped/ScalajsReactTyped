package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDocumentContentProvider extends js.Object {
  /**
  		 * An event to signal a resource has changed.
  		 */
  var onDidChange: js.UndefOr[Event[Uri]] = js.undefined
  /**
  		 * Provide textual content for a given uri.
  		 *
  		 * The editor will use the returned string-content to create a readonly
  		 * [document](#TextDocument). Resources allocated should be released when
  		 * the corresponding document has been [closed](#workspace.onDidCloseTextDocument).
  		 *
  		 * **Note**: The contents of the created [document](#TextDocument) might not be
  		 * identical to the provided text due to end-of-line-sequence normalization.
  		 *
  		 * @param uri An uri which scheme matches the scheme this provider was [registered](#workspace.registerTextDocumentContentProvider) for.
  		 * @param token A cancellation token.
  		 * @return A string or a thenable that resolves to such.
  		 */
  def provideTextDocumentContent(uri: Uri, token: CancellationToken): ProviderResult[String]
}

object TextDocumentContentProvider {
  @scala.inline
  def apply(
    provideTextDocumentContent: (Uri, CancellationToken) => CallbackTo[ProviderResult[String]],
    onDidChange: (/* listener */ js.Function1[Uri, js.Any], /* thisArgs */ js.UndefOr[js.Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => CallbackTo[Disposable] = null
  ): TextDocumentContentProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideTextDocumentContent")(js.Any.fromFunction2((t0: typingsJapgolly.vscode.mod.Uri, t1: typingsJapgolly.vscode.mod.CancellationToken) => provideTextDocumentContent(t0, t1).runNow()))
    if (onDidChange != null) __obj.updateDynamic("onDidChange")(js.Any.fromFunction3((t0: /* listener */ js.Function1[typingsJapgolly.vscode.mod.Uri, js.Any], t1: /* thisArgs */ js.UndefOr[js.Any], t2: /* disposables */ js.UndefOr[js.Array[typingsJapgolly.vscode.mod.Disposable]]) => onDidChange(t0, t1, t2).runNow()))
    __obj.asInstanceOf[TextDocumentContentProvider]
  }
}

