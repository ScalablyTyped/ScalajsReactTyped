package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationProvider extends js.Object {
  /**
  		 * Provide the declaration of the symbol at the given position and document.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param position The position at which the command was invoked.
  		 * @param token A cancellation token.
  		 * @return A declaration or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined` or `null`.
  		 */
  def provideDeclaration(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[Declaration]
}

object DeclarationProvider {
  @scala.inline
  def apply(
    provideDeclaration: (TextDocument, Position, CancellationToken) => CallbackTo[ProviderResult[Declaration]]
  ): DeclarationProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideDeclaration")(js.Any.fromFunction3((t0: typingsJapgolly.vscode.mod.TextDocument, t1: typingsJapgolly.vscode.mod.Position, t2: typingsJapgolly.vscode.mod.CancellationToken) => provideDeclaration(t0, t1, t2).runNow()))
    __obj.asInstanceOf[DeclarationProvider]
  }
}

