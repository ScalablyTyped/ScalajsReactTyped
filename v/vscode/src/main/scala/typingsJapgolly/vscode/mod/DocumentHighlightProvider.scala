package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentHighlightProvider extends js.Object {
  /**
  		 * Provide a set of document highlights, like all occurrences of a variable or
  		 * all exit-points of a function.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param position The position at which the command was invoked.
  		 * @param token A cancellation token.
  		 * @return An array of document highlights or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined`, `null`, or an empty array.
  		 */
  def provideDocumentHighlights(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[js.Array[DocumentHighlight]]
}

object DocumentHighlightProvider {
  @scala.inline
  def apply(
    provideDocumentHighlights: (TextDocument, Position, CancellationToken) => CallbackTo[ProviderResult[js.Array[DocumentHighlight]]]
  ): DocumentHighlightProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideDocumentHighlights")(js.Any.fromFunction3((t0: typingsJapgolly.vscode.mod.TextDocument, t1: typingsJapgolly.vscode.mod.Position, t2: typingsJapgolly.vscode.mod.CancellationToken) => provideDocumentHighlights(t0, t1, t2).runNow()))
    __obj.asInstanceOf[DocumentHighlightProvider]
  }
}

