package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionProvider extends js.Object {
  /**
  		 * Provide the definition of the symbol at the given position and document.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param position The position at which the command was invoked.
  		 * @param token A cancellation token.
  		 * @return A definition or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined` or `null`.
  		 */
  def provideDefinition(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[DefinitionLink]]
}

object DefinitionProvider {
  @scala.inline
  def apply(
    provideDefinition: (TextDocument, Position, CancellationToken) => CallbackTo[ProviderResult[Definition | js.Array[DefinitionLink]]]
  ): DefinitionProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideDefinition")(js.Any.fromFunction3((t0: typingsJapgolly.vscode.mod.TextDocument, t1: typingsJapgolly.vscode.mod.Position, t2: typingsJapgolly.vscode.mod.CancellationToken) => provideDefinition(t0, t1, t2).runNow()))
    __obj.asInstanceOf[DefinitionProvider]
  }
}

