package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoverProvider extends js.Object {
  /**
  		 * Provide a hover for the given position and document. Multiple hovers at the same
  		 * position will be merged by the editor. A hover can have a range which defaults
  		 * to the word range at the position when omitted.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param position The position at which the command was invoked.
  		 * @param token A cancellation token.
  		 * @return A hover or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined` or `null`.
  		 */
  def provideHover(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[Hover]
}

object HoverProvider {
  @scala.inline
  def apply(provideHover: (TextDocument, Position, CancellationToken) => CallbackTo[ProviderResult[Hover]]): HoverProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideHover")(js.Any.fromFunction3((t0: typingsJapgolly.vscode.mod.TextDocument, t1: typingsJapgolly.vscode.mod.Position, t2: typingsJapgolly.vscode.mod.CancellationToken) => provideHover(t0, t1, t2).runNow()))
    __obj.asInstanceOf[HoverProvider]
  }
}

