package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceProvider extends js.Object {
  /**
  		 * Provide a set of project-wide references for the given position and document.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param position The position at which the command was invoked.
  		 * @param token A cancellation token.
  		 *
  		 * @return An array of locations or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined`, `null`, or an empty array.
  		 */
  def provideReferences(document: TextDocument, position: Position, context: ReferenceContext, token: CancellationToken): ProviderResult[js.Array[Location]]
}

object ReferenceProvider {
  @scala.inline
  def apply(
    provideReferences: (TextDocument, Position, ReferenceContext, CancellationToken) => CallbackTo[ProviderResult[js.Array[Location]]]
  ): ReferenceProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideReferences")(js.Any.fromFunction4((t0: typingsJapgolly.vscode.mod.TextDocument, t1: typingsJapgolly.vscode.mod.Position, t2: typingsJapgolly.vscode.mod.ReferenceContext, t3: typingsJapgolly.vscode.mod.CancellationToken) => provideReferences(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[ReferenceProvider]
  }
}

