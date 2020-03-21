package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionRangeProvider extends js.Object {
  /**
  		 * Provide selection ranges for the given positions.
  		 *
  		 * Selection ranges should be computed individually and independent for each position. The editor will merge
  		 * and deduplicate ranges but providers must return hierarchies of selection ranges so that a range
  		 * is [contained](#Range.contains) by its parent.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param positions The positions at which the command was invoked.
  		 * @param token A cancellation token.
  		 * @return Selection ranges or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined` or `null`.
  		 */
  def provideSelectionRanges(document: TextDocument, positions: js.Array[Position], token: CancellationToken): ProviderResult[js.Array[SelectionRange]]
}

object SelectionRangeProvider {
  @scala.inline
  def apply(
    provideSelectionRanges: (TextDocument, js.Array[Position], CancellationToken) => CallbackTo[ProviderResult[js.Array[SelectionRange]]]
  ): SelectionRangeProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("provideSelectionRanges")(js.Any.fromFunction3((t0: typingsJapgolly.vscode.mod.TextDocument, t1: js.Array[typingsJapgolly.vscode.mod.Position], t2: typingsJapgolly.vscode.mod.CancellationToken) => provideSelectionRanges(t0, t1, t2).runNow()))
    __obj.asInstanceOf[SelectionRangeProvider]
  }
}

