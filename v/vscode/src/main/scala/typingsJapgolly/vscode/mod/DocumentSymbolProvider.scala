package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentSymbolProvider extends js.Object {
  /**
  		 * Provide symbol information for the given document.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param token A cancellation token.
  		 * @return An array of document highlights or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined`, `null`, or an empty array.
  		 */
  def provideDocumentSymbols(document: TextDocument, token: CancellationToken): ProviderResult[js.Array[DocumentSymbol | SymbolInformation]]
}

object DocumentSymbolProvider {
  @scala.inline
  def apply(
    provideDocumentSymbols: (TextDocument, CancellationToken) => CallbackTo[ProviderResult[js.Array[DocumentSymbol | SymbolInformation]]]
  ): DocumentSymbolProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideDocumentSymbols")(js.Any.fromFunction2((t0: typingsJapgolly.vscode.mod.TextDocument, t1: typingsJapgolly.vscode.mod.CancellationToken) => provideDocumentSymbols(t0, t1).runNow()))
    __obj.asInstanceOf[DocumentSymbolProvider]
  }
}

